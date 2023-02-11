import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;



public class atmocalc extends JFrame implements ActionListener{
    //Frame
    JFrame frame;
    JFrame frame2;
    //-------------Menu-------------
    static JMenuBar menubar;
    static JMenu menu,manualmenu;
    static JMenuItem credit,help,manual, menutemp, menupres;
    JDialog manoverridetemp = new JDialog(frame, "Override?");
    //-------------Button-------------
    JButton button = new JButton();
    JButton yes = new JButton();
    JButton no = new JButton();
    JButton continuebutt = new JButton();
    JOptionPane manualtempinput;
    JOptionPane manualpresinput;
    JButton setValue1 = new JButton();
    JButton setValue2 = new JButton();
    //-------------Input Boxes-------------
    JTextField[] inputboxes = new JTextField[11]; 
    JTextField AltitudeMetertxt;
    JTextField AltitudeFeettxt;
    JTextField CordLengthtxt;
    JTextField MassToWeighttxt;
    JTextField Areatxt;
    JTextField Velocitytxt;
    JTextField FluidViscositytxt;
    JTextField Dragtxt;
    JTextField Cdtxt;
    //Density Input Boxes
    JTextField ManTemperature;
    JTextField ManPressure;
    
    //-------------Converstion Fields-------------
    JTextField[] conversionboxes = new JTextField[9];
    JTextField ConAltitudeFeet = new JTextField();
    JTextField ConAltitudeMeter = new JTextField();
    JTextField ConCordLength = new JTextField();
    JTextField ConMassToWeight = new JTextField();
    JTextField ConArea = new JTextField();
    JTextField ConVelocity = new JTextField();
    JTextField ConFluidViscosity = new JTextField();
    JTextField ConDrag = new JTextField();
    JTextField ConCd = new JTextField();
    //-------------OutPuts-------------
    JTextField[] outputboxes = new JTextField[10];
    JTextField ConTemperatureCel = new JTextField();
    JTextField ConTemperatureFah = new JTextField();
    JTextField ConPressurekPa = new JTextField();
    JTextField ConPressurepsi = new JTextField();
    JTextField Densitykg = new JTextField();
    JTextField Densitylb = new JTextField();
    JTextField Cl = new JTextField();
    JTextField Cd = new JTextField();
    JTextField Re = new JTextField();
    JTextField D = new JTextField();
    //panels
    JPanel InputPanel;
    JPanel ConversionPanel;
    JPanel OutputPanel;
    //Labels
    JLabel meter1, feet1, meter2, feet2, cordlength,cordlength2, mass, area,area2, velocity, fluidviscosity,fluidviscosity2, drag, labCd,labCd2, manualtemp, manualpress;
    //Con Labels
    JLabel weight, ms2, dragnewton; 
    //Output Labels
    JLabel labtempcel, labtempfah, labpressure, labpsi, labdenkg, labdenlb;
    JLabel[] labels = new JLabel[27];
    //Frame2 Labels
    JLabel labCl, frame2labCd, labRe, labD;
    //Font Stuff
    String string;
    Font UniFont = new Font("Arial",Font.PLAIN,15);
    final Font buttonfont = new Font("Arial",Font.PLAIN,10);
    JTextField tempbox;
    
    
    //numbers
    double number;
    double meternum;
    double feetnum;
    double cordlengthnum;
    double massnum;
    double areanum;
    double velocitynum;
    double fluidviscositynum;
    double dragnum;
    double Cdnum;
    double temperaturecelnum;
    double temperaturefahnum;
    double pressurenum;
    double psinum;
    double densitykgnum;
    double densitylbnum;
    
    //override
    boolean overridetemp = false;
    boolean overridepres = false;
    
    atmocalc(){
        frame = new JFrame("EHHS Aerospace Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setSize(660,850);
        frame.setLayout(null);
        frame.setResizable(false);
        frame2 = new JFrame("More Calculations");
        frame2.setAlwaysOnTop(true);
        frame2.setSize(410,290);
        frame2.setLayout(null);
        frame2.setResizable(false);
        //-------------Menu-------------
        menubar = new JMenuBar();
        menu = new JMenu("Options");
        manualmenu = new JMenu("Manual Inputs!");
        menutemp = new JMenuItem("Manual Tempurature Input");
        menupres = new JMenuItem("Manual Pressure Input");
        menutemp.addActionListener(this);
        menupres.addActionListener(this);
        menu.setFont(UniFont);
        manualmenu.setFont(UniFont);
        menutemp.setFont(UniFont);
        menupres.setFont(UniFont);
        manualmenu.add(menutemp);
        manualmenu.add(menupres);
        menu.add(manualmenu);
        menubar.add(menu);
        //-------------Button-------------
        button = new JButton("More Calculations");
        button.setFont(buttonfont);
        button.setBounds(255,490,130,30);
        button.addActionListener(this);
        //
        setValue1 = new JButton("Set Value");
        setValue1.setFont(new Font("Arial",Font.PLAIN,9));
        setValue1.setBounds(310,95,75,24);
        setValue1.addActionListener(this);
        //
        setValue2 = new JButton("Set Value");
        setValue2.setFont(new Font("Arial",Font.PLAIN,9));
        setValue2.setBounds(310,205,75,24);
        setValue2.addActionListener(this);
        //-------------Input Boxes-------------
        AltitudeMetertxt = new JTextField();
        AltitudeFeettxt = new JTextField();
        CordLengthtxt = new JTextField();
        MassToWeighttxt = new JTextField();
        Areatxt = new JTextField();
        Velocitytxt = new JTextField();
        FluidViscositytxt = new JTextField();
        Dragtxt = new JTextField();
        Cdtxt = new JTextField();
        //Density Input Boxes
        ManTemperature = new JTextField();
        ManPressure = new JTextField();
         //-------------Converstion Fields-------------
        ConAltitudeFeet = new JTextField();
        ConAltitudeMeter = new JTextField();
        ConCordLength = new JTextField();
        ConMassToWeight = new JTextField();
        ConArea = new JTextField();
        ConVelocity = new JTextField();
        ConDrag = new JTextField();
        ConCd = new JTextField();
        //-------------OutPuts-------------
        ConTemperatureCel = new JTextField();
        ConTemperatureFah = new JTextField();
        ConPressurekPa = new JTextField();
        ConPressurepsi = new JTextField();
        Densitykg = new JTextField();
        Densitylb = new JTextField();
        Cl = new JTextField();
        Cd = new JTextField();
        Re = new JTextField();
        D = new JTextField();
        //TempBox
        JTextField tempbox1 = new JTextField();
        JTextField tempbox2 = new JTextField();
        JTextField tempbox3 = new JTextField();
        JTextField tempbox4 = new JTextField();
        JTextField tempbox5 = new JTextField();
        tempbox1.setFocusable(false);
        tempbox2.setFocusable(false);
        tempbox3.setFocusable(false);
        tempbox4.setFocusable(false);
        tempbox5.setFocusable(false);
        //Labels
        meter1 =  new JLabel("Meters");
        feet1 = new JLabel("Feet");
        meter2 =  new JLabel("Meters");
        feet2 = new JLabel("Feet");
        cordlength = new JLabel("Cord Length");
        cordlength2 = new JLabel("Cord Length");
        mass = new JLabel("Mass");
        area = new JLabel("Area");
        area2 = new JLabel("Area");
        velocity = new JLabel("Velocity(kph)");
        fluidviscosity = new JLabel("Fluid Viscosity");
        fluidviscosity2 = new JLabel("Fluid Viscosity");
        drag = new JLabel("Drag");
        labCd = new JLabel("Coefficient of Drag");
        labCd2 = new JLabel("Coefficient of Drag");
        manualtemp = new JLabel("Manual Temperature");
        manualpress = new JLabel("Manual Pressure");
        weight = new JLabel("Weight(N)"); 
        ms2 = new JLabel("m/s2");
        dragnewton = new JLabel("Drag In Newtons");
        labtempcel = new JLabel("Temperature Celsius");
        labtempfah = new JLabel("Temperature Fahrenheit");
        labpressure = new JLabel("Pressure");
        labpsi = new JLabel("PSI");
        labdenlb = new JLabel("Density (lb)");
        labdenkg = new JLabel("Density (kg)");
        labCl = new JLabel("Coefficient of Lift");
        frame2labCd = new JLabel("Coefficient of Drag");
        labRe = new JLabel("Reynolds Number");
        labD = new JLabel("Drag(N)");
        //inputboxes assignment
        inputboxes[0] = AltitudeMetertxt;
        inputboxes[1] = AltitudeFeettxt;
        inputboxes[2] = CordLengthtxt;
        inputboxes[3] = MassToWeighttxt;
        inputboxes[4] = Areatxt;
        inputboxes[5] = Velocitytxt;
        inputboxes[6] = FluidViscositytxt;
        inputboxes[7] = Dragtxt;
        inputboxes[8] = Cdtxt;
        inputboxes[9] = ManTemperature;
        inputboxes[10] = ManPressure;
        //conversionboxes assignments
        conversionboxes[0] = ConAltitudeFeet;
        conversionboxes[1] = ConAltitudeMeter;
        conversionboxes[2] = ConCordLength;
        conversionboxes[3] = ConMassToWeight;
        conversionboxes[4] = ConArea;
        conversionboxes[5] = ConVelocity;
        conversionboxes[6] = ConFluidViscosity;
        conversionboxes[7] = ConDrag;
        conversionboxes[8] = ConCd;
        //outputboxes assignements
        outputboxes[0] = ConTemperatureCel;
        outputboxes[1] = ConTemperatureFah;
        outputboxes[2] = ConPressurekPa;
        outputboxes[3] = ConPressurepsi;
        outputboxes[4] = Densitykg;
        outputboxes[5] = Densitylb;
        outputboxes[6] = Cl;
        outputboxes[7] = Cd;
        outputboxes[8] = Re;
        outputboxes[9] = D;
        //-------------Label Arrays-------------
        //Input Labels
        labels[0] = meter1;
        labels[1] = feet1;
        labels[2] = cordlength;
        labels[3] = mass;
        labels[4] = area;
        labels[5] = velocity;
        labels[6] = fluidviscosity;
        labels[7] = drag;
        labels[8] = labCd;
        labels[9] = manualtemp;
        labels[10] = manualpress;
        //Conversion Labels
        labels[11] = feet2;
        labels[12] = meter2;
        labels[13] = cordlength2;
        labels[14] = weight;
        labels[15] = area2;
        labels[16] = ms2;
        labels[17] = fluidviscosity2;
        labels[18] = dragnewton; 
        labels[19] = labCd2;
        //Output Labels
        labels[20] = labtempcel;
        labels[21] = labtempfah;
        labels[22] = labpressure;
        labels[23] = labpsi;
        labels[24] = labdenkg;
        labels[25] = labdenlb;
        
        //fonts n stuff
        for(int i=0;i<=10;i++){
            inputboxes[i].setFont(UniFont);
            inputboxes[i].addActionListener(this);
        }
        for(int i=0;i<=8;i++){
            conversionboxes[i].setFocusable(false);
            conversionboxes[i].setFont(UniFont);
        }
        for(int i=0;i<10;i++){
            outputboxes[i].setFocusable(false);
            outputboxes[i].setFont(UniFont);
        }
        for(int i=0;i<=25;i++){
            labels[i].setFont(UniFont);
        }
        AltitudeMetertxt.addActionListener(this);
        AltitudeFeettxt.addActionListener(this);
        CordLengthtxt.addActionListener(this);
        MassToWeighttxt.addActionListener(this);
        Areatxt.addActionListener(this);
        Velocitytxt.addActionListener(this);
        FluidViscositytxt.addActionListener(this);
        Dragtxt.addActionListener(this);
        Cdtxt.addActionListener(this);
        ManTemperature.addActionListener(this);
        ManPressure.addActionListener(this);
        
        //-------------Panels-------------
        //InputPanel
        InputPanel = new JPanel();
        InputPanel.setBounds(20,40,200,440);
        InputPanel.setLayout(new GridLayout(9,1,0,30));
        for(int i=0;i<9;i++){
            InputPanel.add(inputboxes[i]);
        }
        
        
        //ConversionPanel
        ConversionPanel = new JPanel();
        ConversionPanel.setBounds(420,40,200,440);
        ConversionPanel.setLayout(new GridLayout(9,1,0,30));
        ConversionPanel.add(conversionboxes[0]);
        ConversionPanel.add(conversionboxes[1]);
        ConversionPanel.add(conversionboxes[2]);
        ConversionPanel.add(conversionboxes[3]);
        ConversionPanel.add(conversionboxes[4]);
        ConversionPanel.add(conversionboxes[5]);
        ConversionPanel.add(conversionboxes[6]);
        ConversionPanel.add(conversionboxes[7]);
        ConversionPanel.add(conversionboxes[8]);
        //OutPutPanel
        OutputPanel = new JPanel();
        OutputPanel.setBounds(20,560,600,200);
        OutputPanel.setLayout(new GridLayout(3,2,90,60));
        for(int i=0; i<6;i++){
            OutputPanel.add(outputboxes[i]);
        }
        
        //-------------Labels-------------
        //Input Labels
        Dimension size0 = labels[0].getPreferredSize();
        labels[0].setBounds(20,25,size0.width,size0.height);
        Dimension size1 = labels[1].getPreferredSize();
        labels[1].setBounds(20,78,size1.width,size1.height);
        Dimension size2 = labels[2].getPreferredSize();
        labels[2].setBounds(20,129,size2.width,size2.height);
        Dimension size3 = labels[3].getPreferredSize();
        labels[3].setBounds(20,182,size3.width,size3.height);
        Dimension size4 = labels[4].getPreferredSize();
        labels[4].setBounds(20,234,size4.width,size4.height);
        Dimension size5 = labels[5].getPreferredSize();
        labels[5].setBounds(20,285,size5.width,size5.height);
        Dimension size6 = labels[6].getPreferredSize();
        labels[6].setBounds(20,338,size6.width,size6.height);
        Dimension size7 = labels[7].getPreferredSize();
        labels[7].setBounds(20,389,size7.width,size7.height);
        Dimension size8 = labels[8].getPreferredSize();
        labels[8].setBounds(20,442,size8.width,size8.height);
        //Dimension size9 = labels[9].getPreferredSize();           
        //labels[9].setBounds(20,495,size9.width,size8.height);    
        //Dimension size10 = labels[10].getPreferredSize();
        //labels[10].setBounds(20,548,size10.width,size10.height);

        //Conversion labels
        Dimension size11 = labels[11].getPreferredSize();
        labels[11].setBounds(420,25,size11.width,size11.height);
        Dimension size12 = labels[12].getPreferredSize();
        labels[12].setBounds(420,78,size12.width,size12.height);
        Dimension size13 = labels[13].getPreferredSize();
        labels[13].setBounds(420,129,size13.width,size13.height);
        Dimension size14 = labels[14].getPreferredSize();
        labels[14].setBounds(420,182,size14.width,size14.height);
        Dimension size15 = labels[15].getPreferredSize();
        labels[15].setBounds(420,234,size15.width,size15.height);
        Dimension size16 = labels[16].getPreferredSize();
        labels[16].setBounds(420,285,size16.width,size16.height);
        Dimension size17 = labels[17].getPreferredSize();
        labels[17].setBounds(420,338,size17.width,size17.height);
        Dimension size18 = labels[18].getPreferredSize();
        labels[18].setBounds(420,389,size18.width,size18.height);
        Dimension size19 = labels[19].getPreferredSize();
        labels[19].setBounds(420,442,size19.width,size19.height);
        //Output Labels
        Dimension size20 = labels[20].getPreferredSize();
        labels[20].setBounds(20,546,size20.width,size20.height);
        Dimension size21 = labels[21].getPreferredSize();
        labels[21].setBounds(365,546,size21.width,size21.height);
        Dimension size22 = labels[22].getPreferredSize();
        labels[22].setBounds(20,632,size22.width,size22.height);
        Dimension size23 = labels[23].getPreferredSize();
        labels[23].setBounds(365,632,size23.width,size23.height);
        Dimension size24 = labels[24].getPreferredSize();
        labels[24].setBounds(20,717,size24.width,size24.height);
        Dimension size25 = labels[25].getPreferredSize();
        labels[25].setBounds(365,717,size25.width,size25.height);
        //Frame2 Labels
        Dimension size26 = labCl.getPreferredSize();
        labCl.setBounds(10,25,size26.width,size26.height);
        Dimension size27 = frame2labCd.getPreferredSize();
        frame2labCd.setBounds(10,80,size27.width,size27.height);
        Dimension size28 = labRe.getPreferredSize();
        labRe.setBounds(10,135,size28.width,size28.height);
        Dimension size29 = labD.getPreferredSize();
        labD.setBounds(10,190,size29.width,size29.height);
        //labCd.setBounds(10,
        //adding stuff to the frame!
        for(int i=0;i<=25;i++){
            frame.add(labels[i]);
        }
        //Frame two stuff
        Cl.setBounds(10,40,300,25);
        Cd.setBounds(10,95,300,25);
        Re.setBounds(10,150,300,25);
        D.setBounds(10,205,300,25);
        
        
        frame.add(button);
        frame.setJMenuBar(menubar);
        frame.add(InputPanel);
        frame.add(ConversionPanel);
        frame.add(OutputPanel);
        frame.setVisible(true);
        //More Calculations
        frame2.add(Cl);
        frame2.add(Cd);
        frame2.add(Re);
        frame2.add(D);
        frame2.add(labCl);
        frame2.add(frame2labCd);
        frame2.add(labRe);
        frame2.add(labD);
        frame2.add(setValue1);
        frame2.add(setValue2);
    }
    public static void main(String[] args){
        atmocalc calc = new atmocalc(); 
    }
        public void intchecker(JTextField txt, Double number){
        string = txt.getText();
        if(number%1==0){
            txt.setText("");
            for(int i=0;i<string.length()-2;i++){
                txt.setText(txt.getText()+string.charAt(i));
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //Manual Inputs
        if(e.getSource()==menutemp){
            JDialog d = new JDialog(frame, "Manual Temperature");
            JLabel l = new JLabel("Enter Temperature in Celsius");
            ManTemperature = new JTextField();
            l.setBounds(10,10,200,15);
            ManTemperature.setBounds(10,25,200,25);
            ManTemperature.setFont(UniFont);
            ManTemperature.addActionListener(this);
            d.add(l);
            d.add(ManTemperature);
            d.setResizable(false);
            d.setSize(235,110);
            d.setLayout(null);
            d.setVisible(true);
        }
        if(e.getSource()==menupres){
            JDialog d = new JDialog(frame, "Manual Pressure");
            JLabel l = new JLabel("Enter Pressure");
            ManPressure = new JTextField();
            l.setBounds(10,10,200,15);
            ManPressure.setBounds(10,25,200,25);
            ManPressure.setFont(UniFont);
            ManPressure.addActionListener(this);
            d.add(l);
            d.add(ManPressure);
            d.setResizable(false);
            d.setSize(235,110);
            d.setLayout(null);
            d.setVisible(true);
        }
        if(e.getSource()==ManTemperature){
            try{
                //Option to override pressure
                JDialog manoverridetemp = new JDialog(frame, "Override?");
                JLabel l = new JLabel("Do you want to Override Pressure?");
                l.setBounds(40,10,200,15);
                yes = new JButton("Yes");
                no = new JButton("No");
                
                yes.setBounds(40,30,75,25);
                no.setBounds(160,30,75,25);
                
                yes.addActionListener(this);
                yes.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                       manoverridetemp.dispose();
                   }
                });
                no.addActionListener(this);
                no.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                       manoverridetemp.dispose();
                   }
                });
                
                manoverridetemp.add(l);
                manoverridetemp.add(yes);
                manoverridetemp.add(no);
                manoverridetemp.setSize(300,125);
                manoverridetemp.setResizable(false);
                manoverridetemp.setLayout(null);
                
                if(pressurenum!=0){
                    manoverridetemp.setVisible(true);
                }
                else{
                    temperaturecelnum = Double.parseDouble(ManTemperature.getText());
                    ConTemperatureCel.setText(String.valueOf(temperaturecelnum));
                    intchecker(ConTemperatureCel,temperaturecelnum);
                    //overridetemp=true;
                    //overridepres=true;
                }
            } 
            catch(Exception a){
                ManTemperature.setText("Only put numbers!");
            }
        }
        //For Manual Temperature
        if(e.getSource()==yes){
            temperaturecelnum = Double.parseDouble(ManTemperature.getText());
            ConTemperatureCel.setText(String.valueOf(temperaturecelnum));
            intchecker(ConTemperatureCel,temperaturecelnum);
            overridetemp=true;
            overridepres=false;
        }
        if(e.getSource()==no){
            temperaturecelnum = Double.parseDouble(ManTemperature.getText());
            ConTemperatureCel.setText(String.valueOf(temperaturecelnum));
            intchecker(ConTemperatureCel,temperaturecelnum);
            overridetemp=true;
            overridepres=true;
        }
        if(e.getSource()==ManPressure){
            try{
                pressurenum = Double.parseDouble(ManPressure.getText());
                ConPressurekPa.setText(String.valueOf(pressurenum));
                intchecker(ConPressurekPa, pressurenum);
                overridepres = true;
            }
            catch(Exception a){
                ManPressure.setText("Only put numbers!");
            }
        }
        //Inputs
        if(e.getSource()==AltitudeMetertxt){
            try{
                meternum = Double.parseDouble(AltitudeMetertxt.getText());
                feetnum = convert.meter(meternum);
                ConAltitudeFeet.setText(String.valueOf(feetnum));
                AltitudeFeettxt.setText(String.valueOf(feetnum));
                ConAltitudeMeter.setText(String.valueOf(meternum));
                intchecker(ConAltitudeFeet,feetnum);
                intchecker(ConAltitudeMeter,meternum);
                overridetemp = false;
                overridepres = false;
            }
            catch(Exception a){
                ConAltitudeFeet.setText("Only put numbers!");
            }
        }
        if(e.getSource()==AltitudeFeettxt){
            try{
                feetnum = Double.parseDouble(AltitudeFeettxt.getText());
                meternum = convert.feet(feetnum);
                ConAltitudeMeter.setText(String.valueOf(meternum));
                AltitudeMetertxt.setText(String.valueOf(meternum));
                ConAltitudeFeet.setText(String.valueOf(feetnum));
                intchecker(ConAltitudeMeter,meternum);
                intchecker(ConAltitudeFeet, feetnum);
                overridetemp = false;
                overridepres = false;
            }
            catch(Exception b){
                ConAltitudeMeter.setText("Only put numbers!");
            }
        }
        if(e.getSource()==CordLengthtxt){
            try{
                cordlengthnum = Double.parseDouble(CordLengthtxt.getText());
                ConCordLength.setText(String.valueOf(cordlengthnum));
                intchecker(ConCordLength,cordlengthnum);
            }
            catch(Exception b){
                ConCordLength.setText("Only put numbers!");
            }
        }
        if(e.getSource()==MassToWeighttxt){
            try{
                massnum = Double.parseDouble(MassToWeighttxt.getText());
                massnum = convert.masstoweight(massnum);
                ConMassToWeight.setText(String.valueOf(massnum));
                intchecker(ConMassToWeight,massnum);
            }
            catch(Exception b){
                ConMassToWeight.setText("Only put numbers!");
            }
        }
        if(e.getSource()==Areatxt){
            try{
                areanum = Double.parseDouble(Areatxt.getText());
                ConArea.setText(String.valueOf(areanum));
                intchecker(ConArea,areanum);
            }
            catch(Exception b){
                ConArea.setText("Only put numbers!");
            }
        }
        if(e.getSource()==Velocitytxt){
            try{
                velocitynum = Double.parseDouble(Velocitytxt.getText());
                velocitynum = convert.ms2(velocitynum);
                ConVelocity.setText(String.valueOf(velocitynum));
                intchecker(ConVelocity,velocitynum);
            }
            catch(Exception b){
                ConVelocity.setText("Only put numbers!");
            }
        }
        if(e.getSource()==FluidViscositytxt){
            try{
                fluidviscositynum = Double.parseDouble(FluidViscositytxt.getText());
                ConFluidViscosity.setText(String.valueOf(fluidviscositynum));
                intchecker(ConFluidViscosity,fluidviscositynum);
            }
            catch(Exception b){
                ConFluidViscosity.setText("Only put numbers!");
            }
        }
        if(e.getSource()==Dragtxt){
            try{
                dragnum = Double.parseDouble(Dragtxt.getText());
                dragnum = convert.drag2newtons(dragnum);
                ConDrag.setText(String.valueOf(dragnum));
                intchecker(ConDrag,dragnum);
            }
            catch(Exception b){
                ConDrag.setText("Only put numbers!");
            }
        }
        if(e.getSource()==Cdtxt){
            try{
                Cdnum = Double.parseDouble(Cdtxt.getText());
                ConCd.setText(String.valueOf(Cdnum));
                intchecker(ConCd,Cdnum);
            }
            catch(Exception b){
                ConCd.setText("Only put numbers!");
            }
        }
        //Buttons
        if(e.getSource()==button){
            frame2.setVisible(true);
        }
        if(e.getSource()==setValue1){
            Cdnum = Double.parseDouble(Cd.getText());
            Cdtxt.setText(String.valueOf(Cdnum));
            ConCd.setText(String.valueOf(Cdnum));
            intchecker(ConCd,Cdnum);
        }
        if(e.getSource()==setValue2){
            dragnum = Double.parseDouble(D.getText());
            Dragtxt.setText(String.valueOf(dragnum));
            ConDrag.setText(String.valueOf(convert.drag2newtons(dragnum)));
            intchecker(ConDrag,dragnum);
            intchecker(Dragtxt,dragnum);
        }
        //override
        if(overridetemp==false){
            if(meternum!=0){
                temperaturecelnum = convert.temperaturecel(meternum);
                ConTemperatureCel.setText(String.valueOf(temperaturecelnum));
                temperaturefahnum = convert.temperaturefah(temperaturecelnum);
                ConTemperatureFah.setText(String.valueOf(temperaturefahnum));
            }
        }
        if(overridepres==false){  
            if(temperaturecelnum!=0){
                temperaturefahnum = convert.temperaturefah(temperaturecelnum);
                ConTemperatureFah.setText(String.valueOf(temperaturefahnum));
                pressurenum = convert.pressurekpa(temperaturecelnum);
                ConPressurekPa.setText(String.valueOf(pressurenum));
                psinum = convert.pressurepsi(pressurenum);
                ConPressurepsi.setText(String.valueOf(psinum));
            }
        }
        //checking for numbers
        if(temperaturecelnum!=0){
            temperaturefahnum = convert.temperaturefah(temperaturecelnum);
            ConTemperatureFah.setText(String.valueOf(temperaturefahnum));
        }
        if(pressurenum!=0){
            psinum = convert.pressurepsi(pressurenum);
            ConPressurepsi.setText(String.valueOf(psinum));
        }
        if((temperaturecelnum!=0)&&(pressurenum!=0)){
             densitykgnum = convert.densitykg(pressurenum,temperaturecelnum);
             Densitykg.setText(String.valueOf(densitykgnum));
             densitylbnum = convert.densitylb(densitykgnum);
             Densitylb.setText(String.valueOf(densitylbnum));
        }
        if((massnum!=0)&&(areanum!=0)&&(densitykgnum!=0)&&(velocitynum!=0)){
            Cl.setText(String.valueOf(convert.Cl(massnum,areanum,densitykgnum,velocitynum)));
        }
        else{
            Cl.setText("Missing value(s)");
        }
        if((dragnum!=0)&&(areanum!=0)&&(densitykgnum!=0)&&(velocitynum!=0)){
            Cd.setText(String.valueOf(convert.Cd(dragnum,areanum,densitykgnum,velocitynum)));
        }
        else{
            Cd.setText("Missing value(s)");
        }
        if((densitykgnum!=0)&&(velocitynum!=0)&&(cordlengthnum!=0)&&(fluidviscositynum!=0)){
            Re.setText(String.valueOf(convert.Re(densitykgnum,velocitynum,cordlengthnum,fluidviscositynum)));
        }
        else{
            Re.setText("Missing values(s)");
        }
        if((Cdnum!=0)&&(areanum!=0)&&(densitykgnum!=0)&&(velocitynum!=0)){
            D.setText(String.valueOf(convert.D(Cdnum,areanum,densitykgnum,velocitynum)));
        }
        else{
            D.setText("Missing values(s)");
        }
    }
}