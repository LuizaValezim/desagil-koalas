package br.edu.insper.desagil.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estatistica extends DataFrame{
	private Map<String, List<Double>> columns;

	// Construtor
	public Estatistica() {
		this.columns = new HashMap<>();
	}

	// Métodos
	public void addColumn(String label, List<Double> values) {
		this.columns.put(label, new ArrayList<>(values));
		}

	public double avg(String label, List<Double> values) {
		return Sequencia.sum(label, values) / values.size();
	}

	public double var(String label, List<Double> values) {
		
		super.condition(label);

		double s;

		s = 0;
		for (double value: values) {
			s += value;
		}
		double m = s / values.size();

		s = 0;
		for (double value: values) {
			s += Math.pow(value - m, 2);
		}
		return s / values.size();
	}

	public double std(String label, List<Double> values) {
		
		super.condition(label);

		double s, m;

		s = 0;
		for (double value: values) {
			s += value;
		}
		m = s / values.size();

		s = 0;
		for (double value: values) {
			s += Math.pow(value - m, 2);
		}
		m = s / values.size();

		return Math.sqrt(m);
	}
}
