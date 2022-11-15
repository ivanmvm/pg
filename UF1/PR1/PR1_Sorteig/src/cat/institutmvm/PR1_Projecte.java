/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/*  
    Iván Sáez Serra
    INS Manuel Vázquez Montalbán
    14/11/22
    Disseny d'Aplicació Web (DAW)
    Programació  
 */
//Pre: Emmagatzarem dades per realitzar un programa amb un límit de 3 errors.
public class PR1_Projecte {

    private static final String MSG_1 = "Introdueix les següents dades corresponents.";
    private static final String MSG_2 = "Introdueix el teu ID:";
    private static final String MSG_3 = "Introdueix la teva edat:";
    private static final String MSG_4 = "\nTipus de venda?\n" + "\nVenda lliure (0)" + "\nPensionista (1)" + "\nCarnet Jove (2)" + "\nSoci (3)\n";
    private static final String MSG_5 = "Introdueix l'import de la compra:";
    private static final String MSG_6 = "Escriu el telèfon de contacte:";
    private static final String MSG_7 = "Error en dades, torna a introduir el valor:";
    private static final String MSG_8 = "Programa terminat, hi ha errors en els valors introduïts";
    private static final String MSG_9 = "id    edat       tipus      import     telèfon";
    private static final String MSG_10 = "Venda lliure";
    private static final String MSG_11 = "Pensionista";
    private static final String MSG_12 = "Carnet Jove";
    private static final String MSG_13 = "Soci";
    private static final int ID_MAX = 999;
    private static final int ID_MIN = 111;
    private static final int EDAT_MAX = 120;
    private static final int EDAT_MIN = 14;
    private static final int COMPRA_MAX = 1000;
    private static final int COMPRA_MIN = 0;
    private static final int TELEF_MAX = 999999999;
    private static final int TELEF_MIN = 111111111;
    private static final int TELEFNUM_MAX = 9;

    public static void main(String[] args) {

        int id_client = 0, edat = 0, tipus_solicitut, num_telef = 0, res = 0, valor_compra = 0, telef = 0, intents_id = 0, intents_edat = 0, intents_tipus = 0, intents_compra = 0, intents_telef = 0;
        String venda_tipus = "";
        boolean valorTrue = false, exit = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        System.out.println(MSG_2);
        do {
            valorTrue = sc.hasNextInt();
            if (valorTrue) {
                id_client = sc.nextInt();
                if (id_client >= ID_MIN && id_client <= ID_MAX) {
                    exit = true;
                } else {
                    System.out.println(MSG_7);
                    intents_id++;
                }
            } else {
                sc.next();
                System.out.println(MSG_7);
                intents_id++;
            }
            if (intents_id == 3) {
                exit = true;
            }
        } while (exit != true);
        if (intents_id == 3) {
            System.out.println(MSG_7);
        } else {
            System.out.println(MSG_3);
            exit = false;
            do {
                valorTrue = sc.hasNextInt();
                if (valorTrue) {
                    edat = sc.nextInt();
                    if (edat >= EDAT_MIN && edat <= EDAT_MAX) {
                        exit = true;
                    } else {
                        System.out.println(MSG_7);
                        intents_edat++;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_7);
                    intents_edat++;
                }
                if (intents_edat == 3) {
                    exit = true;
                }
            } while (exit != true);
            if (intents_edat == 3) {
                System.out.println(MSG_8);
            }
            exit = false;
            System.out.println(MSG_4);
            do {
                valorTrue = sc.hasNextInt();
                if (valorTrue) {
                    tipus_solicitut = sc.nextInt();
                    switch (tipus_solicitut) {
                        case 0:
                            venda_tipus = MSG_10;
                            exit = true;
                            break;
                        case 1:
                            venda_tipus = MSG_11;
                            exit = true;
                            break;
                        case 2:
                            venda_tipus = MSG_12;
                            exit = true;
                            break;
                        case 3:
                            venda_tipus = MSG_13;
                            exit = true;
                            break;
                        default:
                            intents_tipus++;
                            System.out.println(MSG_7);
                            break;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_7);
                    intents_tipus++;
                }
                if (intents_tipus == 3) {
                    exit = true;
                }
            } while (exit != true);
            if (intents_tipus == 3) {
                System.out.println(MSG_8);
            } else {
                exit = false;
                System.out.println(MSG_5);
                do {
                    valorTrue = sc.hasNextInt();
                    if (valorTrue) {
                        valor_compra = sc.nextInt();
                        if (valor_compra >= COMPRA_MIN && valor_compra <= COMPRA_MAX) {
                            exit = true;
                        } else {
                            System.out.println(MSG_7);
                            intents_compra++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_7);
                        intents_compra++;
                    }
                    if (intents_compra == 3) {
                        exit = true;
                    }
                } while (exit != true);
                if (intents_compra == 3) {
                    System.out.println(MSG_8);
                }
                exit = false;
                do {
                    System.out.println(MSG_6);
                    num_telef = 0;
                    res = 0;
                    valorTrue = sc.hasNextInt();
                    if (valorTrue) {
                        telef = sc.nextInt();
                        num_telef = telef;
                        if (telef >= TELEF_MIN && telef <= TELEF_MAX) {
                            while (telef != 0) {
                                telef = (telef / 10);
                                res = res + 1;
                            }
                            if (res == TELEF_MAX) {
                                exit = true;
                            } else {
                                System.out.println(MSG_7);
                                intents_telef++;
                            }
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_7);
                        intents_telef++;
                    }
                    if (intents_telef == 3) {
                        exit = true;
                    }
                } while (exit != true);
                if (intents_telef == 3) {
                    System.out.println(MSG_8);
                } else {
                    System.out.println(MSG_9);
                    System.out.println(id_client + "       " + edat + "       " + venda_tipus + "     " + valor_compra + "     " + num_telef);
                }
            }
        }
    }
}
//Pro: Rep les dades de l'usuari, el programa retorna el resultat introduït.
