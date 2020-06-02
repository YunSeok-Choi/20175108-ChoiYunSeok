package _10Week;

import javax.swing.*;
import java.awt.*;

public class Practice6 extends JFrame{
	Practice6(){
		setTitle("Practice6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container a = getContentPane();
		JPanel j = new JPanel();
		a.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		a.add(j);
		a.add(new JButton("버튼"));
	
		a.add(new JCheckBox("사과"));
		a.add(new JCheckBox("배"));
		a.add(new JCheckBox("체리",new ImageIcon("C:\\Users\\cys\\Videos\\Captures\\3.png")));
		
		a.add(new JRadioButton("사과"));
		a.add(new JRadioButton("배"));
		a.add(new JRadioButton("체리", new ImageIcon("C:\\Users\\cys\\Videos\\Captures\\3.png")));
		
		JSlider slide = new JSlider(0,200);
		slide.setMajorTickSpacing(50);
		slide.setMinorTickSpacing(10);
		slide.setPaintTicks(true);
		slide.setPaintLabels(true);
		a.add(slide);
		
		
		a.add(new JLabel("이름 : "));
		a.add(new JTextField(5));
		a.add(new JLabel("학과 : "));
		a.add(new JTextField("컴퓨터학과(수정)",10));
		a.add(new JLabel("주소 : "));
		a.add(new JTextField("서울시.... ",5));
		
		a.add(new JLabel("Enter the password: "));
		a.add(new JPasswordField(10));
		
		String month[] = {"January", "February", "March", "April", "May", "June", "July","August","September","October","November","December"};
		SpinnerListModel sp = new SpinnerListModel(month);
		JSpinner jsp = new JSpinner(sp);
		a.add(new JLabel("Month:   "));
		a.add(jsp);
		
		a.add(new JTextArea("hello",7,15));
		
		String fruit[] = {"apple", "banana","kiwi","mango","pear","peach","berry","strawberry"};
		String name[] = {"kitae","yunseok"};
		a.add(new JComboBox(fruit));
		a.add(new JComboBox(name));
		
		ImageIcon[] images={new ImageIcon("C:\\Users\\cys\\Videos\\Captures\\3.png"),new ImageIcon("C:\\Users\\cys\\Videos\\Captures\\4.png"), new ImageIcon("C:\\Users\\cys\\Videos\\Captures\\5.png")};
		JList scr = new JList(fruit);
		a.add(new JList(fruit));
		a.add(new JList(images));
		JScrollPane scp = new JScrollPane(scr, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		a.add(scp);
		
		setSize(800,600);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		Practice6 p = new Practice6();
	}
}
