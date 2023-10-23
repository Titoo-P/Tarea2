
abstract class Moneda{

    public Moneda(){
    }


    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    public String toString() {
        return "$" + this.getValor();
    }
}