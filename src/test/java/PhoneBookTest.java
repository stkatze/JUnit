import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private Contact anna;
    private Contact vasiliy;
    private PhoneBook phonBook;

    @BeforeEach
    public void init() {
        this.phonBook = new PhoneBook();
        this.anna = new Contact("Cидорова Анна", "+7 800-555-35-35");
        this.vasiliy = new Contact("Иванов Василий", "+7 925-445-79-67");
        phonBook.creatGroup("Родственники");
        phonBook.addNote("Родственники", vasiliy);
        phonBook.addNote("Родственники", anna);
    }

    @BeforeEach
    public void started() {
        System.out.println("Запуск теста");
    }

    @AfterEach
    public void ended() {
        System.out.println("Тест завершен");
    }

    @Test
    public void testGetСontactByNamePhoneBook() {
        Contact result = phonBook.getСontactByName("Cидорова Анна");
        assertEquals(anna, result);
    }

    @Test
    public void testGetСontactByPhonePhoneBook() {
        Contact result = phonBook.getСontactByPhone("+7 928-400-66-69");
        assertEquals(anna, result);
    }

    @Test
    public void testAddNotePhoneBook() {
        Map<String, List<Contact>> note = new HashMap<>();
        note.put("Родственники", new ArrayList<>());
        note.get("Родственники").add(vasiliy);
        note.get("Родственники").add(anna);

        assertEquals(phonBook.note, note);
    }

}