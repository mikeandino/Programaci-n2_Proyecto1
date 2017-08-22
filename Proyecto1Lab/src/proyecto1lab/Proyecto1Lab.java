package proyecto1lab;

import java.util.Scanner;

public class Proyecto1Lab {

    static Scanner sc = new Scanner(System.in);

    static String jugador1;

    static String jugador2;
    
    static Pieza[][] tabla  = new Pieza[19][19];
    
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
    
    public static void turno(String jugador){
        
    }
    
    public static void llenar(){
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
                if (i==0) {
                    if (j==2||j==5||j==16||j==13) {
                        tabla[i][j]=new Rebelde(i, j);
                    }
                }
            }
        }
    }
    
    public static void imprimir(){
        
    }
    
}
