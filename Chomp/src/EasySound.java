import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class EasySound
{
  private SourceDataLine line = null;
  private byte[] audioBytes;
  private int numBytes;
  
  public EasySound(String fileName)
  {
    File soundFile = new File("/Users/Ktsai23/Documents/workspace/Chomp/src/chomp.wav");
    AudioInputStream audioInputStream = null;
    try
    {
      audioInputStream = AudioSystem.getAudioInputStream(soundFile);
    }
    catch (Exception ex)
    {
      System.out.println("*** Cannot find " + fileName + " ***");
      System.exit(1);
    }
    
    javax.sound.sampled.AudioFormat audioFormat = audioInputStream.getFormat();
    DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
    
    try
    {
      line = ((SourceDataLine)AudioSystem.getLine(info));
      line.open(audioFormat);
    }
    catch (LineUnavailableException ex)
    {
      System.out.println("*** Audio line unavailable ***");
      System.exit(1);
    }
    
    line.start();
    
    audioBytes = new byte[(int)soundFile.length()];
    
    try
    {
      numBytes = audioInputStream.read(audioBytes, 0, audioBytes.length);
    }
    catch (IOException ex)
    {
      System.out.println("*** Cannot read " + fileName + " ***");
      System.exit(1);
    }
  }
  
  public void play()
  {
    line.write(audioBytes, 0, numBytes);
  }
}
