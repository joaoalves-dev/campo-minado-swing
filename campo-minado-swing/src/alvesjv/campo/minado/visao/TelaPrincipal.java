package alvesjv.campo.minado.visao;

import javax.swing.JFrame;

import alvesjv.campo.minado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16,30,50);
		add(new PainelTabuleiro(tabuleiro));
		
		setVisible(true);
		setSize(690, 438);
		setTitle("Campo Minado");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
	}
}
