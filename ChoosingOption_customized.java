import javax.swing.JOptionPane;

public class ChoosingOption_customized {
    public static void main(String[] args){
        String[] options = {"I do", "I don’t"};
        
        int option = JOptionPane.showOptionDialog(
                null,                               
                "Do you want to change to the first class ticket?",
                "Choose an Option",                
                JOptionPane.DEFAULT_OPTION,         
                JOptionPane.QUESTION_MESSAGE,       
                null,                               
                options,                            
                options[0]                          
        );
        
        JOptionPane.showMessageDialog(
                null, "You've chosen: " + options[option]);
        
        System.exit(0);
    }
}
