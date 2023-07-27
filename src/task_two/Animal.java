package task_two;

public class Animal {

  private String name;
  private double speed;
  private int age;

  public Animal(){
    this.name = "Bird";
    this.speed = 30;
    this.age = 10;
  }

  public Animal(String name, double speed, int age) {
    this.name = name;
    this.speed = speed;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Animal{");
    sb.append("name = ").append(name).append('\'');
    sb.append(", speed = ").append(speed);
    sb.append(", age = ").append(age);
    sb.append('}');
    return sb.toString();
  }
}
