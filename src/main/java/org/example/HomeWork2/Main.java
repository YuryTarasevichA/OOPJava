package org.example.HomeWork2;

public class Main {
    public static void main(String[] args) {
        SuperAnimal[] superAnimals = {
                new Cat("Барсик"),
                new Human("Man"),
                new Robot("Android")
        };
//        RunningTrack[] obstacles = { new Wall(2, 3), new Treadmill(10, 0), new Wall(1, 2) };
//        Participant[] participants = { new Human(), new Cat(), new Robot()};
//
//        for (Participant participant : participants) {
//            boolean canPass = true;
//            for (RunningTrack obstacle : obstacles) {
//                if (!obstacle.passObstacle(participant)) {
//                    canPass = false;
//                    break;
//                }
//            }
//            if (canPass) {
//                System.out.println(participant.getClass().getSimpleName() + " has successfully completed the obstacle course.");
//            } else {
//                System.out.println(participant.getClass().getSimpleName() + " was unable to complete the obstacle course.");
//            }
//        }
//    }
//}
//
//abstract class RunningTrack {
//    int distance;
//    int height;
//
//    public RunningTrack(int distance, int height) {
//        this.distance = distance;
//        this.height = height;
//    }
//
//    abstract boolean passObstacle(Participant participant);
//}
//
//class Wall extends RunningTrack {
//    public Wall(int distance, int height) {
//        super(distance, height);
//    }
//
//    boolean passObstacle(Participant participant) {
//        return participant.jump(height);
//    }
//}
//
//class Treadmill extends RunningTrack {
//    public Treadmill(int distance, int height) {
//        super(distance, height);
//    }
//
//    boolean passObstacle(Participant participant) {
//        return participant.run(distance);
//    }
//}
//
//abstract class Participant {
//    boolean run(int distance) {
//        return true;
//    }
//
//    boolean jump(int height) {
//        return true;
//    }
//}
//
//class Human extends Participant {
//    boolean jump(int height) {
//        return height <= 2;
//    }
//}
//
//class Cat extends Participant {
//    boolean run(int distance) {
//        return distance <= 5;
//    }
//
//    boolean jump(int height) {
//        return height <= 1;
//    }
//}
//
//class Robot extends Participant {
//    boolean run(int distance) {
//        return distance <= 10;
//    }
//
//    boolean jump(int height) {
//        return height <= 0;
//    }
    }
}
