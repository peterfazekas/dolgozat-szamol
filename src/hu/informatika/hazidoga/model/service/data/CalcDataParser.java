package hu.informatika.hazidoga.model.service.data;

import java.util.List;
import java.util.stream.Collectors;

import hu.informatika.hazidoga.model.domain.Operation;

public class CalcDataParser {

	public List<Operation> parse(List<String> lines) {
		return lines.stream().map(this::createOperation).collect(Collectors.toList());
	}

	private Operation createOperation(String line) {
		String[] items = line.split(" ");
		int op1 = Integer.parseInt(items[0]);
		int op2 = Integer.parseInt(items[1]);
		int op3 = Integer.parseInt(items[2]);
		int op4 = Integer.parseInt(items[3]);
		int result = getResult(op1, op2, op3, op4);
		return new Operation(op1, op2, op3, op4, result);
	}
	
	private int getResult(int op1, int op2, int op3, int op4) {
		return op1 + op2 - op3 + op4;
	}
}