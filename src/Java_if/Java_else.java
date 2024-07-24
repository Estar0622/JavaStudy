package Java_if;

import java.util.Scanner;

public class Java_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A 점수를 입력하세요: ");
        int A = scanner.nextInt();

        if (A > 90) {
            System.out.println("A 점수가 90점 이상입니다.");
        } else {
            System.out.println("A 점수가 90점 이하입니다.");
        }

        scanner.close();
    }
}

/*# 사용자로부터 여러 값을 입력받아 리스트로 변환
inputs = input("Enter numbers separated by space: ").split()

# 각 값을 정수로 변환
numbers = [int(i) for i in inputs]

print(numbers)


설명
import java.util.Scanner; - Scanner 클래스를 사용하여 사용자 입력을 받습니다.
public static void main(String[] args) - 자바 애플리케이션의 진입점인 main 메서드를 정의합니다.
Scanner scanner = new Scanner(System.in); - Scanner 객체를 생성하여 사용자 입력을 받을 준비를 합니다.
System.out.print("A 점수를 입력하세요: "); - 사용자에게 입력을 요청합니다.
int A = scanner.nextInt(); - 사용자가 입력한 값을 A 변수에 저장합니다.
if (A > 90) - A 값이 90보다 큰지 확인합니다.
조건에 따라 "A 점수가 90점 이상입니다." 또는 "A 점수가 90점 이하입니다."를 출력합니다.
scanner.close(); - Scanner 객체를 닫아 자원을 해제합니다.
*/