import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Sort {
	
	// PATH_READ powinna byc zmodyfikowana zgodnie z lokalizacja pliku fileToSort.txt
	public static String PATH_READ = "C:\\Users\\Katarzyna\\Downloads\\fileToSort.txt";
	public static String PATH_SAVE = "C:\\Users\\Katarzyna\\Downloads\\fileSorted.txt";
	
	public static void main(String[] args) throws IOException {
		
		try{
			FileInputStream inputStream = new FileInputStream(PATH_READ);
			Scanner scanner = new Scanner(inputStream, "UTF-8");
			FileWriter fileWriter = new FileWriter(PATH_SAVE);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			// Deklaracja tablicy licznikow
			int[] counterTable= new int[101];
			String number= null;
			// Iteracja po numerach z pliku
			while (scanner.hasNext()){
				 number = scanner.next();
				 int numberParse = Integer.parseInt(number);
				 System.out.println("Sparsowany numer z pliku: " + numberParse);
				 // Iteracja po licznikach zapisywanych w tablicy
				 for(int j = 0; j <= counterTable.length; j++){
				     if(numberParse == j){
				    	counterTable[j] += 1;
				    	System.out.println("Licznik tablicy: " + counterTable[j]);
				     } 
				}
			}
			//Wypisanie i zapisanie do pliku
			for(int k=1; k<=100; k++){
				for(int l=1; l<=counterTable[k]; l++){
					System.out.print(k + " ");
					bufferedWriter.write(k + " ");
				}
			}
			bufferedWriter.close();
		}
		catch (IOException e){
		    System.out.println("Exception" + e);
		}
	}		 
}

	

