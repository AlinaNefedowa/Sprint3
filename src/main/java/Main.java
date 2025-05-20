import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаём список животных с начальными значениями
        List<String> initialAnimals = new ArrayList<>(Arrays.asList(
                "CAT Murzik",
                "DOG Rex",
                "HORSE Spirit",
                "COW Bessie",
                "DOG Max",
                "CAT Felix"
        ));

        AnimalFarm farm = new AnimalFarm(initialAnimals);

        // Добавляем животных разными способами
        farm.addFarmAnimal(Animal.CAT, "Tom");
        farm.addFarmAnimal(Animal.DOG);
        farm.addFarmAnimal("UnknownName");

        // Выводим карту количества животных
        Map<Animal, Integer> counted = farm.countedAnimals();
        System.out.println("Counted Animals:");
        for (Map.Entry<Animal, Integer> entry : counted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Выводим множество уникальных имён
        Set<String> uniqueNames = farm.uniqueNames();
        System.out.println("\nUnique Names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        // Выводим всех животных на ферме
        System.out.println("\nAnimal Farm:");
        System.out.println(farm);
    }
}
