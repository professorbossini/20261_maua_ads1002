public class TesteVetores {
  public static void main(String[] args) {
    int [] v1 = new int [5];
    int [] v2 = {42, 17, 8, 55};
    //for comum
    for(int i = 0; i < v2.length; i++){
      System.out.println(v2[i]);
    }
    int i = 0;
    while(i < v2.length){
      System.out.println(v2[i]);
      i++;
    }
    //enhanced for (for each) (Java 5+)
    for(int numero : v2){
      System.out.println(numero);
    }

    // System.out.println(v1[2]);  
    // v1[0] = 42;
    // v1[1] = 17;
    // v1[2] = 8;
    // v1[3] = 55;
    // v1[4] = 23;
    // v1[5] = 64;
  }
}
