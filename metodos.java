import java.util.Stack;//

import javax.swing.JOptionPane;
//Joptionpane es para que aparesca la pestaña

public class metodos {
     public Stack<vehiculo> LlenarPila() {//Stack es para crear una pila
Stack<vehiculo> pilas = new Stack<>();
boolean continuar = true;
String agregar = "";
while (continuar) {
    vehiculo o = new vehiculo();
    o.setMarca(JOptionPane.showInputDialog("ingrese marca"));//showInputDialog es mostrar un dialogo para que el usuario ingrese un dato
    o.setColor(JOptionPane.showInputDialog("ingrese color"));
    o.setPreecio(Double.parseDouble(JOptionPane.showInputDialog("ingrese precio")));
pilas.push(o);
agregar = JOptionPane.showInputDialog("desea agregar otro vehiculo (s/n)");
if (agregar.equalsIgnoreCase("n")){
    continuar = false;
}
}
return pilas;
     }
    public void MostrarPila(Stack<vehiculo> pilas) {
        for(vehiculo o : pilas){
            System.out.println("marca: " + o.getMarca());
            System.out.println("color: " + o.getColor());
            System.out.println("precio: "+ o.getPreecio());
            System.out.println();
            System.out.println();
        }

        
    }
        
    
}
