import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        System.out.println("Задание N1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }

        System.out.println("");
        System.out.println("Задание N2");

        Set<Integer> numsList = new HashSet<>();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                numsList.add(nums.get(i));
            }
        }
        System.out.print(numsList);

        System.out.println("");
        System.out.println("Задание N3");

        List<String> words = new ArrayList<>(List.of("Мама", "Папа", "Сын", "Дочь", "Сын", "Внук", "Папа"));
        Set<String> wordsList = new LinkedHashSet<>();

        for (int i = 0; i < words.size(); i++) {
                wordsList.add(words.get(i));
            }
        System.out.print(wordsList);

        System.out.println("");
        System.out.println("Задание N4");

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> uniqueWords = new LinkedHashSet<>(strings);
        for (String word : uniqueWords) {
            System.out.println(word + "->" + Collections.frequency(strings, word));
        }
    }
}