package org.example;

public class Monster {
  String name;
  int rare;

  public Monster() {
    this.name = "デュラハン";
    this.rare = 0;
  }

  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
