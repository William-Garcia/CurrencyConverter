import javax.swing.*;

public class currency_function {
    public boolean check(String input){
        try{
            double x = Double.parseDouble(input);
            if( x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public void dollarToMex(double Minput){
        double mex = Minput *  20.27;
        JOptionPane.showMessageDialog(null, "Amount of Mexican Pesos: " + mex + " pesos");
    }
    public void dollarToEur(double Minput){
        double eur = Minput *  1.02;
        JOptionPane.showMessageDialog(null, "Amount of Euros: " + eur + " euros");
    }

}
