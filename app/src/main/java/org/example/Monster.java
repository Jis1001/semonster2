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

  public String dullahanText() {
    return "デュラハンは首なしの騎士で、恐ろしい姿をしているが、忠実な守護者でもある！";
  }

  public String golemText() {
    return "ゴーレムは土から生み出された巨人で、頑丈な身体と怪力を武器に戦う";
  }

}
