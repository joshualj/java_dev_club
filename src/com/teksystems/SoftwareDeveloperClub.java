package com.teksystems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDeveloperClub {
    public SoftwareDeveloperClub() {
        readFile();
    }

    ArrayList<ClubMember> peeps = new ArrayList<>();

    public void readFile() {
        File members = new File("members.txt");
        //Scanner input;
        {
            try(Scanner input = new Scanner(members)) {
                String dudLine = input.nextLine();

                while(input.hasNextLine()) {
                    String line = input.nextLine();
                    String[] arr = line.split("[*]+");
                    peeps.add(new ClubMember(arr[0], arr[1] + ", " + arr[2], arr[3]));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void displayMembers(){
        peeps.forEach(person-> {
            System.out.printf("Name: %s\nLocation: %s\nFavorite Location: %s\n", person.getName(), person.getLocation(), person.getFavoriteLanguage());
            System.out.println("-------------------------------");
        });
    }

    public void removeMember(Scanner input){
        System.out.println("Please enter the index of the person you would like to remove: ");
        int index = input.nextInt();
        peeps.remove(index);
    }

    public void addMember(Scanner input){
        System.out.println("Please enter the name of the person you wish to add: ");
        String name = input.nextLine();

        System.out.println("Please enter the location of the person you wish to add: ");
        String location = input.nextLine();

        System.out.println("Please enter the favorite language of the person you wish to add: ");
        String favoriteLanguage = input.nextLine();

        peeps.add(new ClubMember(name, location, favoriteLanguage));
    }
}
