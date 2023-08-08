package OOP.part2;


public class Program {
    public static void main(String[] args) {

        newExam exam = new newExam(20, 20, 20, 20);
        System.out.println(exam.total());
        System.out.println(exam.avg());

    }
}
