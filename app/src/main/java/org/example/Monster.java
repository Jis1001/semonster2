package org.example;

public class Monster {
  String name;
  int rare;

  public Monster(String name, int rare) {
    this.name = name;
    this.rare = rare;
  }

  public String summonMonster(int rare) {
    String[] monsterNames = { "デュラハン", "ゴーレム", "ドラゴン", "フェニックス", "リッチ" };
    return monsterNames[rare];
  }

  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
