import java.util.Scanner;

import javax.swing.JOptionPane;
public class Pagina {
	Scanner entrada = new Scanner (System.in);
	Byte serv = 0;
	public void Pagina_Ini() {
		JOptionPane.showMessageDialog(null,"Os primeiros computadores inventados, "
				+ "\n foram criados para resolver problemas matem�ticos complexos, "
				+ "\n cujos quais o ser humano levaria tempo demais para executar. "
				+ "\n As m�quinas foram ficando cada dia mais sofisticadas at� se "
				+ "\n metamorfosearem na complexa e sin�ptica forma que conhecemos, "
				+ "\n forma essa que se originou atrav�s de avan�os t�cnologicos "
				+ "\n de diferentes �reas do conhecimento combinados para criar "
				+ "\n um dispositvo que tem inteligencia artificial com capacidade"
				+ "\n de processamento de bilh�es de bits por segundo e que atua num"
				+ "\n ciberespa�o que se estende pelo planeta quase sem limites geograficos. "
				+ "\n Parece at� historia de filme de fic��o cientif�ca, Incr�vel n�o �? "
				+ "\n Uma coisa � fato, o computador foi inventado para facilitar a vida, "
				+ "\n se sua maquina est� lenta ou travando tem algo de errado com ela, "
				+ "\n computadores tem o trabalho de automatizar tarefas repetitivas "
				+ "\n nos permite criar dentro de um ambiente virtual e se divertir tamb�m,"
				+ "\n n�o perca seu tempo, conte-nos seu problema e solicite um or�amento. "
				+ "\n O tempo economizado n�o tem pre�o, n�o perca seu tempo. "
				+ "\n Deixaremos sua m�quina como nova, ou montaremos uma nova m�quina para voc�, "
				+ "\n estamos a disposi��o e temos um atendimento personalizado para cada cliente.");
		}
	public void Pagina_Serv() {
		while (serv==0) {
		serv = Byte.parseByte(JOptionPane.showInputDialog("Esolha um servi�o para saber mais sobre ele: "
				+ "\n 1 - Manuten��o de Desktops "
				+ "\n 2 - Upgrade de Hardware "
				+ "\n 3 - Upgrade de software "
				+ "\n 4 - Projetos e Montagem de Redes "
				+ "\n 5 - Backups "
				+ "\n 6 - Voltar "));
		
		switch (serv) {
				case 1: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Tem um computador mas o desempenho dele j� n�o � mais l� aquelas coisas? "
						+ "\n Est� fazendo barulhos estranhos "
						+ "\n ligando de madrugada e parece estar possu�do ? "
						+ "\n Voc� pode estar vendo v�tima de um v�rus, "
						+ "\n arquivos tempor�rios e duplicados podem "
						+ "\n estar acabando com seu espa�o no disco rig�do, "
						+ "\n programas que voc� n�o usa podem estar sendo executados ocultos "
						+ "\n com seu sistema operacional e consumindo sua mem�ria, causando lentid�o "
						+ "\n  vamos verificar todas as possibilidades, "
						+ "\n realizar um ou mais or�amentos e entramos em contato "
						+ "\n em at� no m�ximo 24 horas! "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1"));	
				break;
				
				case 2: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Tem um computador mas o desempenho dele j� n�o � mais l� aquelas coisas? "
						+ "\n Pode ser que seu hardware j� esteja defasado, todos sabemos como a tecnol�gia avan�a depressa, "
						+ "\n e para acompanhar os avan�os tecnol�gicos "
						+ "\n � necess�rio manter sua m�quina sempre com pe�as originais e de boa proced�ncia, "
						+ "\n o compenente ser� trocado por um t�cnico capacitado para preservar a integridade"
						+ "\n do hardware tendo em vista que � os perif�ricos s�o caros, e extremamente sens�veis,"
						+ "\n cada caso vai exigir um tipo de hardware especif�fco e cada hardware tem suas particularidades "
						+ "\n podem haver incompatibilidades \n ent�o  vamos verificar todas as possibilidades, "
						+ "\n realizar um ou mais or�amentos e entramos em contato em at� no m�ximo 24 horas! "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1 "));
	    		break;
	    		
				case 3: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Tem um computador mas o desempenho dele j� n�o � mais aquelas coisas? "
						+ "\n Talvez esteja na hora de trocar o seu sistema operacional, "
						+ "\n o Windows 7 j� n�o recebe mais suporte t�cnico e nem atualiza��es de seguran�a  "
						+ "\n da sua fabricante a Microsoft, isso � um prato cheio para hackers que est�o sempre "
						+ "\n em busca de vulnerabilidades, usar um sistema operacional que est� fora de linha ou que � pirata, "
						+ "\n coloca em risco a sua seguran�a no mundo digital, tendo em vista que seu computador pode ser alvo "
						+ "\n dos mais diversos tipos de fraudes e mal funcionamentos, hoje os valores dos softawares s�o bem mais"
						+ "\n acess�veis do que eram � uma d�cada atr�s e mesmo assim se voc� que n�o vale a pena pagar pelo sistema, "
						+ "\n ou n�o possu� condi��es financeiras para tal investimento, voc� tem direito a tecnologia boa  tamb�m,"
						+ "\n existem muitas distribui��es gratuitas de Linux que oferecem uma plataforma t�o funcional quanto a da Microsoft, "
						+ "\n j� ouviu falar em Linux? Incompatibilidades podem existir ent�o vamos verificar todas as possibilidades, "
						+ "\n realizar um ou mais or�amentos e entramos em contato em at� no m�ximo 24 horas! "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1 "));
	    		break;
	    		
				case 4: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Se mudou para uma casa nova e vai contratar o servi�o de um provedor de internet? "
						+ "\n Fa�a um consultoria ap�s a instala��o, verificaremos se a velocidade que est� sendo entregue "
						+ "\n � compat�vel a velocidade que foi contratada, iremos posicionar o seu roteador num ponto em que o sinal "
						+ "\n se espalhe por toda sua loja ou resid�ncia, se for necess�rio podemos acresentar mais roteadores ou repetidores de sinal, "
						+ "\n criamos pontos de acesso em diferentes locais caso sejam necess�rios, configuramos impressoras e pastas para compartilhamento "
						+ "\n de arquivos e at� ambientes de rede locais (Local Area Network) para jogos digitais, todo esse servi�o realizado com capricho "
						+ "\n e visando a harmonia est�tica \n nos conte o seu projeto e n�s vamos realizar um ou mais or�amentos e entramos em contato "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1 "));
	    		break;
	    		
				case 5: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Se voc� n�o sabe o que � o Backup com certeza j� ouviu algu�m dizer essa palavra por a�. "
						+ "\n E eu lhe digo por que, o Backup � MUITO importante, "
						+ "\n imagine que na ultima d�cada praticamente todos os celulares "
						+ "\n agora tem c�meras digitais integradas "
						+ "\n e n�o imprimimos mais essas fotos em papel, "
						+ "\n 10 anos fotografando a vida cotidiana e a familia "
						+ "\n cria um grande volume de dados que � salvo em um computador, "
						+ "\n mas e se esse computador falhar, se ele for perdido, danificado ou pior sofrer uma ATAQUE? "
						+ "\n o Backup � uma c�pia de seguran�a de toda aquela d�cada de registros "
						+ "\n fotograficos que ser� eternizada atrav�s de meios eletr�nicos "
						+ "\n e salvas num local seguro para ser deixado para posteridade, ou n�o podemos "
						+ "\n criptografar os arquivos numa chave secreta e nunca ningu�m ter� acesso � aquela informa��o "
						+ "\n caso n�o possua a chave, \n fazemos o backup de dados em HD externos, cart�es de mem�ria, pendrives "
						+ "\n e na nuvem s�o muitas possibilidades e o valor vai variar conforme o volume dos dados, "
						+ "\n nos conte o que gostaria de eternizar atrav�s da tecnologia e iremos realizar um ou mais or�amentos "
						+ "\n e entramos em contato em at� no m�ximo 24 horas! "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1")); 
	    		break;
	    		
				case 6:
				serv = 1;
				break;
				
				default: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Ops... Voc� selecionou uma op��o inv�lida \n Para voltar ao Menu de Informa��es sobre servi�os digite 0 para sair digite 1"));
				break;
							}
					}
			}
	public void Pagina_Loc() {
		JOptionPane.showMessageDialog(null, "Rua Doutor Jos� Carlos de Araujo - Jardim Novo Osasco, S�o Paulo - BRAZIL  \n Telefone (11)99245-5982 \n email: cyberwolfti@gmail.com");
	    	
	}
}
	

