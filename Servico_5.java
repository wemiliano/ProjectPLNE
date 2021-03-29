import javax.swing.JOptionPane;

public class Servico_5 {
	private static String media;
	private static Boolean cript = false;
	private static double quant_data;
	
	public static String getMedia () {
		return media;
	}
	public static void setMedia (String media) {
		Servico_5.media=media; 
	}
		
	public static Boolean getCript() {
		return cript;
	}
	public static void setCriptV (Boolean Cript) {
		Servico_5.cript = true;
		
	}
	public static void setCriptF (Boolean Cript) {
		Servico_5.cript = false;
	}
	public static double getQuant_data() {
		return quant_data;
	}
	public static void setQuant_data(double Quant_data) {
		Servico_5.quant_data=Quant_data;
		
	}
	public static void imprimirserv5() {
		
		JOptionPane.showMessageDialog(null,"A midia em que será realizada o backup é:" +getMedia());
		JOptionPane.showMessageDialog(null,"Os dados serão criptografados:" +getCript());
		JOptionPane.showMessageDialog(null,"Quantidade de dados em GB aproximadamente:" +getQuant_data());
		}
}