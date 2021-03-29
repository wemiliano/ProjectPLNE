import javax.swing.JOptionPane;

public class Servico_1 {
	
	public static String  marca;
	public static String modelo;
	public static String defeito;
	public static Boolean nootbook = false;
	
	
	public static String getModelo () {
		return modelo;
	}
	public static void setModelo (String modelo) {
		Servico_1.modelo=modelo; 
	}
	public static String getMarca () {
		return marca;
	}
	public static  void setMarca (String marca) {
		Servico_1.marca=marca; 
	}
	public static String getDefeito () {
		return defeito;
	}
	public static void setDefeito (String defeito) {
		Servico_1.defeito=defeito;
	}
	public boolean nootbook () {
		return nootbook;
	}
	public Boolean getNootbook() {
		return nootbook;
	}
	public static void setNootbookV (Boolean nootbook) {
		Servico_1.nootbook = true;
		
	}
	public static void setNootbookF (Boolean nootbook) {
		Servico_1.nootbook = false;
		
	}
	
	public static void imprimirserv() {
		
		JOptionPane.showMessageDialog(null,"O Marca do computador é: " +getMarca());
		JOptionPane.showMessageDialog(null,"O Modelo do computador é: " +getModelo());
		JOptionPane.showMessageDialog(null,"O defeito apresentado é: " +getDefeito());
		JOptionPane.showMessageDialog(null,"É um nootbook: "+nootbook);
	}
}
