package lol_program;

public class LOL_Program {
    public static void main(String[] args) {
        //TODO:
        LoL_char user = new LoL_char();
        LoL_char enemy = new LoL_char();

        String[] user_info = user.user_create();
        user.user_print(user_info);
        user.user_info(user_info[0], user.user_info_int(user_info));
        System.out.println("================================");
        String[] enemy_info = enemy.user_create();
        enemy.user_print(enemy_info);
        enemy.user_info(enemy_info[0], enemy.user_info_int(enemy_info));
        LoL_attack attack = new LoL_attack(user.name, enemy.name, user.info, enemy.info);
        attack.attack(attack.me_info, attack.enemy_info);
    }
}