package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-21
//
//----------------------------------------------|

import org.ejml.simple.SimpleMatrix;

public interface CostFunction {

    //----------------------------------------------|
    // Setter(s)
    //----------------------------------------------|

	public void setTheta(SimpleMatrix theta);
	public void setRegularizationParameter(float lambda);

    //----------------------------------------------|
    // Getter(s)
    //----------------------------------------------|

	public SimpleMatrix getTheta();
	public float getRegularizationParameter();
	public double getCost();
	public SimpleMatrix getDerivative();

    //----------------------------------------------|
    // Other Function(s)
    //----------------------------------------------|

	public double predict();
}