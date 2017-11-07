import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame{
	//set components
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame() {
		//calls JFrame constructor that gives title
		super("Hello World");
		//set layout
		setLayout(new BorderLayout());
		setFont(new Font("Arial",Font.PLAIN,75));
		textArea = new JTextArea();
		textArea.setFont(new Font("Arial",Font.PLAIN,75));
		btn = new JButton("Click Me");
		btn.setFont(new Font("Arial",Font.PLAIN,75));
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textArea.getText();
				if(text == "" || text == " ") {
					textArea.setText("No text provided...");
				}else {
					String reversed = "";
					for(int i=text.length()-1;i>=0;i--) {
						reversed += text.charAt(i);
					}
					textArea.setText(reversed);
					
				}
				
				
			}
			
		});
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		//set length and width of window
		setSize(1500,1000);
		
		//set X button to terminate the application
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
}
