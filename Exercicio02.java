import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		String texto = " ";
		
		for(int j = 0; j<11; j++){
		for(int i = 0; i<11; i++){
			texto += i + " x "+ j + " = " + (i*j) + "     ";
		}
			texto += "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}

}
