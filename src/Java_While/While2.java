package Java_While;

public class While2 {
    public static void main(String args[]){
        int sum = 0;
        int i =0;
        // i를 1씩 증가시켜서 sum에 더해보자
        while(sum<=100){
            System.out.printf("%d - %d%n", i, sum);
            sum += ++i;
        }
    }
}
