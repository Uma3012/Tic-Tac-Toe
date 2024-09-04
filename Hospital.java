import java.awt.*;
import java.awt.event.*;

class Hospital implements ActionListener 
{
Frame f=new Frame("Hospital Managment System");
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,O;
	TextField t1,t2,t4,t6;
	Button b1,b2;
	Panel p;
	String s4="Date Of Birth:     ";
	String s5="Location:   ";
	String s7="Have you ever applied to our facility befor?";
	String s6="Gender:   ";
	String s8="Which procedure do you want to make an appointment for ?";
	String s9="From what your suffering from?";
	String s10="Preferrred Appointment Date:    ";
	String s11="        ";
	
Hospital()
{
//************* Label infromation**********
	O=new Label("Doctor Appointment Form");
	O.setBounds(200,50,200,25);
	
	l1=new Label("Name");
	l1.setBounds(50,100,100,25);
	l2=new Label("Date of Birth");
	l2.setBounds(50,150,100,25);
	l3=new Label("Gender");
	l3.setBounds(50,200,100,25);
	l4=new Label("Location");
	l4.setBounds(50,250,100,25);
	l5=new Label("Contact number");
	l5.setBounds(50,300,100,25);
	l6=new Label("Have you ever applied to our facility befor?");
	l6.setBounds(50,350,250,25);
	l7=new Label("Which procedure do you want to make an appointment for ?");
	l7.setBounds(50,400,350,25);
	l8=new Label("From what your suffering from?");
	l8.setBounds(50,450,250,25);
	l9=new Label("Preferrred Appointment Date");
	l9.setBounds(50,550,250,25);
	f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(O);f.add(l6);f.add(l7);f.add(l8);f.add(l9);
//************TextField******************
	t1=new TextField();
	t1.setBounds(200,100,150,25);
	t2=new TextField();
	t2.setBounds(400,100,150,25);
	t4=new TextField();
	t4.setBounds(200,300,200,25);
	
	
	f.add(t1);f.add(t2);f.add(t4);
//************Check box group************
	CheckboxGroup cbg=new CheckboxGroup();    // ***********for gender****************
	Checkbox c1=new Checkbox("male",cbg,false);
	c1.setBounds(200,200,100,25);
	Checkbox c2=new Checkbox("female",cbg,true);
	c2.setBounds(350,200,100,25);
	CheckboxGroup cbg2=new CheckboxGroup();    
	Checkbox c3=new Checkbox("Yes",cbg2,false);
	c3.setBounds(350,350,100,25);
	Checkbox c4=new Checkbox("No",cbg2,true);
	c4.setBounds(475,350,95,25);
	f.add(c1);f.add(c2);f.add(c3);f.add(c4);
//************Choice*********************
	Choice ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8;
	ch1=new Choice();
	ch1.add("Telangana");
	ch1.add("Andra Pradesh");
	ch1.add("karnataka");
	ch1.add("Tamil Nadu");
	ch1.setBounds(200,250,100,25);

ch1.addItemListener(new ItemListener() {
	
         public void itemStateChanged(ItemEvent e) {
             s5=s5+ch1.getSelectedItem()+"    ,    ";
         }
      });

	ch2=new Choice ();
	ch2.add("hyderabad");
	ch2.add("sokula palem");
	ch2.add("Miryalaguda");
	ch2.setBounds(350,250,100,25);
ch2.addItemListener(new ItemListener() {
	
         public void itemStateChanged(ItemEvent e) {
             s5=s5+ch2.getSelectedItem();
         }
      });

	ch3=new Choice();
	ch3.add("Doctor Check");
	ch3.add("Result Analtsis");
	ch3.add("Check-up");
	ch3.setBounds(425,400,150,25);
ch3.addItemListener(new ItemListener() {
	
         public void itemStateChanged(ItemEvent e) {
            s11= s11+ch3.getSelectedItem();
         }
      });

	
	ch4=new Choice();
	for(int i=1;i<=31;i++){ ch4.add(Integer.toString(i));}
	ch4.setBounds(200,150,75,25);

ch4.addItemListener(new ItemListener() {
	
         public void itemStateChanged(ItemEvent e) {
             s4=s4+ ch4.getSelectedItem()+"/";
         }
      });
	ch5=new Choice();
	ch5.add("January");ch5.add("February");ch5.add("March");ch5.add("April");ch5.add("May");ch5.add("June");
	ch5.add("July ");ch5.add("August");ch5.add("September");ch5.add("October");ch5.add("November");ch5.add("December");
	ch5.setBounds(300,150,75,25);
ch5.addItemListener(new ItemListener() {
	
         public void itemStateChanged(ItemEvent e) {
             s4=s4+ch5.getSelectedItem()+"/";
         }
      });

	ch6=new Choice();
	ch6.add("1996");ch6.add("1997");ch6.add("1998");ch6.add("1999");ch6.add("2000");ch6.add("2001");ch6.add("2002");ch6.add("2003");
	ch6.add("2004");ch6.add("2005");ch6.add("2006");ch6.add("2007");ch6.add("2008");ch6.add("2009");ch6.add("2010");
	ch6.add("2011");ch6.add("2012");ch6.add("2013");ch6.add("2014");
	ch6.add("2015");ch6.add("2016");ch6.add("2017");ch6.add("2018");ch6.add("2019");ch6.add("2020");ch6.add("2021");ch6.add("2022");ch6.add("2023");
	ch6.setBounds(400,150,75,25);
ch6.addItemListener(new ItemListener() {
	
         public void itemStateChanged(ItemEvent e) {
             s4=s4+"/"+ch6.getSelectedItem();
         }
      });

	
	ch7=new Choice();
	for(int i=1;i<=31;i++){ ch7.add(Integer.toString(i));}
	ch7.setBounds(295,550,75,25);
ch7.addItemListener(new ItemListener() {
	
         public void itemStateChanged(ItemEvent e) {
             s10=s10+ch7.getSelectedItem()+"  /   ";
         }
      });
	ch8=new Choice();
	ch8.add("January");ch8.add("February");ch8.add("March");ch8.add("April");ch8.add("May");ch8.add("June");
	ch8.add("July ");ch8.add("August");ch8.add("September");ch8.add("October");ch8.add("November");ch8.add("December");
	ch8.setBounds(400,550,75,25);
	
ch8.addItemListener(new ItemListener() {
	
         public void itemStateChanged(ItemEvent e) {
             s10=s10+ch8.getSelectedItem();
         }
      });

	f.add(ch1);f.add(ch2);f.add(ch3);f.add(ch4);f.add(ch5);f.add(ch6);f.add(ch7);f.add(ch8);
// ***********CheckBox*******************

	Checkbox cb1,cb2,cb3,cb4;
	cb1=new Checkbox("fever");
	cb1.setBounds(50,500,95,25);

	cb2=new Checkbox("cough");
	cb2.setBounds(150,500,95,25);

	cb3=new Checkbox("cold");
	cb3.setBounds(250,500,95,25);

	cb4=new Checkbox("body pains");
	cb4.setBounds(350,500,95,25);
	
	
        
	f.add(cb1);f.add(cb2);f.add(cb3);f.add(cb4);
// ***********Buttons********************
	b1=new Button("Submit");
	b2=new Button("Cancel");
	b1.setBounds(450,600,100,50);

	b2.setBounds(300,600,100,50);
	b1.addActionListener(this);
	b2.addActionListener(this);

 // *********Frame details******************
	f.add(b1);f.add(b2);
	f.setSize(1200,700);
	f.setLayout(null);
	f.setVisible(true);
}
public void actionPerformed(ActionEvent A)
{
	String s1,s2,s3;
	s1="       Patient Details From";
	s2="Name:       "+t1.getText()+"       "+t2.getText();
	s3="Contact number  "+t4.getText();
	  
	
	
	if (A.getSource()==b1)
	{
		p=new Panel();
		p.setBounds(650,50,450,600);
		p.setBackground(Color.blue);

		
		Label pl1,pl2,pl3,pl4,pl5,pl6,pl7,pl8,pl9,pl10;
		//******************* panel label**********************
			pl1=new Label(s1);
			pl1.setBounds(700,95,350,25);
			pl2=new Label(s2);
			pl2.setBounds(700,145,350,25);
			pl4=new Label(s4);
			pl4.setBounds(700,195,350,25);
			pl5=new Label(s5);
			pl5.setBounds(700,245,350,25);
			
			pl3=new Label(s6);
			pl3.setBounds(700,295,350,25);
			pl6=new Label(s7);
			pl6.setBounds(700,345,350,25);
			pl7=new Label(s8);
			pl7.setBounds(700,390,350,25);
			pl8=new Label(s9);
			pl10=new Label(s11);
			pl10.setBounds(700,445,350,25);
			pl8.setBounds(700,495,350,25);
			pl9=new Label(s10);
			pl9.setBounds(700,545,350,25);

			f.add(pl1);f.add(pl2);f.add(pl3);f.add(pl4);f.add(pl5);f.add(pl6);f.add(pl7);f.add(pl8);f.add(pl9);f.add(pl10);
		f.add(p);
	}
	if (A.getSource()==b2)
	{
		System.exit(0);
	}
}
public static void main(String args[])
{
	new Hospital();
}

}