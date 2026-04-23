import java.util.*;
import javax.swing.JOptionPane;
public class Playlist {
  public static void main(String[] args) {
    //musicas = []
    List <Musica> musicas = new ArrayList<Musica>();
    //1 Adicionar
    //2 Visualizar a lista
    //3 Dar uma nota
    //0 Sair
    String menu = "1-Adicionar\n2-Visualizar lista\n3-Avaliar\n0-Sair\n";
    int opcao;
    do{
      // int(input())
      opcao = 
        Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch(opcao){
        case 1:
          String titulo = JOptionPane.showInputDialog("Título?");
          Musica musica = new Musica(titulo);
          musicas.add(musica);
          break;
        case 2:
          String textoFinal = "";
          //enhanced for ou foreach: Java 5+
          for(Musica m : musicas){
            textoFinal = textoFinal + m.getTitulo() + " ";
          }
          JOptionPane.showMessageDialog(null, textoFinal);
          break;
        case 3:
          //pegar o título da música
          //pegar a nota da música
          //encontrar a música na coleção
          //atribuir a nota a ela
          String titulo2 = JOptionPane.showInputDialog("Título");
          int nota = 
            Integer.parseInt(JOptionPane.showInputDialog("Nota?"));
          boolean foiAvaliada = false;
          for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).getTitulo().equals(titulo2)){
              musicas.get(i).setNota(nota);
              JOptionPane.showMessageDialog(null, "Música avaliada");
              foiAvaliada = true;
            }
          }
          if(!foiAvaliada)
            JOptionPane.showMessageDialog(null, "Música não encontrada");
          break;
      }  
    }while(opcao != 0);
  }  
}
