
public class Main {
    public static void main(String[] args) {
////        Teacher teacher = new Teacher("Alex", 38, "math");
////        System.out.println(teacher.isMatches("math"));
////        Person person = new Person("Anya Netologova", 25);
////        System.out.println(person.isMatches("Ne"));
//
//        // Полиморфизм - мы можем создать обьект типа наследника для родительсокго класса., но не можем наоборот
//        Person person = new Teacher("Alex", 38, "math");
////        Teacher teacher = new Person("Vasya", 35);
//
//        person.happyBirthday();  // метод вызовется Но в версии сына - наследника птмч создан новый обьект Teacher
//        person.teach("Olya");  // метод не вызовется

        // Создаем менеджер совместно с репозиторием! (можно и разделять)
    PersonsManager manager = new PersonsManager(); // Сначала покажем как мы хотим пользоваться, потом как реализовывать
        manager.add(new Teacher("Denis", 37, "Math"));
        manager.add(new Doctor("Aliya", 27, "Dental"));
        manager.add(new Teacher("Olya", 57, "Geology"));
        Person[] result = manager.findByQuery("De"); // метод должен будет найти людей по запросу

    }
}
