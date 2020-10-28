/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel
 */
public class Pizzaria extends JFrame implements ActionListener {

    private JPanel panel,panel2,panelcompra,panelvalor,panelgrad, panelP, panelM, panelS, panelExtra;
    private JButton Confirmar, calcular;
    private JLabel label, labelvalor;
    //p - Pepperone // m - Mussarela // s - Sublime
    private JCheckBox pIndi,pRegular,pFamilia,mIndi, mRegular,mFamilia, sIndi,sRegular, sFamilia, 
                      Bacon, Cebola, Champgnom,Tomate, Catupiry, Presunto;
    private JTextField textPI,textPR, textPF,textMI, textMR, textMF,textSI, textSR, textSF;
    private JTextArea detalhes;
    double total;
    
    
    public Pizzaria(){
        super ("Pizzaria da noite");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        //Panel das 3 primeiras tabelas de sabores
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(120,35)); 
            label = new JLabel("Sabores de Pizzas: ");
            label.setHorizontalAlignment(label.CENTER);
        panel.add(label);
        add(panel);
        //panel que vai organizar as tabelas de sabores
        panelgrad = new JPanel();
        panelgrad.setLayout(new GridLayout(1,3,15,15));
        add(panelgrad);
        //Tabela Pepperone
        panelP = new JPanel();
        panelP.setLayout(new GridLayout(3,3,10,10));
        panelP.setPreferredSize(new Dimension(270,100));
        panelP.setBorder(BorderFactory.createLineBorder(null));
        panelP.setBorder(BorderFactory.createTitledBorder(" Pepperoni "));
                //Individual
                pIndi = new JCheckBox("Individual");
                pIndi.setHorizontalAlignment(pIndi.LEFT);
                textPI = new JTextField();
                textPI.setPreferredSize(new Dimension(30,30));
                panelP.add(pIndi);
                panelP.add(textPI);
                labelvalor = new JLabel("R$ 15,00");
                panelP.add(labelvalor);
                
                //Regular
                pRegular = new JCheckBox("Regular");
                pRegular.setHorizontalAlignment(pRegular.LEFT);
                textPR = new JTextField();
                textPR.setPreferredSize(new Dimension(30,30));
                panelP.add(pRegular);
                panelP.add(textPR);
                labelvalor = new JLabel("R$ 27,00");
                panelP.add(labelvalor);
                //Familia
                pFamilia = new JCheckBox("Familia");
                pFamilia.setHorizontalAlignment(pFamilia.LEFT);
                textPF = new JTextField();
                textPF.setPreferredSize(new Dimension(30,30));
                panelP.add(pFamilia);
                panelP.add(textPF);
                labelvalor = new JLabel("R$ 33,00");
                panelP.add(labelvalor);
                
        panelgrad.add(panelP);        
        //Panel mussarela
        panelM = new JPanel();
        panelM.setLayout(new GridLayout(3,3,10,10));
        panelM.setPreferredSize(new Dimension(270,100));
        panelM.setBorder(BorderFactory.createLineBorder(null));
        panelM.setBorder(BorderFactory.createTitledBorder(" Mussarela "));
                //individual
                mIndi = new JCheckBox("Individual");
                mIndi.setHorizontalAlignment(mIndi.LEFT);
                textMI = new JTextField();
                textMI.setPreferredSize(new Dimension(30,30));
                panelM.add(mIndi);
                panelM.add(textMI);
                labelvalor = new JLabel("R$ 12,00");
                panelM.add(labelvalor);
                //Regular
                mRegular = new JCheckBox("Regular");
                mRegular.setHorizontalAlignment(mRegular.LEFT);
                textMR = new JTextField();
                textMR.setPreferredSize(new Dimension(30,30));
                panelM.add(mRegular);
                panelM.add(textMR);
                labelvalor = new JLabel("R$ 21,60");
                panelM.add(labelvalor);
                //Familia
                mFamilia = new JCheckBox("Familia");
                mFamilia.setHorizontalAlignment(mFamilia.LEFT);
                textMF = new JTextField();
                textMF.setPreferredSize(new Dimension(30,30));
                panelM.add(mFamilia);
                panelM.add(textMF);
                labelvalor = new JLabel("R$ 26,40");
                panelM.add(labelvalor);
                
        panelgrad.add(panelM); 
        //Panel Sublime
        panelS = new JPanel();
        panelS.setLayout(new GridLayout(3,3,10,10));
        panelS.setPreferredSize(new Dimension(270,100));
        panelS.setBorder(BorderFactory.createLineBorder(null));
        panelS.setBorder(BorderFactory.createTitledBorder(" Supreme "));
                //Individual
                sIndi = new JCheckBox("Individual");
                sIndi.setHorizontalAlignment(sIndi.LEFT);
                textSI = new JTextField();
                textSI.setPreferredSize(new Dimension(30,30));
                panelS.add(sIndi);
                panelS.add(textSI);
                labelvalor = new JLabel("R$ 17,00");
                panelS.add(labelvalor);
                //Regular
                sRegular = new JCheckBox("Regular");
                sRegular.setHorizontalAlignment(sRegular.LEFT);
                textSR = new JTextField();
                textSR.setPreferredSize(new Dimension(30,30));
                panelS.add(sRegular);
                panelS.add(textSR);
                labelvalor = new JLabel("R$ 30,60");
                panelS.add(labelvalor);
                //Familia
                sFamilia = new JCheckBox("Familia");
                sFamilia.setHorizontalAlignment(sFamilia.LEFT);
                textSF = new JTextField();
                textSF.setPreferredSize(new Dimension(30,30));
                panelS.add(sFamilia);
                panelS.add(textSF);
                labelvalor = new JLabel("R$ 37,40");
                panelS.add(labelvalor);
                
        panelgrad.add(panelS); 
        
        //Panel que vai organizar o panel de extras, valor e botões calcular e Confirmar Pedido
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,2,40,10));
        panel2.setPreferredSize(new Dimension(550,500));
        
        
        panelExtra = new JPanel();
        panelExtra.setLayout(new GridLayout(6,2,10,1));
        panelExtra.setPreferredSize(new Dimension(270,145));
        panelExtra.setBorder(BorderFactory.createLineBorder(null));
        panelExtra.setBorder(BorderFactory.createTitledBorder(" Coberturas Extras "));
                
                Bacon = new JCheckBox("Bacon");
                Bacon.setHorizontalAlignment(Bacon.LEFT);
                panelExtra.add(Bacon);
                labelvalor = new JLabel("R$ 2,00");
                panelExtra.add(labelvalor);
               
                Cebola = new JCheckBox("Cebola");
                Cebola.setHorizontalAlignment(Cebola.LEFT);
                panelExtra.add(Cebola);
                labelvalor = new JLabel("R$ 1,50");
                panelExtra.add(labelvalor);
                
                Champgnom = new JCheckBox("Champignon");
                Champgnom.setHorizontalAlignment(Champgnom.LEFT);
                panelExtra.add(Champgnom);
                labelvalor = new JLabel("R$ 2,50");
                panelExtra.add(labelvalor);
                
                Tomate = new JCheckBox("Tomate");
                Tomate.setHorizontalAlignment(Tomate.LEFT);
                panelExtra.add(Tomate);
                labelvalor = new JLabel("R$ 1,00");
                panelExtra.add(labelvalor);
                
                Catupiry = new JCheckBox("Catupiry");
                Catupiry.setHorizontalAlignment(Catupiry.LEFT);
                panelExtra.add(Catupiry);
                labelvalor = new JLabel("R$ 2,00");
                panelExtra.add(labelvalor);
                
                Presunto = new JCheckBox("Presunto");
                Presunto.setHorizontalAlignment(Presunto.LEFT);
                panelExtra.add(Presunto);
                labelvalor = new JLabel("R$ 2,00");
                panelExtra.add(labelvalor);
                panel2.add(panelExtra);
        
                detalhes = new JTextArea("");
                detalhes.setEditable(false);
                panel2.add(detalhes);
                
        
        panelvalor = new JPanel();
        panelvalor.setLayout(new FlowLayout(FlowLayout.CENTER));
        calcular = new JButton("Calcular");
        calcular.addActionListener(this);
        panelvalor.add(calcular);
        panel2.add(panelvalor);
        
        add(panel2);
        
        
        
        panelcompra = new JPanel();
        panelcompra.setLayout(new FlowLayout());
        Confirmar = new JButton("Confirmar Pedido");
        Confirmar.addActionListener(this);
        panelcompra.add(Confirmar);
        
        
        
        panel2.add(panelcompra);
        
        
                
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        
        double pepperoneInd = 0;
        double pepperoneReg = 0;
        double pepperoneFam = 0;
        
        double mussarelaInd = 0;
        double mussarelaReg = 0;
        double mussarelaFam = 0;
        
        double sublimeInd = 0;
        double sublimeReg = 0;
        double sublimeFam = 0;
        
        double bacon = 0;
        double cebola = 0;
        double champignon = 0;
        double tomate = 0;
        double catupiry = 0;
        double presunto = 0;
        
        
        
        NumberFormat format = new DecimalFormat("0.00");
        
        
        if (e.getSource()== calcular){
           try{
               
           detalhes.setText(null);
           if(pIndi.isSelected()==true){
            pepperoneInd = Double.parseDouble(textPI.getText())*15.00; 
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPizza de Pepperone IND R$ 15,00 x "+textPI.getText());    
           }
           if(pRegular.isSelected()==true){
            pepperoneReg = Double.parseDouble(textPR.getText())*27.00;
           total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPizza de Pepperone REG R$ 27,00 x "+textPR.getText());
           } 
           if(pFamilia.isSelected()==true){
            pepperoneFam = Double.parseDouble(textPF.getText())*33.00;
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPizza de Pepperone FAM R$ 33,00 x "+textPF.getText());
           }
           if(mIndi.isSelected()==true){
            mussarelaInd = Double.parseDouble(textMI.getText())*12.00;
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPizza de Mussarela IND R$ 12,00 x "+textMI.getText());
           }
           if(mRegular.isSelected()==true){
            mussarelaReg = Double.parseDouble(textMR.getText())*21.60;
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPizza de Mussarela REG R$ 21,60 x "+textMR.getText());
           }
           if(mFamilia.isSelected()==true){
            mussarelaFam = Double.parseDouble(textMF.getText())*26.40;
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPizza de Mussarela FAM R$ 26,40 x "+textMF.getText());
           }
           if(sIndi.isSelected()==true){
            sublimeInd = Double.parseDouble(textSI.getText())*17.00;
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPizza de Supreme IND R$ 17,00 x "+textSI.getText());
           }
           if(sRegular.isSelected()==true){
            sublimeReg = Double.parseDouble(textSR.getText())*30.60;
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPizza de Supreme REG R$ 12,00 x "+textSR.getText());
           }
           if(sFamilia.isSelected()==true){
            sublimeFam = Double.parseDouble(textSF.getText())*37.40;
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPizza de Supreme FAM R$ 37,40 x "+textSF.getText());
                }
           
           if(Bacon.isSelected()==true){
            bacon = 2.00; 
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nBacon Extra R$ 2,00 ");
            }
           
            if(Cebola.isSelected()==true){
            cebola = 1.50; 
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nCebola Extra R$ 1,50 ");
            }
            
            if(Champgnom.isSelected()==true){
            champignon = 2.50; 
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nChampgnom Extra R$ 2,50 ");
            }
            
            if(Tomate.isSelected()==true){
            tomate = 1.00; 
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nTomate Extra R$ 1,00 ");
            }
            
            if(Catupiry.isSelected()==true){
            catupiry = 3.00; 
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nCatupiry Extra R$ 3,00 ");
            }
            
            if(Presunto.isSelected()==true){
            presunto = 2.50; 
            total = pepperoneInd+pepperoneReg+pepperoneFam+mussarelaInd+mussarelaReg+mussarelaFam+sublimeInd+sublimeReg+sublimeFam+bacon+cebola+champignon+tomate+catupiry+presunto;
            detalhes.setText(detalhes.getText()+"\nPresunto Extra R$ 2,50 ");
            }
           
            }catch(java.lang.NumberFormatException a){
                JOptionPane.showMessageDialog(null, "Por favor Revise os campos de sabores marcados !");
            }
           
           detalhes.setText(detalhes.getText()+"\n\nTotal: R$ "+format.format(total));
           
        }
            if(e.getSource()==Confirmar){
                if(total == 0){
                JOptionPane.showMessageDialog(null, "Nenhum item selecionado, por favor escolha os sabores e extras !");
                }else{
                JOptionPane.showMessageDialog(null, "Pedido Confirmado !\nTotal a Pagar R$ "+format.format(total));
                }
            }
    }
    public static void main(String[] args) {
        Pizzaria pizzaria = new Pizzaria();
        pizzaria.setVisible(true);
        pizzaria.setLocation(270, 20);
        pizzaria.setSize(870, 500);
        pizzaria.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pizzaria.setResizable(false);
        
        
    }

    
    
}
