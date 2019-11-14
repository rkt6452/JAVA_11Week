import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerSample extends JFrame {
	ListenerSample() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener ();
		btn.addActionListener(listener);
		add(btn);
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenerSample ();
	}
}
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
	}
}
