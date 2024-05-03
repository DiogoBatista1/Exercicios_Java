import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Entities.Products;

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
			Products[] products = new Products[5];
			int index = 0;

			while ((line = br.readLine()) != null) {
				// Divide a linha em campos utilizando a virgula como separador
				String[] campos = line.split(",");

				// Cria um objeto Products com os dados do CSV e armazena no array
				Products product = new Products(campos[0], Double.parseDouble(campos[1]), Integer.parseInt(campos[2]));
				products[index] = product;
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
				Products product = products[i];
				String textOutput = product.getNames() + ", " + product.total();
				bw.write(textOutput);
				bw.newLine(); // escreve novas linhas no arquivo
			}

            System.out.println("\nArquivo summary.csv gerado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}