package com.seattleacademy.team20;

public class Skill {
  private String category;
  private String name;
  private int score;

  public Skill(String category, String name, int score) {
    this.category = category;
    this.name = name;
    this.score = score;
  }

  public String getCategory() {
    return category;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }
}
