/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.FACTORY;

import Shahriar.ISD.StarDestroyer;
import java.util.ArrayList;

/**
 *
 * @author Fahim
 */
public abstract class ISDFactory {
    private String name;
    private String buildType;
    private ArrayList<StarDestroyer> dryDock;
    
    public ISDFactory(String name){
        this.name = name;
    }
    
    public abstract boolean buildISDs(int count);
    public abstract void displayISDs();
}
