package View;

import Model.AlugueldeAutomovel;
import Model.Automovel;
import Model.Pessoa;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList <Pessoa> Funcionarios = new ArrayList<>();
        ArrayList <Pessoa> Clientes = new ArrayList<>();
        ArrayList <Automovel> automoveis = new ArrayList<>();
        ArrayList <AlugueldeAutomovel> alugueis = new ArrayList<>();
        
    String msg = "<html>this is a really long message<br>this is a really long message this is a really long message this is a really long message this is a really long message this is a really long message this is a really long message";
        int num;
        
        JOptionPane.showInputDialog(null,"1- Cadastrar funcionar1io", "2- Cadastrar funcionario","4- Cadastrar funcionario"+ num);
        
    }
}
