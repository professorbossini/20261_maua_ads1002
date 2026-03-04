public class TesteLivroDeNotas{
  public static void main(String args[]) {
    // Primeiro livro (já existia)
    LivroDeNotas livro1 = new LivroDeNotas();
    livro1.nomeCurso = "Programação Java";
    livro1.exibirMensagem();

    // 1. Construir o livro2
    LivroDeNotas livro2 = new LivroDeNotas();
    livro2.nomeCurso = "Estrutura de Dados";
    
    // 2. Construir o livro3
    LivroDeNotas livro3 = new LivroDeNotas();
    livro3.nomeCurso = "Banco de Dados";

    // 3. Acionar o comportamento sobre cada um
    livro2.exibirMensagem();
    livro3.exibirMensagem();
}
}