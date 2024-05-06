import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("Мама", "Папа", "Сын", "Дочь", "Сын", "Внук", "Папа"));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(strings);
    }

    public static void task1(List<Integer> list) {

        System.out.println("Задание N1");

        for(int i = 0; i < list.size();i++) {
            if (list.get(i) % 2 != 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static void task2(List<Integer> list) {

        System.out.println("");
        System.out.println("Задание N2");

        Set<Integer> numsList = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                numsList.add(list.get(i));
            }
        }
        System.out.print(numsList);
    }

    public static void task3(List<String> words) {

        System.out.println("");
        System.out.println("Задание N3");

        Set<String> wordsList = new LinkedHashSet<>();

        for (int i = 0; i < words.size(); i++) {
            wordsList.add(words.get(i));
        }
        System.out.print(wordsList);
    }


    public static void task4(List<String> strings) {

        System.out.println("");
        System.out.println("Задание N4");


        Set<String> uniqueWords = new LinkedHashSet<>(strings);
        for (String word : uniqueWords) {
            System.out.println(word + "->" + Collections.frequency(strings, word));
        }
    }
}