/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

/**
 *
 * @author aluno
 */
public abstract class Pai implements Runnable{
    
    
    public double fatorial(int valor1){
        int fat = 1;
        for(int i = 2; i <= valor1; i++){
            fat *= i;
        }
        int resultado = fat;
        return resultado;
    }
    
}
