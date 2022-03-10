package com.teksystems;

import java.util.Scanner;

public class ClubMemberApp {

    public static void main(String[] args) {
        SoftwareDeveloperClub club = new SoftwareDeveloperClub();
        //SoftwareDeveloperClub.readFile();

        //Retrieve an action from the user
        Scanner action = new Scanner(System.in);

        //loop:
        while(true){
            System.out.println("Select from the following menu:\n1: Display Members\n2: Remove Members\n3: Add Member\n4: Quit\n");
            int i = action.nextInt(); //when user enters input, it includes a new line character
            // or  you can do this
            // switch(Integer.parseInt(action.nextLine();)
            action.nextLine();
            switch(i){
                case 1:
                    club.displayMembers();
                    break;
                case 2:
                    club.removeMember(action);
                    club.displayMembers();
                    break;
                case 3:
                    club.addMember(action);
                    club.displayMembers();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option, please enter 1, 2, 3, or 4");
            }
            break;
        }
    }
}
