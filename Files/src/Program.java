import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String inputFilePath = "Arquivos\\dados.csv";
		String outputFolder = "Arquivos\\out";
		String outputFilePath = outputFolder + "\\summary.csv";

		File inputFile = new File(inputFilePath);
		File outputFolderFile = new File(outputFolder);

		// verifica se a pasta \out existe, caso não, cria a pasta necessária
		if (!outputFolderFile.exists()) {
			outputFolderFile.mkdir(); // cria as pastas necessárias
		}

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {

			String line;
			String[] names = new String[5];
			double[] value = new double[5];
			int[] quantity = new int[5];
			int index = 0;

			while ((line = br.readLine()) != null) {
				// Divide a linha em campos utilizando a virgula como separador
				String[] campos = line.split(",");

				// Armazena o nome do produto no array de nomes
				names[index] = campos[0];
				value[index] = Double.parseDouble(campos[1]);
				quantity[index] = Integer.parseInt(campos[2]);

				// incrementa o indice
				index++;

				// Mostra cada campo no console
				for (int i = 0; i < campos.length; i++) {
					System.out.print(campos[i] + ", ");
				}
				System.out.println(); // Nova linha após cada impressão do csv

			}
			// armazena texto no arquivo out.csv
			for (int i = 0; i < index; i++) {
				String textOutput = (names[i] + ", " + (value[i] * quantity[i]));
				bw.write(textOutput);
				bw.newLine(); // escreve novas linhas no arquivo
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}