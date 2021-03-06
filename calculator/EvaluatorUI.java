
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvaluatorUI extends JFrame implements ActionListener {

    private TextField txField = new TextField();
    private Panel buttonPanel = new Panel();

    // total of 20 buttons on the calculator,
    // numbered from left to right, top to bottom
    // bText[] array contains the text for corresponding buttons
    private static final String[] bText = {
        "7", "8", "9", "+", "4", "5", "6", "- ", "1", "2", "3",
        "*", "0", "^", "=", "/", "(", ")", "C", "CE"
    };
    private Button[] buttons = new Button[bText.length];

    public static void main(String argv[]) {
        EvaluatorUI calc = new EvaluatorUI();
    }

    public EvaluatorUI() {
        setLayout(new BorderLayout());              

        add(txField, BorderLayout.NORTH);
        txField.setEditable(false);

        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setLayout(new GridLayout(5, 4));

        //create 20 buttons with corresponding text in bText[] array
        for (int i = 0; i < 20; i++) {
            buttons[i] = new Button(bText[i]);
        }

        //add buttons to button panel
        for (int i = 0; i < 20; i++) {
            buttonPanel.add(buttons[i]);
        }

        //set up buttons to listen for mouse input
        for (int i = 0; i < 20; i++) {
            buttons[i].addActionListener(this);
        }

        setTitle("Calculator");
        setSize(400, 400);
        setLocationByPlatform(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent arg0) {         //I included some cool features. Everytime you press "=" the next button 
        // You need to fill in this fuction                 // pressed will automattically erease the previous statements.
                                                            // "CE" erases the previous inputted statement.
        if (arg0.getSource() == buttons[0]) {

            if (txField.getText().contains("=")) {

                txField.setText("");

            }

            txField.setText(txField.getText() + "7");

        } else if (arg0.getSource() == buttons[1]) {

            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + "8");

        } else if (arg0.getSource() == buttons[2]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + "9");

        } else if (arg0.getSource() == buttons[3]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + " + ");

        } else if (arg0.getSource() == buttons[4]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + "4");

        } else if (arg0.getSource() == buttons[5]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + "5");

        } else if (arg0.getSource() == buttons[6]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + "6");

        } else if (arg0.getSource() == buttons[7]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + " - ");

        } else if (arg0.getSource() == buttons[8]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + "1");

        } else if (arg0.getSource() == buttons[9]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + "2");

        } else if (arg0.getSource() == buttons[10]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + "3");

        } else if (arg0.getSource() == buttons[11]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + " * ");

        } else if (arg0.getSource() == buttons[12]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + "0");

        } else if (arg0.getSource() == buttons[13]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + " ^ ");

        } else if (arg0.getSource() == buttons[14]) {

            Evaluator eval = new Evaluator();
            String DisplayAnswer = Integer.toString(eval.eval(txField.getText()));
            txField.setText(txField.getText() + " = " + DisplayAnswer);

        } else if (arg0.getSource() == buttons[15]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + " / ");

        } else if (arg0.getSource() == buttons[16]) {
            if (txField.getText().contains("=")) {

                txField.setText("");

            }
            txField.setText(txField.getText() + " ( ");

        } else if (arg0.getSource() == buttons[17]) {

            if (txField.getText().contains("=")) {

                txField.setText("");

            }

            txField.setText(txField.getText() + " ) ");

        } else if (arg0.getSource() == buttons[18]) {

            txField.setText("");

        } else if (arg0.getSource() == buttons[19]) {

            if (txField.getText().contains("=")) {

                txField.setText("");

            } else {
                txField.setText(txField.getText().substring(0, txField.getText().length() - 2));
            }

        }

    }

}
