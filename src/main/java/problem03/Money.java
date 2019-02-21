package problem03;

public class Money {

	private int amount;

	public int getAmount() {
		return amount;
	}

	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		Money result = new Money(amount + money.getAmount());
		return result;
	}

	public Money minus(Money money) {
		Money result = new Money(amount + money.getAmount());
		return result;
	}

	public Money multiply(Money money) {
		Money result = new Money(amount * money.getAmount());
		return result;
	}

	public Money devide(Money money) {
		Money result = new Money(amount / money.getAmount());
		return result;
	}
	public boolean equals(Money obj) {
		if (obj.getAmount() == amount) {
			return true;
		} else {
			return false;
		}

	}

}