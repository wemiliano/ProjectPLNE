import javax.swing.JOptionPane;

public class Servico_3 {
	public static String  marca;
	public static String modelo;
	public static String sisop;
	public static Boolean nootbook = false;
	
	public static String getModelo () {
		return modelo;
	}
	public static void setModelo (String modelo) {
		Servico_3.modelo=modelo; 
	}
	public static String getMarca () {
		return marca;
	}
	public static  void setMarca (String marca) {
		Servico_3.marca=marca; 
	}
	public static String getSisop () {
		return sisop;
	}
	public static void setMelhoria (String sisop) {
		Servico_3.sisop=sisop;
	}
	public boolean nootbook () {
		return nootbook;
	}
	public Boolean getNootbook() {
		return nootbook;
	}
	public static void setNootbookV (Boolean nootbook) {
		Servico_3.nootbook = true;
		
	}
	public static void setNootbookF (Boolean nootbook) {
		Servico_3.nootbook = false;
		
	}
	
	public static void imprimirserv3() {
		
		JOptionPane.showMessageDialog(null,"O Marca do computador é:" +getMarca());
		JOptionPane.showMessageDialog(null,"O Modelo do computador é:" +getModelo());
		JOptionPane.showMessageDialog(null,"O Sistema Operacional atualmente é:" +getSisop());
		JOptionPane.showMessageDialog(null,"É um nootbook: " +nootbook);
	}
}
