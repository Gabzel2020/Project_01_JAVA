
package mercadinho_da_unip;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author A Noite(Gabriel Oliveira Teofilo) e amiguinhos (...)
 */
public class Mercadinho_da_Unip extends JFrame implements ActionListener {
    
    private JPanel panel1,panel2,panel3,panelprodutos;//painel para cada final de elementos
    private JLabel produtos, valor, quantidade;
    private JCheckBox i1,i2,i3,i4,i5,i6,i7,i8; //item 1, 2...
    private JLabel v1,v2,v3,v4,v5,v6,v7,v8;//valor 1, 2...
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8;//Campo de texto 1, 2...
    private JButton comprar;
    private ArrayList<Double> conta;
    ;
    
    public Mercadinho_da_Unip(){
        super ("Mercadinho da Unip");
        setLayout(new FlowLayout());
        
        conta = new ArrayList();
        
        /*Painel de produtos incluindo a Label Produto*/
        /*--------------------------------------*/
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(9,1,13,13));
        panel1.setPreferredSize(new Dimension(140,380));
        add(panel1);
        
        //Label
        produtos = new JLabel("Produtos");
        produtos.setHorizontalAlignment(produtos.LEFT);
        
        panel1.add(produtos, panel1);
        
        //Produtos
        i1 = new JCheckBox("Batata");
        i1.setHorizontalAlignment(i1.LEFT);
        i1.addActionListener(this);
        panel1.add(i1);
        i2 = new JCheckBox("Cenoura");
        i2.setHorizontalAlignment(i2.LEFT);
        i2.addActionListener(this);
        panel1.add(i2);
        i3 = new JCheckBox("Cebola");
        i3.setHorizontalAlignment(i3.LEFT);
        i3.addActionListener(this);
        panel1.add(i3);
        i4 = new JCheckBox("Beterraba");
        i4.setHorizontalAlignment(i4.LEFT);
        i4.addActionListener(this);
        panel1.add(i4);
        i5 = new JCheckBox("Pepino");
        i5.setHorizontalAlignment(i5.LEFT);
        i5.addActionListener(this);
        panel1.add(i5);
        i6 = new JCheckBox("Pimentão");
        i6.setHorizontalAlignment(i6.LEFT);
        i6.addActionListener(this);
        panel1.add(i6);
        i7 = new JCheckBox("Tomate");
        i7.setHorizontalAlignment(i7.LEFT);
        i7.addActionListener(this);
        panel1.add(i7);
        i8 = new JCheckBox("Arroz");
        i8.setHorizontalAlignment(i8.LEFT);
        i8.addActionListener(this);
        panel1.add(i8);
        //Fim produtos
        //Fim Painel 1
        
        
        //Painel de valores
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(9,1,13,13));
        panel2.setPreferredSize(new Dimension(100,380));
        add(panel2);
        
        valor = new JLabel("VALOR (kg)");
        valor.setHorizontalAlignment(valor.LEFT);
        panel2.add(valor);
        
        
        //Valores
        v1 = new JLabel("R$ 1,50");
        v1.setHorizontalAlignment(v1.LEFT);
        panel2.add(v1);
        v2 = new JLabel("R$ 2,00");
        v2.setHorizontalAlignment(v2.LEFT);
        panel2.add(v2);
        v3 = new JLabel("R$ 3,10");
        v3.setHorizontalAlignment(v3.LEFT);
        panel2.add(v3);
        v4 = new JLabel("R$ 2,35");
        v4.setHorizontalAlignment(v4.LEFT);
        panel2.add(v4);
        v5 = new JLabel("R$ 1,85");
        v5.setHorizontalAlignment(v5.LEFT);
        panel2.add(v5);
        v6 = new JLabel("R$ 3,00");
        v6.setHorizontalAlignment(v6.LEFT);
        panel2.add(v6);
        v7 = new JLabel("R$ 3,50");
        v7.setHorizontalAlignment(v7.LEFT);
        panel2.add(v7);
        v8 = new JLabel("R$ 10.000,00");
        v8.setHorizontalAlignment(v8.LEFT);
        panel2.add(v8);
        //Fim Valores
        //Fim Panel 2
        
        //Painel de Kilos
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(9,1,20,20));
        panel3.setPreferredSize(new Dimension(110,380));
        add(panel3);
        
        quantidade = new JLabel("Quantidade (kg)");
        quantidade.setHorizontalAlignment(quantidade.CENTER);
        panel3.add(quantidade);
        
        //Campo para adicionar os Kilos do produto
        t1 = new JTextField();
        t1.setHorizontalAlignment(i1.LEFT);
        t1.setPreferredSize(new Dimension(100,20));
        panel3.add(t1);
        t2 = new JTextField();
        t2.setHorizontalAlignment(i1.LEFT);
        t2.setPreferredSize(new Dimension(100,20));
        panel3.add(t2);
        t3 = new JTextField();
        t3.setHorizontalAlignment(i1.LEFT);
        t3.setPreferredSize(new Dimension(100,20));
        panel3.add(t3);
        t4 = new JTextField();
        t4.setHorizontalAlignment(i1.LEFT);
        panel3.add(t4);
        t5 = new JTextField();
        t5.setHorizontalAlignment(i1.LEFT);
        panel3.add(t5);
        t6 = new JTextField();
        t6.setHorizontalAlignment(i1.LEFT);
        panel3.add(t6);
        t7 = new JTextField();
        t7.setHorizontalAlignment(i1.LEFT);
        panel3.add(t7);
        t8 = new JTextField();
        t8.setHorizontalAlignment(i1.LEFT);
        panel3.add(t8);
        //Fim kilos
        //Fim Panel 3
        
        //Botão Comprar
        comprar = new JButton("COMPRAR");
        comprar.addActionListener(this);
        add(comprar);
        
        
        
        
    }
    
    public static void main(String[] args) {
        Mercadinho_da_Unip merc = new Mercadinho_da_Unip();
        
        merc.setVisible(true);
        merc.setLocation(430, 20);
        merc.setSize(450, 570);
        merc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    /*Verificar quando o botão de produto for marcado, exibir uma mensagem de aviso,
        caso o botão seja desmarcado a mensagem não é exibida novamente
        */    
    if (e.getSource()==i1){
        if(i1.isSelected()==true){
        JOptionPane.showMessageDialog(null,"Por favor insira os Kilos");
        }
    }
    if (e.getSource()==i2){
        if(i2.isSelected()==true){
        JOptionPane.showMessageDialog(null,"Por favor insira os Kilos");
        }
    }    
    if (e.getSource()==i3){
        if(i3.isSelected()==true){
        JOptionPane.showMessageDialog(null,"Por favor insira os Kilos");
        }
    }
    if (e.getSource()==i4){
        if(i4.isSelected()==true){
        JOptionPane.showMessageDialog(null,"Por favor insira os Kilos");
        }
    }
    if (e.getSource()==i5){
        if(i5.isSelected()==true){
        JOptionPane.showMessageDialog(null,"Por favor insira os Kilos");
        }
    }
    if (e.getSource()==i6){
        if(i6.isSelected()==true){
        JOptionPane.showMessageDialog(null,"Por favor insira os Kilos");
        }
    }
    if (e.getSource()==i7){
        if(i7.isSelected()==true){
        JOptionPane.showMessageDialog(null,"Por favor insira os Kilos");
        }
    }
    if (e.getSource()==i8){
        if(i8.isSelected()==true){
        JOptionPane.showMessageDialog(null,"Por favor insira os Kilos");
        }
    }
    
    //Variavel do valor a ser pago
    double x = 0;
    
    /*Evento do botão comprar, adicionara os kilos*seu valor a uma lista, para que possa ser
    somada em seguida. Caso o campo esteja vazio o programa irá enviar uma menssagem. Após 
    o numero ser confirmado os botões e os textos serão apagados.
    */
    if(e.getSource()==comprar){
        
        try{
        
        if(i1.isSelected() == true){
        conta.add((Double.parseDouble(t1.getText()))*1.50);
        }
        if(i2.isSelected() == true){
        conta.add((Double.parseDouble(t2.getText()))*2.00);
        }
        if(i3.isSelected() == true){
        conta.add((Double.parseDouble(t3.getText()))*3.10);
        }
        if(i4.isSelected() == true){
        conta.add((Double.parseDouble(t4.getText()))*2.35);
        }
        if(i5.isSelected() == true){
        conta.add((Double.parseDouble(t5.getText()))*1.85);
        }
        if(i6.isSelected() == true){
        conta.add((Double.parseDouble(t6.getText()))*3.00);
        }
        if(i7.isSelected() == true){
        conta.add((Double.parseDouble(t7.getText()))*3.50);
        }
        if(i8.isSelected() == true){
        conta.add((Double.parseDouble(t8.getText()))*10000.00);
        }
        for (int c = 0; c < conta.size();c++){
            
        x = conta.get(c)+x;
                }
        JOptionPane.showMessageDialog(null,"Valor total: R$"+x);
        i1.setSelected(false);
        t1.setText(null);
        i2.setSelected(false);
        t2.setText(null);
        i3.setSelected(false);
        t3.setText(null);
        i4.setSelected(false);
        t4.setText(null);
        i5.setSelected(false);
        t5.setText(null);
        i6.setSelected(false);
        t6.setText(null);
        i7.setSelected(false);
        t7.setText(null);
        i8.setSelected(false);
        t8.setText(null);
        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Você digitou errado o peso(kg) de algum\n Produto Por favor revise os campos.");
        }
        
        }   
    }
    
}
