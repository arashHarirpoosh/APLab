package Session2;

/**
 * This is the test file of the written classes
 * @author Arash Harirpoosh
 * @version 1.0.0
 * @since 02-10-2021
 */
public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        System.out.println();

        int c = 5;
        Lab l1 = new Lab("Saturday", c);
        Lab l2 = new Lab("Sunday", c);

        Student []ls = new Student[c];
        ls[0] = std1;
        ls[1] = std2;
        l1.setStudents(ls);
        l1.setCurrentSize(2);
        l1.calculateAvg();
        l1.print();
        System.out.println("---------------------");

        l1.enrollStudent(std3);
        l1.print();
        System.out.println("---------------------");

        l1.calculateAvg();
        l1.print();

        Student []ls2 = new Student[c];
        ls2[0] = std2;
        l2.setStudents(ls2);
        l2.setCurrentSize(1);
        l2.calculateAvg();

        System.out.println();

        Department d1 = new Department("CS", 7);
        Lab []dl = new Lab[7];
        dl[0] = l1;

        d1.setDepartmentLabs(dl);
        d1.setCurrentNumOfLabs(1);
        d1.print();

        System.out.println("---------------------");

        d1.addLab(l2);
        d1.setCurrentNumOfLabs(2);
        d1.print();
    }
}
