package lol_program;
import java.util.Scanner;

/*
 * @LoL_char() : 게임정보를 담는 클래스
 * @name : 유닛의 이름
 * @ad :   유닛의 공격력
 * @def :  유닛의 방어력
 * @hp :   유닛의 체력
 * */
class LoL_char {

    // field
    String name;        // user name
    int[] info = new int[3];    // user info (ATK, DEF, Hp)
    /*
     * @user_info : 생성된 유닛의 정보를 담는 메서드
     * @this : 해당 메서드가 입력받은 변수들은 this 를
     * */
    void user_info(String name, int[] info) {
        this.name = name;
        this.info = info;
    }

    /*
     * @user_create() : 유닛을 생성하는 메서드이며, 입력된 값은 user_info() 메서드에게 전달 및 반환 처리합니다.
     * 반환된 값은 시스템 정보창에 출력되도록 합니다.
     * */
    String[] user_create() {
        //TODO:
        //입력 메시지와 함께, 게임에 필요한 유닛의 정보를 입력받습니다.
        String[] str = new String[4];
        Scanner scanner = new Scanner(System.in);
        System.out.print("[시스템] 유닛 [이름]을 입력해주세요 : ");
        str[0] = scanner.nextLine();
        System.out.print("[시스템] 유닛 [공격력]을 입력해주세요 : (Ex 50)");
        str[1] = scanner.nextLine();
        System.out.print("[시스템] 유닛 [방어력]을 입력해주세요 : (Ex 1)");
        str[2] = scanner.nextLine();
        System.out.print("[시스템] 유닛 [체력]을 입력해주세요 : (Ex 100)");
        str[3] = scanner.nextLine();
        System.out.println("");
        // 입력된 값은 user_info()에 전달하여 줍니다.
        return str;
        // 유저마다의 객체 생성을 위해 반환 과정 또한 정의하여 줍니다.
    }

    /*
     * @user_print() : 입력된 배열을 통해 유닛 정보 출력
     * */
    void user_print(String[] user) {
        //TODO:
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.\n", user[0]);
        System.out.printf("[공격력] : %s\n", user[1]);
        System.out.printf("[방어력] : %s\n", user[2]);
        System.out.printf("[체력] : %s\n", user[3]);
    }

    /*
     * @user_info_int() : 공격력과 방어력 등을 고려해 체력 감소를 위해 문자열을 정수형태로 전환합니다.
     * Integer.parseInt() : 정수형태로 전환합니다.
     */
   int[] user_info_int(String[] info) {
        //TODO:
        // 같은 형식의 반환을 위해 배열 선언
        int[] userInfoInt = new int[3];
        // 배열의 값을 하나씩 꺼내 정수형태로 전환합니다.
        for (int i = 0; i < info.length - 1; i++) {
            userInfoInt[i] = Integer.parseInt(info[i + 1]);     // name을 제외한 값을 정수형 배열로 변경
        }
        return userInfoInt;     // ATK, DEF, Hp
    }
}