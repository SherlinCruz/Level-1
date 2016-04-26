import javax.swing.JOptionPane;

public class CoinChanger {

	int total;
	int coin;

	public static void main(String[] args) {
CoinChanger coin = new CoinChanger(100, 25); 
coin.dispenseCoin(25);
	}

	CoinChanger(int total, int coin) {

		this.total = total;

		this.coin = coin;

	}

	boolean available(int subtractingCoins) {

		if (total - subtractingCoins < 0) {

			return false;
		} else {

			return true;
		}

	}

	boolean hasCoins() {

		return total > 0;

	}

	void addCoin(int addingCoin) {

		total = total + addingCoin;

		JOptionPane.showMessageDialog(null, "Adding Coins");

		JOptionPane.showMessageDialog(null, "Amount of Coins Left: " + addingCoin);

	}

	void dispenseCoin(int subtractingCoins) {

		total = total - subtractingCoins;

		JOptionPane.showMessageDialog(null, "Dispensing Coins");

		JOptionPane.showMessageDialog(null, "Amount of Coins Left: " + total);

	}

	

}
