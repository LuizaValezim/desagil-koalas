package br.edu.insper.desagil.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sequencia extends DataFrame {
	private Map<String, List<Double>> columns;
	private String label;

	// Construtor
	public Sequencia() {
		this.columns = new HashMap<>();
	}

	// Métodos
	public void addColumn(String label, List<Double> values) {
		this.columns.put(label, new ArrayList<>(values));}
		
		
	public double min(String label, List<Double> values) {
		
		super.condition(this.label);
		
		double m = Double.POSITIVE_INFINITY;
		for (double value: values) {
			if (m > value) {
				m = value;
			}
		}
		return m;
		}

	public double max(String label, List<Double> values) {
		
		super.condition(this.label);

		double m = Double.NEGATIVE_INFINITY;
		for (double value: values) {
			if (m < value) {
				m = value;
			}
		}
		return m;
		}
		
	public double sum(String label, List<Double> values) {
		
		super.condition(this.label);

		double s = 0;
		for (double value: values) {
			s += value;
	}
		return s;
		}
}
	