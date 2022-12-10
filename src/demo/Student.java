package demo;

public class Student {
    private String name;
    private int age;
    private Address address;

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address1=new Address("hanoi","MyDinh");
        Address address2=new Address("hanoi","ThanhXuan");
        Address address3=new Address("hanoi","HaDong");
        Student student1=new Student("Lien1",33,address1);
        Student student2=new Student("Lien2",33,address2);
        Student student3=new Student("Lien3",33,address3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
