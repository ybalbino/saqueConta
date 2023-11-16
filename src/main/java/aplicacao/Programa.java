package aplicacao;

import entidades.Conta;
import excecoes.ExcecaoComercial;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balanco = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = sc.nextDouble();

        Conta conta = new Conta(numero, titular, balanco, limiteSaque);

        System.out.println();
        System.out.print("Informe a quantia para sacar: ");
        double valor = sc.nextDouble();

        try {
            conta.saque(valor);
            System.out.printf("Novo saldo: %.2f\n" ,  conta.getBalanco());
        } catch (ExcecaoComercial e){
            System.out.printf(e.getMessage());
        }

        sc.close();
    }
}
