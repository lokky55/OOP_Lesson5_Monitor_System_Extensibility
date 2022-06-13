// Сделаем процедуру наследования(или расширения)
public class Teacher extends Person {
    /* теперь Teacher - это класс потомок, а Person - отец;
       Teacher содержит в себе все от "отца" + отличающийся параметр*/
    private String topic;

    public Teacher(String name, int age, String topic) {
        super(name, age);
        this.topic = topic;
    }

    // создадим свой метод для teacher-a отдельно от родителя
    public void teach(String studentName) {
        System.out.println("Я учу студента" + studentName);
    }

    // вызовем метод из родителя Person и дополним его (переопределение метода)
// Аннотация Override проверяет что мы перезаписываем именно нужный метод родителя
    @Override
    public int happyBirthday() {
        System.out.println("Пойду за покупками перед ДР");
        age++;
        return age;
    }

    @Override
    public boolean isMatches(String query) {
/*        if (name.contains(query)) {    перезаписываем метод родителя - лучше этого не делать
            return true;
        } */
        if (super.isMatches(query)) {
            return true;
        }
        if (topic.contains(query)) {
            return true;
        }
        return false;
    }

}
