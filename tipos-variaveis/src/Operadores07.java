public class Operadores07 {
    //Operadores Lógicos

    public static void main(String[] args) {
        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2){ //valida se as duas condiçoes //são verdadeira
            System.out.println("As duas condiçoes são verdadeiras");
        }

        if(condicao1 && (7 > 4 )){ //valida se a condicao1 e verdadeira //e 7 e maior que 4
            System.out.println("as duas condiçoes são verdadeiras");
        }

        if(condicao1 || condicao2){ //valida se uma das opções e verdadeira
            System.out.println("Uma duas condiçoes é verdadeiras");
        }

        //System.out.println("fim");
    }
}
