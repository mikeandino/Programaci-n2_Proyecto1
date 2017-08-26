package proyecto1lab;

public class Rey extends Duque {

    public Rey() {
        super();
    }

    public Rey(int y, int x) {
        super(y, x);
    }

    @Override
    public void mover() {
        int izquierda = 0;
        int index = 1;
        if (x > 0) {
            while (x - index >= 0) {
                if ((Proyecto1Lab.tabla[y][x - index] == null)) {
                    izquierda++;
                    index++;
                } else {
                    break;
                }
            }
        }
        int arriba = 0;
        index = 1;
        if (y > 0) {
            while (y - index >= 0) {
                if (Proyecto1Lab.tabla[y - index][x] == null) {
                    arriba++;
                    index++;
                } else {
                    break;
                }
            }
        }
        int derecha = 0;
        index = 1;
        if (x < 19) {
            while (x + index < 19) {
                if (Proyecto1Lab.tabla[y][x + index] == null) {
                    derecha++;
                    index++;
                } else {
                    break;
                }
            }
        }
        int abajo = 0;
        index = 1;
        if (y < 19) {
            while (y + index < 19) {
                if (Proyecto1Lab.tabla[y + index][x] == null) {
                    abajo++;
                    index++;
                } else {
                    break;
                }
            }
        }
        boolean movido = false;
        while (!movido) {
            System.out.println("Puedes moverte " + arriba + " espacios hacia arriba.");
            System.out.println("Puedes moverte " + izquierda + " espacios a la izquierda.");
            System.out.println("Puedes moverte " + derecha + " espacios a la derecha.");
            System.out.println("Puedes moverte " + abajo + " espacios hacia abajo.");
            System.out.print("1.Arriba\n"
                    + "2.Izquierda\n"
                    + "3.Derecha\n"
                    + "4.Abajo\n"
                    + "Ingrese su opcion: ");
            index = Proyecto1Lab.sc.nextInt();
            while (index < 1 || index > 4) {
                System.out.print("Opcion invalida: ");
                index = Proyecto1Lab.sc.nextInt();
            }
            switch (index) {
                case 1:
                    if (arriba == 0) {
                        System.out.println("No te puedes mover hacia arriba.");
                    } else {
                        System.out.println("Ingrese el numero de espacios que desea moverte.");
                        index = Proyecto1Lab.sc.nextInt();
                        while (index < 1 || index > arriba) {
                            System.out.print("Espacio no valido: ");
                            index = Proyecto1Lab.sc.nextInt();
                        }
                        if (y - index == 9 && x == 9) {
                            if (Proyecto1Lab.tabla[8][9] == null) {
                                Proyecto1Lab.tabla[(y - index) - 1][x] = Proyecto1Lab.tabla[y][x];
                                Proyecto1Lab.tabla[y][x] = null;
                                setY(y - index - 1);
                            } else {
                                Proyecto1Lab.tabla[(y - index) + 1][x] = Proyecto1Lab.tabla[y][x];
                                Proyecto1Lab.tabla[y][x] = null;
                                setY(y - index + 1);
                            }
                        } else {
                            Proyecto1Lab.tabla[y - index][x] = Proyecto1Lab.tabla[y][x];
                            Proyecto1Lab.tabla[y][x] = null;
                            setY(y - index);
                        }
                        movido = true;
                    }
                    break;
                case 2:
                    if (izquierda == 0) {
                        System.out.println("No te mueves mover hacia izquierda.");
                    } else {
                        System.out.println("Ingrese el numero de espacios que desea moverte.");
                        index = Proyecto1Lab.sc.nextInt();
                        while (index < 1 || index > izquierda) {
                            System.out.print("Espacio no valido: ");
                            index = Proyecto1Lab.sc.nextInt();
                        }
                        if (x - index == 9 && y == 9) {
                            if (Proyecto1Lab.tabla[9][8] == null) {
                                Proyecto1Lab.tabla[y][(x - index) - 1] = Proyecto1Lab.tabla[y][x];
                                Proyecto1Lab.tabla[y][x] = null;
                                setX(x - index - 1);
                            } else {
                                Proyecto1Lab.tabla[y][(x - index) + 1] = Proyecto1Lab.tabla[y][x];
                                Proyecto1Lab.tabla[y][x] = null;
                                setX(x - index + 1);
                            }
                        } else {
                            Proyecto1Lab.tabla[y][x - index] = Proyecto1Lab.tabla[y][x];
                            Proyecto1Lab.tabla[y][x] = null;
                            setX(x - index);
                        }
                        movido = true;
                    }
                    break;
                case 3:
                    if (derecha == 0) {
                        System.out.println("No te mueves mover hacia derecha.");
                    } else {
                        System.out.println("Ingrese el numero de espacios que desea moverte.");
                        index = Proyecto1Lab.sc.nextInt();
                        while (index < 1 || index > derecha) {
                            System.out.print("Espacio no valido: ");
                            index = Proyecto1Lab.sc.nextInt();
                        }
                        if (x + index == 9 && y == 9) {
                            if (Proyecto1Lab.tabla[9][10] == null) {
                                Proyecto1Lab.tabla[y][(x + index) + 1] = Proyecto1Lab.tabla[y][x];
                                Proyecto1Lab.tabla[y][x] = null;
                                setX(x + index + 1);
                            } else {
                                Proyecto1Lab.tabla[y][(x + index) - 1] = Proyecto1Lab.tabla[y][x];
                                Proyecto1Lab.tabla[y][x] = null;
                                setX(x + index - 1);
                            }
                        } else {
                            Proyecto1Lab.tabla[y][x + index] = Proyecto1Lab.tabla[y][x];
                            Proyecto1Lab.tabla[y][x] = null;
                            setX(x + index);
                        }
                        movido = true;
                    }
                    break;
                case 4:
                    if (abajo == 0) {
                        System.out.println("No te mueves mover hacia arriba.");
                    } else {
                        System.out.println("Ingrese el numero de espacios que desea moverte.");
                        index = Proyecto1Lab.sc.nextInt();
                        while (index < 1 || index > arriba) {
                            System.out.print("Espacio no valido: ");
                            index = Proyecto1Lab.sc.nextInt();
                        }
                        if (y + index == 9 && x == 9) {
                            if (Proyecto1Lab.tabla[10][9] == null) {
                                Proyecto1Lab.tabla[(y + index) + 1][x] = Proyecto1Lab.tabla[y][x];
                                Proyecto1Lab.tabla[y][x] = null;
                                setY(y + index + 1);
                            } else {
                                Proyecto1Lab.tabla[(y + index) - 1][x] = Proyecto1Lab.tabla[y][x];
                                Proyecto1Lab.tabla[y][x] = null;
                                setY(y + index - 1);
                            }
                        } else {
                            Proyecto1Lab.tabla[y + index][x] = Proyecto1Lab.tabla[y][x];
                            Proyecto1Lab.tabla[y][x] = null;
                            setY(y + index);
                        }
                        movido = true;
                    }
                    break;
            }
        }
        validComer();
    }

    @Override
    public void comer(int direccion) {
        if (x == 0) {
            direccion = 2;
        } else if (x == 18) {
            direccion = 3;
        } else if (y == 0) {
            direccion = 1;
        } else if (y == 18) {
            direccion = 0;
        }else{
            direccion=4;
        }
        switch (direccion) {
            case 0:
                if ((Proyecto1Lab.tabla[y - 1][x] instanceof Rebelde) && (Proyecto1Lab.tabla[y][x+1] instanceof Rebelde) && (Proyecto1Lab.tabla[y][x - 1] instanceof Rebelde)) {
                    Proyecto1Lab.tabla[y][x] = null;
                }
                break;
            case 1:
                if ((Proyecto1Lab.tabla[y + 1][x] instanceof Rebelde) && (Proyecto1Lab.tabla[y][x+1] instanceof Rebelde) && (Proyecto1Lab.tabla[y][x - 1] instanceof Rebelde)) {
                    Proyecto1Lab.tabla[y][x] = null;
                }
                break;
            case 2:
                if ((Proyecto1Lab.tabla[y + 1][x] instanceof Rebelde) && (Proyecto1Lab.tabla[y-1][x] instanceof Rebelde) && (Proyecto1Lab.tabla[y][x - 1] instanceof Rebelde)) {
                    Proyecto1Lab.tabla[y][x] = null;
                }
                break;
            case 3:
                if ((Proyecto1Lab.tabla[y + 1][x] instanceof Rebelde) && (Proyecto1Lab.tabla[y-1][x] instanceof Rebelde) && (Proyecto1Lab.tabla[y][x + 1] instanceof Rebelde)) {
                    Proyecto1Lab.tabla[y][x] = null;
                }
                break;
            case 4:
                if ((Proyecto1Lab.tabla[y + 1][x] instanceof Rebelde) && (Proyecto1Lab.tabla[y-1][x] instanceof Rebelde) && (Proyecto1Lab.tabla[y][x + 1] instanceof Rebelde) && (Proyecto1Lab.tabla[y][x - 1] instanceof Rebelde)) {
                    Proyecto1Lab.tabla[y][x] = null;
                }
                break;
        }
    }

}
