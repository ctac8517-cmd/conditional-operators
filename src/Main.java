//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        int temperature = -8;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }

        int speed = 59;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + "км/ч, можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, придется заплатить штраф.");
        }


        int age2 = 24;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет.");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека больше " + age2 + ", то ему нужно ходить на работу.");
        }

        int age3 = 15;
        if (age3 <= 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " то ему нельзя кататься на атракционе.");
        } else if (age3 > 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " то ему можно кататься на атракционе в сопровождении взрослого.");
        } else if (age3 >= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " то ему можно кататься без сопровождения взрослого.");
        }

        int totalCapacity = 102;
        System.out.println("Общая вместимость вагона " + totalCapacity + " пассажира.");
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
                System.out.println("Свободных сидячих мест нет.");
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




