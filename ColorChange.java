import java.awt.*;
import java.awt.event.*;

class ColorChange extends Panel implements AdjustmentListener
{Scrollbar sb1,sb2,sb3;
 Panel p;
 Panel top;
 TextField t1,t2,t3;

 
 ColorChange()
 {sb1= new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
  sb2= new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
  sb3= new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);

  sb1.addAdjustmentListener(this);
  sb2.addAdjustmentListener(this);
  sb3.addAdjustmentListener(this);

  setLayout(new BorderLayout());

  top= new Panel();
  t1= new TextField(10);
  t2= new TextField(10);
  t3= new TextField(10);
  top.add(t1);
  top.add(t2);
  top.add(t3);

  p= new Panel();
  p.setLayout(new GridLayout(3,1));
  
  p.add(sb1);
  p.add(sb2);
  p.add(sb3);

  add("South",p);
  add("North",top);}

 public void adjustmentValueChanged(AdjustmentEvent e)
 {int r,b,g;
  r=sb1.getValue();
  b=sb2.getValue();
  g=sb3.getValue();
  
  t1.setText(""+r);
  t2.setText(""+b);
  t3.setText(""+g);
  Color myColor= new Color(r,b,g);
  setBackground(myColor);
}
}
  
 