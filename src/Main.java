public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        System.out.println(boxer1);
        var boxer2 = 82.7;
        System.out.println(boxer2);
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров " + boxersWeight + " кг!");
        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе №1 " + differenceWeight + " кг!");
        var difference2Weight = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе №2 " + difference2Weight + " кг!");
        var totalHours = 640;
        var forOneHour = 8;
        var numberEmployees = totalHours / forOneHour;
        System.out.println("Количество сотрудников в компании - " + numberEmployees);
        var newEmployees = 94;
        System.out.println("Количество новых сотрудников в компании - " + newEmployees);
        var totalNumberEmpoyees = numberEmployees + newEmployees;
        var totalHours2 = totalNumberEmpoyees * forOneHour;
        System.out.println("Если в компании работает " + totalNumberEmpoyees + " человека, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");
    }
}