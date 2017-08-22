package proyecto1lab;

public abstract class Pieza {
    protected int y;
    protected int x;

    public Pieza() {
    }

    public Pieza(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Pieza{" + "y=" + y + ", x=" + x + '}';
    }
    
    public abstract void mover();
    
    public abstract void comer();
    
}
