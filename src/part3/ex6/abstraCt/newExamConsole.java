package src.part3.ex6.abstraCt;

import java.util.Scanner;

public class newExamConsole extends ExamConsole{

    @Override
    protected Exam makeExam() {
        return new newExam();
    }

    @Override
    protected void onPrint(Exam exam) {
        newExam newexam = (newExam) exam;
        int com = newexam.getCom();
        System.out.printf("컴퓨터 : %d\n", com);
    }

    @Override
    protected void onInput(Exam exam) {

        newExam newexam = (newExam) exam;
        Scanner scan = new Scanner(System.in);

        int com;

        do {
            System.out.print("컴퓨터 점수 입력 : ");
            com = scan.nextInt();

            if (com < 0 || 100 < com) {
                System.out.println("성적 범위를 벗어났습니다. 다시 입력하세요.");
            }
        } while (com < 0 || 100 < com);

        newexam.setCom(com);
    }
}
