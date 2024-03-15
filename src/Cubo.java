public class Cubo extends Cuadrado{
    public Cubo(double valor1){
        super(valor1);
    }

    @Override
    public double getArea(){
        return Math.pow(this.valor1, 3);
    }
}
