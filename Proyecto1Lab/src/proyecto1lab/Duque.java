package proyecto1lab;

public class Duque extends Pieza {

    public Duque() {
        super();
    }

    public Duque(int y, int x) {
        super(y, x);
    }

    @Override
    public void comer(int direccion) {
        boolean posRey=false;
        
        if (x>0) {
            if (Proyecto1Lab.tabla[y][x-1] instanceof Rey) {
                posRey=true;
            }
        }
        if (x<18) {
            if (Proyecto1Lab.tabla[y][x+1] instanceof Rey) {
                posRey=true;
            }
            
        }
        if (y>0) {
            if (Proyecto1Lab.tabla[y-1][x] instanceof Rey) {
                posRey=true;
            }
            
        }
        if (y<18) {
            if (Proyecto1Lab.tabla[y+1][x] instanceof Rey) {
                posRey=true;
            }
            
        }
        
        
        if (posRey){
            switch (direccion) {
                case 0:
                    if ((Proyecto1Lab.tabla[y-1][x] instanceof Rebelde)) {
                    
                        Proyecto1Lab.tabla[y][x]=null;
                    }
                    break;
                case 1:
                    if ((Proyecto1Lab.tabla[y+1][x] instanceof Rebelde)) {
                        Proyecto1Lab.tabla[y][x]=null;
                    }
                    break;
                case 2:
                    if ((Proyecto1Lab.tabla[y][x+1] instanceof Rebelde)) {
                        Proyecto1Lab.tabla[y][x]=null;
                    }
                    break;
                case 3:
                    if ((Proyecto1Lab.tabla[y][x-1] instanceof Rebelde)) {
                        Proyecto1Lab.tabla[y][x]=null;
                    }
                    break;                
            }
        }
    }

    /*
    0=arriba
    1=abajo
    2=derecha
    3=izquierda
    */
    
    @Override
    public void validComer() {
        if (y > 1 && y < 17) {
            if ((Proyecto1Lab.tabla[y - 1][x] instanceof Rebelde)) {
                Proyecto1Lab.tabla[y - 1][x].comer(0);
            } else if ((Proyecto1Lab.tabla[y + 1][x] instanceof Rebelde)) {
                Proyecto1Lab.tabla[y + 1][x].comer(1);
            }
        } else if ((y > 0 && y < 2) || (y > 16 && y < 19)) {
            if ((y > 0 && y < 2)) {
                if ((Proyecto1Lab.tabla[y + 1][x] instanceof Rebelde)) {
                    Proyecto1Lab.tabla[y + 1][x].comer(1);
                }
            }else{
                if ((Proyecto1Lab.tabla[y - 1][x] instanceof Rebelde)) {
                    Proyecto1Lab.tabla[y - 1][x].comer(0);
                }
            }
        } else if (x > 1 && x < 17) {
            if ((Proyecto1Lab.tabla[y][x + 1] instanceof Rebelde)) {
                Proyecto1Lab.tabla[y][x + 1].comer(2);
            } else if ((Proyecto1Lab.tabla[y][x - 1] instanceof Rebelde)) {
                Proyecto1Lab.tabla[y][x - 1].comer(3);
            }
        } else if ((x > 0 && x < 2) || (x > 16 && x < 19)) {
            if ((x > 0 && x < 2)) {
                if ((Proyecto1Lab.tabla[y][x+ 1] instanceof Rebelde)) {
                    Proyecto1Lab.tabla[y][x + 1].comer(2);
                }
            }else{
                if ((Proyecto1Lab.tabla[y][x - 1] instanceof Rebelde)) {
                    Proyecto1Lab.tabla[y][x - 1].comer(3);
                }
            }
        }
    }

}
