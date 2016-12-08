package fatorial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Tarefa2 extends Pai {
    
    @Override
    public double fatorial(int valor1){
        int fat = 1;
        for(int i = 2; i <= valor1; i++){
            fat *= i;
        }
        int resultado = fat;
        return resultado;
    }

    @Override
    public void run() {
        System.out.println("Fatorial(10) = " + fatorial(10));
    }
    
}
