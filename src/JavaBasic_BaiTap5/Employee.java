package JavaBasic_BaiTap5;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public String nameEmployee;
    public int ageEmployee;
    public String roleEmployee;
    public int sexEmployee;
    public String departmentEmployee;

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", ageEmployee=" + ageEmployee +
                ", positionEmployee='" + roleEmployee + '\'' +
                ", sexEmployee=" + sexEmployee +
                ", departmentEmployee='" + departmentEmployee + '\'' +
                '}';
    }

    private static Employee addEmployee(String a, int b, String c, int d, String e){
        Employee x = new Employee();
        x.nameEmployee = a;
        x.ageEmployee = b;
        x.roleEmployee = c;
        x.sexEmployee = d;
        x.departmentEmployee = e;
        return x;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.nameEmployee = "Bún";
        e1.ageEmployee = 3;
        e1.roleEmployee = "Tester";
        e1.sexEmployee = 1;
        e1.departmentEmployee = "P.KSCL";

        Employee e2 = new Employee();
        e2.nameEmployee = "Mật";
        e2.ageEmployee = 2;
        e2.roleEmployee = "Dev";
        e2.sexEmployee = 0;
        e2.departmentEmployee = "P.Dev";

        Employee e3 = new Employee();
        e3.nameEmployee = "Nem";
        e3.ageEmployee = 1;
        e3.roleEmployee = "BA";
        e3.sexEmployee = 1;
        e3.departmentEmployee = "P.BA";

        // thêm mới nhân viên theo hàm static đã tạo addEmployee
        Employee e4 = addEmployee("Linh",27,"Tester",0,"P.KSCL");
        Employee e5 = addEmployee("Đạt",28,"Dev",1,"P.SP DVM");


        List<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(e1);
        listEmployee.add(e2);
        listEmployee.add(e3);
        listEmployee.add(e4);
        listEmployee.add(e5);

        for(Employee x : listEmployee){
            System.out.println(x.toString());
        }

    }
}
