package org.example.diropt.screens;

import org.example.diropt.services.DirectoryService;
import org.example.diropt.services.PageViews;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class WelcomePage implements Screen {

    private String welcomeText = "Welcome to DirOperation..!";
    private String developerText = "Developer: Ramkumar M";

    private ArrayList<String> options = new ArrayList<>();


    public WelcomePage() {
        options.add("1. Show Files");
        options.add("2. Show File Options Menu");
        options.add("3. Quit");

    }
    
    public void startWS() {
        System.out.println("*********************");
        System.out.println(welcomeText);
        System.out.println(developerText);
        System.out.println("*********************");
        Show();
    }
    
    
    
    @Override
    public void Show() {
    	System.out.println("Main Menu");
        System.out.println("*********************");
        for (String s : options)  {
            System.out.println(s);
        }

    }

    public void GetUserIn() {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int option) {
        switch(option) {

            case 1: // Show Files in Directory
                this.ShowFiles();
                
                this.Show();
                
                break;
                
            case 2: // Show File Options menu
            	PageViews.setCurrentScreen(PageViews.FileOptionsScreen);
                PageViews.getCurrentScreen().Show();
                PageViews.getCurrentScreen().GetUserIn();
                
                this.Show();
                
                break;
                
            default:
                System.out.println("Invalid Option");
                break;
        }
        
    }

    public void ShowFiles() {

        System.out.println("List of Files: ");
        System.out.println("*********************");
    	DirectoryService.PrintFiles();

    }
    
    private int getOption() {
        Scanner in = new Scanner(System.in);

        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnOption;

    }
}
