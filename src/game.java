import java.awt.*;
import java.awt.event.*;
class wadapter extends WindowAdapter
{
	public void windowClosing(WindowEvent w)
	{
		System.exit(1);
	}
	public void windowClosed(WindowEvent w)
	{
		System.exit(1);
	}
}
public class game implements ActionListener {
Frame F;
Button a,b,c,d,e,f,g,h,i,j;
int C=0,D=0;
game()
{
	F=new Frame("Tic-Tac-Toe");
	F.setLayout(new GridLayout(3,4,1,1));
	F.setVisible(true);
	F.setSize(300,300);
	a=new Button("1");
	a.addActionListener(this);
	F.add(a);
	b=new Button("2");
	b.addActionListener(this);
	F.add(b);
	c=new Button("3");
	c.addActionListener(this);
	F.add(c);
	d=new Button("4");
	d.addActionListener(this);
	F.add(d);
	e=new Button("5");
	e.addActionListener(this);
	F.add(e);
	f=new Button("6");
	f.addActionListener(this);
	F.add(f);
	g=new Button("7");
	g.addActionListener(this);
	F.add(g);
	h=new Button("8");
	h.addActionListener(this);
	F.add(h);
	i=new Button("9");
	i.addActionListener(this);
	F.add(i);
	F.addWindowListener(new wadapter());
	
}
public void actionPerformed(ActionEvent w)
{
	String bname=w.getActionCommand();
	C++;
	if((C==1)||(C==3)||(C==5)||(C==7)||(C==9))
     {if(bname.equals("1"))
          {a.setLabel("X");
           D++;
          }
      else if(bname.equals("2"))
          {b.setLabel("X");
           D++;
          }
     
      else if(bname.equals("3"))
          {c.setLabel("X");
           D++;
          }
      else if(bname.equals("4"))
          {d.setLabel("X");
          D++;
          }
      else if(bname.equals("5"))
          {e.setLabel("X");
          D++;
          }
      else if(bname.equals("6"))
          {f.setLabel("X");
          D++;
          }
      else if(bname.equals("7"))
          {g.setLabel("X");
          D++;
          }
      else if(bname.equals("8"))
          {h.setLabel("X");
          D++;
          }
      else if(bname.equals("9"))
          {i.setLabel("X");
          D++;
          }
     }
	else
	{
		if(bname.equals("1"))
	          {a.setLabel("O");
	          D++;
	          }
	      else if(bname.equals("2"))
	          {b.setLabel("O");
	          D++;
	          }
	      else if(bname.equals("3"))
	          {c.setLabel("O");
	          D++;
	          }
	      else if(bname.equals("4"))
	          {d.setLabel("O");
	          D++;
	          }
	      else if(bname.equals("5"))
	          {e.setLabel("O");
	          D++;
	          }
	      else if(bname.equals("6"))
	          {f.setLabel("O");
	          D++;
	          }
	      else if(bname.equals("7"))
	          {g.setLabel("O");
	          D++;
	          }
	      else if(bname.equals("8"))
	          {h.setLabel("O");
	          D++;
	          }
	      else if(bname.equals("9"))
	          {i.setLabel("O");
	          D++;
	          }
	}
	if((a.getLabel().equals("X"))&&(b.getLabel().equals("X"))&&(c.getLabel().equals("X")))
	{  
		System.out.println("Game Over...Player X won !!");
		System.exit(1);
		
	}
	else if((d.getLabel().equals("X"))&&(e.getLabel().equals("X"))&&(f.getLabel().equals("X")))
	{ 
		System.out.println("Game Over...Player X won !!");
		System.exit(1);
		
	}
	else if((g.getLabel().equals("X"))&&(h.getLabel().equals("X"))&&(i.getLabel().equals("X")))
	{ 
		System.out.println("Game Over...Player X won !!");
		System.exit(1);
		
	}
	else if((a.getLabel().equals("X"))&&(d.getLabel().equals("X"))&&(g.getLabel().equals("X")))
	{ 
		System.out.println("Game Over...Player X won !!");
		System.exit(1);
		
	}
	else if((a.getLabel().equals("X"))&&(e.getLabel().equals("X"))&&(i.getLabel().equals("X")))
	{ 
		System.out.println("Game Over...Player X won !!");
		System.exit(1);
		
	}
	else if((c.getLabel().equals("X"))&&(f.getLabel().equals("X"))&&(i.getLabel().equals("X")))
	{ 
		System.out.println("Game Over...Player X won !!");
		System.exit(1);
		
	}
	else if((c.getLabel().equals("X"))&&(e.getLabel().equals("X"))&&(g.getLabel().equals("X")))
	{ 
		System.out.println("Game Over...Player X won !!");
		System.exit(1);
		
	}
	else if((b.getLabel().equals("X"))&&(e.getLabel().equals("X"))&&(h.getLabel().equals("X")))
	{ 
		System.out.println("Game Over...Player X won !!");
		System.exit(1);
		
	}
	else if((a.getLabel().equals("O"))&&(b.getLabel().equals("O"))&&(c.getLabel().equals("O")))
	{    
		System.out.println("Game Over...Player O won !!");
		System.exit(1);
		
	}
	else if((d.getLabel().equals("O"))&&(e.getLabel().equals("O"))&&(f.getLabel().equals("O")))
	{ 
		System.out.println("Game Over...Player O won !!");
		System.exit(1);
		
	}
	else if((g.getLabel().equals("O"))&&(h.getLabel().equals("O"))&&(i.getLabel().equals("O")))
	{ 
		System.out.println("Game Over...Player O won !!");
		System.exit(1);
		
	}
	else if((a.getLabel().equals("O"))&&(d.getLabel().equals("O"))&&(g.getLabel().equals("O")))
	{ 
		System.out.println("Game Over...Player O won !!");
		System.exit(1);
		
	}
	else if((a.getLabel().equals("O"))&&(e.getLabel().equals("O"))&&(i.getLabel().equals("O")))
	{ 
		
		System.out.println("Game Over...Player O won !!");
		System.exit(1);
		
	}
	else if((c.getLabel().equals("O"))&&(f.getLabel().equals("O"))&&(i.getLabel().equals("O")))
	{ 
		System.out.println("Game Over...Player O won !!");
		System.exit(1);
		
	}
	else if((c.getLabel().equals("O"))&&(e.getLabel().equals("O"))&&(g.getLabel().equals("O")))
	{ 
		System.out.println("Game Over...Player O won !!");
		System.exit(1);
	}
	else if((b.getLabel().equals("O"))&&(e.getLabel().equals("O"))&&(h.getLabel().equals("O")))
	{ 
		System.out.println("Game Over...Player O won !!");
		System.exit(1);
	}
	else if(D==9)
	{
		System.out.println("Draw Game...");
		System.exit(1);
	}
}
	
	
	public static void main(String[] args) {
	 game g=new game();

	}

}
