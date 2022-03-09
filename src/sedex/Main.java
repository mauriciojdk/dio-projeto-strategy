package sedex;

import sedex.encomenda.Frete;
import sedex.encomenda.TipoFrete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Qual é a distância da entrega?: ");
            int distancia = sc.nextInt();

            System.out.print("Qual o tipo de frete? Digite (1) - Normal / (2) SEDEX: ");
            int opcaoFrete = sc.nextInt();

            TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

            Frete frete = tipoFrete.obterFrete();
            double preco = frete.calcularPreco(distancia);
            System.out.printf("O valor total a pagar é de R$%.2f", preco);

        }catch (Exception ex){
            ex.printStackTrace();
    }

    }
}
