package interfaceGrafica;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Window extends JFrame{
	
	private JLabel lbNum1, lbNum2;
	private JTextField num1, num2;
	private JButton btSoma, btSub, btMult, btDiv;
	private ImageIcon img = null;
			
	public Window() {
		
		//janela t�tulo
		this.setTitle("Calculadora:");
		//janela tamanho em pixels
		this.setSize(1280,720);
		//this.setLocation(800, 600); para Localiza��o baseada em pixels
		//para centralizar a janela
		this.setLocationRelativeTo(null);
		//definindo fun��o para o 'X' de encerrar
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//definindo cor 
		this.getContentPane().setBackground(Color.WHITE);
		
		//label instaciamento
		lbNum1 = new JLabel();
		//label posi��o	//x  y  widht  height
		lbNum1.setBounds(540, 250, 100, 25);
		//label conte�do
		lbNum1.setText("1* N�mero:");
		//add element
		add(lbNum1);
		
		//�rea de texto instanciamento
		num1 = new JTextField();
		//�rea de texto posicionamento
		num1.setBounds(540, 280, 100, 25);
		//adicionar elemento
		add(num1);
		
		//label instaciamento
		lbNum2 = new JLabel();
		//label posi��o	//x  y  widht  height
		lbNum2.setBounds(540, 320, 100, 25);
		//label conte�do
		lbNum2.setText("2* N�mero:");
		//add element
		add(lbNum2);
				
		//�rea de texto instanciamento
		num2 = new JTextField();
		//�rea de texto posicionamento
		num2.setBounds(540, 350, 100, 25);
		//adicionar elemento
		add(num2);
				
		//bot�o instanciar
		btSoma = new JButton();
		//bot�o posi��o
		btSoma.setBounds(390, 380, 100, 25);
		//bot�o texto
		btSoma.setText("Somar");
		//bot�o cor background
		btSoma.setBackground(Color.BLACK);
		//bot�o cor do texto
		btSoma.setForeground(Color.WHITE);
		//add button
		add(btSoma);
		//atribuir fun��o ao bot�o
		btSoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc('+'); // fun�ao de calculo "+"
            }
        });
		
		
		//bot�o instanciar
		btSub = new JButton();
		//bot�o posi��o
		btSub.setBounds(490, 380, 100, 25);
		//bot�o texto
		btSub.setText("Subtrair");
		//bot�o cor background
		btSub.setBackground(Color.BLACK);
		//bot�o cor do texto
		btSub.setForeground(Color.WHITE);
		//add button
		add(btSub);
		btSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc('-'); // fun�ao de calculo "-"
            }
        });
		
		//bot�o instanciar
		btMult = new JButton();
		//bot�o posi��o
		btMult.setBounds(590, 380, 100, 25);
		//bot�o texto
		btMult.setText("Multiplicar");
		//bot�o cor background
		btMult.setBackground(Color.BLACK);
		//bot�o cor do texto
		btMult.setForeground(Color.WHITE);
		//add button
		add(btMult);
		btMult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a) {
				calc('x');// fun��o para calculo "X"
			}
		});
		//bot�o instanciar
		btDiv = new JButton();
		//bot�o posi��o
		btDiv.setBounds(690, 380, 100, 25);
		//bot�o texto
		btDiv.setText("Dividir");
		//bot�o cor background
		btDiv.setBackground(Color.BLACK);
		//bot�o cor do texto
		btDiv.setForeground(Color.WHITE);
		//add button
		add(btDiv);
		btDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc('/'); // fun�ao para calculo "/"
            }
        });
		
		//puxando imagem no pc
		img = new ImageIcon(getClass().getResource("bg.jpg"));
		JLabel background = new JLabel(img);
		background.setBounds(0,0,1280, 720);
		//add imagem
		add(background);
		
		//por �ltimo - se n�o d� "tilt"
		this.setLayout(null);
		this.setVisible(true);
	}
	
	private void calc(char op) {
		double n1 = Double.parseDouble(num1.getText());
        double n2 = Double.parseDouble(num2.getText());
        double result = 0;
        
        switch(op) {
        case '+':
        	result = n1 + n2;
        	JOptionPane.showMessageDialog(this,"Conta: "+n1+" + "+n2+"\nResultado: " + result, "Resultado da Opera��o", JOptionPane.INFORMATION_MESSAGE);
        	break;
        case '-':
        	result = n1 - n2;
        	JOptionPane.showMessageDialog(this,"Conta: "+n1+" - "+n2+"\nResultado: " + result, "Resultado da Opera��o", JOptionPane.INFORMATION_MESSAGE);
        	break;
        case 'x':
        	result = n1 * n2;
        	JOptionPane.showMessageDialog(this,"Conta: "+n1+" x "+n2+"\nResultado: " + result, "Resultado da Opera��o", JOptionPane.INFORMATION_MESSAGE);
        	break;
        case '/':
        	if(n2!= 0) {
        		result = n1 / n2;
            	JOptionPane.showMessageDialog(this,"Conta: "+n1+" / "+n2+"\nResultado: " + result, "Resultado da Opera��o", JOptionPane.INFORMATION_MESSAGE);
        	}
        	else {
        		JOptionPane.showMessageDialog(this,"� imposs�vel se dividir por 0.","Resultado da Opera��o", JOptionPane.INFORMATION_MESSAGE);
        	}
        	break;
        }
	}
}