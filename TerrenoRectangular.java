

public class TerrenoRectangular extends Terreno
{
    //Atributos o variables de clase o propiedades
    private double largo;
    private double ancho;
      
    //Contructor
    TerrenoRectangular()
    {
        this.largo = 0;
        this.ancho = 0;
        this.estrato = 1;
        this.area = 0;
        this.valorTotal = 0;
    }
    
    TerrenoRectangular(double largo, double ancho, int estrato)
    {
        this.largo = largo;
        this.ancho = ancho;
        this.estrato = estrato;
        this.area = 0;
        this.valorTotal = 0;
    }
    
    //GETTERS Y SETTERS
    //Obtener el valor de largo
    double getLargo()
    {
        return this.largo;
    }
    
    //Obtener el valor del ancho
    double getAncho()
    {
        return this.ancho;
    }  
    

    
    //Asignar un valor a largo
    void setLargo(double largo)
    {
        this.largo = largo;                
    }
    
    void setAncho(double ancho)
    {
        this.ancho = ancho;                
    }
    

    
    //Metodos
    double calcularArea()
    {
        this.area = this.largo * this.ancho;
        return this.area;
    }
    

}
