public class myStudent {

    int age;
    String name;
    int id;
    static int numberOfStudents = 0;

    myStudent (){
        numberOfStudents++;
    }

    public static int getnumberOfStudents() {
        return numberOfStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
