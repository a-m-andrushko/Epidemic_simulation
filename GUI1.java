package panel1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI1 extends JFrame implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	
	JCheckBox highContrastMode, hygiene, medicine;
	JButton chooseColors;
	Color color = (Color.WHITE); 
	Color backgroundColor = new Color(179, 235, 255);
	Color highContrastModeBackgroundColor = new Color(0, 0, 51);
	Color highContrastModeFontColor = new Color(204, 230, 255);
	Color black = Color.BLACK;
	Color buttonBackground;
	Color comboBoxBackground;
	JComboBox chooseDisease, chooseLanguage;
	String diseases[], languages[];
	JSlider tempo;
	JLabel chooseTempo;
	JButton RESET, SAVE, START, EXIT;
	JPanel panel;
	GridBagLayout layout;
	GUI2 GUI2 = new GUI2(this);

	static final int SLIDER_MIN = 1;
	static final int SLIDER_MAX = 10;
	static final int SLIDER_INIT = 5;
	
	public GUI1() throws HeadlessException
	{
		this.setSize(550, 325);
		this.setResizable(false);
		
		highContrastMode = new JCheckBox("Tryb dużego kontrastu", false);
		highContrastMode.setBackground(backgroundColor);
		highContrastMode.addActionListener(e->GUI2.highContrastModeMethod());
		
        	chooseColors = new JButton("Wybór kolorów");
       		buttonBackground = chooseColors.getBackground();
		ActionListener colorListener = new ActionListener()
    		{
    			@Override
    			public void actionPerformed(ActionEvent arg0)
    			{
    				GUI2.setVisible(true);
    			}	
    		};
		chooseColors.addActionListener(colorListener);

		diseases = new String[] {"Wybór choroby:", "1", "2", "3"};
		chooseDisease = new JComboBox(diseases);
		chooseDisease.setSelectedIndex(0);
		comboBoxBackground = chooseDisease.getBackground();
		
		languages = new String[] {"Język", "Polski", "English", "Deutsch", "Русский", "漢語"};
		chooseLanguage = new JComboBox(languages);
		chooseLanguage.setSelectedIndex(0);
		
		chooseTempo = new JLabel("Tempo symulacji");

		tempo = new JSlider(JSlider.HORIZONTAL, SLIDER_MIN, SLIDER_MAX, SLIDER_INIT);
		tempo.setBackground(backgroundColor);
		tempo.setMajorTickSpacing(1);
		tempo.setPaintLabels(true);		
		
		hygiene = new JCheckBox("Higiena"); 
		hygiene.setBackground(backgroundColor);
		
		medicine = new JCheckBox("Rozwój medycyny");
		medicine.setBackground(backgroundColor);
		
		RESET = new JButton("ZRESETUJ");
		ActionListener reset = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				Window frameGUI1 = SwingUtilities.windowForComponent((Component) arg0.getSource());
	            frameGUI1.setVisible(false);
				
				GUI1 frameGUI2 = new GUI1();
				frameGUI2.setVisible(true);
			}	
		};
		RESET.addActionListener(reset);

		SAVE = new JButton("ZAPISZ");

		START = new JButton("STARTUJ");

		EXIT = new JButton("WYJDŹ");
		EXIT.addActionListener(e->Exit());
		
		
		panel = new JPanel();
		
		layout = new GridBagLayout(); 
		panel.setLayout(layout); 
		
		GridBagConstraints gbc = new GridBagConstraints();  
	    	gbc.fill = GridBagConstraints.HORIZONTAL; 
	    
	    	gbc.insets = new Insets(1, 1, 1, 1);
	    	gbc.gridx = 0;  
	    	gbc.gridy = 0;  
	    	panel.add(highContrastMode, gbc);  
	    
	   	gbc.insets = new Insets(5, 5, 5, 5);
	   	gbc.gridx = 1;  
	    	gbc.gridy = 0; 
	   	panel.add(chooseDisease, gbc); 
	    
	    	gbc.insets = new Insets(0, 60, 0, 50);
	    	gbc.gridx = 2;
	    	gbc.gridy = 0;
	    	panel.add(chooseTempo, gbc);
	    
	    	gbc.insets = new Insets(1, 1, 1, 1);
	    	gbc.gridx = 0;  
	    	gbc.gridy = 1;  
	    	panel.add(chooseColors, gbc);
	    
	    	gbc.insets = new Insets(5, 5, 5, 5);
	    	gbc.gridx = 1;  
	    	gbc.gridy = 1;  
	    	panel.add(chooseLanguage, gbc);
		
		gbc.insets = new Insets(50, 5, 0, 5);
	    	gbc.gridx = 1;  
	    	gbc.gridy = 3;  
	    	panel.add(RESET, gbc);
	    
	    	gbc.insets = new Insets(5, 5, 5, 5);
	    	gbc.gridx = 2;  
	    	gbc.gridy = 1;  
	    	panel.add(tempo, gbc); 
	    
	    	gbc.insets = new Insets(5, 5, 5, 5);
	    	gbc.gridx = 2;  
	    	gbc.gridy = 2;  
	    	panel.add(hygiene, gbc);
	    
	    	gbc.insets = new Insets(5, 5, 5, 5);
	    	gbc.gridx = 2;  
	    	gbc.gridy = 3;  
	    	panel.add(medicine, gbc);
	    
		gbc.insets = new Insets(25, 0, 0, 1);
	    	gbc.gridx = 0;  
	   	gbc.gridy = 4; 
	   	panel.add(SAVE, gbc); 
	    
	    	gbc.insets = new Insets(25, 5, 0, 5);
	    	gbc.gridx = 1;  
	    	gbc.gridy = 4;  
	    	panel.add(START, gbc); 
	    
	    	gbc.insets = new Insets(25, 1, 0, 0);
	    	gbc.gridx = 2;  
	    	gbc.gridy = 4;  
	    	panel.add(EXIT, gbc); 
	    
	    	panel.setBackground(backgroundColor);
	    
	    	this.add(panel);
	}
	
	public void Exit()
	{
		System.exit(0);
	}

	public static void main(String[] args) 
	{
		GUI1 frameGUI1 = new GUI1();
		frameGUI1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
