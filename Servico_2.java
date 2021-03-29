import javax.swing.JOptionPane;

public class Servico_2 {
	
	public static String  marca;
	public static String modelo;
	public static String melhoria;
	public static Boolean nootbook = false;
	
	public static String getModelo () {
		return modelo;
	}
	public static void setModelo (String modelo) {
		Servico_2.modelo=modelo; 
	}
	public static String getMarca () {
		return marca;
	}
	public static  void setMarca (String marca) {
		Servico_2.marca=marca; 
	}
	public static String getMelhoria () {
		return melhoria;
	}
	public static void setMelhoria (String melhoria) {
		Servico_2.melhoria=melhoria;
	}
	public boolean nootbook () {
		return nootbook;
	}
	public Boolean getNootbook() {
		return nootbook;
	}
	public static void setNootbookV (Boolean nootbook) {
		Servico_2.nootbook = true;
		
	}
	public static void setNootbookF (Boolean nootbook) {
		Servico_2.nootbook = false;
		
	}
	
	public static void imprimirserv2() {
		
		JOptionPane.showMessageDialog(null,"O Marca do computador é:" +getMarca());
		JOptionPane.showMessageDialog(null,"O Modelo do computador é:" +getModelo());
		JOptionPane.showMessageDialog(null,"A melhoria a ser feita é:" +getMelhoria());
		JOptionPane.showMessageDialog(null,"É um nootbook: " +nootbook);
	}

}
