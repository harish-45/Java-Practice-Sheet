package musicPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

    public static void main(String[] args) {

        // to play AUDIO with java file type => '(.wav , .au , .aiff)'
        String fileName = "musicPlayer\\somewhere only we know.wav";
        File file = new File(fileName);

        try (Scanner sc = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String responce = "";

            while (!"Q".equals(responce)) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("F = 10 sec Forward");
                System.out.println("B = 10 sec BackWord");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice : ");

                responce = sc.next().toUpperCase();

                switch (responce) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "F" -> forward(clip);
                    case "B" -> backWord(clip);
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice! ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio File does not supported!");
        } catch (IOException e) {
            System.out.println("Something went Wrong!");
        } finally {
            System.out.println("Bye!");
        }

    }

    final static long TEN_SECONDS = 10_000_000L; // 10 seconds in microseconds

    public static void forward(Clip clip) {
        // length of music = clip.getMicrosecondLength()
        // currentPos = clip.getMicrosecondPosition()
        long position = clip.getMicrosecondPosition() + TEN_SECONDS;
        if (position > clip.getMicrosecondLength())
            position = clip.getMicrosecondLength();
        
        clip.setMicrosecondPosition(position);
        clip.start();
    }

    public static void backWord(Clip clip) {
        long position = clip.getMicrosecondPosition() - TEN_SECONDS;
        if (position < 0)
            position = 0;
        
        clip.setMicrosecondPosition(position);
        clip.start();
    }

}
