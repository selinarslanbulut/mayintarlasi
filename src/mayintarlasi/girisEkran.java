package mayintarlasi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class girisEkran extends mayinTarlasiOyun{
    protected int kareler=10;
    protected int mayinlar=9;
    JFrame frm;
   
    public static void main(String [] args){
       
        girisEkran al=new girisEkran();
        al.ilkFrame();        
        
   }

    public girisEkran() {
        this.frm = new JFrame("Benim Mayın Tarlam");
    }
   public void ilkFrame(){
    
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.getContentPane().add(new mayinYerlestir(10,9).getContent());
      frm.setSize(700,700);
      frm.setLocation(400,100);
      frm.setVisible(true);
      JMenuBar menuBar=new JMenuBar();
      menuBar.setSize(550,100);
      oyunMenubar(menuBar);
      frm.setJMenuBar(menuBar);
      frm.repaint();
      frm.revalidate();
   }
   

  public void oyunMenubar(JMenuBar menuBar){
   
        JMenu dosya;
        dosya = new JMenu("Benim Mayın Tarlam");
        menuBar.add(dosya);
        JMenuItem yeniMayın;
        yeniMayın = new JMenuItem("Yeni Mayın"); // yeniden başlatma yerine yeni mayın isimli menu
        dosya.add(yeniMayın);
        JMenuItem caylak;
        caylak = new JMenuItem("Çaylak"); //boyutu daha küçük mayın tarlası
        dosya.add(caylak);
        JMenuItem orta;
        orta = new JMenuItem("Orta"); //boyutu daha büyük mayın tarlası
        dosya.add(orta);
        JMenuItem pro;
        pro = new JMenuItem("Profesyonel"); //boyutu büyük ve mayını fazla mayın tarlası
        dosya.add(pro);
        JMenuItem cikisyap;
        cikisyap = new JMenuItem("Çıkış Yap"); //oyunu kapatma işlemi
        dosya.add(cikisyap);
        
        cikisyap.addActionListener(new ActionListener() {
          
            @Override
             public void actionPerformed(ActionEvent e) {
               System.exit(10);                      
                  }
            }); 
        
        yeniMayın.addActionListener(new ActionListener() {
            
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                
                 
                girisEkran al=new girisEkran();
                JFrame frm;
                frm = new JFrame("Benim Mayın Tarlam");
                frm.getContentPane().setBackground(Color.YELLOW);
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestir(10,9).getContent());
                frm.setSize(550,450);
                frm.setLocation(300,100); 
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);
                al.frm=frm;
                  }
            }); 
            
        
        caylak.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                girisEkran al=new girisEkran();
                JFrame frm;
                frm = new JFrame("Benim Mayın Tarlam");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestir(10,9).getContent());
                frm.setSize(550,450);
                frm.setLocation(300,100);
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar); 
                al.frm=frm;
                  }
            }); 
        
        orta.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                girisEkran al=new girisEkran();
                JFrame frm;
                frm = new JFrame("Benim Mayın Tarlam");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestir(15,25).getContent());
                frm.setSize(800,600);
                frm.setLocation(300,58);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);  
                al.frm=frm;
                  }
            }); 
        
        pro.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                girisEkran al=new girisEkran();
                JFrame frm;
                frm = new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestir(20,60).getContent());
                frm.setSize(1070,650);
                frm.setLocation(200,30);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);   
                al.frm=frm;
                  }
            }); 
  }
    
  
  
}