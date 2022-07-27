import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Arranque
{
    public static void main(String [] args)
    {
        DecimalFormat formato = new DecimalFormat("#,###.##");
        int opcion;
        ArrayList<Terreno> listaTerrenos = new ArrayList<Terreno>();
        
        do
        {
            String mensajeMenu = "MENU PRINCIPAL \n1"+
                                 "1. Ingresar Terreno Rectangular\n"+
                                 "2. Ingresar Terreno Trapezoidal\n"+
                                 "3. Ingresar Terreno Triangular\n"+
                                 "4. Mostrar cantidad de terrenos\n"+
                                 "5. Salir";
                                 
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensajeMenu));
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
                    listaTerrenos.add(t);
                    break;
                
                case 2:
                    double largoMayor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el largo Mayor del terreno Trapezoidal: "));
                    double largoMenor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el largo Menor del terreno Trapezoidal: "));
                    ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ancho del terreno Trapezoidal: "));
                    estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el estrato del terreno Trapezoidal: "));
                    t = new TerrenoTrapezoidal(largoMayor, largoMenor, ancho, estrato);
                    JOptionPane.showMessageDialog(null, "El area Trapezoidal es: "+t.calcularArea()+ "\nEl valor total del terreno Trapezoidal es: $"+formato.format(t.calcularValorTotal()));
                    listaTerrenos.add(t);   
                    break;
                
                case 3: 
                    double ladoa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ladoa del terreno Trinagular: "));
                    double ladob = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ladob del terreno Trinagular: "));
                    double ladoc = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ladoc del terreno Trinagular: "));
                    estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el estrato del terreno Trinagular: "));
                    t = new TerrenoTriangular(ladoa, ladob, ladoc, estrato);
                    JOptionPane.showMessageDialog(null, "El area Trinagular es: "+t.calcularArea()+ "\nEl valor total del terreno Trinagular es: $"+formato.format(t.calcularValorTotal()));
                    listaTerrenos.add(t);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Cantidad de terrenos ingresados: "+listaTerrenos.size()); 
                
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
