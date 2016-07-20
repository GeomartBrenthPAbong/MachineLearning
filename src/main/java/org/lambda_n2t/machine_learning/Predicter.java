package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-21
//
//----------------------------------------------|

import org.ejml.simple.SimpleMatrix;

public abstract class Predicter implements CostFunction {

	protected CostFunction f;
	protected double cost;
	protected SimpleMatrix derivative;
	protected SimpleMatrix theta;
	protected float lambda;

    //----------------------------------------------|
    // Setter(s)
    //----------------------------------------------|

	public void setTheta(SimpleMatrix theta) {
		this.theta = theta;
	}

	public void setRegularizationParameter(float lambda) {
		this.lambda = lambda;
	}

    //----------------------------------------------|
    // Getter(s)
    //----------------------------------------------|

	public double getCost() {
		return this.cost;
	}

	public SimpleMatrix getDerivative() {
		return this.derivative;
	}

	public SimpleMatrix getTheta() {
		return this.theta;
	}

	public float getRegularizationParameter() {
		return this.lambda;
	}
}