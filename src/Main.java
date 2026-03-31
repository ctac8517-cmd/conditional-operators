//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("Человек совершеннолетний");
        } else {
            System.out.println("Человек не совершеннолетний");
        }

        int temperature = -8;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        int speed = 59;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + "км/ч, можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, придется заплатить штраф");
        }


        age = 15;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека больше " + age + ", то ему нужно ходить на работу");
        }

        age = 15;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на атракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на атракционе в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься без сопровождения взрослого");
        }

        int totalCapacity = 102;
        System.out.println("Общая вместимость вагона " + totalCapacity + " пассажира");
        int seatCapacity = 60;
        System.out.println("Сидячих мест " + seatCapacity);
        int standingCapacity = totalCapacity - seatCapacity;
        System.out.println("Стоячих мест " + standingCapacity);
        int occupiedSeats = 47;
        System.out.println("Количество занятых сидячих мест " + occupiedSeats);
        int occupiedStanding = 32;
        System.out.println("Количество занятых стоячих мест " + occupiedStanding);
        int totalOccupied = occupiedSeats + occupiedStanding;
        System.out.println("Общее количество занятых мест " + totalOccupied);
        int remainingSeats;
        int remainingStanding;
        if (totalOccupied < totalCapacity) {
            if (occupiedSeats < seatCapacity) {
                remainingSeats = seatCapacity - occupiedSeats;
                System.out.println("Свободно сидячих мест " + remainingSeats);
            } else if (occupiedSeats >= seatCapacity) {
                System.out.println("Свободных сидячих мест нет");
            }
            if (occupiedStanding < standingCapacity) {
                remainingStanding = standingCapacity - occupiedStanding;
                System.out.println("Свободных стоячих мест " + remainingStanding);
            } else if (occupiedStanding >= standingCapacity) {
                System.out.println("Свободных стоячих мест нет.");
            }
        } else {
            System.out.println("Вагон полностью забит.");
        }

        int one = 5;
        int two = 23;
        int three = 11;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }

    }
}




