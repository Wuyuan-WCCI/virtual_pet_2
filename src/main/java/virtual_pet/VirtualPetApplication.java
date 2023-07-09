package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Please choose your new pets: 1. Dog; 2. Cat; 3. Bird; 4. Fish; 5. Snake.");
        int choice_1 = scanner.nextInt();

        String pet = "";
        switch (choice_1) {

            case 1:
                pet = "Dog";
                break;

            case 2:
                pet = "Cat";
                break;

            case 3:
                pet = "Bird";
                break;

            case 4:
                pet = "Fish";
                System.out.println(pet + " ><(((('>");
                break;

            case 5:
                pet = "Snake";
                System.out.println(pet + " '----___----____---=>");
                break;

            default:
                System.out.println("Invalid choice!");
                break;

        }

        System.out.println("You have chosen " + pet + " as your a new pet. PLease enter your pet's name: ");
        scanner.nextLine();
        String petName = scanner.nextLine();

        Pets myPet = new Pets(petName);

        while (!exit) {

            System.out.println("\nDay " + myPet.getDay() + " \n\nHunger: " + myPet.getHunger() + "\nThirst: "
                    + myPet.getThirst() + "\nWaste: "
                    + myPet.getWaste() + "\nBoredom: " + myPet.getBoredom() + "\nSickness: " + myPet.getSickness()
                    + "\n");

            if (myPet.getSickness() > 100 || myPet.getHunger() > 200 || myPet.getThirst() > 200) {
                System.out.println("Sorry! Game over!");
                exit = true;

            }

            int highestValue = Math.max(Math.max(myPet.getHunger(), myPet.getThirst()),
                    Math.max(myPet.getWaste(), Math.max(myPet.getSickness(), myPet.getBoredom())));

            if (highestValue == myPet.getSickness() && myPet.getSickness() > 80) {
                System.out.println(myPet.getName() + " is very ill, need to see a doctor immediately!\n");
            }

            else if (highestValue == myPet.getHunger() && myPet.getHunger() > 50) {
                System.out.println(myPet.getName() + " is hungry, What do you want to do?\n");
            }

            else if (highestValue == myPet.getBoredom() && myPet.getBoredom() > 50) {
                System.out.println(myPet.getName() + " is boredom, what do you want to do?\n");
            }

            else if (highestValue == myPet.getThirst() && myPet.getThirst() > 50) {
                System.out.println(myPet.getName() + " is thirsty, what do you want to do?\n");
            }

            else if (highestValue == myPet.getWaste() && myPet.getWaste() > 50) {
                System.out.println("There is too much waste, what do you want to do?\n");
            }

            else if (highestValue == myPet.getSickness() && myPet.getSickness() <= 80) {
                System.out.println(myPet.getName() + " is sick, what do you need to do?\n");

            } else {
                System.out.println("Your pet is looking good!\n");
            }

            System.out.println("1. Feed " + myPet.getName());
            System.out.println("2. Water " + myPet.getName());
            System.out.println("3. Play with " + myPet.getName());
            System.out.println("4. Take " + myPet.getName() + " to the doctor.");
            System.out.println("5, Take " + myPet.getName() + " to the bathroom.");
            System.out.println("6. Put " + myPet.getName() + " to sleep.");
            System.out.println("7. Do not thing.");
            System.out.println("8. Exit the game!");

            int choice_2 = scanner.nextInt();

            switch (choice_2) {
                case 1:
                    myPet.feed();
                    System.out.println(myPet.getName() + " has been fed.\n");
                    break;
                case 2:
                    myPet.water();
                    System.out.println(myPet.getName() + " has been watered.\n");
                    break;
                case 3:
                    myPet.play();
                    System.out.println("You played with " + myPet.getName() + ".\n");
                    break;
                case 4:
                    myPet.visitDoctor();
                    System.out.println(myPet.getName() + " has been to the doctor.\n");
                    break;
                case 5:
                    myPet.goToBathroom();
                    System.out.println("Now it's clean\n");
                case 6:
                    myPet.sleep();
                    System.out.println(myPet.getName() + " went to sleep.");
                case 7:
                    System.out.println(myPet.getName() + " is doing not thing!\n");
                    break;
                case 8:
                    System.out.println("You quit the game, Thank you!");
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid choice. Please choose again!\n");
                    continue;

            }

            myPet.tick();
        }
        scanner.close();

    }

}
