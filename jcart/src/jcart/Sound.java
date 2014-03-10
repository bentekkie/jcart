package jcart;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class Sound {
	public static String one = "one.wav";
	public static String two = "two.wav";
	public static String three = "three.wav";
	public static String four = "four.wav";
	public static String five = "five.wav";
	public static String six = "six.wav";
	public static String seven = "seven.wav";
	public static String eight = "eight.wav";
	public static String nine = "nine.wav";
	public static String path = "/";
    public static synchronized void play(final String fileName) 
    {
        // Note: use .wav files             
        new Thread(new Runnable() { 
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("lock/"+fileName));
                    clip.open(inputStream); 
                    clip.start();
                    this.wait(clip.getMicrosecondLength() - 10);
                    clip.stop();
                } catch (Exception e) {
                    System.out.println("play sound error: " + e.getMessage() + " for " + fileName);
                }
            }
        }).start();
    }
    public static boolean isPlaying(final String fileName){
		
    	
    	
    	
    	return false;
    	
    }}

