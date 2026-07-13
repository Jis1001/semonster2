package org.example;

public class Monster {
  String name;
  int rare;

  public Monster() {
    this.name = "デュラハン";
    this.rare = 0;
  }

  public String summonMonster(int rare) {
    String[] monsterNames = { "デュラハン", "ゴーレム", "ドラゴン", "フェニックス", "リッチ" };
    return monsterNames[rare];
  }

  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
