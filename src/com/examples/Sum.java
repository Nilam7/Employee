package com.examples;

import java.util.StringTokenizer;

public class Sum {

	private String values;
	int sum = 0;
	

	public Sum(String values) {
		this.values = values;
	}

	public int getSum() {
		return calculateSum(this.values);
	}

	private int calculateSum(String values2) {
		int result = 0;
		if (values2 == null || values2 == "") {
			return result;
		}
		StringTokenizer st = new StringTokenizer(values, ",");
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			try {
				result = result + Integer.parseInt(token);
			} catch (Exception e) {
				result = -1;
			}
		}

		return result;

	}

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}

}
