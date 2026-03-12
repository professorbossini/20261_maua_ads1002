public class Veiculo {
  private String modelo;
  private String placa;
  private double nivelCombustivel;

  public Veiculo(String modelo, String placa){
    //resolver o mesmo problema usando os métodos setters
    setModelo(modelo);
    setPlaca(placa);  
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void acelerar(){
    System.out.printf("%s acelerando\n", modelo);
  }

  public void abastecer(){
    System.out.printf("%s abastecendo\n", modelo);
  }

  
}
