package fatorial;

//Alunos: Gabriel Antonio da Silva e Roberta Sousa Pires

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import fatorial.Tarefa1;
import fatorial.Tarefa2;
/**
 *
 * @author aluno
 */
public class Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Thread thread1 = new Thread();
       Thread thread2 = new Thread();
       
       Tarefa1 tarefa1 = new Tarefa1();
       Tarefa2 tarefa2 = new Tarefa2();
       
       thread1 = new Thread(tarefa1);
       thread2 = new Thread(tarefa2);
      
       thread1.start();
       thread2.start();       
       
    }
    
}
