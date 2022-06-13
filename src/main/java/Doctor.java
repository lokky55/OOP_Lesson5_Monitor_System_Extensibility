public class Doctor extends Person {
    //каждый обьект класса содержит информацию об докторе
    private String medicineType;

    public Doctor(String name, int age, String medicineType) {
        super(name, age);
        this.medicineType = medicineType;
    }

    @Override
    public int happyBirthday() {
        age++;
        return age;
    }

    @Override
    public boolean isMatches(String query) {
        if (super.isMatches(query)) {
            return true;
        }
        if (medicineType.contains(query)) {
            return true;
        }
        return false;
    }
}
