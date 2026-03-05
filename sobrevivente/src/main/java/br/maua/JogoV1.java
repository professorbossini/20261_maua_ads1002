package br.maua;

public class JogoV1 {
    public static void main(String[] args) {
        //construir um objeto do tipo Personagem
        Personagem p1 = new Personagem();
        p1.nome = "Criatura";
        p1.cacar();
        p1.comer();
        p1.dormir();
        p1.cacar();
        //fazer um segundo personagem
        //escolher um nome para ele
        //considerar que ele tem muito sono
        //ele dorme três vezes
        Personagem p2 = new Personagem();
        p2.nome = "Jorge";
        p2.dormir();
        p2.dormir();
        p2.dormir();

    }
    
}
