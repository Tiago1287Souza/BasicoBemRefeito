/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicobemrefeito;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Usuarios usuario = new Usuarios("João", 20, "sao lourenco");
        
        Usuarios usuario2 = new Usuarios();
        
        usuario2.setNome("Victor");
        usuario2.setIdade(43);
        usuario2.setEndereco("sao lourenco");
        
        
        System.out.println("DADOS DE INFORMAÇOES: ");
        
        usuario.imprimir();
        usuario2.imprimir();
        
        
        
    }

}
