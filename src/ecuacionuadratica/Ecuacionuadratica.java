/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionuadratica;

/**
 *
 * @author AntOniO
 */
public class Ecuacionuadratica {

    public double untercio,b1,b2,b3,aux,x1;

    public double getAux() {
        return aux;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public double getB3() {
        return b3;
    }

    public void setB3(double b3) {
        this.b3 = b3;
    }

    public double getUntercio() {
        return untercio;
    }

    public void setUntercio(double untercio) {
        this.untercio = untercio;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }
    /**
     * @param args the command line arguments
     */
    public Ecuacionuadratica(){}
    
      
    public double operacion(int a, int b, int c, int d){
        untercio=1./3.;
        b1=-b/(3*a);
        b2=b*b+3*a*c;
        b3=-2*b*b*b+9*a*b*c-27*a*a*d;
        aux=Math.pow((b3+Math.sqrt(4*b2*b2*b2+b3*b3) ),untercio);
        x1=b1-(Math.pow(2,untercio*b2)/(3*a*aux)+(aux)/(3*Math.pow(2,untercio)*a));
        return Math.rint(x1*100)/100;
    }
}
