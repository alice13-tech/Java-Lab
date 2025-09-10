import java.util.HashMap;

public class WordFrequency {
    public static void countWordFrequency(String sentence) {
        sentence = sentence.toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = sentence.split("\\s+");

        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }

        for (String key : freqMap.keySet()) {
            System.out.println(key + ": " + freqMap.get(key));
        }
    }

    public static void main(String[] args) {
        String input = "The cat and the dog.";
        countWordFrequency(input);
    }
}