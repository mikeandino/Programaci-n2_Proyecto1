package proyecto1lab;

import java.util.Scanner;

public class Proyecto1Lab {

    static Scanner sc = new Scanner(System.in);

    static String jugador1;

    static String jugador2;

    static Pieza[][] tabla = new Pieza[19][19];

    static Pieza[][] debug = new Pieza[2][6];

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
        System.out.println("Es tu turno " + jugador + ".");
        System.out.print("Ingrese la cordenada x: ");
        int x = sc.nextInt() - 1;
        System.out.print("Ingrese la cordenada y: ");
        int y = sc.nextInt() - 1;
        while ((x < 0 || x > 18) || (y < 0 || y > 18)) {
            if (x < 0 || x > 18) {
                System.out.print("Ingrese una cordenada x valida: ");
                x = sc.nextInt() - 1;
            }
            if (y < 0 || y > 18) {
                System.out.print("Ingrese una cordenada y valida: ");
                y = sc.nextInt() - 1;
            }
        }
        if (jugador1.equals(jugador)) {
            if (tabla[y][x] instanceof Duque) {
                tabla[y][x].mover();
            } else if (tabla[y][x] instanceof Rey) {
                tabla[y][x].mover();
            } else {
                System.out.println("Esta pieza no te pertenece");
                turno(jugador);
            }
            jugador = jugador2;
        } else {
            if (tabla[y][x] instanceof Rebelde) {
                tabla[y][x].mover();
                jugador = jugador1;
            } else {
                System.out.println("Esta pieza no te pertenece");
            }
            turno(jugador);
        }
        if (!ganar()) {
            turno(jugador);
        }
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
        for (int i = 0; i < tabla[0].length; i++) {
            if ((i + 1) < 10) {
                System.out.print(" " + (i + 1) + "  ");
            } else {
                System.out.print((i + 1) + "  ");
            }
        }
        System.out.println("");
        for (int i = 0; i < tabla.length; i++) {
            if ((i + 1) < 10) {
                System.out.print((i + 1) + "  ");
            } else {
                System.out.print((i + 1) + " ");
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

    public static boolean ganar() {
        boolean j1 = false;
        if ((tabla[0][0] instanceof Rey) || (tabla[0][1] instanceof Rey) || (tabla[0][17] instanceof Rey) || (tabla[0][18] instanceof Rey) || (tabla[1][0] instanceof Rey) || (tabla[1][1] instanceof Rey) || (tabla[1][17] instanceof Rey) || (tabla[1][18] instanceof Rey) || (tabla[17][0] instanceof Rey) || (tabla[17][1] instanceof Rey) || (tabla[17][17] instanceof Rey) || (tabla[17][18] instanceof Rey) || (tabla[18][0] instanceof Rey) || (tabla[18][1] instanceof Rey) || (tabla[18][17] instanceof Rey) || (tabla[18][18] instanceof Rey)) {
            j1 = true;
        }
        boolean j2 = true;
        boolean fin = false;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] instanceof Rey) {
                    j2 = false;
                }
            }
        }
        if (j1) {
            System.out.println(jugador1 + " haz ganado!");
            fin = true;
            return fin;
        } else if (j2) {
            System.out.println(jugador2 + " haz ganado!");
            fin = true;
            return fin;
        } else {
            return fin;
        }
    }
}
