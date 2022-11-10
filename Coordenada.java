package modelo;

public class Coordenada 
{
    private double x;
    private double y;
    
    
    public Coordenada()
    {
    
    }

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getx()
    {
        return  x;
    }

    public void setx(double x)
    {
        this.x = x;
    }

    public double gety()
    {
        return  y;
    }

    public void sety(double y)
    {
        this.y = y;
    }

    public String toString()
    {
        return "(" + x + "," + y + ")" ;
    }

    public boolean equals(Object o)
    {
        Coordenada otra = (Coordenada)o;
        return (x==otra.x) && (y==otra.y);
    }
}
