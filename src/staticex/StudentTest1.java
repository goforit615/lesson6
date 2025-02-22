package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이병헌");
        System.out.println(studentLee.serialNum);   // serialNum 변수의 초깃값 출력
        studentLee.serialNum++;

        Student studentSon = new Student();
        studentSon.setStudentName("손석희");
        System.out.println(studentSon.serialNum);
        System.out.println(studentLee.serialNum);
    }
}
