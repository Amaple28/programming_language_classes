package meuapp;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TesteJanela extends JFrame{

    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonLimpar = new JButton("Limpar1");
    private JTextField jTextFieldTexto = new JTextField("Teste1", 20);
    private JLabel jLabelMensagem = new JLabel("Exemplo de label Simples Janela");

    private JTextField jTextFieldNovo = new JTextField("Teste2", 20);
    private JLabel jLabelNovo = new JLabel("Novo exemplo de label na janela");
    private JButton jButtonNovo = new JButton("Limpar2");


    // Construtor
    public TesteJanela(){
        this.setTitle("Exemplo de Interface Gráfica");
        this.setSize(400, 350);
        configurarComponentes();
        //this.setLocationRelativeTo(null); // Centralizar janela
        this.setVisible(true); // Exibir janela
    }


    private void configurarComponentes() {
        jButtonLimpar.setToolTipText("Limpar formulário");
        jButtonLimpar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonLimpar.setMnemonic('L');

        jButtonLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });

        jButtonNovo.setToolTipText("Limpar segundo textfield");
        jButtonNovo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonNovo.setMnemonic('L');

        jButtonNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limparSegundoTextField();
            }
        });


        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        jTextFieldTexto.setFont(new Font("Arial", Font.PLAIN, 16));
        jTextFieldNovo.setFont(new Font("Arial", Font.PLAIN, 16));
        painel.add(jTextFieldTexto);
        painel.add(jTextFieldNovo);
        painel.add(jButtonLimpar);
        painel.add(jButtonNovo);
        painel.add(jLabelMensagem);
        painel.add(jLabelNovo);
        this.getContentPane().add(painel);
    }


    private void limparTela() {
        jTextFieldTexto.setText("");
        jTextFieldTexto.requestFocus();
    }

    private void limparSegundoTextField(){
        jTextFieldNovo.setText("");
        jTextFieldNovo.requestFocus();
    }


    public static void main(String[] args) {
        new TesteJanela();
    }
}