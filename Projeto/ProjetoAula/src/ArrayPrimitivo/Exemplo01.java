package ArrayPrimitivo;

public class Exemplo01 {

    
    public static void main(String[] args) {
        
        int[] inteiros = new int[5];
        
        inteiros[0] = 10;
        inteiros[1] = 100;
        inteiros[2] = 1000;
        inteiros[3] = 10000;
        inteiros[4] = 100000;
        
        for (int i = 0; i < inteiros.length; i++) {
            System.out.println("Primeiro Exemplo - Valor: "  + inteiros[i]);
        }
        
        
    }
    
}
