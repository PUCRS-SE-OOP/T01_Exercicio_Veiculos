//import com.sun.java.util.jar.pack.Instruction.Switch;
import java.util.Scanner;
public class App{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double abastecer = 0.0;
        int distancia = 0;
        int menu = 0;

        Placa p1 = new Placa();
        p1.setPais("Brasil");
        p1.setCodigo("ABC1R23");


        Veiculo v1 = new Veiculo(p1);
       
    /*
        Veiculo v2 = new Veiculo(p1);
        v1.abastece(65);
        v1.dirige(250);


        System.out.println("Dados do veiculo 1:");
        System.out.println(v1);
        System.out.println("----------------");
        System.out.println("Dados do veiculo 2:");
        System.out.println(v2);
        System.out.println("----------------");
    

        v2.setPais("Estados Unidos");
        System.out.println("Refresh");
        System.out.println("Dados do veiculo 1:");
        System.out.println(v1);
        System.out.println("----------------");
        System.out.println("Dados do veiculo 2:");
        System.out.println(v2);
        System.out.println("----------------"); 
    */

        while(menu != 9){
            System.out.println("------Menu------");
            System.out.println("Digite (1) para abastecer;"+"\n"+
                               "Digite (2) para dirigir;"+"\n"+
                               "Digite (3) para verificar combustível no tanque;"+"\n"+
                               "Digite (4) para informações do veiculo;"+"\n"+
                               "Digite (9) para sair da aplicação.");
            menu = in.nextInt();

            switch(menu){
                case 1:
                    System.out.println("Informe quantos litros deseja abastecer: ");
                        abastecer = in.nextDouble();
                    System.out.println("Abastecido: " + v1.abastece(abastecer) + " Litros.");
                    break;

                case 2:
                    System.out.println("Informe a distância em KM: ");
                        distancia = in.nextInt();
                    System.out.println("Dirigiu por: " + v1.dirige(distancia) + " Km");
                    System.out.println("Restou " + v1.getCombustivelNoTanque() + " litro(s) de combustível no tanque.");
                    break;    
                
                case 3:
                    System.out.println(v1.getCombustivelNoTanque() + " Litros de combustível no tanque.");
                    break;
                
                case 4:
                    System.out.println(v1);
                   break;

                case 9:
                    break;
                
                default:
                    System.out.println("Valor incorreto.");
                    break;

            }
        }
    in.close();
    System.exit(1);
    }
}

/*
 * Notas:
 *  Exercício 2B
 *  Utilizar o modificador "Final" torna muito mais fácil alterar uma 
 * constante numérica não sendo necessário ficar procurando em todos os lugares
 * que teria a mesma função.
 * 
 *  Exercício 2C
 *  Ambos buscam informação da classe PLACA, caso a referencia
 * seja alterada todas que a usam serão alteradas. (assim como o modificador final)
 *  Não permitir que a mesma placa seja utilizada por 2 veiculos direntes.
 */
