package org.example.diropt.services;

import org.example.diropt.screens.FileOptionsService;
import org.example.diropt.screens.Screen;
import org.example.diropt.screens.WelcomePage;
import org.example.diropt.entities.Directories;


public class PageViews {
	
	//static Directory dir = new Directory();
	
	
	
	public static WelcomePage WelcomeScreen = new WelcomePage();
    public static FileOptionsService FileOptionsScreen = new FileOptionsService();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
