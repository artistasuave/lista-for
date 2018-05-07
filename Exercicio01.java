import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		String texto = " ";
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do que se deseja a tabuada:"));

		for (int i = 1; i < 11; i++) {
			texto += "\n" +numero+" x "+i+" = "+(numero*i);
		}
		
		JOptionPane.showMessageDialog(null,
				"Tabuada do número "+numero+
				texto);
	}

}
