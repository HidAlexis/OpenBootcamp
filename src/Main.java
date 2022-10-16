public class Main {
    public static void main(String[] args) {
        suma(10,24,12);

    }

    public static void suma(int a, int b, int c){
        int resultado = a + b + c;
        System.out.println(resultado);
    }

    class Coche {
        public int cantidadPuertas = 0;

        public void AñadirPuerta(){
            this.cantidadPuertas++;
        }

    }

}