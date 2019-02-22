package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.Map;

public class Cash {

	private Map<String, CashElement> cash = new HashMap<>();

	public Map<String, CashElement> getCash() {
		return cash;
	}

	public void setCash(Map<String, CashElement> cash) {
		this.cash = cash;
	}
}
