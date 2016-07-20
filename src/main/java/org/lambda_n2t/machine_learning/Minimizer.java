package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-21
//
//----------------------------------------------|

import org.ejml.simple.SimpleMatrix;

public interface Minimizer {

    //----------------------------------------------|
    // Other Function(s)
    //----------------------------------------------|

	public void minimize(CostFunction f, SimpleMatrix theta);
}