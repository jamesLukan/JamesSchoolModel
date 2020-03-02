public class Student extends Person {
    private Section[] students = new Section[10];
    private int grade;
    private int sectionCount=0;



    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public Section[] getSections() {
        return students;
    }


    public void addSection(Section s) {
        students[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        String c = name + " has a " + this.grade + " and is enrolled in the following sections: ";
        for (int i=0; i<this.sectionCount; i++){
            c += students[i].getName();
            c+= "(" + students[i].getTeacher() + ")";
        }
        return c;
    }


}
