package Java_if;

/* if(조건){
결과값
}
*/
public class Java_if_1 {
    public static void main(String[] args) {
        // main 메서드 실행
        if(true){
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);

        // main2 메서드 호출
        main2(args);
    }

    public static void main2(String[] args) {
        if(false){
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);
    }
}
