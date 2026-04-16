
public class ContaBancaria {
  private String titular;
  private String numero;
  private double saldo;
  
  public ContaBancaria(String titular, String numero, double saldo){
    this.titular = titular;
    this.numero = numero;
    setSaldo(saldo);
  }

  String getTitular(){
    return titular;
  }
  
  void setSaldo(double saldo){
    if(saldo > 0)
      this.saldo = saldo;
  }

  void depositar(double valor){
    if(valor <= 0){
      System.out.println("Erro ao depositar. Valor deve ser positivo.");
    }
    else{
      saldo = saldo + valor;
      System.out.printf("Depósito de R$%.2f realizado com sucesso.\n", valor);
    }
  }

  void sacar(double valor){
    if(valor <= 0){
      System.out.println("Erro ao sacar. Valor deve ser positivo.");
    }
    else if(valor > saldo){
      System.out.println("Valor não pode ser maior do que o saldo.");
    }
    else{
      saldo -= valor;
      System.out.printf("Saque de R$%.2f realizado com sucesso.\n", valor);
    }
  }

  void transferir(ContaBancaria destino, double valor){
    if(valor <= 0){
      System.out.println("Erro ao transferir. Valor deve ser positivo");
    }
    else if(valor > saldo){
      System.out.println("Valor não pode ser maior do que o saldo");
    }
    else{
      //1. Atualizar o saldo, retirando o valor
      saldo = saldo - valor;
      //2. Atualizar o saldo da destino, adicionando o valor
      destino.saldo += valor;
      System.out.printf(
        "Transferência de R$%.2f da conta de %s para a conta de %s\n",
        valor, titular, destino.titular   
      );
    }
  }

  void consultarSaldo(){
    //Titular: Ana | Número: 12345 | Saldo: R$400
    System.out.printf(
      "Titular: %s | Número: %s | Saldo: R$%.2f\n",
      titular, numero, saldo
    );
  }

  void exibirExtrato(){
    System.out.println("--- Extrato ---");
    System.out.printf("Titular: %s\n", titular);
    System.out.printf("Conta: %s\n", numero);
    System.out.printf("Saldo: %.2f\n", saldo);
  }

}
