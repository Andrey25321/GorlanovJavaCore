package JavaCore4;

public class Main {
    public static void main(String[] args) {
        Phonebook book = new Phonebook();
        book.add("Иванов", "12334222");
        book.add("Иванов", "45612344");
        book.add("Петров", "17181911");
        book.add("Петров", "10111211");
        book.add("Петров", "13141511");
        book.add("Петров", "16171811");
        book.add("Сидоров", "19110111");
        book.add("Сидоров", "12113141");

        System.out.println("Телефоны Ивановых: " + book.get("Иванов"));
        System.out.println("Телефоны Сидоровых: " + book.get("Сидоров"));
        System.out.println("Телефоны Петровых: " + book.get("Петров"));
    }
}