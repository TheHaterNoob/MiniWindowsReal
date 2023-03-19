/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptiones;

/**
 *
 * @author kelvi
 */
public class NoExisteUsr extends Exception{
    
    public NoExisteUsr(){
        super("No existe ese usuario");
    }
}
