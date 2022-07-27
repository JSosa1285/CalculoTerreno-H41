import javax.swing.JOptionPane;

public class Arreglos
{
    public static void main(String [] args)
    {
        String nombre;
        int cantNotas = 5;
        double [] notas = new double[cantNotas];
          
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        double acum = 0;
        for (int i = 0; i < cantNotas; i++)
        {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su nota 1 "+(i+1))); 
            acum = acum + notas[i];
        }
        
        double prom = acum / cantNotas;
        
        JOptionPane.showMessageDialog(null, "El promedio es: "+prom);
    }

}
