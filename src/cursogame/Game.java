package cursogame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*Descrição: a Classe Game representá a tela do jogo, 
ou seja, a superfície em que o jogo será
"desenhado" a cada frame*/
public class Game extends JPanel{
    public Game(){
        setFocusable(true); //Para que a classe possa escutar eventos
        
        /*Para indicar que não adicionaremos outros componentes 
        específicos do Java na classe:*/
        setLayout(null);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        /*Descrição: método sobrescrito de JPanel
        que é responsável por fazer com que
        os elementos gráficos sejam desenhados
        na tela (é chamado automaticamente
        pela classe JPanel herdada.
        */
        super.paintComponent(g);
        setBackground(Color.LIGHT_GRAY);
        g.setColor(Color.RED); //Altera a cor de pintura para vermelho
        //Desenha na tela uma primitiva geométrica oval:
        g.fillOval(100, 100, 50, 50);
    }
}
