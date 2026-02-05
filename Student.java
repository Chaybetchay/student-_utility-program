class Student {

    private String name;
    private int age;
    private double grade;

    public void setDetails(String n, int a, double g) {
        name = n;
        age = a;
        grade = g;
    }

    public String getName() {
        return name;
    }

    public boolean isPassed() {
        return grade >= 75;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

        if (isPassed()) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}