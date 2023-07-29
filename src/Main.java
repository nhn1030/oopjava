import part3.ex5.splitUICode.Exam;

public class Main {
    // 코드 재사용 방법
    // 1. 컴파일 -> Exam.class
    // 2. 압축 -> Exam.zip
    // 3. jar -> Exam.jar
    public static void main(String[] args) {
        Exam exam = new Exam(1,1,1);

        System.out.print(exam.total());
    }
}