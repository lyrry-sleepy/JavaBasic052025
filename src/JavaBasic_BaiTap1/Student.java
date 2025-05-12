package JavaBasic_BaiTap1;

public class Student {
    private String name;
    public int age;
    protected float totalScore;
    protected boolean isExcellentStudent;

    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.name = "Nguyen Van Bun";
        sv1.age = 3;
        sv1.isExcellentStudent = true;
        sv1.totalScore = 9.5F;
        // In thông tin chung (khai báo static tại ThongTin.java)
        System.out.println("Tên trường: "+ ThongTin.SCHOOL_NAME + "\nTên nghành: " + ThongTin.MAJOR);

        // In thông tin sinh viên
        System.out.print("Thông tin sinh viên: ");
        System.out.println(sv1.name + " " + sv1.age + " "+ sv1.totalScore+ " --> "+ sv1.isExcellentStudent);

    }
}
