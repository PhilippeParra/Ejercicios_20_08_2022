package Ejercicio3.SumaEjercicio3_java;

import javax.swing.JOptionPane;

public class Suma 
{
    public static void main(String[] args) 
    {
        //Declaracion de variables
        int N;
        int s;

        //Input
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de N: "));

        //Processing
        s = N*(N+1)/2;

        //Output
        JOptionPane.showMessageDialog(null, "La suma de los primeros " + N + " numeros es "  + s, "Suma" , JOptionPane.INFORMATION_MESSAGE);

        //end
        System.exit(0);
    }
}