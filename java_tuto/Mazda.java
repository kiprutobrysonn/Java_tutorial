package java_tuto;
import javax.swing.*;

public class Mazda extends JFrame  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button=new JButton();
    public Mazda(){

        button.setBounds(100,100,30,50);
        button.addActionListener(e -> System.out.println("welcome"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,400);
        this.setLayout(null);
        this.add(button);
    }
    public static void main(String []args){
        Mazda m1=new Mazda();

    }


}

