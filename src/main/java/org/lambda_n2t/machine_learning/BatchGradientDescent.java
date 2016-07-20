package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-21
//
//----------------------------------------------|

import org.ejml.simple.SimpleMatrix;

public class BatchGradientDescent implements Minimizer {

	private float alpha;

    //----------------------------------------------|
    // Setter(s)
    //----------------------------------------------|

	public void setLearningRate(float alpha) {
		this.alpha = alpha;
	}

    //----------------------------------------------|
    // Getter(s)
    //----------------------------------------------|

	public float getLearningRate() {
		return this.alpha;
	}

    //----------------------------------------------|
    // Other Function(s)
    //----------------------------------------------|

	public void minimize(CostFunction f, SimpleMatrix theta) {
		
	}
}