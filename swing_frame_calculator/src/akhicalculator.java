import java.io.*;
import javax.swing.*;
import java.awt.event.*;
public class akhicalculator implements ActionListener{
    
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,bc,beq;
    JTextField t,tf2,tf3;
     double a , b,result;
	String resul;
     int o;
    akhicalculator(){
      JFrame j=new JFrame();
      t=new JTextField();
      t.setBounds(10,10,250,50);  
      
        tf2=new JTextField();  
        tf2.setBounds(10,33,150,30);  
        tf3=new JTextField();  
        tf3.setBounds(11,54,149,30);  
        tf3.setEditable(false);   
      b0=new JButton("0");
      b1=new JButton("1");
      b2=new JButton("2");
      b3=new JButton("3");
      b4=new JButton("4");
      b5=new JButton("5");
      b6=new JButton("6");
       b7=new JButton("7");
       b8=new JButton("8");
        b9=new JButton("9");
        ba=new JButton("+");
        bs=new JButton("-");
        bm=new JButton("*");
         bd=new JButton("/");
         bc=new JButton("c");
          beq=new JButton("=");
      b0.setBounds(70,290,50,50);
      
      b1.setBounds(10,100,50,50);
      
      b2.setBounds(70,100,50,50);
      
      b3.setBounds(130,100,50,50);
      
      b4.setBounds(10,170,50,50);
      
      b5.setBounds(70,170,50,50);
      
      b6.setBounds(130,170,50,50);
     
      b7.setBounds(10,230,50,50);
      
      b8.setBounds(70,230,50,50);
     
      b9.setBounds(130,230,50,50);
      
      ba.setBounds(10,290,50,50);
      
      bs.setBounds(130,290,50,50);
      
      bm.setBounds(200,230,50,50);
     
      bd.setBounds(200,290,50,50);
      
      bc.setBounds(200,170,50,50);
    
     
      beq.setBounds(200,100,50,50);
      b0.addActionListener(this);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      ba.addActionListener(this);
      bs.addActionListener(this);
      bm.addActionListener(this);
      bd.addActionListener(this);
      bc.addActionListener(this);
     
      beq.addActionListener(this);
      
      j.add(t);j.add(b0);j.add(b1);j.add(b2);j.add(b3);j.add(b4);j.add(b5);j.add(b6); j.add(b7); j.add(b8); j.add(b9);j.add(ba); j.add(bs); j.add(bm); j.add(bd);j.add(bc);
      j.add(beq);
      j.setSize(300,400);
      j.setLayout(null);
      j.setVisible(true);
      
      
    }
    public void actionPerformed(ActionEvent e){
       
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));

         if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        
         if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        
         if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        
         if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        
         if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        
         if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        
         if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        
         if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        
        if(e.getSource()==ba)
        {
            a=Double.parseDouble(t.getText());
            o=1;
            t.setText("");
        }
        if(e.getSource()==bs)
        {
            a=Double.parseDouble(t.getText());
            o=2;
            t.setText("");
        }
        if(e.getSource()==bm)
        {
            a=Double.parseDouble(t.getText());
            o=3;
            t.setText("");
        }
        if(e.getSource()==bd)
        {
            a=Double.parseDouble(t.getText());
            o=4;
            t.setText("");
        }
        if(e.getSource()==bc)
        {
            t.setText("");
        }
        
        if (e.getSource()==beq) {
            b=Double.parseDouble(t.getText());
            switch(o){
                case 1: result=a+b;
                break;
                case 2: result=a-b;
                break;
                case 3: result=a*b;
                break;
                case 4: result=a/b;
                break;
                default: result=0.0;
            }
        
        resul=String.valueOf(result);
    t.setText(resul);
        }
    }
    public static void main(String[] args) {
      new akhicalculator();
    }
}
