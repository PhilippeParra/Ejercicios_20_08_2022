package OrdenInverso;

import javax.swing.JOptionPane;

public class Inverso 
{
    public static void main(String[] args) 
    {
        //Declaracion de variables
        int x;
        int z1;
        int z2;
        int z3;
        int z4;
        int z5;
        

        //Input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de X: "));

        //Processing
        z1 = x % 10;
        z2 = (x % 100)/10;
        z3 = (x % 1000)/100;
        z4 = (x % 10000)/1000;
        z5 = (x % 100000)/10000;

        //Output
        JOptionPane.showMessageDialog(null,"El inverso de " + x + " es " + z1 + z2 + z3 + z4 + z5 , "Numero Inverso" , JOptionPane.INFORMATION_MESSAGE);

        //end
        System.exit(0);
    }
}
