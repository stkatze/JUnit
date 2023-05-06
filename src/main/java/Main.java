import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Contact Anna = new Contact("Cидорова Анна", "+7 800-555-35-35");
        Contact Vasiliy = new Contact("Иванов Василий", "+7 925-445-79-67");
        Contact Ekaterina = new Contact("Петрова Екатерина", "+7 928-400-66-69");

        PhoneBook.creatGroup("Родственники");
        PhoneBook.creatGroup("Коллеги");
        PhoneBook.creatGroup("Друзья");

        PhoneBook.addNote("Родственники", Anna);
        PhoneBook.addNote("Родственники", Ekaterina);
        PhoneBook.addNote("Коллеги", Ekaterina);
        PhoneBook.addNote("Коллеги", Vasiliy);
        PhoneBook.addNote("Друзья", Vasiliy);

        MissedCalls.putMissedCalls("+7 800-555-35-35");
        TimeUnit.SECONDS.sleep(2);
        MissedCalls.putMissedCalls("+7 925-445-79-67");
        TimeUnit.SECONDS.sleep(2);
        MissedCalls.putMissedCalls("+7 928-400-66-69");
        TimeUnit.SECONDS.sleep(2);
        MissedCalls.putMissedCalls("+7 925-445-79-67");

        MissedCalls.printMissedCalls();
    }
}