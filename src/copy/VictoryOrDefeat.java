package copy;

public class VictoryOrDefeat {
	private static int point = 0;
	public static final void decisionVictoryOrDefeat(int computerHand, int playerHand) {
		int playerHandTemp = playerHand;
		playerHandTemp++;
		
		if(playerHand == computerHand) {
			Panel.headerLabel.setText("������");
		}
		else if((playerHand == 3 && computerHand == 1)||(playerHandTemp == computerHand)) {
			point+=1;
			Panel.headerLabel.setText("�����I" + point +("�A�����I")+ " ");
		}
		else {
			point = 0;
			Panel.headerLabel.setText("�����I");
		}
	}
}