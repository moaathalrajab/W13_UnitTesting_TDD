package Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GUI_Controller {

    @FXML
    private TextField number_1;

    @FXML
    private TextField number_2;

    @FXML
    private Label answer;

    @FXML
    void find_GCD(ActionEvent event) {
        int num1 = Integer.parseInt(number_1.getText());
        int num2 = Integer.parseInt(number_2.getText());
        answer.setText("The GCD is "+gcdLoops(num1,num2));
    }
    
    public int gcd(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        return gcd(b, a % b);  
          
    }
    
    public int gcdLoops(int a, int b) 
    {
        while(b > 0)
        {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

}
