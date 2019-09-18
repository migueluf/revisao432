/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;


public class Carro extends Automovel {
          protected String tamanho;
          protected String portas;

    public Carro(String tamanho, String portas, String Modelo, String Marca, String Ano) {
        super(Modelo, Marca, Ano);
        this.tamanho = tamanho;
        this.portas = portas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

          
}
