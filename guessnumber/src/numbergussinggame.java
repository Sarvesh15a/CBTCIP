import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class numbergussinggame {
    private JButton button;
    private JButton guessButton;
    private JTextField Massege;
    private JTextField ComputerNum;
    private JTextField MyNumber;
    private JPanel MyPanel;

    public numbergussinggame() {
        guessButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              int myno=Integer.parseInt(MyNumber.getText());
              int n02=(int)(Math.random()*100);
              if (myno==n02){
                  Massege.setText("Congratulations! You guessed ");
              } else if (myno+1==n02) {
                  Massege.setText("You were too close");
              }
              else {
                  Massege.setText("Ooops! you guessed Wrongs");
              }
              ComputerNum.setText(Integer.toString(n02));
            }
        });
    }

    public static void main(String[] arg) {
        // TODO: place custom component creation code here

        JFrame frame=new JFrame("Guessing game");
        frame.setContentPane(new numbergussinggame().MyPanel);
        frame.setSize(450,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
