import java.util.Scanner;

public class SimulacaoBancaria {

    double deposito;
    double saque;
    double saldoAtual;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double deposito;
        double saque;
        double saldoAtual;
        
        int opcao = 0;
        boolean continuar = true;

            while (!scanner.hasNextInt()) {

                System.out.println(" Olá seja bem vindo ao bancoTOP, o seu banco digital");
                System.out.println("");
                System.out.println(" 1 - Depositar");
                System.out.println(" 2 - Sacar");
                System.out.println(" 3 - Extrato");
                System.out.println(" 4 - Sair");
                System.out.println("");

                System.out.println("Digite a opção desejada");
                opcao = scanner.nextInt();
            }
         
            
            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println(" Insira o valor a depositar");
                    deposito = scanner.nextDouble();
                    System.out.println(" O Valor depositado foi de R$ " + deposito);
                    saldo = saldo + deposito;
                    System.out.println(" Seu Saldo é de " + saldo);
                break;

                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println(" Qual valor que deseja sacar?");
                    saque = scanner.nextDouble();
                  
                   // if (saque > saldo)
                  //  saldoAtual = saldoAtual - saque;
                    //System.out.println(" O valor restante foi de " + saldoAtual);
                    break;
              //  case 3:
                    // TODO: Exibir o saldo atual da conta.
                    //System.out.println(" Seu Saldo é de " + saldoAtual);
              //      break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        
        scanner.close();
        }



    }
