package service;

import com.google.gson.Gson;
import model.Pair;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {

    public void comecaAPP(){

        final String APIKEY = "/*apikey*/";
        final String enderecoInicial = "https://v6.exchangerate-api.com/v6/";

        ConsomeAPI consomeAPI = new ConsomeAPI();
        Pair pair = new Pair();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Essas são as opções para conversão: ");
        System.out.println("""
                1) Dolar Canadense para Real.
                2) Real para Dolar Canadense.
                3) Dolar Canadense para Euro.
                4) Euro para Peso Chileno.
                5) Real para Yen.
                6) Real para Pesos Argentinos.
                7) Sair.
                """);

        try {
            System.out.println("Digite o número da conversão desejada: ");
            int opcaoDeConversao = leitura.nextInt();

            switch (opcaoDeConversao) {
                case 1:
                    pair.setBase_code("CAD");
                    pair.setTarget_code("BRL");
                    break;
                case 2:
                    pair.setBase_code("BRL");
                    pair.setTarget_code("CAD");
                    break;
                case 3:
                    pair.setBase_code("CAD");
                    pair.setTarget_code("EUR");
                    break;
                case 4:
                    pair.setBase_code("CLP");
                    pair.setTarget_code("EUR");
                    break;
                case 5:
                    pair.setBase_code("BRL");
                    pair.setTarget_code("JPY");
                    break;
                case 6:
                    pair.setBase_code("BRL");
                    pair.setTarget_code("ARS");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Opção invalida, tente novamente.");
                    break;
            }


        System.out.println("Digite o valor que deseja converter: ");
        double quantidadeDeDinheiro = leitura.nextDouble();


        var json = consomeAPI.obterDados(
                enderecoInicial + APIKEY + "/pair/"
                        + pair.getBase_code()
                        + "/" + pair.getTarget_code() + "/"
                        + quantidadeDeDinheiro);

        Gson gson = new Gson();
        var resultado = gson.fromJson(json, Pair.class);
        System.out.println("Quantidade que deseja converter: " + quantidadeDeDinheiro);
        System.out.println(resultado);
        } catch (InputMismatchException e) {
            System.out.println("entrada inválida, tente novamente.");
        }
    }
}
