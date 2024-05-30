package isec;
import java.awt.*;


public class simple_awt extends Frame {
	simple_awt(){
		Button b=new Button("click here");
		b.setBounds(20,100,80,55);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		add(b);
		
	}
	public static void main(String args[]) {
		simple_awt sa=new simple_awt();
		
	}
}


