public class Staff {
    String name;
    String position;
    double salary;

    Staff(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String staff_info (int i) {
        double over_gross = i * salary;
        String message = "��������� " + name + ", " + "\"" + position + "\"" + ", �� ��������� " + i + " ������� ������� " + over_gross + " ������.";
        return(message);
    }
}
