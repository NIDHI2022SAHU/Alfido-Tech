// Task 2:Word Counter 
// find Total Word,Total Character,Average Word Length,Each Word Frequency

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class WordCounter {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a File object representing the text file
        File file = new File("E://Desktop//helpful//Alfido Tech//text.txt");
        
        // Create a Scanner to read the contents of the file
        Scanner sc = new Scanner(file);
        
        // Initialize variables to keep track of word count, character count, and word frequencies
        int totalWord = 0;
        int totalCharacterCount = 0;
        Map<String, Integer> wordFrequency = new HashMap<>();
        
        // Print a header for the text file
             System.out.println("Text file is :");

        // Loop through each line in the file
        while (sc.hasNextLine()) {
            // Read the current line from the file
            String line = sc.nextLine();

             // Print the current line from the file
            System.out.println(line);
            
            // Split the line into words based on spaces
            String[] words = line.split(" ");
            
            // Increment the total word count by the number of words in the line
            totalWord += words.length;
            
            // Iterate through the words in the line
            for (String word : words) {

                // Increment the total character count by the length of the word
                totalCharacterCount += word.length();
                
                // Update the word frequency map, counting the occurrence of each word
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);

            }
             
          
        }
        
        // Calculate the average word length
        double averageWordLength = (double) totalCharacterCount / totalWord;
        
        // Print total word count, total character count, and average word length
        System.out.println("Total words: " + totalWord);
        System.out.println("Total characters: " + totalCharacterCount);
        System.out.println("Average word length: " + averageWordLength);
        
        // Print word frequencies
        System.out.println("Word Frequencies:");
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
        sc.close();
    }

}
