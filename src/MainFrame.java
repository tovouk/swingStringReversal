import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame{
	//set components
	private TextPanel textPanel;
	private JButton btn;
	
	public MainFrame() {
		//calls JFrame constructor that gives title
		super("Hello World");
		//set layout
		setLayout(new BorderLayout());
		setFont(new Font("Arial",Font.PLAIN,75));
		textPanel = new TextPanel();
		textPanel.setFont();
		btn = new JButton("Click Me");
		btn.setFont(new Font("Arial",Font.PLAIN,75));
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textPanel.getText();
				if(text == "" || text == " ") {
					textPanel.setText("No text provided...");
				}else {
					String reversed = "";
					for(int i=text.length()-1;i>=0;i--) {
						reversed += text.charAt(i);
					}
					textPanel.setText(reversed);
					
				}
				
				
			}
			
		});
		
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		//set length and width of window
		setSize(1500,1000);
		
		//set X button to terminate the application
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
}
