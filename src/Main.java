public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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

}