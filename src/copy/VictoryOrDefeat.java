package copy;

public class VictoryOrDefeat {
	private static int point = 0;
	public static final void decisionVictoryOrDefeat(int computerHand, int playerHand) {
		int playerHandTemp = playerHand;
		playerHandTemp++;
		
		if(playerHand == computerHand) {
			Panel.headerLabel.setText("もう一度！");
		}
		else if((playerHand == 3 && computerHand == 1)||(playerHandTemp == computerHand)) {
			point+=1;
			Panel.headerLabel.setText("お前の勝ちだ！" + point +("連勝中！")+ " ");
		}
		else {
			point = 0;
			Panel.headerLabel.setText("お前の負けだ！");
		}
	}
}