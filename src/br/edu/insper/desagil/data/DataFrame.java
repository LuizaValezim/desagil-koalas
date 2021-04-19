package br.edu.insper.desagil.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataFrame {
	protected Map<String, List<Double>> columns;
	
	// Construtor
	public DataFrame() {
		this.columns = new HashMap<>();
	}

	// Métodos
	public void addColumn(String label, List<Double> values) {
		this.columns.put(label, new ArrayList<>(values));
	}
	
	public static void condition(String label) {
		if (!this.columns.containsKey(label)) {
			throw new DataFrameException("Column " + label + " is invalid!");
		}
		List<Double> values = this.columns.get(label);
		if (values.size() == 0) {
			throw new DataFrameException("Column " + label + " is empty!");
			}
		}
}