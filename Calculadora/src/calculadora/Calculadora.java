package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner sci = new Scanner(System.in);
        
        //Declaração de variáveis
        double num1 = 0, num2 = 0, resultadoFinal;
        char operacao;
        
        //******** Entrada de dados ********
        System.out.println("******* Operacoes *******");
        System.out.println("A - Adicao");
        System.out.println("S - Subtracao");
        System.out.println("M - Multiplicacao");
        System.out.println("D - Divisao");
        System.out.println("E - Exponenciacao");
        
        System.out.print("Informe a operacao: ");
        operacao = sci.next().toUpperCase().charAt(0);
        
        //Conferindo se o usuário informou exponenciação para depois pedir os valores
        if(operacao == 'E'){
            System.out.print("Informe o numero: ");
            num1 = sci.nextDouble();
        }
        else{
            System.out.print("Informe o primeiro numero: ");
            num1 = sci.nextDouble();
            System.out.print("Informe o segundo numero: ");
            num2 = sci.nextDouble();
        }
        
        //Verificando qual operação o usuário escolheu para calcular
        switch (operacao) {
            case 'E': resultadoFinal = Math.pow(num1,2);
                System.out.println("O resultado da exponenciacao e " + resultadoFinal);
            case 'A': resultadoFinal = num1 + num2;
                System.out.println("O resultado da adicao e " + resultadoFinal);
            case 'S': resultadoFinal = num1 - num2;
                System.out.println("O resultado da subtracao e " + resultadoFinal);
            case 'M': resultadoFinal = num1 * num2;
                System.out.println("O resultado da multiplicacao e " + resultadoFinal);
            case 'D': resultadoFinal = num1 / num2;
                System.out.println("O resultado da divisao e " + resultadoFinal);           
            break;
            
            //Se o usuário não informou nenhuma letra corresponde envia uma mensagem de erro
            default:
                System.out.println("Voce informou uma operacao invalida!!");
        }
        

    }

}
