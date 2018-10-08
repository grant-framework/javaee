public class User extends Login{
    private String fio;
    private Department department;
    private Position position;
    private String number;
    private String email;
    private float salary;

    User(String cLogin, String cPassword,
         String fio, String number,
         String email, Float salary) {
        login = cLogin;
        password = cPassword;
        this.fio = fio;
        this.number = number;
        this.email = email;
        this.salary = salary;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String getFio() {
        return fio;
    }

    void setFio(String fio) {
        this.fio = fio;
    }

    Department getDepartment() {
        return department;
    }

    void setDepartment(Department department) {
        this.department = department;
    }

    Position getPosition() {
        return position;
    }

    void setPosition(Position position) {
        this.position = position;
    }

    String getNumber() {
        return number;
    }

    void setNumber(String number) {
        this.number = number;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    float getSalary() {
        return salary;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", fio='" + fio + '\'' +
                ", departmentAndCity='" + department + '\'' +
                ", position='" + position + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
