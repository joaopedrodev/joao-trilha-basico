public class OperadoresAula06 {

    public static void main(String[] args) {
        //Operadores relacionais

        //Compara se a string o valor e igual
        String nomeUm = "João Pedro";
        String nomeDois = "João Pedro";

        System.out.println(nomeUm == nomeDois);

        int numero1 = 55;
        int numero2 = 5;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        //numero 1 e menor que numero2
        if(numero1 < numero2){
            System.out.println("a nossa codição é verdadeira ");
        }
        else{
            System.out.println("a nossa condição e falsa");
        }

        //numero1 e igual a numero2
        if(numero1 == numero2){
            System.out.println("a nossa codição é verdadeira ");
        }
        else{
            System.out.println("a nossa condição e falsa");
        }
        //numero1 e diferente de numero2
        if(numero1 != numero2){
            System.out.println("a nossa codição é verdadeira ");
        }
        else{
            System.out.println("a nossa condição e falsa");
        }
    }
    
}
