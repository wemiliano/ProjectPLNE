import javax.swing.JOptionPane;

public class Servico_4 {
	private static int acPoint,Disp;
	private static Boolean wi_fi = false;
	private static double area;
	
	public static int getAcPoint () {
		return acPoint;
	}
	public static void setAcPoint (int AcPoint) {
		Servico_4.acPoint=AcPoint; 
	}
	public static int getDisp () {
		return Disp;
	}
	public static  void setDisp (int Disp) {
		Servico_4.Disp=Disp; 
	}
	
	public static Boolean getWi_fi() {
		return wi_fi;
	}
	public static void setWi_fiV (Boolean Wi_fi) {
		Servico_4.wi_fi = true;
		
	}
	public static void setWi_fiF (Boolean Wi_fi) {
		Servico_4.wi_fi = false;
				
	}
	public static double getArea() {
		return area;
	}
	public static void setArea(double Area) {
		Servico_4.area=Area;
		
	}
	
	

	public static void imprimirserv4() {
		
		JOptionPane.showMessageDialog(null,"O n�mero de pontos de Acesso �:" +getAcPoint());
		JOptionPane.showMessageDialog(null,"O n�mero de dispositivos �:" +getDisp());
		JOptionPane.showMessageDialog(null,"O tamnho da �rea a ser instalada a rede em m�:" +getArea());
		JOptionPane.showMessageDialog(null,"� uma rede sem fio: " +getWi_fi());
	}
}

