import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		String texto = " ";
		
		for(int i = 0; i<11; i++){
			for(int j = 0; j<11; j++){
			texto += "\n" + i+ " x "+ j + " = " + (i*j);
		}
		}
		JOptionPane.showMessageDialog(null, texto);
	}

}
