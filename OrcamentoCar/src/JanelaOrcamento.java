import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaOrcamento extends JFrame{
	
	private JLabel lbNomeEmpresa, lbNome, lbTelefone, lbEmail, lbMarca, lbModelo, lbCor, lbOpcional, lbCar;
	private JTextField txtNome, txtTelefone, txtEmail;
	private JComboBox cbMarca, cbModelo;
	private JRadioButton rbBranco, rbPreto, rbCinza;
	private ButtonGroup bgCor;
	private JCheckBox ckArCondicionado, ckDirecaoHidraulica, ckLigaLeve, ckKitMultmidia;
	private String model1, model2, model3, corCar=null;
	private JButton btSalvar, btCancelar;
	private ImageIcon imgCar = null;
	
	JanelaOrcamento(){
		this.setTitle("Or�amento:");
		this.setSize(950, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lbNomeEmpresa = new JLabel();
		lbNomeEmpresa.setBounds(25,25,500,35);
		lbNomeEmpresa.setText("EasyCar Multimarcas (Or�amento)");
		lbNomeEmpresa.setFont(new Font("Century Gothic", Font.BOLD, 26));
		add(lbNomeEmpresa);
		
		lbNome = new JLabel();
		lbNome.setBounds(25, 80, 50, 20);
		lbNome.setText("Nome:");
		add(lbNome);
		txtNome = new JTextField();
		txtNome.setBounds(65, 80, 150, 20);
		add(txtNome);
		
		lbTelefone = new JLabel();
		lbTelefone.setBounds(250, 80, 50, 20);
		lbTelefone.setText("Celular:");
		add(lbTelefone);
		txtTelefone = new JTextField();
		txtTelefone.setBounds(295, 80, 150, 20);
		add(txtTelefone);
		
		lbEmail = new JLabel();
		lbEmail.setBounds(480, 80, 50, 20);
		lbEmail.setText("Email:");
		add(lbEmail);
		txtEmail = new JTextField();
		txtEmail.setBounds(520, 80, 150, 20);
		add(txtEmail);
		
		lbMarca = new JLabel();
		lbMarca.setBounds(25, 110, 50, 20);
		lbMarca.setText("Marca:");
		add(lbMarca);
		cbMarca = new JComboBox();
		cbMarca.addItem("Dodge");
		cbMarca.addItem("Nissan");
		cbMarca.addItem("Mitsubishi");
		cbMarca.setBounds(65, 110, 150, 20);
		add(cbMarca);
		
		lbModelo = new JLabel();
		lbModelo.setBounds(25, 140, 50, 20);
		lbModelo.setText("Model:");
		add(lbModelo);
		cbModelo = new JComboBox();
		cbModelo.setBounds(65, 140, 150, 20);
		add(cbModelo);
		
		ActionListener modelos = new ActionListener() {
		    public void actionPerformed(ActionEvent actionEvent) {
		    	cbModelo.removeAllItems();
		    	if(cbMarca.getSelectedItem().toString().equals("Dodge")) {
		  			model1 = "Challenger";
		  			model2 = "Charger";
		  			model3 = "Durango";
		  			cbModelo.addItem(model1);
					cbModelo.addItem(model2);
					cbModelo.addItem(model3);
		  		}else if(cbMarca.getSelectedItem().toString().equals("Mitsubishi")) {
		  			model1 = "Lancer EVO";
		  			model2 = "Eclipse";
		  			model3 = "Mirage";
		  			cbModelo.addItem(model1);
					cbModelo.addItem(model2);
					cbModelo.addItem(model3);
		  		}else if(cbMarca.getSelectedItem().toString().equals("Nissan")) {
		  			model1 = "Kicks";
		  			model2 = "SkyLine R35";
		  			model3 = "Leaf";
		  			cbModelo.addItem(model1);
					cbModelo.addItem(model2);
					cbModelo.addItem(model3);
		  		}
		    }
		};
		cbMarca.addActionListener(modelos);
		
		rbBranco = new JRadioButton();
		rbBranco.setText("Branco");
		rbBranco.setBounds(25, 170, 75, 25);
		add(rbBranco);
		rbPreto = new JRadioButton();
		rbPreto.setText("Preto");
		rbPreto.setBounds(100, 170, 75, 25);
		add(rbPreto);
		rbCinza = new JRadioButton();
		rbCinza.setText("Cinza");
		rbCinza.setBounds(175, 170, 75, 25);
		add(rbCinza);
		bgCor = new ButtonGroup();
		bgCor.add(rbBranco);
		bgCor.add(rbPreto);
		bgCor.add(rbCinza);
		
		lbCar = new JLabel(imgCar);
		lbCar.setBounds(480, 140, 300, 200);
    	add(lbCar);
		
		ActionListener exibirIMG = new ActionListener() {
		    public void actionPerformed(ActionEvent actionEvent) {
		    	if(rbBranco.isSelected()) {
		    		//Dodge
		    		if(cbModelo.getSelectedItem().toString().equals("Challenger")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("challengerBRANCO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Charger")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("chargersrtBRANCO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Durango")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("durangoBRANCO.png")));
			  		}
		    		
		    		//Nissan
		    		if(cbModelo.getSelectedItem().toString().equals("Kicks")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("kicksBRANCO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("SkyLine R35")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("r35BRANCO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Leaf")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("leafBRANCO.png")));
			  		}
		    		
		    		//Mitsubishi
		    		if(cbModelo.getSelectedItem().toString().equals("Lancer EVO")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("lancerevoBRANCO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Eclipse")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("eclipseBRANCO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Mirage")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("mirageBRANCO.png")));
			  		}
		    		
				}
		    	if(rbPreto.isSelected()) {
					//Dodge
		    		if(cbModelo.getSelectedItem().toString().equals("Challenger")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("challengerPRETO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Charger")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("chargersrtPRETO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Durango")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("durangoPRETO.png")));
			  		}
		    		
		    		//Nissan
		    		if(cbModelo.getSelectedItem().toString().equals("Kicks")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("kicksPRETO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("SkyLine R35")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("r35PRETO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Leaf")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("leafPRETO.png")));
			  		}
		    		
		    		//Mitsubishi
		    		if(cbModelo.getSelectedItem().toString().equals("Lancer EVO")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("lancerevoPRETO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Eclipse")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("eclipsePRETO.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Mirage")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("miragePRETO.png")));
			  		}
		    		
				}
		    	if(rbCinza.isSelected()) {
					//Dodge
					if(cbModelo.getSelectedItem().toString().equals("Challenger")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("challengerCINZA.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Charger")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("chargersrtCINZA.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Durango")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("durangoCINZA.png")));
			  		}
					
					//Nissan
					if(cbModelo.getSelectedItem().toString().equals("Kicks")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("kicksCINZA.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("SkyLine R35")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("r35CINZA.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Leaf")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("leafCINZA.png")));
			  		}
					
					//Mitsubishi
					if(cbModelo.getSelectedItem().toString().equals("Lancer EVO")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("lancerevoCINZA.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Eclipse")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("eclipseCINZA.png")));
			  		}else if(cbModelo.getSelectedItem().toString().equals("Mirage")) {
			  			lbCar.setIcon(new ImageIcon(getClass().getResource("mirageCINZA.png")));
			  		}
					
				}
		    }
		};
		rbBranco.addActionListener(exibirIMG);
		rbPreto.addActionListener(exibirIMG);
		rbCinza.addActionListener(exibirIMG);
		cbModelo.addActionListener(exibirIMG);
		
		//LABEL OPCIONAL
		lbOpcional = new JLabel();
		lbOpcional.setBounds(25,200,100,30);
		lbOpcional.setText("Opcionais:");
		lbOpcional.setFont(new Font("Century Gothic", Font.BOLD, 13));
		add(lbOpcional);
		ckArCondicionado = new JCheckBox();
		ckArCondicionado.setText("Ar Condicionado");
		ckArCondicionado.setBounds(25, 235, 200, 25);
		add(ckArCondicionado);
		ckLigaLeve = new JCheckBox();
		ckLigaLeve.setText("Rodas Liga Leve");
		ckLigaLeve.setBounds(225, 235, 200, 25);
		add(ckLigaLeve);
		ckDirecaoHidraulica = new JCheckBox();
		ckDirecaoHidraulica.setText("Dire��o Hidr�ulica");
		ckDirecaoHidraulica.setBounds(25, 270, 200, 25);
		add(ckDirecaoHidraulica);
		ckKitMultmidia = new JCheckBox();
		ckKitMultmidia.setText("Kit Multim�dia");
		ckKitMultmidia.setBounds(225, 270, 200, 25);
		add(ckKitMultmidia);
		
		btSalvar = new JButton();
		btSalvar.setText("Salvar");
		btSalvar.setBounds(25, 310, 125, 25);
		btSalvar.setBackground(Color.BLACK);
		btSalvar.setForeground(Color.WHITE);
		add(btSalvar);
		
		btCancelar = new JButton();
		btCancelar.setText("Cancelar");
		btCancelar.setBounds(225, 310, 125, 25);
		btCancelar.setBackground(Color.BLACK);
		btCancelar.setForeground(Color.WHITE);
		add(btCancelar);
		
		
		
		
		this.setLayout(null);
		this.setVisible(true);
	}
	
}
