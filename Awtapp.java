package isec;
import java.awt.*;

public class Awtapp extends Frame {
    Awtapp(){
        Label firstName =new Label("first name");
        firstName.setBounds(29,50,80,20);
        Label lastName=new Label("last name");
        lastName.setBounds(20,80,80,20);
        Label dob=new Label(" date of birth");
        lastName.setBounds(20,110,80,20);
        TextField firstNameTF=new TextField();
        firstNameTF.setBounds(120, 50, 100, 20);
        TextField lastNameTF=new TextField();
        lastNameTF.setBounds(120, 80, 100, 20);
        TextField dobTF=new TextField();
        dobTF.setBounds(120, 110, 100, 20);
        Button sbmt=new Button("submit");
        sbmt.setBounds(20,160,110,30);
        Button reset=new Button("reset");
        reset.setBounds(120,160,100,30);
        add(firstName);
        add(lastName);
        add(dob);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(sbmt);
        add(reset);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String [] args){
        Awtapp awt=new Awtapp();
    }
}
        
        
    
    

