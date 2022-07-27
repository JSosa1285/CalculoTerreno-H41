import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Arranque
{
    public static void main(String [] args)
    {
        DecimalFormat formato = new DecimalFormat("#,###.##");
        int opcion;
        
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja tipo de terreno\n1, Rectangular\n2, Trapezoidal\n3, Triangular\n0, Salir"));
            double ancho;
            int estrato;
            Terreno t;        
            switch(opcion)
            {   
                case 1:
                    double largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el largo del terreno Rectangular: "));
                    ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ancho del terreno Rectangular: "));
                    estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el estrato del terreno Rectangular: "));
                    t = new TerrenoRectangular(largo, ancho, estrato);
                    JOptionPane.showMessageDialog(null, "El area Rectangular es: "+t.calcularArea()+ "\nEl valor total del terreno Rctangular es: $"+formato.format(t.calcularValorTotal()));
                
                    break;
                
                case 2:
                    double largoMayor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el largo Mayor del terreno Trapezoidal: "));
                    double largoMenor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el largo Menor del terreno Trapezoidal: "));
                    ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ancho del terreno Trapezoidal: "));
                    estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el estrato del terreno Trapezoidal: "));
                    t = new TerrenoTrapezoidal(largoMayor, largoMenor, ancho, estrato);
                    JOptionPane.showMessageDialog(null, "El area Trapezoidal es: "+t.calcularArea()+ "\nEl valor total del terreno Trapezoidal es: $"+formato.format(t.calcularValorTotal()));
                    break;
                
                case 3: 
                    double ladoa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ladoa del terreno Trinagular: "));
                    double ladob = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ladob del terreno Trinagular: "));
                    double ladoc = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ladoc del terreno Trinagular: "));
                    estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el estrato del terreno Trinagular: "));
            
                    t = new TerrenoTriangular(ladoa, ladob, ladoc, estrato);
                    JOptionPane.showMessageDialog(null, "El area Trinagular es: "+t.calcularArea()+ "\nEl valor total del terreno Trinagular es: $"+formato.format(t.calcularValorTotal()));
                    break;
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias");
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "La opcion es incorrecta");
            }
        }
        while(opcion !=0);
        
 
    }
    
    

}
