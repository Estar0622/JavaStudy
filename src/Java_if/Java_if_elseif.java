package Java_if;

import java.util.Scanner;

public class Java_if_elseif {
    public static void main(String[] args) {
        Scanner bbb = new Scanner(System.in);

        System.out.print("A 점수를 입력하세요: ");
        int A = bbb.nextInt();

        if(A>=90){
            System.out.println("학점 A");
        }else if (A>=80) {
            System.out.println("학점 :B");
        }else if (A<80) {
            System.out.println("학점 :C");
        }
        bbb.close();



    }
}
