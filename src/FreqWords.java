import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FreqWords {

    static void count_freq(String str) {
        Map<String, Integer> wordFreqMap = new TreeMap<>();

        String[] words = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordFreqMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count_freq(str);
    }
}
