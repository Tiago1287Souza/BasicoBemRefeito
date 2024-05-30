/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicobemrefeito;

/**
 *
 * @author aluno
 */
abstract class Animal {
    
    String apelido;
    int idade;

    public Animal(String apelido, int idade) {
        this.apelido = apelido;
        this.idade = idade;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    abstract void FazerBarulho();
    
    
    
    
}
