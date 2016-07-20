package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-21
//
//----------------------------------------------|

import org.ejml.simple.SimpleMatrix;

public class MiniBatchGradientDescent implements Minimizer {

	private float alpha;
	private int batchSize;

    //----------------------------------------------|
    // Setter(s)
    //----------------------------------------------|

	public void setLearningRate(float alpha) {
		this.alpha = alpha;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

    //----------------------------------------------|
    // Getter(s)
    //----------------------------------------------|

	public float getLearningRate() {
		return this.alpha;
	}

	public int getBatchSize() {
		return this.batchSize;
	}

    //----------------------------------------------|
    // Other Function(s)
    //----------------------------------------------|

	public void minimize(CostFunction f, SimpleMatrix theta) {
		
	}
}