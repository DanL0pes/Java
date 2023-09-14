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
		
		//janela título
		this.setTitle("Calculadora:");
		//janela tamanho em pixels
		this.setSize(1280,720);
		//this.setLocation(800, 600); para Localização baseada em pixels
		//para centralizar a janela
		this.setLocationRelativeTo(null);
		//definindo função para o 'X' de encerrar
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//definindo cor 
		this.getContentPane().setBackground(Color.WHITE);
		
		//label instaciamento
		lbNum1 = new JLabel();
		//label posição	//x  y  widht  height
		lbNum1.setBounds(540, 250, 100, 25);
		//label conteúdo
		lbNum1.setText("1* Número:");
		//add element
		add(lbNum1);
		
		//área de texto instanciamento
		num1 = new JTextField();
		//área de texto posicionamento
		num1.setBounds(540, 280, 100, 25);
		//adicionar elemento
		add(num1);
		
		//label instaciamento
		lbNum2 = new JLabel();
		//label posição	//x  y  widht  height
		lbNum2.setBounds(540, 320, 100, 25);
		//label conteúdo
		lbNum2.setText("2* Número:");
		//add element
		add(lbNum2);
				
		//área de texto instanciamento
		num2 = new JTextField();
		//área de texto posicionamento
		num2.setBounds(540, 350, 100, 25);
		//adicionar elemento
		add(num2);
				
		//botão instanciar
		btSoma = new JButton();
		//botão posição
		btSoma.setBounds(390, 380, 100, 25);
		//botão texto
		btSoma.setText("Somar");
		//botão cor background
		btSoma.setBackground(Color.BLACK);
		//botão cor do texto
		btSoma.setForeground(Color.WHITE);
		//add button
		add(btSoma);
		//atribuir função ao botão
		btSoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc('+'); // funçao de calculo "+"
            }
        });
		
		
		//botão instanciar
		btSub = new JButton();
		//botão posição
		btSub.setBounds(490, 380, 100, 25);
		//botão texto
		btSub.setText("Subtrair");
		//botão cor background
		btSub.setBackground(Color.BLACK);
		//botão cor do texto
		btSub.setForeground(Color.WHITE);
		//add button
		add(btSub);
		btSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc('-'); // funçao de calculo "-"
            }
        });
		
		//botão instanciar
		btMult = new JButton();
		//botão posição
		btMult.setBounds(590, 380, 100, 25);
		//botão texto
		btMult.setText("Multiplicar");
		//botão cor background
		btMult.setBackground(Color.BLACK);
		//botão cor do texto
		btMult.setForeground(Color.WHITE);
		//add button
		add(btMult);
		btMult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a) {
				calc('x');// função para calculo "X"
			}
		});
		//botão instanciar
		btDiv = new JButton();
		//botão posição
		btDiv.setBounds(690, 380, 100, 25);
		//botão texto
		btDiv.setText("Dividir");
		//botão cor background
		btDiv.setBackground(Color.BLACK);
		//botão cor do texto
		btDiv.setForeground(Color.WHITE);
		//add button
		add(btDiv);
		btDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc('/'); // funçao para calculo "/"
            }
        });
		
		//puxando imagem no pc
		img = new ImageIcon(getClass().getResource("bg.jpg"));
		JLabel background = new JLabel(img);
		background.setBounds(0,0,1280, 720);
		//add imagem
		add(background);
		
		//por último - se não dá "tilt"
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
        	JOptionPane.showMessageDialog(this,"Conta: "+n1+" + "+n2+"\nResultado: " + result, "Resultado da Operação", JOptionPane.INFORMATION_MESSAGE);
        	break;
        case '-':
        	result = n1 - n2;
        	JOptionPane.showMessageDialog(this,"Conta: "+n1+" - "+n2+"\nResultado: " + result, "Resultado da Operação", JOptionPane.INFORMATION_MESSAGE);
        	break;
        case 'x':
        	result = n1 * n2;
        	JOptionPane.showMessageDialog(this,"Conta: "+n1+" x "+n2+"\nResultado: " + result, "Resultado da Operação", JOptionPane.INFORMATION_MESSAGE);
        	break;
        case '/':
        	if(n2!= 0) {
        		result = n1 / n2;
            	JOptionPane.showMessageDialog(this,"Conta: "+n1+" / "+n2+"\nResultado: " + result, "Resultado da Operação", JOptionPane.INFORMATION_MESSAGE);
        	}
        	else {
        		JOptionPane.showMessageDialog(this,"É impossível se dividir por 0.","Resultado da Operação", JOptionPane.INFORMATION_MESSAGE);
        	}
        	break;
        }
	}
}