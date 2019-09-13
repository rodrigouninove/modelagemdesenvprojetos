package Util;

import java.util.Scanner;

public class ScannerUtil {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static String pegarTexto(String mensagem) {

        boolean erro = false;
        String texto = "";
        do {
            try {
                System.out.print(mensagem);
                texto = scanner.nextLine().trim();
                if (texto.isEmpty()) {
                    throw new Exception("Erro recuperar texto, tente novamente");
                }

                erro = false;
                break;
                
            } catch (Exception e) {

                erro = true;
                System.err.println(e.getMessage());
            }
        } while (erro);

        return texto;
    }

    public static int pegarNumero(String mensagem) {

        boolean erro = false;
        int numero = 0;

        do {
            try {
                System.out.print(mensagem);
                numero = Integer.parseInt(scanner.nextLine().trim());
                break;
            } catch (Exception e) {
                erro = true;
                System.err.println("Não foi possivel converter em numero, tente novamente");
            }
        } while (erro);

        return numero;

    }
    
    public static void escreverLinha(){
        System.out.println("=================================");
    }
}
