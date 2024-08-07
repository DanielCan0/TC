    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package laboratoriodos;

    import java.util.Scanner;

    /**
     *
     * @author dany8
     */
    public class Cano_Daniel_TC {
        public static void main(String[] args) {
            Scanner lea = new Scanner(System.in);

            System.out.println("- - - - Menu Principal - - - -");
            System.out.println("(1) Triangulos");
            System.out.println("(2) Comun Multiplo");
            System.out.println("(3) Numero Perfecto");
            System.out.println("- - - - - - - -- - - - - - - -");
            int option = lea.nextInt();


            if (option == 1) {

                } else if (option == 2) {

                System.out.println("Ingrese el primer numero");
                int primern = lea.nextInt();
                System.out.println("Ingrese el segundo numero");
                int segundon = lea.nextInt();
                
                int primernumero = primern;
                int segundonumero = segundon;
                
    
                while (segundonumero != 0) {
                        int temp = segundonumero;
                       segundonumero = primernumero % segundonumero;
                       primernumero = temp;
                   }
                    int mcd = primernumero;

                int mcm = (primern * segundon) / mcd;

                System.out.println("El Maximo Comun Divisor es "+ mcd );
                System.out.println("El Minimo Comun Multiplo "+ mcm );


                } else if (option == 3) {
                    System.out.println("Ingrese un numero");
                    int numero = lea.nextInt();

                    int suma = 0;
                       for (int perfecto = 1; perfecto <= numero / 2; perfecto++) {
                           if (numero % perfecto == 0) {
                                suma += perfecto;
                            }
                        }

                    if (suma == numero) {
                        System.out.println("El numero "+numero+" es perfecto " );
                    } else {
                        System.out.println("El numero "+numero+" no es perfecto " );
                     }
                }
            }
    }


