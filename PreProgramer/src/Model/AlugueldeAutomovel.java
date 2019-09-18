/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Date;


 public abstract class AlugueldeAutomovel {
    protected Date DataAquisicao;
    protected Date DataDevolucao;

    public AlugueldeAutomovel(Date DataAquisicao, Date DataDevolucao) {
        this.DataAquisicao = DataAquisicao;
        this.DataDevolucao = DataDevolucao;
    }

    public Date getDataAquisicao() {
        return DataAquisicao;
    }

    public void setDataAquisicao(Date DataAquisicao) {
        this.DataAquisicao = DataAquisicao;
    }

    public Date getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(Date DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }
    
}
