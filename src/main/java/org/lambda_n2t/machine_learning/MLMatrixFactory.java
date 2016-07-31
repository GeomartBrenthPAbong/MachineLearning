package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-22
//
//----------------------------------------------|

public class MLMatrixFactory {

	private static String defaultMatrix = "ejml";

    //----------------------------------------------|
    // Other Function(s)
    //----------------------------------------------|

	public static MLMatrix create(int numRows, int numCols) throws IllegalArgumentException {
		MLMatrix matrix = create(defaultMatrix);
		matrix.create(numRows, numCols);

		return matrix;
	}

	public static MLMatrix create(double[][] rawMatrix) throws IllegalArgumentException {
		MLMatrix matrix = create(defaultMatrix);
		matrix.create(rawMatrix);

		return matrix;
	}

	public static MLMatrix create(String type, int numRows, int numCols) throws IllegalArgumentException {
		MLMatrix matrix = create(type);
		matrix.create(numRows, numCols);

		return matrix;
	}

	public static MLMatrix create(String type, double[][] rawMatrix) throws IllegalArgumentException {
		MLMatrix matrix = create(type);
		matrix.create(rawMatrix);

		return matrix;
	}

	public static MLMatrix create(MLMatrix matrix) {
		MLMatrix newMatrix = create(defaultMatrix);
		newMatrix.create(matrix);

		return newMatrix;
	}

	public static MLMatrix create(String type, MLMatrix matrix) {
		MLMatrix newMatrix = create(type);
		newMatrix.create(matrix);

		return newMatrix;
	}

	public static MLMatrix create(String type) throws IllegalArgumentException {
		if (type.equals("ejml"))
			return new EJMLMatrix();
		else
			throw new IllegalArgumentException("Invalid matrix type.");
	}
}