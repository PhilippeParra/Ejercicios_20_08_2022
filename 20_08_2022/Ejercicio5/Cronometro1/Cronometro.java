package Cronometro1;

import javax.swing.JOptionPane;

public class Cronometro 
{
    public static void main(String[] args) 
    {
        //Declaracion de variables
        int S;
        int M;
        int H;
        int S2;

        //Input
        S = Integer.parseInt(JOptionPane.showInputDialog("Digite los segundos: "));

        //Processing
        H = S / 3600;
        M = ((H % 10)- H) * 60;
        S2 = S % 60;

        //Output
        JOptionPane.showMessageDialog(null, "De " + S + " Segundos " + "\nson " + H + " Horas, " + M + " Minutos y " + S2 + " Segundos."  , "Cronometro" , JOptionPane.INFORMATION_MESSAGE);

        //end
        System.exit(0);
    }
}