/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Date;

public class Diaria extends AlugueldeAutomovel{
    private String pessoa;
    private String automovel;

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getAutomovel() {
        return automovel;
    }

    public void setAutomovel(String automovel) {
        this.automovel = automovel;
    }

    public Diaria(String pessoa, Date DataAquisicao, Date DataDevolucao) {
        super(DataAquisicao, DataDevolucao);
        this.pessoa = pessoa;
    }
    
    
}
