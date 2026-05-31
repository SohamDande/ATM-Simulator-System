import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignupTwo extends JFrame implements ActionListener
{
    JTextField passportTextField;
    JButton next;
    JRadioButton scyes, scno, exyes, exno;
    JComboBox religion, nationality, income, education, occupation, Emirate;
    String formno;

    public SignupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);

        setTitle("New Account Application Form - Page 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        JLabel rel = new JLabel("Religion: ");
        rel.setFont(new Font("Raleway",Font.BOLD,20));
        rel.setBounds(100,140,100,30);
        add(rel);

        String valReligion[] = {"Muslim","Jew","Christian","Hindu","Atheist","Others"};
        religion = new JComboBox(valReligion); 
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel national = new JLabel("Nationality: ");
        national.setFont(new Font("Raleway",Font.BOLD,20));
        national.setBounds(100,190,200,30);
        add(national);

        String valNationality[] = {"Emirati","Egyptian","Jordanian","Palestinian","Nigerian","Sudanese","American","British","Russian","Pakistani","Indian","Chinese","Korean","Filipino","Others"};
        nationality = new JComboBox(valNationality);
        nationality.setBounds(300,190,400,30);
        nationality.setBackground(Color.WHITE);
        add(nationality);

        JLabel inc = new JLabel("Income: ");
        inc.setFont(new Font("Raleway",Font.BOLD,20));
        inc.setBounds(100,240,200,30);
        add(inc);

        String valIncome[] = {"Zero","< 5000","< 15000","< 25000","< 35000","< 45000","< 55000","Upto 75000"};
        income = new JComboBox(valIncome); 
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);


        JLabel edu = new JLabel("Educational ");
        edu.setFont(new Font("Raleway",Font.BOLD,20));
        edu.setBounds(100,290,200,30);
        add(edu);

        JLabel qual = new JLabel("Qualification: ");
        qual.setFont(new Font("Raleway",Font.BOLD,20));
        qual.setBounds(100,315,200,30);
        add(qual);

        String valEducation[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(valEducation); 
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);


        JLabel occ = new JLabel("Occupation: ");
        occ.setFont(new Font("Raleway",Font.BOLD,20));
        occ.setBounds(100,390,200,30);
        add(occ);

        String valOccupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupation = new JComboBox(valOccupation); 
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);


        JLabel passport = new JLabel("Passport Number: ");
        passport.setFont(new Font("Raleway",Font.BOLD,20));
        passport.setBounds(100,440,200,30);
        add(passport);

        passportTextField = new JTextField();
        passportTextField.setFont(new Font("Raleway",Font.BOLD,14));
        passportTextField.setBounds(300,440,400,30);
        add(passportTextField);

        JLabel emirate = new JLabel("Emirate: ");
        emirate.setFont(new Font("Raleway",Font.BOLD,20));
        emirate.setBounds(100,490,200,30);
        add(emirate);

        String valEmirate[] = {"Abu Dhabi","Dubai","Sharjah","Ajman","Umm Al Quwain","Ras Al Khaimah","Fujairah"};
        Emirate = new JComboBox(valEmirate); 
        Emirate.setBounds(300,490,400,30);
        Emirate.setBackground(Color.WHITE);
        add(Emirate);


        JLabel scitizen = new JLabel("Senior Citizen: ");
        scitizen.setFont(new Font("Raleway",Font.BOLD,20));
        scitizen.setBounds(100,540,200,30);
        add(scitizen);

        scyes = new JRadioButton("Yes");
        scyes.setBounds(300,540,100,30);
        scyes.setBackground(Color.WHITE);
        scyes.setOpaque(false);
        scyes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        scyes.setFocusPainted(false);
        add(scyes);

        scno = new JRadioButton("No");
        scno.setBounds(400,540,100,30);
        scno.setBackground(Color.WHITE);
        scno.setOpaque(false);
        scno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        scno.setFocusPainted(false);
        add(scno);

        ButtonGroup sc = new ButtonGroup();
        sc.add(scyes);
        sc.add(scno);
        

        JLabel exaccount = new JLabel("Existing Account: ");
        exaccount.setFont(new Font("Raleway",Font.BOLD,20));
        exaccount.setBounds(100,590,200,30);
        add(exaccount);

        exyes = new JRadioButton("Yes");
        exyes.setBounds(300,590,100,30);
        exyes.setBackground(Color.WHITE);
        exyes.setOpaque(false);
        exyes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exyes.setFocusPainted(false);
        add(exyes);

        exno = new JRadioButton("No");
        exno.setBounds(400,590,100,30);
        exno.setBackground(Color.WHITE);
        exno.setOpaque(false);
        exno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exno.setFocusPainted(false);
        add(exno);

        ButtonGroup ex = new ButtonGroup();
        ex.add(exyes);
        ex.add(exno);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.decode("#FFFDD0"));
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }   

    public void actionPerformed(ActionEvent ae)
    {
        String rel = (String) religion.getSelectedItem();
        String national = (String) nationality.getSelectedItem();
        String inc = (String) income.getSelectedItem();
        String edu  = (String) education.getSelectedItem();
        String occ  = (String) occupation.getSelectedItem();
        String passport = passportTextField.getText();
        String emirate  = (String) Emirate.getSelectedItem();
        
        String scitizen = null;
        if (scyes.isSelected())
        {
            scitizen="Yes";
        }
        else if (scno.isSelected())
        {
            scitizen="No";
        }

        String exaccount = null;
        if (exyes.isSelected())
        {
            exaccount="Yes";
        }
        else if(exno.isSelected())
        {
            exaccount="No";
        }
        
        try
        {
            connection c = new connection();
            String query = "insert into signuptwo values('"+formno+"','"+rel+"','"+national+"','"+inc+"','"+edu+"','"+occ+"','"+passport+"','"+emirate+"','"+scitizen+"','"+exaccount+"')";
            c.s.executeUpdate(query);   
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public static void main(String[] args)
    {
        new SignupTwo("");
    }
}
