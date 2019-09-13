package ArrayObjeto;

public class Exemplo01 {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[5];

        for (int i = 0; i < 5; i++) {
            Pessoa pessoa = new Pessoa();
            if(i % 2 == 0){
                pessoa.setNome("João da Silva");
            }else{
                pessoa.setNome("Maria da Silva");
            }
            pessoa.setIdade(20 + i);
            pessoas[i] = pessoa;
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade());
        }
    }

}
