import com.rikkei.academy.model.Employee;
import com.rikkei.academy.model.Person;
import com.rikkei.academy.model.Student;
import com.rikkei.academy.model.Bus;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        Bus bus = null;
        while (true) {
            System.out.println("1.Khởi tạo chuyến xe");
            System.out.println("2.Thêm hành khách lên xe (có thể lựa chọn thêm Student hoặc Employee)");
            System.out.println("3.Thống kê số hành khách đang có trên xe");
            System.out.println("4.Tìm kiếm các hành khách là Employee làm cùng công ty");
            System.out.println("5.Tìm kiếm các hành khách là Student học cùng trường");
            System.out.println("6.Hiển thị thông tin các hành khách trên xe");
            System.out.println("7.Thoát (Dừng chuyến xe)");
            System.out.println("Chọn tính năng (1->7) : ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    bus = new Bus(20);
                    bus.setCustomers(new Person[20]);
                    System.out.println("Chuyến xe đã được khởi tạo.");
                    break;
                case 2:
                    if (bus != null) {
                        System.out.print("Chọn loại hành khách (1: Student, 2: Employee): ");
                        int passengerType = sc.nextInt();
                        sc.nextLine();
                        if (passengerType == 1) {
                            student.inputData();
                            bus.push(student);
                        } else if (passengerType == 2) {
                            employee.inputData();
                            bus.push(employee);
                        }
                    }
                    break;
                case 3:
                    int Count = 0 ;
                    for (Person customer : bus.getCustomers()){
                        if (customer!=null){
                            Count++;
                        }
                    }
                    System.out.println("Số hành khách đang có trên xe: " + Count);
                    break;
                case 4:
                    System.out.println("Nhập tên công ty");
                    String searchEmployee = sc.nextLine();
                    boolean find = false;
                    for (Person customer : bus.getCustomers()){
                        if (customer instanceof Employee){
                            if (employee.getCompanyName().equals(searchEmployee)){
                                System.out.println("Hành khách Employee làm cùng công ty: " + employee.getFullName());
                                find = true;
                            }
                        }
                    }
                    if (!find) {
                        System.out.println("Không tìm thấy hành khách Employee làm cùng công ty.");
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên Trường");
                    String searchStudent = sc.nextLine();
                    boolean st = false;
                    for (Person customer : bus.getCustomers()){
                        if (customer instanceof Student){
                            if (student.getSchoolName().equals(searchStudent)){
                                System.out.println("Hành khách Student cùng trường " + student.getFullName());
                                st = true;
                            }
                        }
                    }
                    if (!st) {
                        System.out.println("Không tìm thấy hành khách Student cùng trường");
                    }
                    break;
                case 6:
                    bus.report();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
            }
        }


    }


}
