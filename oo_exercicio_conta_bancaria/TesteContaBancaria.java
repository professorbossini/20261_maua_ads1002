import java.util.Random;
public class TesteContaBancaria {
  public static void main(String[] args) throws Exception {
    Random gerador = new Random();
    ContaBancaria conta1 = new ContaBancaria("Ana", "12345", 1000);
    ContaBancaria conta2 = new ContaBancaria("João", "45678", 1000);
    while(true){
      //1: conta da Ana 2: conta do João
      int qualConta = gerador.nextInt(1,3);
      int qualOperacao = gerador.nextInt(1, 4);
      double quanto = gerador.nextDouble(1, 500);
      switch(qualConta){
        case 1: //Ana
          if(qualOperacao == 1){//deposito
            System.out.printf("=== Operação: DEPÓSITO na conta de %s ===\n", conta1.getTitular());
            conta1.depositar(quanto);      
          }
          else if(qualOperacao == 2){ //saque
            System.out.printf("=== Operação: SAQUE na conta de %s ===\n", conta1.getTitular());
            conta1.sacar(quanto);
          }
          else{ //transferência
            System.out.printf(
              "=== Operação TRANSFERÊNCIA de %s para %s no valor de R$%.2f\n ===",
              conta1.getTitular(), conta2.getTitular(), quanto
            );
            conta1.transferir(conta2, quanto);
          }
          break;
        case 2: //João
          switch(qualOperacao){
            case 1: //depósito
              System.out.printf("=== Operação DEPÓSITO na conta de %s ===\n", conta2.getTitular());
              conta2.depositar(quanto);
              break;
            case 2: //saque
              System.out.printf("=== Operação SAQUE na conta de %s ===\n", conta2.getTitular());
              conta2.sacar(quanto);
              break;
            case 3: //transferência
              conta2.transferir(conta1, quanto);
              System.out.printf(
                "=== Operação TRANSFERÊNCIA de %s para %s no valor de R$%.2f\n ===",
                conta2.getTitular(), conta1.getTitular(), quanto
              );
              break;
          }
          break;
      }
      conta1.exibirExtrato();
      conta2.exibirExtrato();
      Thread.sleep(20000);
    }
    
  }
}
