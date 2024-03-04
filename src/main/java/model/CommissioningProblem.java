package model;

public class CommissioningProblem {
	private int totalLocks, totalStocks, totalBarrels;
	private double lockPrice, stockPrice, barralesPrice, lockSales, stockSales, barrelSale, Sales, Commission;

	public CommissioningProblem() {
		lockPrice = 30.0;
		stockPrice = 35.0;
		barralesPrice = 40.0;
	}

	public void setInput(int locks, int stocks, int barrels) {
		this.totalLocks = locks;
		this.totalStocks = stocks;
		this.totalBarrels = barrels;
	}

	public int getTotalLocks() {
		return totalLocks;
	}

	public int getTotalStocks() {
		return totalStocks;
	}

	public int getTotalBarrales() {
		return totalBarrels;
	}

	public double calSale() {
		lockSales = lockPrice * totalLocks;
		stockSales = stockPrice * totalStocks;
		barrelSale = barralesPrice * totalBarrels;

		Sales = lockSales + stockSales + barrelSale;

		return Sales;
	}

	public double calCommission(double Sales) {

		boolean c1, c2, c3;

		c1 = (1 <= totalLocks) && (totalLocks <= 60);
		c2 = (1 <= totalStocks) && (totalStocks <= 70);
		c3 = (1 <= totalBarrels) && (totalBarrels <= 80);

		if (!c1 || !c2 || !c3)
			Commission = 0.0;
		else {

			if (Sales > 1800) {
				Commission = 220 + 0.20 * (Sales - 1800.0);
			} else if (Sales > 1000) {
				Commission = 100 + 0.15 * (Sales - 1000);
			} else{
				Commission = 0.10 * Sales;
			}
		}
		return Commission;
	}

}
