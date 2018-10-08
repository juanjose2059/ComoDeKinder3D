/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderEngine;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 *
 * @author JUAN
 */
public class DisplayManager {
    
        private static final int WIDTH = 1024;
        private static final int HEIGHT = 768;
        
    public static void createDisplay(){
        try{
            Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));            
        }catch (LWJGLException e) {
            e.printStackTrace();
        }        
    }
    public static void updateDisplay(){}
    public static void closeDisplay(){}
}
