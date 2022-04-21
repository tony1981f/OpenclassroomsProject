package nyto.test;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Manipulateur extends JFrame implements ActionListener  {
	
	private static final long serialVersionUID = 1L;
	
	JTextField t1,t2,t3,t4,t5;
	JCheckBox j1,j2,j3;
	JLabel lj1;
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25;
	JLabel l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50;
	JLabel l51,l52,l53,l54,l55,l56,l57,l58,l59,l60,l61,l62,l63,l64,l65,l66,l67,l68,l69,l70,l71,l72,l73,l74,l75;
	JLabel l76,l77,l78,l79,l80;
	JLabel l81,l82,l83,l84;
	JLabel l85,l86,l87,l88;
	JLabel l89,l90,l91,l92;
	JButton b1,b2,b3,b4;
	JPanel la1,la2,la3;
	long result1020=0;
	long result1030=0;
	long result1040=0;
	long totalFact=0;
	long totalFret=0;
	Manipulateur()	{
    setLayout(null);
   	la1 = new JPanel();
   	la1.setLayout(null);
    la1.setBounds(0, 40, 280, 290);
	la1.setBackground(null);
	la1.setBorder(BorderFactory.createLoweredBevelBorder());
	add(la1);
	
	l84 =new JLabel("FRET PARTIEL");
	l84.setBounds(160, 7, 105, 20);
	la1.add(l84);
	l83 =new JLabel("- - - - - - - - - - - - - - - - ");
	l83.setBounds(160, 25, 125, 20);
	la1.add(l83);
	l82 =new JLabel("PARTIEL FACTURE");
	l82.setBounds(9, 7, 105, 20);
	la1.add(l82);
	t1 = new JTextField(10);
	t1.setBounds(5, 25, 125, 20);
	la1.add(t1);	
	l81 =new JLabel("- - - - - - - - - - - - - - - - ");
	l81.setBounds(5, 46, 125, 20);
	la1.add(l81);	
	
	l1 =new JLabel("20%");
	l1.setBounds(135, 46, 125, 20);
	la1.add(l1);
	l2 =new JLabel("- - - - - - - - - - - - - - - - ");
	l2.setBounds(165, 46, 125, 20);
	la1.add(l2);
	l3 =new JLabel("- - - - - - - - - - - - - - - - - -");
	l3.setBounds(5, 67, 125, 20);
	la1.add(l3);
	l4 =new JLabel("1%");
	l4.setBounds(135, 67, 125, 20);
	la1.add(l4);
	l5 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l5.setBounds(165, 67, 125, 20);
	la1.add(l5);
	l6 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l6.setBounds(5, 88, 125, 20);
	la1.add(l6);
	l7 =new JLabel("18%");
	l7.setBounds(135, 88, 125, 20);
	la1.add(l7);
	l8 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l8.setBounds(165, 88, 125, 20);
	la1.add(l8);
	l9 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l9.setBounds(5, 110, 125, 20);
	la1.add(l9);
	l10 =new JLabel("0,40%");
	l10.setBounds(125, 110, 125, 20);
	la1.add(l10);
	l11 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l11.setBounds(165, 110, 125, 20);
	la1.add(l11);
	l12 =new JLabel("- - - - - - - - - - - - - - - - ");
	l12.setBounds(5, 132, 125, 20);
	la1.add(l12);
	l13 =new JLabel("0,8%");
	l13.setBounds(129, 132, 125, 20);
	la1.add(l13);
	l14 =new JLabel("- - - - - - - - - - - - - - - - ");
	l14.setBounds(163, 132, 125, 20);
	la1.add(l14);
	l15 =new JLabel("- - - - - - - - - - - - - - - - ");
	l15.setBounds(5, 155, 125, 20);
	la1.add(l15);
	l16 =new JLabel("0,50%");
	l16.setBounds(125, 155, 125, 20);
	la1.add(l16);
	l17 =new JLabel("- - - - - - - - - - - - - - - - ");
	l17.setBounds(163, 155, 125, 20);
	la1.add(l17);
	l18 =new JLabel("- - - - - - - - - - - - - - - - ");
	l18.setBounds(5, 178, 125, 20);
	la1.add(l18);
	l19 =new JLabel("3%");	
	l19.setBounds(133, 178, 125, 20);
	la1.add(l19);
	l20 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l20.setBounds(163, 178, 125, 20);
	la1.add(l20);
	l21 =new JLabel("- - - - - - - - - - - - - - - - ");
	l21.setBounds(5, 200, 125, 20);
	la1.add(l21);
	l22 =new JLabel("2%");	
	l22.setBounds(133, 200, 125, 20);
	la1.add(l22);
	l23 =new JLabel("- - - - - - - - - - - - - - - - - ");
	l23.setBounds(163, 200, 125, 20);
	la1.add(l23);
	l24 =new JLabel(" Résultat ");	
	l24.setBounds(30, 225, 55, 20);
	l24.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	la1.add(l24);
	l25 =new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - ");
	l25.setBounds(95, 225, 170, 20);
	la1.add(l25);
	b1 =new JButton("clic ");	
	b1.setBounds(137, 250, 57, 26);
	b1.setFocusable(false);
	la1.add(b1);
	
	la2 = new JPanel();
   	la2.setLayout(null);
    la2.setBounds(275, 40, 280, 290);
	la2.setBackground(null);
	la2.setBorder(BorderFactory.createLoweredBevelBorder());
	add(la2);
	
	l88 =new JLabel("FRET PARTIEL");
	l88.setBounds(160, 7, 105, 20);
	la2.add(l88);
	l87 =new JLabel("- - - - - - - - - - - - - - - - ");
	l87.setBounds(160, 25, 125, 20);
	la2.add(l87);
	l86 =new JLabel("PARTIEL FACTURE");
	l86.setBounds(9, 7, 105, 20);
	la2.add(l86);
	t2 = new JTextField(10);
	t2.setBounds(5, 25, 125, 20);
	la2.add(t2);	
	l85 =new JLabel("- - - - - - - - - - - - - - - - ");
	l85.setBounds(5, 46, 125, 20);
	la2.add(l85);	
	
	l26 =new JLabel("10%");
	l26.setBounds(135, 46, 125, 20);
	la2.add(l26);
	l27 =new JLabel("- - - - - - - - - - - - - - - - ");
	l27.setBounds(165, 46, 125, 20);
	la2.add(l27);
	l28 =new JLabel("- - - - - - - - - - - - - - - - -");
	l28.setBounds(5, 67, 125, 20);
	la2.add(l28);
	l29 =new JLabel("1%");
	l29.setBounds(135, 67, 125, 20);
	la2.add(l29);
	l30 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l30.setBounds(165, 67, 125, 20);
	la2.add(l30);
	l31 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l31.setBounds(5, 88, 125, 20);
	la2.add(l31);
	l32 =new JLabel("18%");
	l32.setBounds(135, 88, 125, 20);
	la2.add(l32);
	l33 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l33.setBounds(165, 88, 125, 20);
	la2.add(l33);
	l34 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l34.setBounds(5, 110, 125, 20);
	la2.add(l34);
	l35 =new JLabel("0,40%");
	l35.setBounds(125, 110, 125, 20);
	la2.add(l35);
	l36 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l36.setBounds(165, 110, 125, 20);
	la2.add(l36);
	l37 =new JLabel("- - - - - - - - - - - - - - - - ");
	l37.setBounds(5, 132, 125, 20);
	la2.add(l37);
	l38 =new JLabel("0,8%");
	l38.setBounds(129, 132, 125, 20);
	la2.add(l38);
	l39 =new JLabel("- - - - - - - - - - - - - - - - ");
	l39.setBounds(163, 132, 125, 20);
	la2.add(l39);
	l40 =new JLabel("- - - - - - - - - - - - - - - - ");
	l40.setBounds(5, 155, 125, 20);
	la2.add(l40);
	l41 =new JLabel("0,50%");
	l41.setBounds(125, 155, 125, 20);
	la2.add(l41);
	l42 =new JLabel("- - - - - - - - - - - - - - - - ");
	l42.setBounds(163, 155, 125, 20);
	la2.add(l42);
	l43 =new JLabel("- - - - - - - - - - - - - - - - ");
	l43.setBounds(5, 178, 125, 20);
	la2.add(l43);
	l44 =new JLabel("3%");	
	l44.setBounds(133, 178, 125, 20);
	la2.add(l44);
	l45 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l45.setBounds(163, 178, 125, 20);
	la2.add(l45);
	l46 =new JLabel("- - - - - - - - - - - - - - - - ");
	l46.setBounds(5, 200, 125, 20);
	la2.add(l46);
	l47 =new JLabel("2%");	
	l47.setBounds(133, 200, 125, 20);
	la2.add(l47);
	l48 =new JLabel("- - - - - - - - - - - - - - - - ");
	l48.setBounds(163, 200, 125, 20);
	la2.add(l48);
	l49 =new JLabel(" Résultat ");	
	l49.setBounds(30, 225, 55, 20);
	l49.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	la2.add(l49);
	l50 =new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - ");
	l50.setBounds(95, 225, 170, 20);
	la2.add(l50);
	b2 =new JButton("clic ");	
	b2.setBounds(137, 250, 57, 26);
	la2.add(b2);
	
	la3 = new JPanel();
   	la3.setLayout(null);
    la3.setBounds(550, 40, 280, 290);
	la3.setBackground(null);
	la3.setBorder(BorderFactory.createLoweredBevelBorder());
	add(la3);
	
	l92 =new JLabel("FRET PARTIEL");
	l92.setBounds(160, 7, 105, 20);
	la3.add(l92);
	l91 =new JLabel("- - - - - - - - - - - - - - - - ");
	l91.setBounds(160, 25, 125, 20);
	la3.add(l91);
	l90 =new JLabel("PARTIEL FACTURE");
	l90.setBounds(9, 7, 105, 20);
	la3.add(l90);
	t3 = new JTextField(10);
	t3.setBounds(5, 25, 125, 20);
	la3.add(t3);	
	l89 =new JLabel("- - - - - - - - - - - - - - - - ");
	l89.setBounds(5, 46, 125, 20);
	la3.add(l89);	
	
	l51 =new JLabel("5%");
	l51.setBounds(135, 46, 125, 20);
	la3.add(l51);
	l52 =new JLabel("- - - - - - - - - - - - - - - - ");
	l52.setBounds(165, 46, 125, 20);
	la3.add(l52);
	l53 =new JLabel("- - - - - - - - - - - - - - - - -");
	l53.setBounds(5, 67, 125, 20);
	la3.add(l53);
	l54 =new JLabel("1%");
	l54.setBounds(135, 67, 125, 20);
	la3.add(l54);
	l55 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l55.setBounds(165, 67, 125, 20);
	la3.add(l55);
	l56 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l56.setBounds(5, 88, 125, 20);
	la3.add(l56);
	l57 =new JLabel("18%");
	l57.setBounds(135, 88, 125, 20);
	la3.add(l57);
	l58 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l58.setBounds(165, 88, 125, 20);
	la3.add(l58);
	l59 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l59.setBounds(5, 110, 125, 20);
	la3.add(l59);
	l60 =new JLabel("0,40%");
	l60.setBounds(125, 110, 125, 20);
	la3.add(l60);
	l61 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l61.setBounds(165, 110, 125, 20);
	la3.add(l61);
	l62 =new JLabel("- - - - - - - - - - - - - - - - ");
	l62.setBounds(5, 132, 125, 20);
	la3.add(l62);
	l63 =new JLabel("0,8%");
	l63.setBounds(129, 132, 125, 20);
	la3.add(l63);
	l64 =new JLabel("- - - - - - - - - - - - - - - - ");
	l64.setBounds(163, 132, 125, 20);
	la3.add(l64);
	l65 =new JLabel("- - - - - - - - - - - - - - - - ");
	l65.setBounds(5, 155, 125, 20);
	la3.add(l65);
	l66 =new JLabel("0,50%");
	l66.setBounds(125, 155, 125, 20);
	la3.add(l66);
	l67 =new JLabel("- - - - - - - - - - - - - - - - ");
	l67.setBounds(163, 155, 125, 20);
	la3.add(l67);
	l68 =new JLabel("- - - - - - - - - - - - - - - - ");
	l68.setBounds(5, 178, 125, 20);
	la3.add(l68);
	l69 =new JLabel("3%");	
	l69.setBounds(133, 178, 125, 20);
	la3.add(l69);
	l70 =new JLabel("- - - - - - - - - - - - - - - - ");	
	l70.setBounds(163, 178, 125, 20);
	la3.add(l70);
	l71 =new JLabel("- - - - - - - - - - - - - - - - ");
	l71.setBounds(5, 200, 125, 20);
	la3.add(l71);
	l72 =new JLabel("2%");	
	l72.setBounds(133, 200, 125, 20);
	la3.add(l72);
	l73 =new JLabel("- - - - - - - - - - - - - - - - ");
	l73.setBounds(163, 200, 125, 20);
	la3.add(l73);
	l74 =new JLabel(" Résultat ");	
	l74.setBounds(30, 225, 55, 20);
	l74.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	la3.add(l74);
	l75 =new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - ");
	l75.setBounds(95, 225, 170, 20);
	la3.add(l75);
	b3 =new JButton("clic ");	
	b3.setBounds(137, 250, 57, 26);
	la3.add(b3);
	
	l79 =new JLabel("MONTANT TOTAL FACTURE");
	l79.setBounds(75,5, 200, 25);
	add(l79);
	t4 = new JTextField(10);
	t4.setBounds(250, 7, 125, 20);
	add(t4);
	
	l80 =new JLabel("MONTANT FRET TOTAL ");
	l80.setBounds(395,5, 200, 25);
	add(l80);
	t5 = new JTextField(10);
	t5.setBounds(530, 7, 125, 20);
	add(t5);
	
	b4 =new JButton("Total ");	
	b4.setBounds(382,350, 65, 25);
	add(b4);
	l76 =new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - ");
	l76.setBounds(460,350, 200, 25);
	add(l76);
	l77 =new JLabel("CALCUL DROIT DE DOUANE");
	l77.setBounds(345,400, 200, 25);
	l77.setFont(new Font("Serif", Font.BOLD, 13));
	add(l77);
	l78 =new JLabel("Auteur : Antoine sagna");
	l78.setBounds(0,400, 200, 25);
	l78.setFont(new Font("Serif", Font.ITALIC, 13));
	add(l78);
	
	j1= new  JCheckBox("sans bic");
	j1.setBounds(60,255, 75, 15);
	j1.setFocusable(false);	
	la1.add(j1);
	
	j2= new  JCheckBox("sans bic");
	j2.setBounds(60,255, 75, 15);
	j2.setFocusable(false);	
	la2.add(j2);
	
	j3= new  JCheckBox("sans bic");
	j3.setBounds(60,255, 75, 15);
	j3.setFocusable(false);	
	la3.add(j3);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	setSize(845,475);	
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		totalFact =(long)(Math.round(Double.parseDouble(t4.getText())));
		totalFret =(long)(Math.round(Double.parseDouble(t5.getText())));
		if(e.getSource()==b1 && !j1.isSelected()) {
			
			long fob1 =(long)(Math.round(Double.parseDouble(t1.getText())));						
			long fretPartiel1=((totalFret*fob1)/totalFact);			
			l83.setText(String.format("%,d",((fretPartiel1))));
			long fobTotal1=fob1+fretPartiel1;
			l81.setText(String.format("%,d",fobTotal1));
			long result120=(long)((Math.round((fobTotal1*20)/100.0)));
			l2.setText(String.format("%,d",result120));
			long result220= (long)( Math.round((fobTotal1*1)/100.0));
			l3.setText(String.format("%,d",fobTotal1));
			l5.setText(String.format("%,d", result220));
			long result320=(long)(Math.round(fobTotal1+((result120/2)+((result120/2)+result220))));
			l6.setText(String.format("%,d",result320));
			long result420=(long)Math.round((result320*18)/100.0);
			l8.setText(String.format("%,d",result420));
			l9.setText(String.format("%,d",fobTotal1));
			double result520=(Math.round((fobTotal1*0.40)/100));
			l11.setText(String.format("%,d",(long)result520));
			l12.setText(String.format("%,d",fobTotal1));
			double result620=Math.round((fob1*0.8)/100);
			l14.setText(String.format("%,d",(long)result620));
			l15.setText(String.format("%,d",fobTotal1));
			double result720=Math.round((fobTotal1*0.50)/100);
			l17.setText(String.format("%,d",(long)result720));
			l18.setText(String.format("%,d",result320));
			long result820=(long)(Math.round((result320*3)/100.0));
			l20.setText(String.format("%,d",result820));
			l21.setText(String.format("%,d",fobTotal1));
			long result920=(long)(Math.round((fobTotal1*2)/100.0));
			l23.setText(String.format("%,d",result920));
			result1020=result920+result820+(long)result720+(long)result620+(long)result520+result420+result220+result120;			
			l25.setText(String.format("%,d",(result1020)));}
			
			 if(e.getSource()==b1 && j1.isSelected()) {
				
				long fob1 =(long)(Math.round(Double.parseDouble(t1.getText())));						
				long fretPartiel1=((totalFret*fob1)/totalFact);			
				l83.setText(String.format("%,d",((fretPartiel1))));
				long fobTotal1=fob1+fretPartiel1;
				l81.setText(String.format("%,d",fobTotal1));
				long result120=(long)((Math.round((fobTotal1*20)/100.0)));
				l2.setText(String.format("%,d",result120));
				long result220= (long)( Math.round((fobTotal1*1)/100.0));
				l3.setText(String.format("%,d",fobTotal1));
				l5.setText(String.format("%,d", result220));
				long result320=(long)(Math.round(fobTotal1+((result120/2)+((result120/2)+result220))));
				l6.setText(String.format("%,d",result320));
				long result420=(long)Math.round((result320*18)/100.0);
				l8.setText(String.format("%,d",result420));
				l9.setText(String.format("%,d",fobTotal1));
				double result520=(Math.round((fobTotal1*0.40)/100));
				l11.setText(String.format("%,d",(long)result520));
				l12.setText(String.format("%,d",fobTotal1));
				double result620=Math.round((fob1*0.8)/100);
				l14.setText(String.format("%,d",(long)result620));
				l15.setText(String.format("%,d",fobTotal1));
				double result720=Math.round((fobTotal1*0.50)/100);
				l17.setText(String.format("%,d",(long)result720));
				l18.setText(String.format("%,d",0));
				long result820=(long)(Math.round((result320*0)/100.0));
				l20.setText(String.format("%,d",result820));
				l21.setText(String.format("%,d",fobTotal1));
				long result920=(long)(Math.round((fobTotal1*2)/100.0));
				l23.setText(String.format("%,d",result920));
				result1020=result920+result820+(long)result720+(long)result620+(long)result520+result420+result220+result120;			
				l25.setText(String.format("%,d",(result1020)));			
		
		}
		if(e.getSource()==b2 && !j2.isSelected()) {
			
			long fob2 =(long)(Math.round(Double.parseDouble(t2.getText())));						
			long fretPartiel2=((totalFret*fob2)/totalFact);			
			l87.setText(String.format("%,d",((fretPartiel2))));
			long fobTotal2=fob2+fretPartiel2;								
			l85.setText(String.format("%,d",fobTotal2));
			
			long result130=(long)((Math.round((fobTotal2*10)/100.0)));
			l27.setText(String.format("%,d",result130));
			long result230= (long)( Math.round((fobTotal2*1)/100.0));
			l28.setText(String.format("%,d",fobTotal2));
			l30.setText(String.format("%,d", result230));
			long result330=(long)(Math.round(fobTotal2+((result130/2)+((result130/2)+result230))));
			l31.setText(String.format("%,d",result330));
			long result430=(long)Math.round((result330*18)/100.0);
			l33.setText(String.format("%,d",result430));
			l34.setText(String.format("%,d",fobTotal2));
			double result530=(Math.round((fobTotal2*0.40)/100));
			l36.setText(String.format("%,d",(long)result530));
			l37.setText(String.format("%,d",fobTotal2));
			double result630=Math.round((fobTotal2*0.8)/100);
			l39.setText(String.format("%,d",(long)result630));
			l40.setText(String.format("%,d",fobTotal2));
			double result730=Math.round((fobTotal2*0.50)/100);
			l42.setText(String.format("%,d",(long)result730));
			l43.setText(String.format("%,d",result330));
			long result830=(long)(Math.round((result330*3)/100.0));
			l45.setText(String.format("%,d",result830));
			l46.setText(String.format("%,d",fobTotal2));
			long result930=(long)(Math.round((fobTotal2*2)/100.0));
			l48.setText(String.format("%,d",result930));
			result1030=result930+result830+(long)result730+(long)result630+(long)result530+result430+result230+result130;
			l50.setText(String.format("%,d",(result1030)));
			
	}
		
		if(e.getSource()==b2 && j2.isSelected()) {
			
			long fob2 =(long)(Math.round(Double.parseDouble(t2.getText())));						
			long fretPartiel2=((totalFret*fob2)/totalFact);			
			l87.setText(String.format("%,d",((fretPartiel2))));
			long fobTotal2=fob2+fretPartiel2;								
			l85.setText(String.format("%,d",fobTotal2));
			
			long result130=(long)((Math.round((fobTotal2*10)/100.0)));
			l27.setText(String.format("%,d",result130));
			long result230= (long)( Math.round((fobTotal2*1)/100.0));
			l28.setText(String.format("%,d",fobTotal2));
			l30.setText(String.format("%,d", result230));
			long result330=(long)(Math.round(fobTotal2+((result130/2)+((result130/2)+result230))));
			l31.setText(String.format("%,d",result330));
			long result430=(long)Math.round((result330*18)/100.0);
			l33.setText(String.format("%,d",result430));
			l34.setText(String.format("%,d",fobTotal2));
			double result530=(Math.round((fobTotal2*0.40)/100));
			l36.setText(String.format("%,d",(long)result530));
			l37.setText(String.format("%,d",fobTotal2));
			double result630=Math.round((fobTotal2*0.8)/100);
			l39.setText(String.format("%,d",(long)result630));
			l40.setText(String.format("%,d",fobTotal2));
			double result730=Math.round((fobTotal2*0.50)/100);
			l42.setText(String.format("%,d",(long)result730));
			l43.setText(String.format("%,d",0));
			long result830=(long)(Math.round((result330*0)/100.0));
			l45.setText(String.format("%,d",result830));
			l46.setText(String.format("%,d",fobTotal2));
			long result930=(long)(Math.round((fobTotal2*2)/100.0));
			l48.setText(String.format("%,d",result930));
			result1030=result930+result830+(long)result730+(long)result630+(long)result530+result430+result230+result130;
			l50.setText(String.format("%,d",(result1030)));
			
	}		
		
		if(e.getSource()==b3 && !j3.isSelected()) {
			
			long fob3 =(long)(Math.round(Double.parseDouble(t3.getText())));						
			long fretPartiel3=((totalFret*fob3)/totalFact);			
			l91.setText(String.format("%,d",((fretPartiel3))));
			long fobTotal3=fob3+fretPartiel3;								
			l89.setText(String.format("%,d",fobTotal3));
			
			long result140=(long)((Math.round((fobTotal3*5)/100.0)));
			l52.setText(String.format("%,d",result140));
			long result240= (long)( Math.round((fobTotal3*1)/100.0));
			l53.setText(String.format("%,d",fobTotal3));
			l55.setText(String.format("%,d", result240));
			long result340=(long)(Math.round(fobTotal3+((result140/2)+((result140/2)+result240))));
			l56.setText(String.format("%,d",result340));
			long result440=(long)Math.round((result340*18)/100.0);
			l58.setText(String.format("%,d",result440));
			l59.setText(String.format("%,d",fobTotal3));
			double result540=(Math.round((fobTotal3*0.40)/100));
			l61.setText(String.format("%,d",(long)result540));
			l62.setText(String.format("%,d",fobTotal3));
			double result640=Math.round((fobTotal3*0.8)/100);
			l64.setText(String.format("%,d",(long)result640));
			l65.setText(String.format("%,d",fobTotal3));
			double result740=Math.round((fobTotal3*0.50)/100);
			l67.setText(String.format("%,d",(long)result740));
			l68.setText(String.format("%,d",result340));
			long result840=(long)(Math.round((result340*3)/100.0));
			l70.setText(String.format("%,d",result840));
			l71.setText(String.format("%,d",fobTotal3));
			long result940=(long)(Math.round((fobTotal3*2)/100.0));
			l73.setText(String.format("%,d",result940));
			result1040=result940+result840+(long)result740+(long)result640+(long)result540+result440+result240+result140;
			l75.setText(String.format("%,d",(result1040)));
			
	}
if(e.getSource()==b3 && j3.isSelected()) {
			
			long fob3 =(long)(Math.round(Double.parseDouble(t3.getText())));						
			long fretPartiel3=((totalFret*fob3)/totalFact);			
			l91.setText(String.format("%,d",((fretPartiel3))));
			long fobTotal3=fob3+fretPartiel3;								
			l89.setText(String.format("%,d",fobTotal3));
			
			long result140=(long)((Math.round((fobTotal3*5)/100.0)));
			l52.setText(String.format("%,d",result140));
			long result240= (long)( Math.round((fobTotal3*1)/100.0));
			l53.setText(String.format("%,d",fobTotal3));
			l55.setText(String.format("%,d", result240));
			long result340=(long)(Math.round(fobTotal3+((result140/2)+((result140/2)+result240))));
			l56.setText(String.format("%,d",result340));
			long result440=(long)Math.round((result340*18)/100.0);
			l58.setText(String.format("%,d",result440));
			l59.setText(String.format("%,d",fobTotal3));
			double result540=(Math.round((fobTotal3*0.40)/100));
			l61.setText(String.format("%,d",(long)result540));
			l62.setText(String.format("%,d",fobTotal3));
			double result640=Math.round((fobTotal3*0.8)/100);
			l64.setText(String.format("%,d",(long)result640));
			l65.setText(String.format("%,d",fobTotal3));
			double result740=Math.round((fobTotal3*0.50)/100);
			l67.setText(String.format("%,d",(long)result740));
			l68.setText(String.format("%,d",0));
			long result840=(long)(Math.round((result340*0)/100.0));
			l70.setText(String.format("%,d",result840));
			l71.setText(String.format("%,d",fobTotal3));
			long result940=(long)(Math.round((fobTotal3*2)/100.0));
			l73.setText(String.format("%,d",result940));
			result1040=result940+result840+(long)result740+(long)result640+(long)result540+result440+result240+result140;
			l75.setText(String.format("%,d",(result1040)));
			
	}
		if(e.getSource()==b4) {
			
			l76.setText(String.format("%,d",(result1020+result1030+result1040)));
		}
}}
