 //Project for the discipline Programming Language for Networking Environmental I, on FATEC-SP superior course of Technology of Computer Networks , Teacher Hamilton Fernandes, Student Wolfigang de Carvalho Emiliano  
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Pagina pag = new Pagina ();
		Servico_1 serv1 = new Servico_1 ();
		Cliente cli = new Cliente (); 
		Scanner entrada = new Scanner (System.in);
		byte op =0, op2=0, sair=1, sair1=1;	
	    
		JOptionPane.showMessageDialog(null," \n SEJA BEM VINDO \n CYBERWOLF TI SOLUÇÕES EM INFORMÁTICA E REDES");
	    Cliente.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
	    Cliente.setEmail(JOptionPane.showInputDialog("Informe seu email: "));
	    Cliente.setTel(JOptionPane.showInputDialog("Informe seu telefone: "));
	    
	    while(sair!=0) {	    	
	    	op = Byte.parseByte(JOptionPane.showInputDialog(("\n Escolha uma opção para continuar: "
	    			+ "\n 1 - Página Inicial "
	    			+ "\n 2 - Serviços"
	    			+ " \n 3 - Orçamentos "
	    			+ "\n 4 - Localização \n 5 - Sair")));
	    	switch (op) {
	    		case 1:	    		
	    		pag.Pagina_Ini();	    		
	    		break;
	    		
	    		case 2:	    		
	    		pag.Pagina_Serv();	    		
	    		break;
	    		
	    		case 3:
	    		
	    			while (sair1==1) {
	    				op2 = Byte.parseByte(JOptionPane.showInputDialog("Esolha um serviço para Solicitar o orçamento:"
	    						+ "\n 1 - Manutenção de Computadores "
	    						+ "\n 2 - Upgrade de Hardware "
	    						+ "\n 3 - Upgrade de software "
	    						+ "\n 4 - Projetos e Montagem de Redes "
	    						+ "\n 5 - Backups "
	    						+ "\n 6 - Voltar"));
	    				
	    				switch (op2) {
	    				case 1: 
	    				Servico_1.setMarca(JOptionPane.showInputDialog("Informe a Marca do PC:"));
	    				Servico_1.setModelo(JOptionPane.showInputDialog("Informe o modelo do PC: "));
	    				Servico_1.setDefeito(JOptionPane.showInputDialog("Informe qual é o defeito: "));
	    				int resposta = JOptionPane.showConfirmDialog(null,"É um nootbook?");
	    					if(resposta == JOptionPane.YES_OPTION) {
	    						Servico_1.setNootbookV(true);
	    											}
	    					else {
	    						Servico_1.setNootbookF(false);
	    								}
	    					
	    					serv1.imprimirserv();	    					
	    					break;
	    					
	    				case 2:
	    				Servico_2.setMarca(JOptionPane.showInputDialog("Informe a Marca do PC:"));
	    				Servico_2.setModelo(JOptionPane.showInputDialog("Informe o modelo do PC: "));
	    				Servico_2.setMelhoria(JOptionPane.showInputDialog("Informe qual é a melhoria a ser feita: "));
	    				int resposta2 = JOptionPane.showConfirmDialog(null,"É um nootbook?");
	    					if(resposta2 == JOptionPane.YES_OPTION) {
	    						Servico_2.setNootbookV(true);
	    											}
	    					else {
	    						Servico_2.setNootbookF(false);
	    								}

	    					Servico_2.imprimirserv2();
	    					
	    					break;
	    					
	    				case 3:
	    				Servico_3.setMarca(JOptionPane.showInputDialog("Informe a Marca do PC:"));
	    				Servico_3.setModelo(JOptionPane.showInputDialog("Informe o modelo do PC: "));
	    				Servico_3.setMelhoria(JOptionPane.showInputDialog("Informe qual é o Sistema Operacional (Ex. Windows): "));
	    				int resposta3 = JOptionPane.showConfirmDialog(null,"É um nootbook?");
	    					if(resposta3 == JOptionPane.YES_OPTION) {
	    						Servico_3.setNootbookV(true);
	    											}
	    					else {
	    						Servico_3.setNootbookF(false);
	    								}
	    					
	    					Servico_3.imprimirserv3();

	    					break;
	    					
	    				case 4:
	    				Servico_4.setAcPoint(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de pontos de aceso que a rede deve ter:  ")));
	    				Servico_4.setDisp(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de Dispositivos que vai se conectar a rede: ")));
	    				Servico_4.setArea(Double.parseDouble(JOptionPane.showInputDialog("Informe qual é a área a ser instalada a rede em m²: ")));
	    				int resposta4 = JOptionPane.showConfirmDialog(null,"Quer uma rede sem fio?");
	    					if(resposta4 == JOptionPane.YES_OPTION) {
	    						Servico_4.setWi_fiV(true);
	    											}
	    					else {
	    						Servico_4.setWi_fiF(false);
	    								}
	    					
	    					Servico_4.imprimirserv4();
	    					
	    					break;
	    					
	    				case 5:
	    				Servico_5.setMedia(JOptionPane.showInputDialog("Que tipo de Mídia prefere para ser realizado o Backup (Ex. HD externo, Pendrive, Cloud Service, DVD/Blue-ray):"));
	    				Servico_5.setQuant_data(Double.parseDouble(JOptionPane.showInputDialog("Informe qual o tamanho aproximado do Backup em GigaBytes: ")));
	    				int resposta5 = JOptionPane.showConfirmDialog(null,"Quer que os dados sejam protegidos por criptografia?");
	    					if(resposta5 == JOptionPane.YES_OPTION) {
	    						Servico_5.setCriptV(true);
	    											}
	    					else {
	    						Servico_5.setCriptF(false);
	    								}
	    					
	    					Servico_5.imprimirserv5();
	    					
	    					break;
	    				case 6: sair1=2;
    					break;
    					}
	    					    				
	    			}
	    		case 5:
	    			
	    			System.exit(0);
	    				break;		    	
	    		
	    	}
	    }
	    
	    
	}
			
}

	

