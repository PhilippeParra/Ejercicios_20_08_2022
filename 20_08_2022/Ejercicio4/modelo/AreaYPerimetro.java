package modelo;

import javax.swing.JOptionPane;
import java.lang.Math;

public class AreaYPerimetro
{
    public static void main(String[] args) 
    {
        //Declaracion de variables
        int R;
        int A;
        int P;
        

        //Input
        R = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del Radio: "));

        //Processing
        P = (int)(2 * Math.PI *R);
        A = (int)(Math.PI *(R*R));

        //Output
        JOptionPane.showMessageDialog(null, "El perimetro de su circumferencia es: " + P + " \ny su Area es "  + A, "Circunferencia" , JOptionPane.INFORMATION_MESSAGE);

        //end
        System.exit(0);
    }
}