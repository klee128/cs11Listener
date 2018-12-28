
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Listener extends JFrame {
	JButton reverse;
	JTextField input, output;
	JLabel in, out;
	
	Listener(){
		//sets up basics of frame
		this.setSize(350,350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints con = new GridBagConstraints();
		this.setLayout(layout);
		
		
		//labels a textfield as input
		in = new JLabel("Input: ");
		con.weightx = 1;
		con.gridx = 0;
		con.gridy = 0;
		layout.setConstraints(in, con);
		
		//labels a textfield as output
		out = new JLabel("Output: ");
		con.gridx = 10;
		con.gridy = 0;
		layout.setConstraints(out, con);
		
		//this is input textfield
		input = new JTextField(10);
		con.gridx = 0;
		con.gridy = 10;
		layout.setConstraints(input, con);
		
		//this is output textfield
		output = new JTextField(10);
		con.gridx = 10;
		con.gridy = 10;
		layout.setConstraints(output, con);
		
		//this is reverse button
		reverse = new JButton("reverse");
		con.gridx = 30;
		con.gridy = 10;
		layout.setConstraints(reverse, con);
		
		//when reverse button is pressed, string will be reversed
		reverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String in = input.getText();
				String array = "";
				for (int i = 0; i < in.length(); i++) {
					array = array + in.charAt(in.length() - i - 1);
				}
				output.setText(array);
			}
		});
		
		//when enter is pressed while cursor is on input, string will be reversed
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in = input.getText();
				String array = "";
				for (int i = 0; i < in.length(); i++) {
					array = array + in.charAt(in.length() - i - 1);
				}
				output.setText(array);
			}
			
		});
		
		//adds everything into frame
		this.add(in);
		this.add(out);
		this.add(input);
		this.add(output);
		this.add(reverse);

		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Listener listen = new Listener();
	}

}
