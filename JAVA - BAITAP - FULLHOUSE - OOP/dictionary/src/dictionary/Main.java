package dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary d = new Dictionary();
		int choice = 0;
//		d.addWord("Dog", "con cho");
//		d.addWord("cat", "Con meo");
//		d.addWord("Car", "xe o to");
//		d.addWord("abc", "Con meo");
//		System.out.println();
//		
//		d.updateWord("abc", "con cho");
//		System.out.println(d.searchWord("cat"));
//		
//		d.showAll();

		do {

			System.out.println("===DICTIONARY===");
			System.out.println("1. Add new word");
			System.out.println("2. Update word");
			System.out.println("3. Delete word");
			System.out.println("4. Search word");
			System.out.println("5. Show all word");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:\n ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter new word: ");
				String newWord = sc.nextLine();
				System.out.println("Enter new mean of word: ");
				String newMean = sc.nextLine();
				d.addWord(newWord, newMean);
				break;
			case 2:
				System.out.println("Enter word you want to update: ");
				String updateWord = sc.nextLine();
				System.out.println("Enter mean of word you want to update: ");
				String updateMean = sc.nextLine();
				d.updateWord(updateWord, updateMean);
				break;
			case 3:
				System.out.println("Enter word you want to delete: ");
				String deleteWord = sc.nextLine();
				d.deleteWord(deleteWord);
				break;
			case 4:
				System.out.println("Enter word you want to search: ");
				String searchWord = sc.nextLine();
				d.searchWord(searchWord);
				break;
			case 5:
				
					d.showAll();
				
				
				break;
			case 6:
				System.out.println("End program.");
				break;
			default:
				System.out.println("Error. Please enter again.");
				System.out.println();
				
			}

		} while (choice != 6);
		sc.close();
	}
}