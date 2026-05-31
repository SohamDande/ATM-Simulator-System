import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignupOne extends JFrame implements ActionListener
{
    long random;
    JTextField nameTextField, fnameTextField, dateTextField, emailTextField, addressTextField, cityTextField, countryTextField, pinTextField; 
    JButton next;
    JRadioButton male, female, married, unmarried;

    public SignupOne()
    {
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setOpaque(false);
        nameTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(nameTextField);

        JLabel fname = new JLabel("Father's name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setOpaque(false);
        fnameTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateTextField = new JTextField();
        dateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        dateTextField.setBounds(300,240,400,30);
        dateTextField.setOpaque(false);
        dateTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(dateTextField);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        male.setOpaque(false);
        male.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        male.setFocusPainted(false);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        female.setOpaque(false);
        female.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        female.setFocusPainted(false);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setOpaque(false);
        emailTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.WHITE);
        married.setOpaque(false);
        married.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        married.setFocusPainted(false);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.WHITE);
        unmarried.setOpaque(false);
        unmarried.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        unmarried.setFocusPainted(false);
        add(unmarried);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        addressTextField.setOpaque(false);
        addressTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(addressTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setOpaque(false);
        cityTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(cityTextField);

        JLabel country = new JLabel("Country: ");
        country.setFont(new Font("Raleway",Font.BOLD,20));
        country.setBounds(100,540,200,30);
        add(country);

        countryTextField = new JTextField();
        countryTextField.setFont(new Font("Raleway",Font.BOLD,14));
        countryTextField.setBounds(300,540,400,30);
        countryTextField.setOpaque(false);
        countryTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(countryTextField);

        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        pinTextField.setOpaque(false);
        pinTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(pinTextField);

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
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = dateTextField.getText();
        String gender = null;
        if (male.isSelected())
        {
            gender="Male";
        }
        else if (female.isSelected())
        {
            gender="Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected())
        {
            marital="Married";
        }
        else if(unmarried.isSelected())
        {
            marital="Unmarried";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String country = countryTextField.getText();
        String pin = pinTextField.getText();

        try
        {
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            else
            {
                connection c = new connection();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+country+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public static void main(String[] args)
    {
        new SignupOne();
    }
}
