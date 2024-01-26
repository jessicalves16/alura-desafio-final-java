import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        //Inicializar dados do cliente
        Scanner scanner = new Scanner(System.in);
        String nome = "Jéssica Alves";
        String tipoConta = "Corrente";
        double saldo = 6000.00;
        int opcao = 0;

        System.out.println("****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***************************");

        //Criar menu de opções
        String menu = """
                \n*** Digite sua opção ***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo é de: " + saldo);

            } else if (opcao == 2) {
                System.out.print("Qual valor deseja transferir?");
                double valor = scanner.nextDouble();

                if (valor > saldo){
                    System.out.println("Saldo insuficiente para essa transação.");
                } else{
                    saldo -= valor;
                    System.out.println("Tranferência realizada com sucesso! Novo saldo: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.print("Valor recebido: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Transferência recebida! Novo saldo: " + saldo);

            }else if (opcao != 4){
                System.out.println("Opção inválida!");

            }

        }




    }


}
