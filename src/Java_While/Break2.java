package Java_While;

public class Break2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // i가 5가 되면 반복문을 종료
            }
            System.out.println("i: " + i);
        }
        System.out.println("반복문 종료");
    }
}
