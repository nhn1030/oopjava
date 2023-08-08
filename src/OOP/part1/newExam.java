package OOP.part1;

import part3.ex5.splitUICode.Exam;

public class newExam extends Exam {

    private int com;

    public newExam() {
        this(0,0,0,0);

    }

    public newExam(int kor, int eng, int math, int com) {
        super(kor, eng, math);
        this.com = com;

    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public  int total() {
        return super.total() + com;
    }

    @Override
    public float avg() {
        return total()/4.0f;
    }


}
