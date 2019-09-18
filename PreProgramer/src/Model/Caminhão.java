/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author aluno
 */
public class Caminhão extends Automovel {
          protected String tamanho;
          protected String carga;

    public Caminhão(String tamanho, String carga, String Modelo, String Marca, String Ano) {
        super(Modelo, Marca, Ano);
        this.tamanho = tamanho;
        this.carga = carga;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }
          

    
}
