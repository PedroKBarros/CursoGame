package cursogame;

import java.awt.Dimension;
import javax.swing.JFrame;

/*Descrição: a classe Principal representa a janela
do jogo, ou seja, o local que contém o 
JPanel (classe Game)*/
public class Principal {
    public static final int LARGURA_TELA = 640;
    public static final int ALTURA_TELA = 480;
    
    public Principal(){
        JFrame janela = new JFrame("Jogo2D");
        Game game = new Game();
        //Atribuindo as dimensões do jogo a Game e não a janela:
        game.setPreferredSize(new Dimension(LARGURA_TELA, ALTURA_TELA));
        janela.getContentPane().add(game); //Add Game (Jpanel) a janela
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocation(100, 100);
        janela.setVisible(true);
        janela.pack(); //Adapta a janela ao tamanho do objeto Game (JPanel)
    }
    public static void main(String[] args) {
        new Principal();
    }
    
}
