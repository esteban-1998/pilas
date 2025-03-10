import java.util.Stack;
public class principal {
    public static void main(String[] args) {
        metodos m = new metodos();
        Stack<vehiculo> pilas = m.LlenarPila();
        m.MostrarPila(pilas);System.out.println();
        
    }
}
