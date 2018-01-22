import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;






public class Chomp
  extends JFrame
{
  private ChompGame game;
  private JTextField display;
  private Player[] players;
  private int currentPlayer;
  
  public Chomp()
  {
    Container c = getContentPane();
    
    display = new JTextField(20);
    display.setBackground(Color.YELLOW);
    display.setEditable(false);
    c.add(display, "North");
    
    BoardPanel board = new BoardPanel();
    c.add(board, "Center");
    
    game = new ChompGame(board);
    
    HumanPlayer human = new HumanPlayer(this, game, board);
    ComputerPlayer computer = new ComputerPlayer(this, game, board);
    computer.setStrategy(new Chomp4by7Strategy());
    
    players = new Player[2];
    players[0] = human;
    players[1] = computer;
    currentPlayer = 0;
    
    display.setText(" You go first...");
    players[currentPlayer].makeMove();
  }
  

  public void hasMoved()
  {
    currentPlayer = ((currentPlayer + 1) % 2);
    Player p = players[currentPlayer];
    if (game.isWon())
    {
      display.setText(p.getWinMessage());
    }
    else
    {
      display.setText(p.getPrompt());
      p.makeMove();
    }
  }
  
  public static void main(String[] args)
  {
    Chomp window = new Chomp();
    window.setTitle("Chomp");
    window.setBounds(200, 200, 300, 225);
    window.setDefaultCloseOperation(3);
    window.setResizable(false);
    window.setVisible(true);
  }
}
