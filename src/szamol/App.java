package szamol;

import java.util.List;

import szamol.model.domain.Operation;
import szamol.model.service.data.SzamolDataParser;
import szamol.model.service.data.SzamolFileReader;
import szamol.model.service.data.SzamolResultWriter;

public class App {
	
	private final List<Operation> operations;
	private final SzamolResultWriter writer;

	public App() {
		writer = new SzamolResultWriter("eredmenyek.txt");
		SzamolFileReader file = new SzamolFileReader();
		SzamolDataParser data = new SzamolDataParser();
		operations = data.parse(file.read("szamok.txt"));
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

	private void run() {
		operations.forEach(i -> System.out.println(i));
		writer.printAll(operations);
	}
}
