package jfdesgin.learning;

import java.util.Scanner;

public class OpMethod {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double num1 = 0.0;
        Double num2 = 0.0;
        String op = "";
        Double result = 0.0;

        System.out.println("Digite o Number 1: ");
        num1 = reader.nextDouble();
        System.out.println("Digite o Number 2: ");
        num2 = reader.nextDouble();
        reader.nextLine();
        System.out.println(" Digite seu operador (escolha um desses: +,-./,*): ");
        op = reader.nextLine();

        if (op.equals("+")){
            result = sum(num1, num2);
            System.out.println(result);
        } else  if (op.equals("*")) {
            result = mult(num1, num2);
            System.out.println(result);
        }  else  if (op.equals("-")) {
            result = sub(num1, num2);
            System.out.println(result);
        }  else  if (op.equals("/")) {
            result = div(num1, num2);
            System.out.println(result);
        } else {
            System.out.println("Não foi reconhecido este operador, Por favor, tente novamente");
        }
    }
    public static Double sum(Double num1, Double num2) {
        return num1 + num2;
    }
    public static Double sub(Double num1, Double num2) {
        return num1 - num2;
    }
    public static Double mult(Double num1, Double num2) {
        return num1 * num2;
    }
    public static Double div(Double num1, Double num2) {
        return num1 / num2;
    }
}
