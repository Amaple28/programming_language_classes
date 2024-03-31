package meuapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class lotofacil extends JFrame {

    //atributos
    private JPanel painel = new JPanel();
    private JLabel jLabelMensagem = new JLabel("Escolha qual aposta deseja fazer: ");
    private JButton jButtonApostar = new JButton("Apostar");
    private JRadioButton jRadioButtonOpcao = new JRadioButton("Aposta de 0 a 100");




    //    construtor
    public lotofacil(){
        this.setTitle("Lotofácil");
        this.setSize(400,400);
        configurarComponentes();
//        this.setLocationRelativeTo(null); // Centralizar janela
        this.setVisible(true); // Exibir janela
    }

    private void configurarComponentes() {
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        painel.add(jLabelMensagem);
//        painel.add(jRadioButtonOpcao);

        // Exemplo de RadioButton
        JRadioButton bm = new JRadioButton("Apostar de 0 a 100", true);
        JRadioButton bf = new JRadioButton("Apostar PAR ou ÍMPAR");
        painel.add(bm);
        painel.add(bf);

        painel.add(jButtonApostar);
        this.getContentPane().add(painel);
    }

    public static void main(String[] args) {
        new meuapp.lotofacil();
    }
}
