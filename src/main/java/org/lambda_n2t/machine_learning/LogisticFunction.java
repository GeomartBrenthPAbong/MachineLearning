package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-21
//
//----------------------------------------------|

import org.ejml.simple.SimpleMatrix;

public class LogisticFunction implements CostFunction {

	private SimpleMatrix theta;
	private float lambda;
	private double cost;
	private SimpleMatrix derivative;


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

	public SimpleMatrix getTheta() {
		return this.theta;
	}

	public float getRegularizationParameter() {
		return this.lambda;
	}

	public double getCost() {
		return this.cost;
	}

	public SimpleMatrix getDerivative() {
		return this.derivative;
	}

    //----------------------------------------------|
    // Other Function(s)
    //----------------------------------------------|

	public double predict() {
		return null;
	}
}