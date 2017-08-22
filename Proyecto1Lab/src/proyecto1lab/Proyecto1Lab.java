package proyecto1lab;

import java.util.Scanner;

public class Proyecto1Lab {

    static Scanner sc = new Scanner(System.in);

    static String jugador1;

    static String jugador2;

    static Pieza[][] tabla = new Pieza[19][19];

    public static void main(String[] args) {
        juego();
    }

    public static void juego() {
        System.out.print("Ingrese el nommbre del jugador que controlara a los duques: ");
        jugador1 = sc.next();
        System.out.print("Ingrese el nommbre del jugador que controlara a los rebeldes: ");
        jugador2 = sc.next();
        llenar();
        turno(jugador2);
    }

    public static void turno(String jugador) {
        imprimir();
    }

    public static void llenar() {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i == 0 || i == 18) {
                    if (j == 2 || j == 5 || j == 13 || j == 16) {
                        tabla[i][j] = new Rebelde(i, j);
                    }
                } else if (i == 2 || i == 16) {
                    if (j == 0 || j == 5 || j == 13 || j == 18) {
                        tabla[i][j] = new Rebelde(i, j);
                    }
                } else if (i == 3 || i == 15) {
                    if (j == 7 || j == 9 || j == 11) {
                        tabla[i][j] = new Rebelde(i, j);
                    }
                } else if (i == 4 || i == 14) {
                    if (j == 6 || j == 12) {
                        tabla[i][j] = new Rebelde(i, j);
                    } else if (j == 8 || j == 10) {
                        tabla[i][j] = new Duque(i, j);
                    }
                } else if (i == 5 || i == 13) {
                    if (j == 0 || j == 2 || j == 5 || j == 13 || j == 16 || j == 18) {
                        tabla[i][j] = new Rebelde(i, j);
                    }
                } else if (i == 6 || i == 12) {
                    if (j == 4 || j == 15) {
                        tabla[i][j] = new Rebelde(i, j);
                    } else if (j == 9) {
                        tabla[i][j] = new Duque(i, j);
                    }
                } else if (i == 7 || i == 11) {
                    if (j == 3 || j == 15) {
                        tabla[i][j] = new Rebelde(i, j);
                    } else if (j == 8 || j == 10) {
                        tabla[i][j] = new Duque(i, j);
                    }
                } else if (i == 8 || i == 10) {
                    if (j == 4 || j == 7 || j == 9 || j == 11 || j == 14) {
                        tabla[i][j] = new Duque(i, j);
                    }
                } else if (i == 9) {
                    if (j == 13 || j == 15) {
                        tabla[i][j] = new Rebelde(i, j);
                    } else if (j == 6 || j == 8 || j == 10 || j == 12) {
                        tabla[i][j] = new Duque(i, j);
                    } else if (j == 9) {
                        tabla[i][j] = new Rey(i, j);
                    }
                }
            }
        }
    }

    public static void imprimir() {
        System.out.print("   ");
        for (int i = 0; i < 19; i++) {
            if (i < 10) {
                System.out.print(" " + i + "  ");
            } else {
                System.out.print(i + "  ");
            }
        }
        System.out.println("");
        for (int i = 0; i < tabla.length; i++) {
            if (i < 10) {
                System.out.print(i + "  ");
            } else {
                System.out.print(i + " ");
            }
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] instanceof Rebelde) {
                    System.out.print("[r] ");
                } else if (tabla[i][j] instanceof Rey) {
                    System.out.print("[R] ");
                } else if (tabla[i][j] instanceof Duque) {
                    System.out.print("[d] ");
                } else if ((i == 0 && (j == 0 || j == 1 || j == 17 || j == 18)) || (i == 1 && (j == 0 || j == 1 || j == 17 || j == 18)) || (i == 17 && (j == 0 || j == 1 || j == 17 || j == 18)) || (i == 18 && (j == 0 || j == 1 || j == 17 || j == 18))) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println("");
        }
    }
}
