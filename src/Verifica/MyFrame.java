package Verifica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MyFrame extends JFrame implements ActionListener {
	
	JTextArea Numero=new JTextArea();
	JButton Aggiungi=new JButton("aggiungi");
	JButton Rimuovi=new JButton("rimuovi");
	JButton Visualizza=new JButton("visualizza");
	JLabel t=new JLabel("Inserisci un numero:");
	JTextArea risultato=new JTextArea();
	ArrayList<Integer> numeri = new ArrayList<Integer>();
	
	
	
	JFrame r = new JFrame("Rimuovi ");
    JLabel numRem = new JLabel("Inserisci Numero: ");
    JLabel agg = new JLabel("Array Aggiornato: ");
    JTextArea numRemove = new JTextArea();
    JTextArea ris = new JTextArea();
    JButton update = new JButton("AGGIORNA");
	
	public MyFrame() {
		super("Array numeri");
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(t);
		c.add(Numero);
		Numero.setPreferredSize(new Dimension(280, 18));
		c.add(Aggiungi);
		Aggiungi.addActionListener(e -> agg());
		c.add(Rimuovi);
		Rimuovi.addActionListener(e -> rim());
		c.add(Visualizza);
		Visualizza.addActionListener(e -> vis());
		c.add(risultato);
		risultato.setPreferredSize(new Dimension(265, 20));
		setSize(400, 200);
        setVisible(true);
        setResizable(false);
        
        
        
        
        
        
        
        r.setSize(500, 150);
        r.setResizable(false);
        r.setLayout(new FlowLayout());

        r.add(numRem);
        numRem.setPreferredSize(new Dimension(150, 20));

        r.add(numRemove);
        numRemove.setPreferredSize(new Dimension(150, 20));

        r.add(update);
        update.setPreferredSize(new Dimension(350, 20));
        update.addActionListener(e ->aggiorna());

        r.add(agg);
        agg.setPreferredSize(new Dimension(150, 20));

        r.add(ris);
        ris.setPreferredSize(new Dimension(150, 20));
    }
		
	
	

	
	
	private void agg() {
		int n = Integer.parseInt(Numero.getText());
		numeri.add(n);
		Numero.setText("");
       }
	   
       
       
  
	  
	  
	        
	
	
	




	private void rim() {
		
	}



	private void vis() {
		 int m = 0;
	        for(int i=0; i<numeri.size(); i++){
	            for (int x=0; x<numeri.size()-1; i++){
	                if(numeri.get(x)>numeri.get(x+1)){
	                    m=numeri.get(x);
	                    numeri.set(x, numeri.get(x+1));
	                    numeri.set(x+1, m);
	                }
	            }
	        }
	        risultato.setText(""+numeri);
	        risultato.setEditable(false);
	    }
		
        
        
        
	 public void aggiorna(){
	        int n = Integer.parseInt(numRemove.getText());
	        for(int i=0; i<numeri.size(); i++){
	            if(n==numeri.get(i)){
	                numeri.remove(i);
	                ris.setText(""+numeri);
	            }
	        }
	        numRemove.setText("");
	    }
        
	


	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==Aggiungi){
	            agg();
	            
	        }
	        
	        if(e.getSource()==Rimuovi){
	            rim();
	            
	        }
	        if(e.getSource()==Visualizza){
	            vis();
	            
	        }
	        if(e.getSource()==update){
	            aggiorna();
	        }
		
	}

}
