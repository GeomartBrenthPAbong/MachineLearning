package org.lambda_n2t.machine_learning;

//----------------------------------------------|
//
// Programmer: Geomart Brenth Abong
// Date Created: 2016-07-22
//
//----------------------------------------------|

import org.ejml.data.DenseMatrix64F;
import org.ejml.equation.*;

public class EJMLMatrix implements MLMatrix {
	ManagerTempVariables managerTempVariables;
	VariableMatrix variableMatrix;
	VariableDouble variableDouble;

	//----------------------------------------------|
	// Constructor(s)
	//----------------------------------------------|

	public EJMLMatrix() {
		this.managerTempVariables = new ManagerTempVariables();
		this.variableDouble = new VariableDouble(0);
	}

	//----------------------------------------------|
	// Setter(s)
	//----------------------------------------------|

	public void set(int row, int col, double value) {
		this.variableMatrix.matrix.set(row, col, value);
	}

	// ----------------------------------------------|
	// Getter(s)
	//----------------------------------------------|

	public double get(int row, int col) {
		return this.variableMatrix.matrix.get(row, col);
	}

    //----------------------------------------------|
    // Other Function(s)
    //----------------------------------------------|

	public void create(int numRows, int numCols) {
		this.variableMatrix = new VariableMatrix(new DenseMatrix64F(numRows, numCols));
	}

	public void create(double[][] rawMatrix) {
		this.variableMatrix = new VariableMatrix(new DenseMatrix64F(rawMatrix));
	}

	public void create(MLMatrix matrix) {
		this.variableMatrix = new VariableMatrix(
									new DenseMatrix64F(
											((EJMLMatrix) matrix).variableMatrix.matrix
									)
							  );
	}

	public void create(VariableMatrix matrix) {
		this.variableMatrix = matrix;
	}

	public MLMatrix multiply(MLMatrix matrix) {
		Operation.Info info;
		info = Operation.multiply(this.variableMatrix,
								  ((EJMLMatrix) matrix).variableMatrix,
								  this.managerTempVariables);

		return this.getResultMatrix(info);
	}

	public MLMatrix multiply(double constant) {
		this.variableDouble.value = constant;
		Operation.Info info;
		info = Operation.multiply(this.variableMatrix,
								  this.variableDouble,
								  this.managerTempVariables);

		return this.getResultMatrix(info);
	}


	public MLMatrix add(MLMatrix matrix) {
		Operation.Info info;
		info = Operation.add(this.variableMatrix,
							 ((EJMLMatrix) matrix).variableMatrix,
							 this.managerTempVariables);

		return this.getResultMatrix(info);
	}

	public MLMatrix add(double constant) {
		this.variableDouble.value = constant;
		Operation.Info info;
		info = Operation.add(this.variableMatrix,
							 this.variableDouble,
							 this.managerTempVariables);

		return this.getResultMatrix(info);
	}


	public MLMatrix subtract(MLMatrix matrix) {
		Operation.Info info;
		info = Operation.subtract(this.variableMatrix,
								 ((EJMLMatrix) matrix).variableMatrix,
								 this.managerTempVariables);

		return this.getResultMatrix(info);
	}

	public MLMatrix subtract(double constant) {
		this.variableDouble.value = constant;
		Operation.Info info;
		info = Operation.subtract(this.variableMatrix,
								  this.variableDouble,
								  this.managerTempVariables);

		return this.getResultMatrix(info);
	}

	public MLMatrix divide(MLMatrix matrix) {
		Operation.Info info;
		info = Operation.divide(this.variableMatrix,
								((EJMLMatrix) matrix).variableMatrix,
								this.managerTempVariables);

		return this.getResultMatrix(info);
	}

	public MLMatrix divide(double constant) {
		this.variableDouble.value = constant;
		Operation.Info info;
		info = Operation.divide(this.variableMatrix,
								this.variableDouble,
								this.managerTempVariables);

		return this.getResultMatrix(info);
	}

	public MLMatrix inverse() {
		Operation.Info info;
		info = Operation.inv(this.variableMatrix,
							 this.managerTempVariables);

		return this.getResultMatrix(info);
	}

	public MLMatrix pseudoInverse() {
		Operation.Info info;
		info = Operation.pinv(this.variableMatrix,
							  this.managerTempVariables);

		return this.getResultMatrix(info);
	}

	public MLMatrix transpose() {
		Operation.Info info;
		info = Operation.transpose(this.variableMatrix,
								   this.managerTempVariables);

		return this.getResultMatrix(info);
	}

	private MLMatrix getResultMatrix(Operation.Info info) {
		EJMLMatrix newMatrix = (EJMLMatrix) MLMatrixFactory.create("ejml");
		newMatrix.create((VariableMatrix) info.output);

		return newMatrix;
	}
}