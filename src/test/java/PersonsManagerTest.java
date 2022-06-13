import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonsManagerTest {
    PersonsManager manager = new PersonsManager();
    Teacher teacher = new Teacher("Denis", 37, "Math");
    Doctor doctor = new Doctor("Aliya", 27, "Dental");
    Teacher teacher1 = new Teacher("Olya", 57, "Geology");

    @Test
    public void shouldFind2Elements() {
        // подготовка - создаем менеджер, давляем данные
        manager.add(teacher);
        manager.add(doctor);
        manager.add(teacher1);

        Person[] actual = manager.findByQuery("De");
        Person[] expected = {teacher, doctor};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCalcAge() {
        manager.add(doctor);
        int actual = doctor.happyBirthday();
        int expected = 28;
        Assertions.assertEquals(expected, actual);
    }

}

