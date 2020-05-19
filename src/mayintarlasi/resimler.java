
package mayintarlasi;

import javax.swing.ImageIcon;

public class resimler extends mayinTarlasiOyun{
    
    
    
  public ImageIcon mayin(){
   java.net.URL dosyaYolu;
      dosyaYolu = getClass().getResource("Mayin.jpg");
   ImageIcon resim = new ImageIcon(dosyaYolu);
   return resim;
 }   
}
