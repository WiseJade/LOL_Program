package lol_program;

public class LoL_attack {
    // field
    String user_name;
    String enemy_name;
    int[] me_info = new int[3];      // ATK, DEF, Hp
    int[] enemy_info = new int[3];   // ATK, DEF, Hp

    // constructor
    LoL_attack(String user_name, String enemy_name, int[] me_info, int[] enemy_info) {
        this.user_name = user_name;
        this.enemy_name = enemy_name;
        this.me_info = me_info;
        this.enemy_info = enemy_info;
    }

    // attack method
    void attack(int[] me_info_int, int[] enemy) {
        // 적의 체력이 0보다 작아질 때까지 공격 반복
        while(enemy_info[2] > 0){
            System.out.println("--------------------------------");
            System.out.printf("[안내] [%s]유닛이 [공격] 하였습니다.\n", user_name);
            enemy[2] -= me_info[0] / enemy_info[1];         // 적의 남은 체력 -= 내 공격력 / 적 방어력
            System.out.printf("[안내] 상대 유닛의 남은 [체력]은 %d 입니다.\n", enemy[2]);
            System.out.println("--------------------------------");
        }
        System.out.println("[안내] 더 이상 공격할 수 없습니다.");
        System.out.println("");
        System.out.println("[안내] 상대 유닛이 제거되었습니다.");
    }
}
