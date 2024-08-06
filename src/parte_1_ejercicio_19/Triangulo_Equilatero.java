
package parte_1_ejercicio_19;

/**
 *
 * @author Alejandro Bernal
 */

public class Triangulo_Equilatero {
    
    double lado;  //Atributo que define el lado del triandulo equilatero
    
    Triangulo_Equilatero (double lado){
        this.lado = lado;
    }
    
    double calcularArea() {
        return (Math.pow(lado, 2)*Math.sqrt(3))/4;
    }
        
    double calcularAltura() {
        return (lado*Math.sqrt(3))/2;
    }
        
    double calcularPerimetro() {
        return lado*3;
    }
   
}