package com.example.sms.view;

import com.example.sms.service.StudentService;
import com.example.sms.model.Student;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    private StudentService service = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("\n=== 学生管理系统 ===");
            System.out.println("1. 添加学生");
            System.out.println("2. 显示所有学生");
            System.out.println("3. 查看平均分");
            System.out.println("4. 删除学生");
            System.out.println("5. 退出");
            System.out.print("请选择: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 消耗换行符

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> showAllStudents();
                case 3 -> showAverageScore();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("再见！");
                    return;
                }
                default -> System.out.println("无效选择！");
            }
        }
    }

    private void addStudent() {
        System.out.print("学号: ");
        String id = scanner.nextLine();
        System.out.print("姓名: ");
        String name = scanner.nextLine();
        System.out.print("年龄: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("性别: ");
        String gender = scanner.nextLine();
        System.out.print("班级: ");
        String className = scanner.nextLine();
        System.out.print("专业: ");
        String major = scanner.nextLine();
        System.out.print("成绩: ");
        double score = scanner.nextDouble();
        scanner.nextLine();

        if (service.addStudent(id, name, age, gender, className, major, score)) {
            System.out.println("添加成功！");
        } else {
            System.out.println("添加失败！");
        }
    }

    private void showAllStudents() {
        List<Student> students = service.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("暂无学生信息！");
            return;
        }

        System.out.println("\n学号\t姓名\t年龄\t性别\t班级\t专业\t成绩");
        for (Student s : students) {
            System.out.printf("%s\t%s\t%d\t%s\t%s\t%s\t%.1f\n",
                    s.getId(), s.getName(), s.getAge(), s.getGender(),
                    s.getClassName(), s.getMajor(), s.getScore());
        }
    }

    private void showAverageScore() {
        double average = service.getAverageScore();
        System.out.printf("平均成绩: %.2f\n", average);
    }

    private void deleteStudent() {
        System.out.print("输入要删除的学生学号: ");
        String id = scanner.nextLine();

        if (service.deleteStudent(id)) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败，学号不存在！");
        }
    }
}
