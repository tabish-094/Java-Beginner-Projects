import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class musicPlayer {
    public static void main(String[] args) {
        System.out.println("Welcome to the Music Player!");
        System.out.println("This is a simple music player application.");
        System.out.println("You can play, pause, and stop music.");


        String filePath = "C:\\Users\\User\\Music\\sample.mp3"; // Replace with your music file path
        File file = new File(filePath);

        try (AudioInputStream as = AudioSystem.getAudioInputStream(file)) {
            Scanner s = new Scanner(System.in);

            Clip clip = AudioSystem.getClip();
            clip.open(as);
            // clip.start(); // Start playing the music

            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P : Play");
                System.out.println("S : Stop");
                System.out.println("R : Resume");
                System.out.println("Q : Quit");
                System.out.print("Enter your choice: ");
                response = s.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> {
                        clip.stop();
                        clip.close();
                        System.out.println("Exiting the music player.");
                    }    
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }

            System.out.println("No problems detected");
        }

    
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file format");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while playing the music");
        } 
        catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable");
        } 
        finally {
            System.out.println("Music player process completed.");
        }


    }
    
}
