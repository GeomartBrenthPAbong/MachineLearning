package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-21
//
//----------------------------------------------|

import org.ejml.simple.SimpleMatrix;

public class Machine {

	private Minimizer minimizer;
	private CostFunction f;
	private int batchSize;

    //----------------------------------------------|
    // Setter(s)
    //----------------------------------------------|

	public void setMinimizer(String minimizer) {
		this.minimizer = MinimizerFactory.create(minimizer);
	}

	public void setCostFunction(String f) {
		this.f = CostFunctionFactory.create(f);
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

    //----------------------------------------------|
    // Getter(s)
    //----------------------------------------------|

	public int getBatchSize() {
		return this.batchSize;
	}

    //----------------------------------------------|
    // Other Function(s)
    //----------------------------------------------|

	public void build() {
		
	}

	public double predict(SimpleMatrix x) {
		return null;
	}

	public void train(SimpleMatrix X, SimpleMatrix y) {
		
	}
}