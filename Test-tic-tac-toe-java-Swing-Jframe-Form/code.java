import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
public class jogoDaVelha extends JFrame{
    JButton[] bt = new JButton[9];
    boolean xo = false;
    boolean[] click = new boolean[9];
    public jogoDaVelha()
    {
        setVisible(true);
        setTitle("Jogo da velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(0, 0, 330, 350);
        int count = 0;
        for (int i = 0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j < 3 ; j++)
            {
                bt[count] = new JButton();
                add (bt[count]);
                bt[count].setBounds((100*i)+10,(100 *j)+10,95,95);
                bt[count].setBackground(Color.white);
                bt[count].setFont(new Font("Arial",1,40));
                count++;
            }
        }
        
        for (int i = 0 ; i < 9 ; i++)
        {
            click[i] = false;
        }
        
            bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[0] == false)
                {
                    click[0] = true;
                    mudar(bt[0]);
                }
            }
        }
    );
            bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[1] == false)
                {
                    click[1] = true;
                    mudar(bt[1]);
                }
            }
        }
    );
            bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[2] == false)
                {
                    click[2] = true;
                    mudar(bt[2]);
                }
            }
        }
    );
            bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[3] == false)
                {
                    click[3] = true;
                    mudar(bt[3]);
                }
            }
        }
    );
            bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[4] == false)
                {
                    click[4] = true;
                    mudar(bt[4]);
                }
            }
        }
    );
            bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[5] == false)
                {
                    click[5] = true;
                    mudar(bt[5]);
                }
            }
        }
    );
                bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[6] == false)
                {
                    click[6] = true;
                    mudar(bt[6]);
                }
            }
        }
    );
                bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[7] == false)
                {
                    click[7] = true;
                    mudar(bt[7]);
                }
            }
        }
    );
                bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[8] == false)
                {
                    click[8] = true;
                    mudar(bt[8]);
                }
            }
        }
    );
    }
    
    
    public void mudar (JButton btn)
    {
        if(xo)
        {
            btn.setText("O");
            xo = false;
        }
        else
        {
            btn.setText("X");
            xo = true;
        }
        JOptionPaneAssignents(win());
        computer();
    }
   
    public void clear ()
    {
        for(int i = 0 ; i < 9 ; i++)
        {
            bt[i].setText("");
            click[i] = false;
        }
    }

    public void firstLine()
    {
        if(bt[0].getText() == "X")
            {
            bt[1].setText("O");
            click[1] = true;
            }else if(bt[3].getText() == "X")
            {
            bt[6].setText("O");
            click[6] = true;
            }else if(bt[6].getText() == "X")
            {
            bt[7].setText("O");
            click[7] = true;
            }
    }

    public void computer()
    {
        firstLine();
    }

    public String win()
    {
        String won = "false";
        if ((bt[0].getText() == "X"&& bt[1].getText() == "X" && bt[2].getText() == "X")||
                (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")||
                (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")||
                (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X")||
                (bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X")||
                (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")||
                (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X")||
                (bt[2].getText() == "X" && bt[4].getText() == "X" && bt[6].getText() == "X")
        )
        {
            won = "trueX";
            return won;
        }else if((bt[0].getText() == "O"&& bt[1].getText() == "O" && bt[2].getText() == "O")||
        (bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O")||
        (bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O")||
        (bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O")||
        (bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O")||
        (bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O")||
        (bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O")||
        (bt[2].getText() == "O" && bt[4].getText() == "O" && bt[6].getText() == "O")
        )
        {
            won = "trueY";
            return won;
        }
        else if((((bt[0].getText() == "X"&& bt[1].getText() == "X" && bt[2].getText() == "X")||
        (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")||
        (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")||
        (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X")||
        (bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X")||
        (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")||
        (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X")||
        (bt[2].getText() == "X" && bt[4].getText() == "X" && bt[6].getText() == "X"))
        &&
        ((bt[0].getText() == "O"&& bt[1].getText() == "O" && bt[2].getText() == "O")||
        (bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O")||
        (bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O")||
        (bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O")||
        (bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O")||
        (bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O")||
        (bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O")||
        (bt[2].getText() == "O" && bt[4].getText() == "O" && bt[6].getText() == "O"))
        ) == true)
        {
            JOptionPane.showMessageDialog(null, "Empate!");
            clear();
        }
        return won;
    }

    public void JOptionPaneAssignents(String bool)
    {
        bool = win();
        if(bool.equals("trueX"))
        {
            JOptionPane.showMessageDialog(null, "O jogador 'X' ganhou!");
            clear();
        }
        else if(bool.equals("trueY"))
        {
            JOptionPane.showMessageDialog(null, "O jogador 'O' ganhou!");
            clear();
        }
    }
   
    public static void main(String[] args)
    {
        new jogoDaVelha();
    }
}
