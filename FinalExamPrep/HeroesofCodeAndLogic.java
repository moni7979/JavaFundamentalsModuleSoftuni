package finalExamPrep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesofCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> hpMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> mpMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String hero = scanner.nextLine();

            String name = hero.split(" ")[0];
            int hp = Integer.parseInt(hero.split(" ")[1]);
            int mp = Integer.parseInt(hero.split(" ")[2]);

            if (hp <= 100) {
                hpMap.put(name, hp);
            }
            if (mp <= 200) {
                mpMap.put(name, mp);
            }

        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("CastSpell")) {

                String heroName = command.split(" - ")[1];
                int mpNeeded = Integer.parseInt(command.split(" - ")[2]);
                String spellName = command.split(" - ")[3];

                int currentMp = mpMap.get(heroName);

                if (currentMp >= mpNeeded) {
                    currentMp -= mpNeeded;
                    mpMap.put(heroName, currentMp);

                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMp);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }

            } else if (command.contains("TakeDamage")) {

                String heroName = command.split(" - ")[1];
                int damage = Integer.parseInt(command.split(" - ")[2]);
                String attacker = command.split(" - ")[3];

                int currentHp = hpMap.get(heroName);
                currentHp -= damage;

                if (currentHp > 0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHp);
                    hpMap.put(heroName, currentHp);
                } else {
                    hpMap.remove(heroName);
                    mpMap.remove(heroName);

                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }

            } else if (command.contains("Recharge")) {

                String name = command.split(" - ")[1];
                int amount = Integer.parseInt(command.split(" - ")[2]);

                int currentMp = mpMap.get(name);
                int initialMp = mpMap.get(name);
                currentMp += amount;


                if (currentMp > 200) {
                    currentMp = 200;
                }
                int rechargedMp = currentMp - initialMp;
                System.out.printf("%s recharged for %d MP!%n", name, rechargedMp);
                mpMap.put(name, currentMp);


            } else if (command.contains("Heal")) {

                String name = command.split(" - ")[1];
                int amount = Integer.parseInt(command.split(" - ")[2]);

                int currentHp = hpMap.get(name);
                int initialHp = hpMap.get(name);
                currentHp += amount;

                if (currentHp > 100) {
                    currentHp = 100;
                }
                int rechargedHp = currentHp - initialHp;
                System.out.printf("%s healed for %d HP!%n", name, rechargedHp);
                hpMap.put(name, currentHp);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : hpMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());

            System.out.printf("  HP: %d%n", entry.getValue());
            System.out.printf("  MP: %d%n", mpMap.get(entry.getKey()));
        }


    }
}
