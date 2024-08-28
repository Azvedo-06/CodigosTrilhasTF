package Main.Trilha02;

public class Pessoa extends Universidade {
    String nome;
    String universidadeTR;

    public void mostrar() {
        System.out.println("seu nome é: " + nome);
        System.out.println("Trabalha na universidade: " + universidadeTR);
    }
}
