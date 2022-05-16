package lol_program;
import java.util.Scanner;

// character info class
class LoL_char {

    // field
    String name;                  // user name
    int[] info = new int[3];    // user info (ATK, DEF, Hp)

    // method
    // Enter user information into field
    void user_info(String name, int[] info) {
        this.name = name;
        this.info = info;
    }

    // Input user information in console
    String[] user_create() {
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
        // Return input user information(name, ATK, DEF, Hp)
        return str;
    }


    // Print the input user information
    void user_print(String[] user) {
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.\n", user[0]);
        System.out.printf("[공격력] : %s\n", user[1]);
        System.out.printf("[방어력] : %s\n", user[2]);
        System.out.printf("[체력] : %s\n", user[3]);
    }


    //
    int[] user_info_int(String[] info) {
        int[] userInfoInt = new int[3];
        // String array converts into integers array one by one
        // except name
        for (int i = 0; i < info.length - 1; i++) {
            // Change values except name to integer array
            userInfoInt[i] = Integer.parseInt(info[i + 1]);
        }
        // Return user info except name ( ATK, DEF, Hp )
        return userInfoInt;
    }
}package lol_program;
        import java.util.Scanner;

// character info class
class LoL_char {

    // field
    String name;                  // user name
    int[] info = new int[3];    // user info (ATK, DEF, Hp)

    // method
    // Enter user information into field
    void user_info(String name, int[] info) {
        this.name = name;
        this.info = info;
    }

    // Input user information in console
    String[] user_create() {
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
        // Return input user information(name, ATK, DEF, Hp)
        return str;
    }


    // Print the input user information
    void user_print(String[] user) {
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.\n", user[0]);
        System.out.printf("[공격력] : %s\n", user[1]);
        System.out.printf("[방어력] : %s\n", user[2]);
        System.out.printf("[체력] : %s\n", user[3]);
    }


    //
    int[] user_info_int(String[] info) {
        int[] userInfoInt = new int[3];
        // String array converts into integers array one by one
        // except name
        for (int i = 0; i < info.length - 1; i++) {
            // Change values except name to integer array
            userInfoInt[i] = Integer.parseInt(info[i + 1]);
        }
        // Return user info except name ( ATK, DEF, Hp )
        return userInfoInt;
    }
}