package teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import fatorial.Tarefa1;
import fatorial.Tarefa2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
/**
 *
 * @author aluno
 */
public class testefatorial {
    
    @Test
    public void teste(){
        Tarefa1 tarefa = new Tarefa1();
        double esperado, resultado;
        
        resultado = tarefa.fatorial(8);
        esperado = 40320;
        
        assertEquals(resultado, esperado,0);
    }
    
     @Test
    public void teste2(){
        Tarefa1 tarefa = new Tarefa1();
        double naoEsperado, resultado;
        
        resultado = tarefa.fatorial(8);
        naoEsperado = 1000;
        
        assertNotEquals(resultado, naoEsperado,0);    
    }
    
}
