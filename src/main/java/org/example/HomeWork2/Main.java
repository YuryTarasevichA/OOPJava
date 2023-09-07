package org.example.HomeWork2;

public class Main {
    public static void main(String[] args) {
        SuperAnimal[] superAnimals = {
                new Cat("Барсик"),
                new Human("Man"),
                new Robot("Android")
        };
        RuningTrack [] runingTracks = new RuningTrack[] {
                new Treadmill(100),
                new Wall(3),
                new Treadmill(1000),
                new Wall(5),
                new Treadmill(900),
                new Wall(10),
                new Treadmill(5000)
        };
        for (SuperAnimal superAnimal: superAnimals) {
            for (RuningTrack runingTrack:runingTracks) {
                if (runingTrack instanceof Treadmill) {
                    superAnimal.run(((Treadmill) runingTrack).getDistance());
                }else {
                    superAnimal.jump(((Wall) runingTrack).getHeight());
                }
            }

        }
    }
}
