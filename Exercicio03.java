import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args){

		String texto = "";

		for (int linha = 0; linha < 21; linha++){
			for (int coluna = 0; coluna <21; coluna++){
				texto += " *  ";
			}
			texto += "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}

}
