package staticex;

public class StudentTest2 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.setStudentName("이병헌");
        System.out.println(studentLee.serialNum);   // serialNum 변수의 초깃값 출력
        System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);

        Student1 studentSon = new Student1();
        studentSon.setStudentName("손석희");
        System.out.println(studentSon.serialNum);
        System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
    }
}
