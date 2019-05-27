package com.example;

public class CalcBean implements java.io.Serializable {
	private int operand1;
	private int operand2;

	public CalcBean() {
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	public int getOperand1() {
		return operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	public int getAnswer() {
		return operand1 + operand2;
	}
}