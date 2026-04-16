import javax.swing.JOptionPane;

public class OperacoesVetores {
  static int [] numeros = new int[5];
  static int quantidade = 0;
  static String menu = 
    "1-Adicionar\n2-Exibir\n3-Buscar\n4-Ver o maior\n0-Sair";
  public static void main(String[] args) {
    int opcao;
    do{
      opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch(opcao){
        case 1:
          adicionar();
          break;
        case 2:
          exibir();
          break;  
      }
    }while(opcao != 0);
  }
  static void adicionar(){
    if(quantidade == numeros.length){
      JOptionPane.showMessageDialog(null, "Vetor cheio!");
      return;
    }  
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor?"));
    numeros[quantidade] = valor;
    quantidade++;
    JOptionPane.showMessageDialog(null, "Valor adicionado com sucesso!");
  }

  static void exibir(){
    if(quantidade == 0){
      JOptionPane.showMessageDialog(null, "Vetor vazio");
      return;
    }
    String texto = "";
    for(int i = 0; i < quantidade; i++){
      texto = texto + numeros[i] + " ";
    }
    JOptionPane.showMessageDialog(null, texto);
  }

  static void buscar(){
    if(quantidade == 0){
      JOptionPane.showMessageDialog(null, "Vetor vazio");
      return;
    }
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor"));
    for(int i = 0; i < quantidade; i++){
      if(valor == numeros[i]){
        JOptionPane.showMessageDialog(null, "Encontrado na posição: " + i);
        return;
      }
    }
    JOptionPane.showMessageDialog(null, "Elemento não encontrado");
  }

  static void acharMaior(){
    if(quantidade == 0){
      JOptionPane.showMessageDialog(null, "Vetor vazio");
      return;
    }
    int maior = numeros[0];
    for(int i = 1; i < quantidade; i++){
      //operador ternário
      maior = numeros[i] > maior ? numeros[i] : maior;
    }
    JOptionPane.showMessageDialog(null, "Maior: " + maior);

  }

  //somar todos os elementos do vetor
  static void somar(){
    if(quantidade == 0){
      JOptionPane.showMessageDialog(null, "Vetor vazio");
      return;
    }
    int ac = 0;
    for(int numero : numeros){
      ac += numero;
    }
    JOptionPane.showMessageDialog(null,"Soma: " + ac);
  }

  //dizer quantos elementos pares o vetor tem
  static void quantosPares(){
    int quantidadePares = 0;
    for(int numero : numeros){
      if(numero % 2 == 0)
        quantidadePares++;
    }
    JOptionPane.showMessageDialog(null, "Total de pares: " + quantidadePares);
  }

  static boolean estaVazio(){
    if (quantidade == 0)
      return true;
    return false;
  }
}
