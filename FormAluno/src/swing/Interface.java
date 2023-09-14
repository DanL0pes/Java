package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame{
	
	private JLabel lbNome;
	private JTextField txtNome;
	private JButton btExibir;
	private JComboBox cbTurma;
	private ButtonGroup bgTurma;
	private JRadioButton rdTurma1, rdTurma2, rdTurma3;
	private JCheckBox ckJogo1, ckJogo2, ckJogo3;
	
	public Interface(){
		this.setTitle("Formulário:");
		this.setSize(360, 260);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lbNome = new JLabel();
		lbNome.setBounds(25, 25, 100, 25);
		lbNome.setText("Nome:");
		add(lbNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(25, 50, 300, 25);
		add(txtNome);
		
		cbTurma = new JComboBox();
		cbTurma.addItem("MTEC DS");
		cbTurma.addItem("MTEC NUTRI");
		cbTurma.setBounds(25, 80, 300, 25);
		add(cbTurma);

		rdTurma1 = new JRadioButton();
		rdTurma1.setText("1* Série");
		rdTurma1.setBounds(25, 105, 75, 25);
		add(rdTurma1);
		
		rdTurma2 = new JRadioButton();
		rdTurma2.setText("2* Série");
		rdTurma2.setBounds(125, 105, 75, 25);
		add(rdTurma2);
		
		rdTurma3 = new JRadioButton();
		rdTurma3.setText("3* Série");
		rdTurma3.setBounds(225, 105, 75, 25);
		add(rdTurma3);
		
		bgTurma = new ButtonGroup();
		bgTurma.add(rdTurma1);
		bgTurma.add(rdTurma2);
		bgTurma.add(rdTurma3);
		
		ckJogo1 = new JCheckBox();
		ckJogo1.setText("Grounded");
		ckJogo1.setBounds(25, 130, 100, 25);
		add(ckJogo1);
		
		ckJogo2 = new JCheckBox();
		ckJogo2.setText("Minecraft");
		ckJogo2.setBounds(125, 130, 100, 25);
		add(ckJogo2);
		
		ckJogo3 = new JCheckBox();
		ckJogo3.setText("Sea of Thieves");
		ckJogo3.setBounds(225, 130, 100, 25);
		add(ckJogo3);
		
		btExibir = new JButton();
		btExibir.setText("Exibir");
		btExibir.setBounds(25, 165, 300, 25);
		btExibir.setBackground(Color.BLACK);
		btExibir.setForeground(Color.WHITE);
		add(btExibir);
		btExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome, turma, serie="", jogo="";
				nome = txtNome.getText();
				turma = cbTurma.getSelectedItem().toString();
				
				if(rdTurma1.isSelected()) {
					serie = rdTurma1.getText();
				}else if(rdTurma2.isSelected()) {
					serie = rdTurma2.getText();
				}else if(rdTurma3.isSelected()) {
					serie = rdTurma3.getText();
				}
				
				if(ckJogo1.isSelected()) {
					jogo = jogo + " " +ckJogo1.getText();
				}
				if(ckJogo2.isSelected()) {
					jogo = jogo + " " +ckJogo2.getText();
				}
				if(ckJogo3.isSelected()) {
					jogo = jogo + " " +ckJogo3.getText();
				}
				
				JOptionPane.showMessageDialog(null, "Nome do aluno: "+nome+"\nTurma: "+turma+"\nSérie: "+serie+"\nJogo Preferido: "+jogo);
			}
        });
		
		this.setLayout(null);
		this.setVisible(true);
	}
}
