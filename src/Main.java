public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
        System.out.println("Задача №1");
        byte age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
    }
    public static void task2(){
        System.out.println("");
        System.out.println("Задача №2");
        byte degree = -50;
        if (degree < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3(){
        System.out.println("");
        System.out.println("Задача №3");
        byte speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость "+speed+", то штраф");
        } else if (speed < 60){
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        } else {
            System.out.println("Зависит от настроения гаишника");
        }
    }
    public static void task4(){
        System.out.println("");
        System.out.println("Задача №4");
        byte age  = 1;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен "+age+", то его место в университете");
        } else if (age >= 24 && age < 60){
            System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу");
        } else {
            System.out.println("Человек должен себе позволить расслабиться");
        }
    }
    public static void task5(){
        System.out.println("");
        System.out.println("Задача №5");
        byte numberPassenger = 120;
        if (numberPassenger >= 0 && numberPassenger<60) {
            System.out.println("Количество пассажиров "+numberPassenger+" человек, в вагоне есть сидячие места");
        } else if (numberPassenger>60 && numberPassenger<102) {
            System.out.println("Количество пассажиров - "+numberPassenger+" человек, в вагоне есть стоячие места");
        } else {
            System.out.println("Мест в вагоне нет");
        }
    }
    public static void task6(){
        System.out.println("");
        System.out.println("Задача №6");
        byte childAge = 10;
        if (childAge<5){
            System.out.println("Если возраст ребенка равен "+childAge+", то он не может кататься на аттракционе.");
        } else if (childAge>=5 && childAge<14) {
            System.out.println("Если возраст ребенка равен "+childAge+", то он может кататься только в " +
                    "сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (childAge>=14) {
            System.out.println("Если возраст ребенка равен "+childAge+", то он может кататься без " +
                    "сопровождения взрослого.");
        }
    }
    public static void task7(){
        System.out.println("");
        System.out.println("Задача №7");
    }
}