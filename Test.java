package ejecutable;

import modelo.Coordenada;

public class Test 
{
    public static void main(String[] args) 
    {
        Coordenada c1 = new Coordenada();

        System.out.println("x: " + c1.getx());
        System.out.println("y: " + c1.gety());
        System.out.println(c1.toString());
        
        Coordenada miCoordenada = new Coordenada();
        miCoordenada.setx(8);
        miCoordenada.sety(6);
        System.out.println(miCoordenada.toString());

        if(c1.equals(miCoordenada))
        {
            System.out.println("Las coordenadas si son iguales");
        }
        else
        {
            System.out.println("Las coordenadas no son iguales"); 
        }

        Coordenada distancia0 = new Coordenada();

        System.out.println("x: " + distancia0.getx());
        System.out.println("y: " + distancia0.gety());
        System.out.println(distancia0.toString());
        
        Coordenada distancia1 = new Coordenada();
        distancia1.setx(8);
        distancia1.sety(6);
        System.out.println(distancia1.toString());


        if(distancia0.equals(distancia1))
        {
            System.out.println("Las distancias si son iguales");
        }
        else
        {
            System.out.println("Las distancias no son iguales"); 
        }
    }    
}
