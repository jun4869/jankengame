package copy;

import javax.swing.JFrame;

public class GameMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�E�B���h�E�ݒ�
		JFrame frame = new JFrame("����񂯂�Q�[��");
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		Panel.createPanel(frame);
		
		//�E�B���h�E�\��
		frame.setVisible(true);
	}
}