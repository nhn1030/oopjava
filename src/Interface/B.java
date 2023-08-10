package src.Interface;

public class B implements X{ // x라는 인터페이스가 부탁하고 있는 기능을 구현 했다고 implements로 명시해야 함 이게 없으면 도킹 불가
    public int total() {
        return 30;
    }
}
