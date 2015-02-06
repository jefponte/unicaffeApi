package view;  
  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
  
import javax.swing.JFrame;  
import javax.swing.JOptionPane;  
  
public class TesteListenerWindow extends JFrame{  
  
      
    public TesteListenerWindow(){  
        super("Teste de windows listener");  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setSize(300,300);  
          
          
        addWindowListener(new WindowListener(){  
  

            @Override  
            public void windowActivated(WindowEvent arg0) {  
                // TODO Auto-generated method stub  
                  
            }  
  
            @Override  
            public void windowClosed(WindowEvent arg0) {  
                //N�o aparece pq mandamos sair do prgrama l� em cima  
                JOptionPane.showMessageDialog(null, "Fechei");  
                  
            }  
  
            @Override  
            public void windowClosing(WindowEvent arg0) {  
                JOptionPane.showMessageDialog(null, "Vou fechar");  
                  
            }  
  
            @Override  
            public void windowDeactivated(WindowEvent arg0) {  
                // TODO Auto-generated method stub  
                  
            }  
  
            @Override  
            public void windowDeiconified(WindowEvent arg0) {  
                JOptionPane.showMessageDialog(null, "Voc� desminimizou");  
                  
            }  
  
            @Override  
            public void windowIconified(WindowEvent arg0) {  
                JOptionPane.showMessageDialog(null, "Voc� minimizou");  
                  
            }  
  
            @Override  
            public void windowOpened(WindowEvent arg0) {  
                JOptionPane.showMessageDialog(null, "Abriu o Frame");  
                  
            }  
              
        });    
          
    }  
      
    public static void main(String[] args) {  
        new TesteListenerWindow().setVisible(true);  
    }  
}  
