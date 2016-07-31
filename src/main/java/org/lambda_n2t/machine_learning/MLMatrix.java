package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-22
//
//----------------------------------------------|

public interface MLMatrix {

    //----------------------------------------------|
    // Setter(s)
    //----------------------------------------------|

	public void set(int row, int col, double value);

	// ----------------------------------------------|
    // Getter(s)
    //----------------------------------------------|

	public double get(int row, int col);

	// ----------------------------------------------|
    // Other Function(s)
    //----------------------------------------------|

	public void create(int numRows, int numCols);
	public void create(double[][] rawMatrix);
	public void create(MLMatrix matrix);

	public MLMatrix multiply(MLMatrix matrix);
	public MLMatrix multiply(double constant);

	public MLMatrix add(MLMatrix matrix);
	public MLMatrix add(double constant);

	public MLMatrix subtract(MLMatrix matrix);
	public MLMatrix subtract(double constant);

	public MLMatrix divide(MLMatrix matrix);
	public MLMatrix divide(double constant);

	public MLMatrix inverse();
	public MLMatrix pseudoInverse();
	public MLMatrix transpose();
}