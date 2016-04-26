import java.util.Random;

public class ChangeMaker {

	CoinChanger penny;

	CoinChanger quarter;

	CoinChanger dimes;

	CoinChanger nickels;

	public static void main(String[] args) {
		ChangeMaker changemaker = new ChangeMaker(9, 17, 10, 20);

	}

	ChangeMaker(int quarter, int dimes, int nickels, int penny) {

		this.quarter = new CoinChanger(quarter, 25);

		this.dimes = new CoinChanger(dimes, 10);

		this.nickels = new CoinChanger(nickels, 5);

		this.penny = new CoinChanger(penny, 1);

	}

	int give1Coin(int amount) {

		if (amount >= 25 && quarter.hasCoins()) {

			quarter.dispenseCoin(1);

			return amount - 25;

		} else if (amount >= 10 && dimes.hasCoins()) {

			dimes.dispenseCoin(1);

			return amount - 10;
		} else if (amount >= 5 && nickels.hasCoins()) {

			dimes.dispenseCoin(1);

			return amount - 5;

		} else if (amount >= 1 && penny.hasCoins()) {

			penny.dispenseCoin(1);

			return amount - 1;

		}

		else {
			return 0;
		}

	}

	void makeChange(int amount) {

		while (amount > 0) {

			amount = give1Coin(amount);
		}
	}
}
