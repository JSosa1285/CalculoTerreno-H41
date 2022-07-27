

public class TerrenoTrapezoidal extends Terreno
{
    //Atributos o variables de clase o propiedades
    private double largoMayor;
    private double largoMenor;
    private double ancho;
    
    TerrenoTrapezoidal(double largoMayor, double largoMenor, double ancho, int estrato)
    {
        this.largoMayor = largoMayor;
        this.largoMenor = largoMenor;
        this.ancho = ancho;
        this.estrato = estrato;
        this.area = 0;
        this.valorTotal = 0;
    }
       
    void setLargoMayor(double largoMayor)
    {
        this.largoMayor = largoMayor;
    }
    
    void setLargoMenor(double largoMenor)
    {
        this.largoMenor = largoMenor;
    }
    
    void setAncho(double ancho)
    {
        this.ancho = ancho;
    }
    

    
    double getlargoMayor()
    {
        return this.largoMayor;
    }
    
      double getlargoMenor()
    {
        return this.largoMenor;
    }

    

    
    //Metodos
    double calcularArea()
    {
        this.area = (this.largoMayor + this.largoMenor)*this.ancho/2;
        return this.area;
    }
    

}
