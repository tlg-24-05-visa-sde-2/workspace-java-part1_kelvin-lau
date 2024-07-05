import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        LocalDate bday = LocalDate.of(1995, 4, 12);
        Person p1 = new Person("Kelvin", bday);

        System.out.printf("%s is %s years old\n", p1.name(), p1.age());
        System.out.println(p1);
    }
}