class student {
    String name;
    int id;
}

class TestStudent {
    public static void main(String[] args) {
        student s1 = new student();
        s1.id = 101;
        System.out.println(s1.id);
        s1.name = "Nishma";
        System.out.println(s1.name);
        student s2 = new student();
        s2.id = 102;
        System.out.println(s2.id);
        s2.name = "Savithri";
        System.out.println(s2.name);
    }
}