package task_two;

public class Main {

  public static void main(String[] args) {

    Animal animal = new Animal();
    animal.getName();
    animal.getSpeed();
    animal.getAge();
    System.out.println(animal);
    animal.setName("Leopard");
    animal.setSpeed(20);
    animal.setAge(7);
    System.out.println(animal);
  }
}
