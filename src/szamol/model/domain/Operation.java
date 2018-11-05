package szamol.model.domain;

public class Operation {
	
	private final int op1;
	private final int op2;
	private final int op3;
	private final int op4;
	private final int result;
	
	public Operation(int op1, int op2, int op3, int op4, int result) {
		super();
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.op4 = op4;
		this.result = result;
	}

	public int getOp1() {
		return op1;
	}

	public int getOp2() {
		return op2;
	}

	public int getOp3() {
		return op3;
	}

	public int getOp4() {
		return op4;
	}

	public int getResult() {
		return result;
	}

	@Override
	public String toString() {
		return String.format("%d + %d - %d + %d = %d", op1, op2, op3, op4, result);
	}
}
