package Teste;

/**
 *
 * @author daniel
 */
import BDVeiculos.BDVeiculos;
import Carga.Carga;
import Exception.VeicExistException;
import Exception.VelocException;
import Passeio.Passeio;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        BDVeiculos bd = new BDVeiculos();

        int aux1 = 0;
        int op1 = 0;
        int op;

        do {

            System.out.println("");
            menu();
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    try {
                        do {

                            System.out.println("# VEICULO DE PASSEIO #");
                            System.out.print("Placa: ");
                            String placa = sc.next();

                            bd.verificarPlacaPasseio(placa);

                            System.out.print("Marca: ");
                            String marca = sc.next();

                            System.out.print("Modelo: ");
                            String modelo = sc.next();

                            System.out.print("Cor: ");
                            String cor = sc.next();

                            System.out.print("Velocidaded Maxima: ");
                            float velocMax = sc.nextFloat();
                            try {
                                if (velocMax < 80 || velocMax > 110) {

                                    throw new VelocException("# A VELOCIDADE MAXIMA ESTA FORA DOS LIMITES BRASILEIROS #");
                                }

                            } catch (VelocException e) {
                                System.out.println();
                                System.out.println(e.getMessage());
                                System.out.println();
                                velocMax = (float) 100.00;

                            }
                            System.out.print("Quantidade de Rodas: ");
                            int qtdRodas = sc.nextInt();

                            System.out.print("Quantidade de Pistao: ");
                            int qtdPist = sc.nextInt();

                            System.out.print("Potencia: ");
                            int potencia = sc.nextInt();

                            System.out.print("Quantidade Passageiro: ");
                            int qtdPassageiro = sc.nextInt();

                            Passeio p = new Passeio(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia, qtdPassageiro);

                            bd.addVeiculosPasseio(p);
                            aux1++;

                            System.out.println("DESEJA CADASTRAR UM NOVO VEICULO?\n"
                                    + "1- SIM: \n"
                                    + "2- NAO: ");
                            op1 = sc.nextInt();
                        } while (op1 == 1);

                    } catch (VeicExistException e) {
                        System.out.println(e.getMessage());

                    }
                }
                break;

                case 2: {
                    try {
                        do {

                            System.out.println("#VEICULO DE CARGA#");
                            System.out.print("Placa: ");
                            String placa = sc.next();

                            bd.verificarPlacaCarga(placa);

                            System.out.print("Marca: ");
                            String marca = sc.next();

                            System.out.print("Modelo: ");
                            String modelo = sc.next();

                            System.out.print("Cor: ");
                            String cor = sc.next();

                            System.out.print("Velocidaded Maxima: ");
                            float velocMax = sc.nextFloat();

                            try {
                                if (velocMax < 80 || velocMax > 110) {

                                    throw new VelocException("# A VELOCIDADE MAXIMA ESTA FORA DOS LIMITES BRASILEIROS #");
                                }

                            } catch (VelocException e) {
                                System.out.println();
                                System.out.println(e.getMessage());
                                System.out.println();
                                velocMax = (float) 90.00;

                            }

                            System.out.print("Quantidade de Rodas: ");
                            int qtdRodas = sc.nextInt();

                            System.out.print("Quantidade de Pistao: ");
                            int qtdPist = sc.nextInt();

                            System.out.print("Potencia: ");
                            int potencia = sc.nextInt();

                            System.out.print("Carga Maxima: ");
                            int cargaMax = sc.nextInt();

                            System.out.print("Tara: ");
                            int tara = sc.nextInt();

                            Carga c = new Carga(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia, cargaMax, tara);
                            bd.addVeiculosCarga(c);
                            aux1++;

                            System.out.println("DESEJA CADASTRAR UM NOVO VEICULO?\n"
                                    + "1- SIM: \n"
                                    + "2- NAO: ");
                            op1 = sc.nextInt();
                        } while (op1 == 1);
                    } catch (VeicExistException e) {
                        System.out.println(e.getMessage());
                    }

                }
                break;

                case 3: {
                    bd.listarVeiculosPasseio();

                }
                break;
                case 4: {
                    bd.listarVeiculosCarga();
                }
                break;
                case 5: {
                    try {
                        System.out.print("INSIRA PLACA PARA PESQUISA:  ");
                        String PesquisaPlaca = sc.next();
                        bd.listarVeicPlacaPasseio(PesquisaPlaca);
                    } catch (VeicExistException e) {
                        System.out.println("TENTE NOVAMENTE - " + e.getMessage());
                    }

                }
                break;

                case 6: {

                    try {
                        System.out.print("INSIRA PLACA PARA PESQUISA:  ");
                        String PesquisaPlaca = sc.next();
                        bd.listarVeicPlacaPasseio(PesquisaPlaca);
                    } catch (VeicExistException e) {
                        System.out.println("TENTE NOVAMENTE - " + e.getMessage());
                    }

                }
                break;

                case 7: {

                    try {
                        System.out.print("INSIRA PLACA PARA EXCLUIR O VEICULO:  ");
                        String excluirVeiculo = sc.next();
                        bd.excluirVeiculoPasseio(excluirVeiculo);
                    } catch (VeicExistException e) {
                        System.out.println("OPERACAO NAO CONCLUIDA - " + e.getMessage());
                    }

                }
                break;
                case 8: {

                    try {
                        System.out.print("INSIRA PLACA PARA EXCLUIR O VEICULO:  ");
                        String excluirVeiculoCarga = sc.next();
                        bd.excluirVeiculoCarga(excluirVeiculoCarga);
                    } catch (VeicExistException e) {
                        System.out.println("OPERACAO NAO CONCLUIDA - " + e.getMessage());
                    }

                }
                break;

                case 9: {
                    System.out.println("# SITEMA FINALIZADO # \n");
                }

                default: {
                    System.out.println("## ATENCAO -> OPÇÃO INVALIDA , DIGITE UM NUMERO ENTRE 1 A 7 !! \n");
                }
                break;

            }

        } while (op != 9);

    }

    private static void menu() {

        System.out.println("==========================================================");
        System.out.println("###### SISTEMA DE GESTÃO DE VEICULOS - MENU INICIAL ###### \n"
                + "1. Cadastrar Veiculo de Passeio \n\n"
                + "2. Cadastrar Veiculo de Carga \n\n"
                + "3. Imprimir Todos os Veiculos de Passeio \n\n"
                + "4. Imprimir Todos os Veiculos de Carga \n\n"
                + "5. Imprimir Veiculo de Passeio pela Placa \n\n"
                + "6. Imprimir Veiculo de Carga pela Placa \n\n"
                + "7. Excluir Veiculos de Passeio pela Placa \n\n"
                + "8. Excluir Veiculos de Carga pela Placa \n\n"
                + "9. Sair do Sistema ");
        System.out.println("==========================================================");
        System.out.print("DIGITE UMA DAS OPCOES ACIMA:  ");
        System.out.println("\n");

    }

}
