public class TesteVeiculo {
  public static void main(String[] args) {
    
    var veiculo1 = new Veiculo("Fusca", "ABC-1234");
    var veiculo2 = new Veiculo("Corolla", "AAA-1111");

    veiculo1.acelerar();
    veiculo1.abastecer();
    veiculo2.acelerar();
    veiculo2.abastecer();
  }  
}
