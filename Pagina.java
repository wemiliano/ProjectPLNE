import java.util.Scanner;

import javax.swing.JOptionPane;
public class Pagina {
	Scanner entrada = new Scanner (System.in);
	Byte serv = 0;
	public void Pagina_Ini() {
		JOptionPane.showMessageDialog(null,"Os primeiros computadores inventados, "
				+ "\n foram criados para resolver problemas matemáticos complexos, "
				+ "\n cujos quais o ser humano levaria tempo demais para executar. "
				+ "\n As máquinas foram ficando cada dia mais sofisticadas até se "
				+ "\n metamorfosearem na complexa e sinóptica forma que conhecemos, "
				+ "\n forma essa que se originou através de avanços técnologicos "
				+ "\n de diferentes áreas do conhecimento combinados para criar "
				+ "\n um dispositvo que tem inteligencia artificial com capacidade"
				+ "\n de processamento de bilhões de bits por segundo e que atua num"
				+ "\n ciberespaço que se estende pelo planeta quase sem limites geograficos. "
				+ "\n Parece até historia de filme de ficção cientifíca, Incrível não é? "
				+ "\n Uma coisa é fato, o computador foi inventado para facilitar a vida, "
				+ "\n se sua maquina está lenta ou travando tem algo de errado com ela, "
				+ "\n computadores tem o trabalho de automatizar tarefas repetitivas "
				+ "\n nos permite criar dentro de um ambiente virtual e se divertir também,"
				+ "\n não perca seu tempo, conte-nos seu problema e solicite um orçamento. "
				+ "\n O tempo economizado não tem preço, não perca seu tempo. "
				+ "\n Deixaremos sua máquina como nova, ou montaremos uma nova máquina para você, "
				+ "\n estamos a disposição e temos um atendimento personalizado para cada cliente.");
		}
	public void Pagina_Serv() {
		while (serv==0) {
		serv = Byte.parseByte(JOptionPane.showInputDialog("Esolha um serviço para saber mais sobre ele: "
				+ "\n 1 - Manutenção de Desktops "
				+ "\n 2 - Upgrade de Hardware "
				+ "\n 3 - Upgrade de software "
				+ "\n 4 - Projetos e Montagem de Redes "
				+ "\n 5 - Backups "
				+ "\n 6 - Voltar "));
		
		switch (serv) {
				case 1: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Tem um computador mas o desempenho dele já não é mais lá aquelas coisas? "
						+ "\n Está fazendo barulhos estranhos "
						+ "\n ligando de madrugada e parece estar possuído ? "
						+ "\n Você pode estar vendo vítima de um vírus, "
						+ "\n arquivos temporários e duplicados podem "
						+ "\n estar acabando com seu espaço no disco rigído, "
						+ "\n programas que você não usa podem estar sendo executados ocultos "
						+ "\n com seu sistema operacional e consumindo sua memória, causando lentidão "
						+ "\n  vamos verificar todas as possibilidades, "
						+ "\n realizar um ou mais orçamentos e entramos em contato "
						+ "\n em até no máximo 24 horas! "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1"));	
				break;
				
				case 2: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Tem um computador mas o desempenho dele já não é mais lá aquelas coisas? "
						+ "\n Pode ser que seu hardware já esteja defasado, todos sabemos como a tecnológia avança depressa, "
						+ "\n e para acompanhar os avanços tecnológicos "
						+ "\n é necessário manter sua máquina sempre com peças originais e de boa procedência, "
						+ "\n o compenente será trocado por um técnico capacitado para preservar a integridade"
						+ "\n do hardware tendo em vista que é os periféricos são caros, e extremamente sensíveis,"
						+ "\n cada caso vai exigir um tipo de hardware especifífco e cada hardware tem suas particularidades "
						+ "\n podem haver incompatibilidades \n então  vamos verificar todas as possibilidades, "
						+ "\n realizar um ou mais orçamentos e entramos em contato em até no máximo 24 horas! "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1 "));
	    		break;
	    		
				case 3: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Tem um computador mas o desempenho dele já não é mais aquelas coisas? "
						+ "\n Talvez esteja na hora de trocar o seu sistema operacional, "
						+ "\n o Windows 7 já não recebe mais suporte técnico e nem atualizações de segurança  "
						+ "\n da sua fabricante a Microsoft, isso é um prato cheio para hackers que estão sempre "
						+ "\n em busca de vulnerabilidades, usar um sistema operacional que está fora de linha ou que é pirata, "
						+ "\n coloca em risco a sua segurança no mundo digital, tendo em vista que seu computador pode ser alvo "
						+ "\n dos mais diversos tipos de fraudes e mal funcionamentos, hoje os valores dos softawares são bem mais"
						+ "\n acessíveis do que eram à uma década atrás e mesmo assim se você que não vale a pena pagar pelo sistema, "
						+ "\n ou não possuí condições financeiras para tal investimento, você tem direito a tecnologia boa  também,"
						+ "\n existem muitas distribuições gratuitas de Linux que oferecem uma plataforma tão funcional quanto a da Microsoft, "
						+ "\n já ouviu falar em Linux? Incompatibilidades podem existir então vamos verificar todas as possibilidades, "
						+ "\n realizar um ou mais orçamentos e entramos em contato em até no máximo 24 horas! "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1 "));
	    		break;
	    		
				case 4: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Se mudou para uma casa nova e vai contratar o serviço de um provedor de internet? "
						+ "\n Faça um consultoria após a instalação, verificaremos se a velocidade que está sendo entregue "
						+ "\n é compatível a velocidade que foi contratada, iremos posicionar o seu roteador num ponto em que o sinal "
						+ "\n se espalhe por toda sua loja ou residência, se for necessário podemos acresentar mais roteadores ou repetidores de sinal, "
						+ "\n criamos pontos de acesso em diferentes locais caso sejam necessários, configuramos impressoras e pastas para compartilhamento "
						+ "\n de arquivos e até ambientes de rede locais (Local Area Network) para jogos digitais, todo esse serviço realizado com capricho "
						+ "\n e visando a harmonia estética \n nos conte o seu projeto e nós vamos realizar um ou mais orçamentos e entramos em contato "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1 "));
	    		break;
	    		
				case 5: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Se você não sabe o que é o Backup com certeza já ouviu alguém dizer essa palavra por aí. "
						+ "\n E eu lhe digo por que, o Backup é MUITO importante, "
						+ "\n imagine que na ultima década praticamente todos os celulares "
						+ "\n agora tem câmeras digitais integradas "
						+ "\n e não imprimimos mais essas fotos em papel, "
						+ "\n 10 anos fotografando a vida cotidiana e a familia "
						+ "\n cria um grande volume de dados que é salvo em um computador, "
						+ "\n mas e se esse computador falhar, se ele for perdido, danificado ou pior sofrer uma ATAQUE? "
						+ "\n o Backup é uma cópia de segurança de toda aquela década de registros "
						+ "\n fotograficos que será eternizada através de meios eletrônicos "
						+ "\n e salvas num local seguro para ser deixado para posteridade, ou não podemos "
						+ "\n criptografar os arquivos numa chave secreta e nunca ninguém terá acesso à aquela informação "
						+ "\n caso não possua a chave, \n fazemos o backup de dados em HD externos, cartões de memória, pendrives "
						+ "\n e na nuvem são muitas possibilidades e o valor vai variar conforme o volume dos dados, "
						+ "\n nos conte o que gostaria de eternizar através da tecnologia e iremos realizar um ou mais orçamentos "
						+ "\n e entramos em contato em até no máximo 24 horas! "
						+ "\n"
						+ "\n Para voltar digite 0 para sair digite 1")); 
	    		break;
	    		
				case 6:
				serv = 1;
				break;
				
				default: 
				serv = Byte.parseByte(JOptionPane.showInputDialog("Ops... Você selecionou uma opção inválida \n Para voltar ao Menu de Informações sobre serviços digite 0 para sair digite 1"));
				break;
							}
					}
			}
	public void Pagina_Loc() {
		JOptionPane.showMessageDialog(null, "Rua Doutor José Carlos de Araujo - Jardim Novo Osasco, São Paulo - BRAZIL  \n Telefone (11)99245-5982 \n email: cyberwolfti@gmail.com");
	    	
	}
}
	

