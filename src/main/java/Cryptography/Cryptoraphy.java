package Cryptography;

import java.util.Scanner;

class Cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter message:");
        String plaintext = sc.nextLine();
        System.out.println("Number to be shifted");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for (int i = 0; i < plaintext.length(); i++) {
            alphabet = plaintext.charAt(i);
            if (alphabet >= 'a' && alphabet >= 'z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);

                }
                ciphertext = ciphertext + alphabet;
            }
            // if alphabet lies between 'A' and 'Z'
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                //shift alphabet
                alphabet = (char) (alphabet + shift);
                //if shift alphabet greater than 'Z'
                if (alphabet > 'Z')
                    //reshift to starting position
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
            }
            ciphertext = ciphertext + alphabet;

            ciphertext   =ciphertext  + alphabet;
        }

        System.out.println("Cipher text" + ciphertext);
    }
}
