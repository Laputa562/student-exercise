public class Student {
    private int ID = 0;
    private static int incrementID = 0;
    private final String Dep = "CS";
    private String name;
    private int semester;
    public Student(String name,  int semester){
        this.ID = incrementID++;
        this.name = name;
        this.semester = semester;
    }
    public Student(String name){
        this.ID = incrementID++;;
        this.name = name;
        this.semester = 1;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public String getDepartment(){
        return Dep;
    }
    public void display(){
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Semester: " + getSemester());
        System.out.println("*****************************");
    }
}
