package studentsystem;

public class Student {

    private int Sid;
    private String name;
    private String address;
    private double marks;

    public int getSid() {
        return Sid;
    }

    public void setSid(int Sid) {
        this.Sid = Sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{"
                + "id=" + Sid
                + ", name='" + name + '\''
                + ", address=" + address
                + ", marks=" + marks
                + '}';
    }
}
