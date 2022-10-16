public class Main {
    public static void main(String[] args) {
        suma(10,24,12);
        Coche miCoche = new Coche();
        miCoche.AñadirPuerta();
        System.out.println(miCoche.cantidadpuertas);
    }

    public static void suma(int a, int b, int c){
        int resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {
    public int cantidadpuertas = 2;
    public void AñadirPuerta(){
        this.cantidadpuertas++;
    }

}