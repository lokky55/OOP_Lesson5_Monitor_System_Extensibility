import java.util.Objects;

// создадим общий класс для людей разных профессий но с общими обьектами
public class Person {
    protected String name; // protected будет давать доступ к полю всем наследникам!
    protected int age;

// Сгенерируем тривиальный констурктор для Person (Alt + Insert)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
// Создадим метод проверки на имя
    public boolean isMatches(String query) {
        return name.contains(query);     // contains усть у всех текстовых данных
//        if (name.contains(query)) {
//            return true;
//        } else {
//            return false;
//        }
    }

// Создадим метод дня рождения который увеличивает возраст на 1
    public int happyBirthday() {
        age++;
        return 0;
    }

    // создадим корреткный equals (Alt + Insert)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
