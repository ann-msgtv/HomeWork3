public class Main {
    public static void main(String[] args) {


        //task1
        System.out.println("task1");
        int age = 20;
        if (age>=18){
            System.out.println("Если возраст человека равен "+age+ ", то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен "+age+ ", то он не достиг совершеннолетия, нужно немного подождать");
        }


        //task2
        System.out.println("task2");
        int temp=-11;
        if (temp<5) {
            System.out.println("На улице "+temp+" градусов, нужно надеть шапку");
        }else {
            System.out.println("На улице "+temp+" градусов, можно идти без шапки");
        }

        //task3
        System.out.println("task3");
        int speed=11;
        if (speed>60) {
            System.out.println("Если скорость "+speed+"км/ч, то придется заплатить штраф");
        }else {
            System.out.println("Если скорость "+speed+"км/ч, то можно ездить спокойно");
        }

        //task4
        System.out.println("task4");
        int age1 = 25;
        if (age1>=2 && age1<6){
            System.out.println("Если возраст человека равен "+age1+ ", то ему нужно ходить в сад");
        }
        if (age1>7 && age1<17){
            System.out.println("Если возраст человека равен "+age1+ ", то ему нужно ходить в школу");
        }
        if (age1>=18 && age1<=24){
            System.out.println("Если возраст человека равен "+age1+ ", то ему нужно ходить в университет");

        }
        if (age1>24){
            System.out.println("Если возраст человека равен "+age1+ ", то ему нужно ходить на работу");
        }

        //task5
        System.out.println("task5");
        int age3= 15;
        if (age3<5){
            System.out.println("Если возраст ребенка равен "+age3+", то ему нельзя кататься на аттракционе");
        }
        if (age3>5 && age3<14){
            System.out.println("Если возраст ребенка равен "+age3+", то ему можно кататься на аттракционе в сопровождении взрослых");
        }
        if (age3>14){
            System.out.println("Если возраст ребенка равен "+age3+", то ему можно кататься на аттракционе без сопровождения взрослых");
        }

        //task6
        System.out.println("task6");
        int carriageCapacity = 102;
        int sit = 60;
        int stand = carriageCapacity-sit;
        int people = 112;
        if (people<=carriageCapacity) {
            System.out.println("Если в вагон хотят зайти "+people+ " человек, то для них будет место");
        } else {
            System.out.println("Если в вагон хотят зайти "+people+ " человек, то для них не будет места");
        }
        if (people>sit && people<=carriageCapacity){
            System.out.println("Но только стоячее");
        }
        if (people>0 && people<=sit){
            System.out.println("Но сидячее");
        }

        //task7
        System.out.println("task7");
        int one=6;
        int two=8;
        int three=5;
        if (one>two && one>three) {
            System.out.println(one);
        } else   if (two>one && two>three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }


    }
}