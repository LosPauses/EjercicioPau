package exercicipau;

public class ExerciciPau {

    public void inicio() {
        LT entr = new LT(); // con esto me permite utilizar los métodos de la clase LT
        int entrada; // solo una variable entrada
        int aux; // variable auxiliar para poder guardar el primer valor
        System.out.print("Escribe un número: ");
        entrada = entr.llegirSencer();
        if (comprovar(entrada)) {
            System.out.println("El primer valor que has escrito (" + entrada + ") no puede ser negativo");
        } else {
            aux = entrada; // asigno el primer valor de entrada a aux
            System.out.print("Escribe otro número: ");
            entrada = entr.llegirSencer();
            if (comprovar(entrada)) {
                System.out.println("No puede haber numeros negativos");
            } else {
                System.out.println("El número más alto es: " + comparacion(entrada, aux));
            }
        }
    }

    public int comparacion(int a, int b) {
        if (a <= b) { // comparo a y b
            return b; // si a es más pequeño o igual devuelvo b
        }
        return a; // sino devuelvo a
    }

    public boolean comprovar(int a) { // mira si un numero es negativo o no
        boolean comprovar;
        comprovar = false;
        if (a < 0) {
            comprovar = true;
        }
        return comprovar;
    }

    public static void main(String[] args) {
        new ExerciciPau().inicio();
    }

}
