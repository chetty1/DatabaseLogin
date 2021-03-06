/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaselogin;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.sql.SQLException;

/**
 *
 * @author Kesh
 */
public class Register extends javax.swing.JFrame {
    
    static String name,surname,id,address1,address2,address3,email,cell,nokName,nokSurname,nokEmail,day,month,year,surephrase;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        SurnameLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cTextField = new javax.swing.JTextField();
        surnameTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        addressTextField1 = new javax.swing.JTextField();
        addressTextField2 = new javax.swing.JTextField();
        addressTextField3 = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        nTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        cellLabel = new javax.swing.JLabel();
        dayDOB = new javax.swing.JComboBox<>();
        monthDOB = new javax.swing.JComboBox<>();
        yearDOB = new javax.swing.JComboBox<>();
        nokLabel = new javax.swing.JLabel();
        nokNameLabel = new javax.swing.JLabel();
        nokSurnameLabel = new javax.swing.JLabel();
        nokEmailLabel = new javax.swing.JLabel();
        nokNameTextField = new javax.swing.JTextField();
        nokSurnameTextField = new javax.swing.JTextField();
        nokEmailTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        surephraseLabel = new javax.swing.JLabel();
        surephraseTextField = new javax.swing.JTextField();
        nameCheck = new javax.swing.JLabel();
        sCheck = new javax.swing.JLabel();
        idCheck = new javax.swing.JLabel();
        emailCheck = new javax.swing.JLabel();
        cellCheck = new javax.swing.JLabel();
        nokNcheck = new javax.swing.JLabel();
        nokScheck = new javax.swing.JLabel();
        nokEmailCheck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registeration");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        nameLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(250, 0, 0));
        nameLabel.setText("Name:");

        SurnameLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        SurnameLabel.setForeground(new java.awt.Color(250, 0, 0));
        SurnameLabel.setText("Surname:");

        dobLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(250, 0, 0));
        dobLabel.setText("Date Of Birth:");

        idLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        idLabel.setForeground(new java.awt.Color(250, 0, 0));
        idLabel.setText("I.D Number:");

        addressLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(250, 0, 0));
        addressLabel.setText("Address:");

        cTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cTextFieldFocusGained(evt);
            }
        });

        surnameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                surnameTextFieldFocusGained(evt);
            }
        });

        idTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTextFieldFocusGained(evt);
            }
        });

        addressTextField3.setForeground(new java.awt.Color(250, 0, 0));

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
        });

        nTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nTextFieldFocusGained(evt);
            }
        });
        nTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(250, 0, 0));
        emailLabel.setText("E-mail:");

        cellLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        cellLabel.setForeground(new java.awt.Color(250, 0, 0));
        cellLabel.setText("Cell Number:");

        dayDOB.setMaximumRowCount(31);
        dayDOB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthDOB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        yearDOB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", "" }));

        nokLabel.setFont(new java.awt.Font("Cooper Black", 2, 18)); // NOI18N
        nokLabel.setForeground(new java.awt.Color(250, 0, 0));
        nokLabel.setText("Next of Kin");

        nokNameLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        nokNameLabel.setForeground(new java.awt.Color(250, 0, 0));
        nokNameLabel.setText("Name:");

        nokSurnameLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        nokSurnameLabel.setForeground(new java.awt.Color(250, 0, 0));
        nokSurnameLabel.setText("Surname:");

        nokEmailLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        nokEmailLabel.setForeground(new java.awt.Color(250, 0, 0));
        nokEmailLabel.setText("E-mail:");

        nokNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nokNameTextFieldFocusGained(evt);
            }
        });

        nokSurnameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nokSurnameTextFieldFocusGained(evt);
            }
        });

        nokEmailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nokEmailTextFieldFocusGained(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(250, 0, 0));
        backButton.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    backButtonActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        registerButton.setBackground(new java.awt.Color(250, 0, 0));
        registerButton.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cooper Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 0, 0));
        jLabel1.setText("Surephrase");

        surephraseLabel.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        surephraseLabel.setForeground(new java.awt.Color(250, 0, 0));
        surephraseLabel.setText("Enter Phrase:");

        nameCheck.setText("X");

        sCheck.setText("X");

        idCheck.setText("X");

        emailCheck.setText("X");

        cellCheck.setText("X");

        nokNcheck.setText("X");

        nokScheck.setText("X");

        nokEmailCheck.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SurnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cellLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dayDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(surnameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailCheck)
                            .addComponent(cellCheck)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nameCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(nokNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nokSurnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nokEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(surephraseLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(surephraseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(nokNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                                .addComponent(nokSurnameTextField)
                                                .addComponent(nokEmailTextField))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addComponent(nokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nokNcheck)
                                    .addComponent(nokScheck)
                                    .addComponent(nokEmailCheck))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nokLabel)
                    .addComponent(nTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SurnameLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(surnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sCheck))
                    .addComponent(nokNameLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nokNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nokNcheck)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(dayDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nokSurnameLabel)
                    .addComponent(nokSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nokScheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nokEmailLabel)
                    .addComponent(nokEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCheck)
                    .addComponent(nokEmailCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surephraseLabel)
                    .addComponent(surephraseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addressTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)
                    .addComponent(emailCheck))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellLabel)
                    .addComponent(cellCheck))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(registerButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents




    private void CheckNumbers(JTextField txt, JLabel l){
        if(!txt.getText().matches("[0-9]+")){
            registerButton.setEnabled(false);
            l.setForeground(Color.red);


        }
        else{
            l.setForeground(Color.black);
            registerButton.setEnabled(true);
        }


    }

    public void numberDoclist(JTextField txt, JLabel l){
        txt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CheckNumbers(txt, l);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CheckNumbers(txt, l);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                CheckNumbers(txt, l);
            }
        });

    }

    private void CheckWords(JTextField txt, JLabel l){
        if(!txt.getText().matches("[a-zA-Z]+")){
            registerButton.setEnabled(false);
            l.setForeground(Color.red);


        }
        else{
            l.setForeground(Color.black);
            registerButton.setEnabled(true);
        }


    }

    public void wordsDoclist(JTextField txt, JLabel l){
        txt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CheckWords(txt, l);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CheckWords(txt, l);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                CheckWords(txt, l);
            }
        });

    }



    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        name = cTextField.getText();
        surname = surnameTextField.getText();
        id = idTextField.getText();
        address1 = addressTextField1.getText();
        address2 = addressTextField2.getText();
        address3 = addressTextField3.getText();
        email = emailTextField.getText();
        cell = nTextField.getText();
        nokName = nokNameTextField.getText();
        nokSurname = nokSurnameTextField.getText();
        nokEmail = nokEmailTextField.getText();
        day = dayDOB.getSelectedItem().toString();
        month = monthDOB.getSelectedItem().toString();
        year = yearDOB.getSelectedItem().toString();
        surephrase = surephraseTextField.getText();
        Username user = new Username();
        user.setLocationRelativeTo(null);
        user.setVisible(true);
        user.initVar(name, surname, id, address1, address2, address3, email, cell, nokName, nokSurname, nokEmail, day, month, year,surephrase);
        setVisible(false);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void nTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nTextFieldActionPerformed

    private void nTextFieldFocusGained(FocusEvent evt) {
        wordsDoclist(nTextField,nameCheck);
    }

    //cell number(mistake with the naming)
    private void nameTextFieldFocusGained1(FocusEvent evt) {
        numberDoclist(cTextField,cellCheck);
    }
    private void surnameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameTextFieldFocusGained
        // TODO add your handling code here:
        wordsDoclist(surnameTextField,sCheck);
    }//GEN-LAST:event_surnameTextFieldFocusGained

    private void idTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFieldFocusGained
        // TODO add your handling code here:
        numberDoclist(idTextField,idCheck);
    }//GEN-LAST:event_idTextFieldFocusGained

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldFocusGained

    private void nokNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nokNameTextFieldFocusGained
        // TODO add your handling code here:
        wordsDoclist(nokNameTextField,nokNcheck);
    }//GEN-LAST:event_nokNameTextFieldFocusGained

    private void nokSurnameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nokSurnameTextFieldFocusGained
        // TODO add your handling code here:
        wordsDoclist(nokSurnameTextField,nokScheck);
    }//GEN-LAST:event_nokSurnameTextFieldFocusGained

    private void nokEmailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nokEmailTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nokEmailTextFieldFocusGained

    private void cTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cTextFieldFocusGained
        // TODO add your handling code here:
        numberDoclist(cTextField,cellCheck);
    }//GEN-LAST:event_cTextFieldFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField1;
    private javax.swing.JTextField addressTextField2;
    private javax.swing.JTextField addressTextField3;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cTextField;
    private javax.swing.JLabel cellCheck;
    private javax.swing.JLabel cellLabel;
    private javax.swing.JComboBox<String> dayDOB;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel emailCheck;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel idCheck;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> monthDOB;
    private javax.swing.JTextField nTextField;
    private javax.swing.JLabel nameCheck;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nokEmailCheck;
    private javax.swing.JLabel nokEmailLabel;
    private javax.swing.JTextField nokEmailTextField;
    private javax.swing.JLabel nokLabel;
    private javax.swing.JLabel nokNameLabel;
    private javax.swing.JTextField nokNameTextField;
    private javax.swing.JLabel nokNcheck;
    private javax.swing.JLabel nokScheck;
    private javax.swing.JLabel nokSurnameLabel;
    private javax.swing.JTextField nokSurnameTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel sCheck;
    private javax.swing.JLabel surephraseLabel;
    private javax.swing.JTextField surephraseTextField;
    private javax.swing.JTextField surnameTextField;
    private static javax.swing.JComboBox<String> yearDOB;
    // End of variables declaration//GEN-END:variables
}
