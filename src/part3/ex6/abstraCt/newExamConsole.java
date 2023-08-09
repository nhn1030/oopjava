package src.part3.ex6.abstraCt;

public class newExamConsole extends ExamConsole{

    @Override
    protected Exam makeExam() {
        return new newExam();
    }
}
