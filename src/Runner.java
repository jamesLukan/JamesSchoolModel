public class Runner {
    public static void main(String[] args){
        School berkeleyHigh = new School(" Berkeley High ");

        Section math = new Section("Math");
        Section biology = new Section("Biology");
        Section compsci = new Section("Computer Science");

        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher palen = new Teacher("Palen", "math");
        Teacher wolkenfeld = new Teacher("Wolkenfeld", "Biology");

        Student me = new Student("Me", 90);
        Student ian = new Student("Ian", 90);
        Student zephyr = new Student("Zephyr", 90);
        Student zoidis = new Student("zoidis", 85);
        Student lyndon = new Student("Lyndon", 86);
        Student afrazz = new Student("Afrazz", 50);

        berkeleyHigh.addSection(math);
        berkeleyHigh.addSection(biology);
        berkeleyHigh.addSection(compsci);

        math.setTeacher(palen);
        biology.setTeacher(wolkenfeld);
        compsci.setTeacher(albinson);

        palen.addSection(math);
        albinson.addSection(compsci);
        wolkenfeld.addSection(biology);

        math.addStudents(ian);
        math.addStudents(afrazz);
        biology.addStudents(lyndon);
        biology.addStudents(zephyr);
        compsci.addStudents(me);
        compsci.addStudents(zoidis);

        ian.addSection(math);
        afrazz.addSection(math);
        lyndon.addSection(biology);
        zephyr.addSection(biology);
        me.addSection(compsci);
        zoidis.addSection(compsci);


        System.out.println(berkeleyHigh.toString());
        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(compsci.toString());
        System.out.println(albinson.toString());
        System.out.println(palen.toString());
        System.out.println(wolkenfeld.toString());
        System.out.println(me.toString());
        System.out.println(ian.toString());
        System.out.println(zephyr.toString());
        System.out.println(zoidis.toString());
        System.out.println(lyndon.toString());
        System.out.println(afrazz.toString());
    }
}
