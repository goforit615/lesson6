package thisex;

class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay(); // 태어난 연도를 2000으로 지정
        bDay.setYear(2000); // 참조 변수 출력
        System.out.println(bDay);   // 참조 변수 출력
        bDay.printThis();   // this  출력 메서드 호출
    }
}
