import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        int answer[] = new int[3];
        int user[] = new int[3];
        int S = 0;
        int B = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

//       랜덤숫자 생성
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (answer[i] == answer[j]) {
                    i--;
                    break;
                }
            }
        }
//      랜덤숫자 확인용(끝나고 삭제하기)
//        for (int x : answer) {
//            System.out.print(x + " ");
//        }

//       사용자에게 숫자 입력받기
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");
        while (true) {
            S = 0;
            B = 0;
            count++;

            System.out.println(count + "번째 시도 : ");
            for (int i = 0; i < user.length; i++) {
                user[i] = sc.nextInt();
            }
//          사용자가 입력한 값과 정답이 같은지 확인
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < user.length; j++) {
                    if (answer[i] == user[j] && i == j) {
                        S++;
                    } else if (answer[i] == user[j] && i != j) {
                        B++;
                    }
                }
            }
            if(B==3){
                System.out.println("3B");
            }  else if(S == 3){
                System.out.println("3S");
                System.out.println(count + "번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                System.out.println(B + "B" + S + "S");
            }
        }
    }
}
