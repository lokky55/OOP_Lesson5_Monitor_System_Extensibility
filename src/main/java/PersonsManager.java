public class PersonsManager {
    private Person[] people = new Person[0];  // создадим пустой массив для хранения людей


    // создаем метод добавления (вход параметр - человек(родитель), не профессия (наследник)
    public void add(Person person) {
        Person[] tmp = new Person[people.length + 1];  // создаем массив длиной на 1 ячейку больше
        for (int i = 0; i < people.length; i++) {      // перебираем
            tmp[i] = people[i];                        // перезаписываем массив
        }
        tmp[tmp.length - 1] = person;  // обращаемся к последней ячейке перезаписаннрго массива и кладем туда вход яргумент метода
        people = tmp;   // финальный шаг - перезаписываем старый масив новым
    }

    // создаем метод - кторый будет принимать запрос, и возвращать массив найденных по запросу людей
    public Person[] findByQuery(String query) {   // входной параметр - запрос;
        Person[] result = new Person[0];          // создадим пустой масссив
        for (Person person : people) {            // циклом for each переберем массив people
            if (person.isMatches(query)) {
                Person[] tmp = new Person[result.length + 1];   // добавить каждого найденного в новый массив(+ 1 ячейка) который придет ответом
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = person;
                result = tmp;

            }
        }
        return result;
    }
}
