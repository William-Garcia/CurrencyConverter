import javax.swing.*;

public class currency {

    public static void main(String[] args) {
        currency_function f = new currency_function();
        Object[] option1 = {"MEX", "EUR", "Quit"};
        Object[] option2 = {"Try Again", "Quit"};

        while(true){
            String input = JOptionPane.showInputDialog(null, "Enter Value: ");
            System.out.println(input);

            if(f.check(input) == true){
                double Minput = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null,
                        "Chose which currency you wish to convert", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, option1, option1[2]);
                if(choice1 == 0){
                    f.dollarToMex(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if(choice2 == 0){
                    } else{ break; }

                } else if(choice1 == 1) {
                    f.dollarToEur(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if(choice2 == 0){
                    } else{ break; }

                } else { break; }

            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Output, Try again");
                int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                if(choice2 == 0){

                } else{ break; }
            }

        }
    }
}
