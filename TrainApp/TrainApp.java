import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class TrainApp extends JFrame{   
    public static void main(String[] args) {
        TrainApp t=new TrainApp();
        t.trainApp();
    }
    
    public void trainApp(){
        setTitle("Train App");
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel titleA=new JLabel("Train departs from A:");
        JLabel titleB=new JLabel("Train departs from B:");
        
        JPanel panelA=new JPanel();
        panelA.setLayout(new GridLayout(3,2,15,10));
        JTextField depA1=new JTextField(15);
        JTextField arvA1=new JTextField(15);
        JTextField depA2=new JTextField(15);
        JTextField arvA2=new JTextField(15);
        JTextField depA3=new JTextField(15);
        JTextField arvA3=new JTextField(15);
        panelA.add(depA1);
        panelA.add(arvA1);
        panelA.add(depA2);
        panelA.add(arvA2);
        panelA.add(depA3);
        panelA.add(arvA3);
        JPanel panelB=new JPanel();
        panelB.setLayout(new GridLayout(3,2,15,10));
        JTextField depB1=new JTextField(15);
        JTextField arvB1=new JTextField(15);
        JTextField depB2=new JTextField(15);
        JTextField arvB2=new JTextField(15);
        JTextField depB3=new JTextField(15);
        JTextField arvB3=new JTextField(15);
        panelB.add(depB1);
        panelB.add(arvB1);
        panelB.add(depB2);
        panelB.add(arvB2);
        panelB.add(depB3);
        panelB.add(arvB3);
        add(titleA);
        add(panelA);
        add(titleB);
        add(panelB);        
        
        JButton b=new JButton("sumbit");
        b.setPreferredSize(new Dimension(100,50));
        add(b);
        JLabel resA=new JLabel("Total Trains needed at station A is ");
        // add(resA);
        JTextArea areaA=new JTextArea();
        areaA.setEditable(false);  
        // add(areaA);
        JLabel resB=new JLabel(" Total Trains needed at station B is ");
        // add(resB);
        JTextArea areaB=new JTextArea();  
        areaB.setEditable(false);      
        // add(areaB);

        setVisible(true);
        b.addActionListener((e)->{
            String [][] arrA=inputArival(inputDeparture(depA1.getText(), depA2.getText(), depA3.getText()), arvA1.getText(), arvA2.getText(), arvA3.getText());
            String [][] arrB=inputArival(inputDeparture(depB1.getText(), depB2.getText(), depB3.getText()), arvB1.getText(), arvB2.getText(), arvB3.getText());
            int nb=noOfTrains(arrA, arrB, 3);
            int na=noOfTrains(arrB, arrA, 3);
            areaA.setText(""+na);
            areaB.setText(""+nb);
            add(resA);
            add(areaA);
            add(resB);
            add(areaB);
        });
    }

    public String[][] inputArival(String [][] arr,String arv1,String arv2,String arv3) {
        arr[0][1]=arv1;
        arr[1][1]=arv2;
        arr[2][1]=arv3;
        return arr;
    }

    public String[][] inputDeparture(String dep1,String dep2,String dep3) {
        String [][] arr=new String[3][2];
        arr[0][0]=dep1;
        arr[1][0]=dep2;
        arr[2][0]=dep3;
        return arr;
    }

    public int noOfTrains(String [][]arr1,String [][]arr2,int n) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i][1].compareTo(arr2[j][0])<0){
                    n--;
                    arr2[j][0]="";
                    break;
                }
            }
        }
        return n;
    }
}

