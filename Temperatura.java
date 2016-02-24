import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temperatura extends JFrame implements ActionListener{

  JLabel c=new JLabel("Celsius     ");
  JTextField txt1=new JTextField(30);
  JButton bc= new JButton("Celsius");
  JLabel f=new JLabel("Farehnheit");
  JTextField txt2=new JTextField(30);
  JButton bf=new JButton("Farehnheit");

  public Temperatura(){
    super("Convertidor de temperatura!");
    setSize(600,150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    bc.addActionListener(this);
    bf.addActionListener(this);

    Container cont=getContentPane();
    cont.setLayout(new FlowLayout());
    cont.add(c);
    cont.add(txt1);
    cont.add(bf);
    cont.add(f);
    cont.add(txt2);
    cont.add(bc);
  }
  public void actionPerformed(ActionEvent e){
    Object sourse=e.getSource();
    if(sourse==bf){
    try{
      Float C=Float.parseFloat(txt1.getText());
      Double t=(C*1.8)+32;
      txt2.setText(" "+t);
    }catch(NumberFormatException nfe){
      JOptionPane.showMessageDialog(this,"Solo numeros");
    }
  }else if(sourse==bc){
    try{
      Float F=Float.parseFloat(txt2.getText());
      Double t=(F-32)/1.8;
      txt1.setText(" "+t);
    }catch(NumberFormatException nfe){
      JOptionPane.showMessageDialog(this,"Solo numeros");
    }
  }
  }
  public static void main(String[] args) {
    Temperatura temp=new Temperatura();
  }
}
