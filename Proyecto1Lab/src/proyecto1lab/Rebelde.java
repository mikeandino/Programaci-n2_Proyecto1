package proyecto1lab;

public class Rebelde extends Pieza {

    public Rebelde() {
        super();
    }

    public Rebelde(int y, int x) {
        super(y, x);
    }

    @Override
    public void comer(int  direccion) {
        switch (direccion) {
            case 0:
                if ((Proyecto1Lab.tabla[y-1][x] instanceof Duque) || (Proyecto1Lab.tabla[y-1][x] instanceof Rey)) {
                    Proyecto1Lab.tabla[y][x]=null;
                }
                break;
            case 1:
                if ((Proyecto1Lab.tabla[y+1][x] instanceof Duque) || (Proyecto1Lab.tabla[y+1][x] instanceof Rey)) {
                    Proyecto1Lab.tabla[y][x]=null;
                }
                break;
            case 2:
                if ((Proyecto1Lab.tabla[y][x+1] instanceof Duque) || (Proyecto1Lab.tabla[y][x+1] instanceof Rey)) {
                    Proyecto1Lab.tabla[y][x]=null;
                }
                break;
            case 3:
                if ((Proyecto1Lab.tabla[y][x-1] instanceof Duque) || (Proyecto1Lab.tabla[y][x-1] instanceof Rey)) {
                    Proyecto1Lab.tabla[y][x]=null;
                }
                break;                
        }
    }

    @Override
    public void validComer() {
        if (y > 1 && y < 17) {
            if ((Proyecto1Lab.tabla[y - 1][x] instanceof Duque) || (Proyecto1Lab.tabla[y - 1][x] instanceof Rey)) {
                Proyecto1Lab.tabla[y - 1][x].comer(0);
            } else if ((Proyecto1Lab.tabla[y + 1][x] instanceof Duque) || (Proyecto1Lab.tabla[y + 1][x] instanceof Rey)) {
                Proyecto1Lab.tabla[y + 1][x].comer(1);
            }
        } else if ((y > 0 && y < 2) || (y > 16 && y < 19)) {
            if ((y > 0 && y < 2)) {
                if ((Proyecto1Lab.tabla[y + 1][x] instanceof Duque) || (Proyecto1Lab.tabla[y + 1][x] instanceof Rey)) {
                    Proyecto1Lab.tabla[y + 1][x].comer(1);
                }
            }else{
                if ((Proyecto1Lab.tabla[y - 1][x] instanceof Duque) || (Proyecto1Lab.tabla[y - 1][x] instanceof Rey)) {
                    Proyecto1Lab.tabla[y - 1][x].comer(0);
                }
            }
        } else if (x > 1 && x < 17) {
            if ((Proyecto1Lab.tabla[y][x + 1] instanceof Duque) || (Proyecto1Lab.tabla[y][x + 1] instanceof Rey)) {
                Proyecto1Lab.tabla[y][x + 1].comer(2);
            } else if ((Proyecto1Lab.tabla[y][x - 1] instanceof Duque) || (Proyecto1Lab.tabla[y][x - 1] instanceof Rey)) {
                Proyecto1Lab.tabla[y][x - 1].comer(3);
            }
        } else if ((x > 0 && x < 2) || (x > 16 && x < 19)) {
            if ((x > 0 && x < 2)) {
                if ((Proyecto1Lab.tabla[y][x+ 1] instanceof Duque) || (Proyecto1Lab.tabla[y + 1][x] instanceof Rey)) {
                    Proyecto1Lab.tabla[y][x + 1].comer(2);
                }
            }else{
                if ((Proyecto1Lab.tabla[y][x - 1] instanceof Duque) || (Proyecto1Lab.tabla[y][x - 1] instanceof Rey)) {
                    Proyecto1Lab.tabla[y][x - 1].comer(3);
                }
            }
        }
    }

}
