package ArrayObjeto;

import Util.ScannerUtil;

public class Exemplo02 {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];

        //Cria as pessoas
        for (int i = 0; i < 2; i++) {
            pessoas[i] = criarPessoa();
        }

        //Imprime a pessoa
        for (Pessoa p : pessoas) {
            if (p != null) {
                System.out.println("NOME: " + p.getNome() + "  " + "IDADE: " + p.getIdade());

            }
        }
    }

    public static Pessoa criarPessoa() {
        String nome = ScannerUtil.pegarTexto("Digite o nome: ");
        int idade = ScannerUtil.pegarNumero("Digite a idade: ");
        ScannerUtil.escreverLinha();
        return new Pessoa(nome, idade);
    }

}
