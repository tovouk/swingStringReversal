import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{
	
	private JTextArea textArea;
	
	public TextPanel() {
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		//JScrollPane adds scrollbars
		add(new JScrollPane(textArea),BorderLayout.CENTER);
		
	}
	
	public String getText() {
		return textArea.getText();
	}
	
	public void setText(String str) {
		textArea.setText(str);
	}
	
	public void setFont() {
		textArea.setFont(new Font("Arial",Font.PLAIN,75));
	}

}
