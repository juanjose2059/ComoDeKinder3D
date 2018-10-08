/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderEngine;

/**
 *
 * @author JUAN
 */
public class DisplayManager {
    public static void createDisplay(){
        private static final int WIDTH =1280;
        private static final int HEIGHT = 720;
        
        Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
    }
    public static void updateDisplay(){}
    public static void closeDisplay(){}
}
