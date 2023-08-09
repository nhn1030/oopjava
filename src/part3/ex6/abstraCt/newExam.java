package src.part3.ex6.abstraCt;

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
    public int total() {
        int total = subCalculateTotal() + getCom();
        return total;
    }

    @Override
    public float avg() {
        return total()/4.0f;
    }
}
