public class Main {
    public static void main(String[] args) {
        // Домашнее задание 3
        // Задание 1
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        int personsAge = 3;
        if(personsAge >= 2 && personsAge < 6){
            System.out.println("Если возраст человека равен "+personsAge+" года/лет,то ему нужно ходить в деский сад.");
        } else if (personsAge >= 7 && personsAge < 18){
            System.out.println("Если возраст человека равен "+personsAge+" лет,то ему нужно ходить в школу.");
        } else if (personsAge >= 18 && personsAge < 24){
            System.out.println("Если возраст человека равен "+personsAge+" года/лет,то ему нужно ходить в университет.");
        } else if (personsAge >= 24){
            System.out.println("Если возраст человека равен "+personsAge+" года/лет,то ему нужно ходить на работу.");
        }
        // Задание 2
        System.out.println("Задание 2");
        int ageChild = 16;
        if(ageChild < 5){
            System.out.println("Если ребёнку меньше "+ageChild+" года/лет,то ему нельзя кататься на атракционе.");
        } else if (ageChild >= 5 && ageChild < 14){
            System.out.println("Если ребёнку "+ageChild+" лет,то ему можно кататься на атракционе в" +
                    " сопровождении взрослого.Если взрослого нет,то кататься нельзя.");
        } else if(ageChild >= 14){
            System.out.println("Если ребенок старше "+ageChild+" лет,то он может кататься без сопровождения " +
                    "взрослого.");
        }
        // Задание 3
        System.out.println("Задание 3");
        int one = 155;
        int two = 408;
        int three = 2;
        if (one > two) {
            if (one >= three) {
                System.out.println("Большее число - " + one);
            } else {
                System.out.println("Большее число - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Большее число - " + two);
            } else {
                System.out.println("Большее число - " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Большее число - " + one);
            } else if (three >one) {
                System.out.println("Большее число - " + three);
            } else {
                System.out.println("Все три числа равны");
            }

        }
    }
}