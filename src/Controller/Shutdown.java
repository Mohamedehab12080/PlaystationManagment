package Controller;

import Model.paymentDevicesModel;
import View.Home;

import java.io.FileWriter;
import java.text.DecimalFormat;

import java.util.ArrayList;

import java.util.Iterator;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Shutdown extends Thread {

    m m = Home.M;
    public JLabel id[];
    String Date[];
    private JCheckBox multi[];
    private JCheckBox txtSecond[];

    public void checkonTimesAndaddPaymentForFirst(paymentDevicesModel pays, JLabel labelid) {
        try {
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.checkonTimesAndaddPaymentForFirst(pays);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel pay = itr.next();
                labelid.setText(String.valueOf(pay.getId()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Shutdown(int size, String date[], JLabel... x) {

        this.id = x;
        this.Date = date;
    }

    public JCheckBox[] getTxtSecond() {
        return txtSecond;
    }

    public void setTxtSecond(JCheckBox... x) {
        this.txtSecond = x;
    }

    public JCheckBox[] getMulti() {
        return multi;
    }

    public void setMulti(JCheckBox... x) {
        this.multi = x;
    }

    @Override
    public void run() {
        try {
            FileWriter writer = new FileWriter("m.txt");

            try {
                for (int i = 0; i < m.state.length; i++) {
                    if (m.state[i] == true) {
                        if (multi[i].isSelected()) {
                            writer.append("************************************  PS " + (i + 1) + "  ************************************\n\t\tMulti Time: " + m.hours[i] + ":" + m.minuts[i] + "\n");
                        } else {
                            writer.append("************************************  PS " + (i + 1) + "  ************************************\n\t\tSingle Time: " + m.hours[i] + ":" + m.minuts[i] + "\n");
                        }
                    }
                }
                writer.close();
                for (int i = 0; i < m.state.length; i++) {
                    if (m.state[i] == true) {
                        float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle("PS " + (i + 1), "Multi");
                        float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle("PS " + (i + 1), "");
                        boolean checkforMulti;
                        String Time = "" + m.hours[i] + ":" + m.minuts[i] + ":";
                        float timeforCalc = 0;
                        int minutes = 0;
                        String TimeSent = "";
                        try {
                            paymentDevicesModel pay = new paymentDevicesModel();
                            int ids;
                            pay.setDeviceName("PS " + (i + 1));
                            if (Time.charAt(0) != '0' && Time.charAt(2) != '0' && Time.charAt(3) != ':') {
                                minutes = Integer.parseInt(Time.charAt(2) + "" + Time.charAt(3));
                                float Hour = Float.parseFloat("" + Time.charAt(0));
                                if (minutes <= 17) {
                                    if (minutes > 10) {
                                        timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.25));
                                        minutes = 15;
                                    } else if (minutes >= 6) {
                                        timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.16));
                                        minutes = 10;
                                    }
                                }
                                if (minutes > 17 && minutes < 23) {
                                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.35));
                                    minutes = 20;
                                }
                                if (minutes >= 23 && minutes <= 25) {
                                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.4));
                                    minutes = 25;
                                }
                                if (minutes > 25 && minutes < 32) {
                                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.5));
                                    minutes = 30;
                                }
                                if (minutes > 32 && minutes <= 35) {
                                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.59));
                                    minutes = 35;
                                }
                                if (minutes > 35 && minutes <= 40) {
                                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.65));
                                    minutes = 40;
                                }
                                if (minutes > 40 && minutes <= 45) {
                                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.75));
                                    minutes = 45;
                                }
                                if (minutes > 45 && minutes <= 50) {
                                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.85));
                                    minutes = 50;
                                }
                                if (minutes > 50 && minutes <= 60) {
                                    timeforCalc = Hour + 1;
                                    minutes = 0;
                                }
                                TimeSent = Time.charAt(0) + ":" + String.valueOf(Time.charAt(2) + "" + Time.charAt(3));
                            }
                            if (Time.charAt(0) != '0' && Time.charAt(2) != '0' && Time.charAt(3) == ':') {
                                float Hour = Float.parseFloat("" + Time.charAt(0));
                                minutes = Integer.parseInt(Time.charAt(2) + "");
                                if (minutes >= 6) {
                                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.16));
                                    minutes = 10;
                                } else if (minutes < 6) {
                                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.1));
                                    minutes = 5;
                                }
                                TimeSent = Time.charAt(0) + ":" + minutes;
                            }
                            if (Time.charAt(0) != '0' && Time.charAt(2) == '0' && Time.charAt(3) == ':') {
                                float Hour = Float.parseFloat("" + Time.charAt(0));
                                timeforCalc = Hour;
                                TimeSent = "" + Hour;
                            }
                            if (Time.charAt(0) == '0' && Time.charAt(2) != '0' && Time.charAt(3) != ':') {
                                minutes = Integer.parseInt(Time.charAt(2) + "" + Time.charAt(3));
                                if (minutes <= 17) {
                                    if (minutes > 10) {
                                        timeforCalc = Float.parseFloat(String.valueOf(0.25));
                                        minutes = 15;
//                        JOptionPane.showMessageDialog(null, "Worked");
                                    } else if (minutes >= 6) {
                                        timeforCalc = Float.parseFloat(String.valueOf(0.16));
                                        minutes = 10;
                                    }
                                }
                                if (minutes > 17 && minutes < 23) {
                                    timeforCalc = Float.parseFloat(String.valueOf(0.35));
                                    minutes = 20;
                                }
                                if (minutes >= 23 && minutes <= 25) {
                                    timeforCalc = Float.parseFloat(String.valueOf(0.4));
                                    minutes = 25;
                                }
                                if (minutes > 25 && minutes < 32) {
                                    timeforCalc = Float.parseFloat(String.valueOf(0.5));
                                    minutes = 30;
                                }
                                if (minutes > 32 && minutes <= 35) {
                                    timeforCalc = Float.parseFloat(String.valueOf(0.59));
                                    minutes = 35;
                                }
                                if (minutes > 35 && minutes <= 40) {
                                    timeforCalc = Float.parseFloat(String.valueOf(0.65));
                                    minutes = 40;
                                }
                                if (minutes > 40 && minutes <= 45) {
                                    timeforCalc = Float.parseFloat(String.valueOf(0.75));
                                    minutes = 45;
                                }
                                if (minutes > 45 && minutes <= 50) {
                                    timeforCalc = Float.parseFloat(String.valueOf(0.85));
                                    minutes = 50;
                                }
                                if (minutes > 50 && minutes <= 60) {
                                    timeforCalc = 1;
                                    minutes = 59;
                                }
                                TimeSent = String.valueOf(minutes);
                            }
                            if (Time.charAt(0) == '0' && Time.charAt(2) != '0' && Time.charAt(3) == ':') {
                                minutes = Integer.parseInt("" + Time.charAt(2));
                                if (minutes <= 9) {
                                    if (minutes >= 6) {
                                        timeforCalc = Float.parseFloat(String.valueOf(0.16));
                                        minutes = 10;
                                    } else if (minutes < 6) {
                                        timeforCalc = Float.parseFloat(String.valueOf(0.1));
                                        minutes = 5;
                                    }
                                }
                                TimeSent = String.valueOf(minutes);
                            }

                            pay.setTime1(TimeSent);
                            if (multi[i].isSelected()) {
                                pay.setHoursType("Multi");
                                pay.setHoursprice(MultiPrice);
                                pay.setPriceofTime1(timeforCalc * MultiPrice);
                                checkforMulti = true;

//                                   JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 1: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
                            } else {
                                pay.setHoursType("Single");
                                pay.setHoursprice(SinglePrice);
                                pay.setPriceofTime1(timeforCalc * SinglePrice);
//                                   JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 1: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
                                checkforMulti = false;
                            }
                            pay.setDate(Date[i]);
                            try {
                                checkonTimesAndaddPaymentForFirst(pay, id[i]);
                            } catch (Exception es) {
//                                JOptionPane.showMessageDialog(null, es);
                            }

// Check for set The Time 1 or 2 or 3 or 4 or 5
                            ids = Integer.parseInt(id[i].getText());
                            pay.setId(ids);
                            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getTimesRecords(ids);
                            Iterator<paymentDevicesModel> itr = list.iterator();
                            while (itr.hasNext()) {
                                paymentDevicesModel payed = itr.next();
                                if (!payed.getTime1().equals("0")) {

                                    if (payed.getTime2().equals("0")) {
                                        pay.setTime1(payed.getTime1());
                                        pay.setPriceofTime1(payed.getPriceofTime1());
                                        pay.setTime3(payed.getTime3());
                                        pay.setPriceOfTime3(payed.getPriceOfTime3());
                                        pay.setTime4(payed.getTime4());
                                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                                        pay.setTime5(payed.getTime5());
                                        pay.setPriceofTime5(payed.getPriceofTime5());
                                        pay.setTime2(TimeSent);
                                        if (checkforMulti == true) {
                                            pay.setPriceOfTime2(timeforCalc * MultiPrice);

                                        } else {
                                            pay.setPriceOfTime2(timeforCalc * SinglePrice);

                                        }

                                    } else if (payed.getTime3().equals("0")) {
                                        pay.setTime1(payed.getTime1());
                                        pay.setPriceofTime1(payed.getPriceofTime1());
                                        pay.setTime2(payed.getTime2());
                                        pay.setPriceOfTime2(payed.getPriceOfTime2());
                                        pay.setTime4(payed.getTime4());
                                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                                        pay.setTime5(payed.getTime5());
                                        pay.setPriceofTime5(payed.getPriceofTime5());
                                        pay.setTime3(TimeSent);
                                        if (checkforMulti == true) {
                                            pay.setPriceOfTime3(timeforCalc * MultiPrice);

                                        } else {
                                            pay.setPriceOfTime3(timeforCalc * SinglePrice);

                                        }
                                    } else if (payed.getTime4().equals("0")) {
                                        pay.setTime1(payed.getTime1());
                                        pay.setPriceofTime1(payed.getPriceofTime1());
                                        pay.setTime2(payed.getTime2());
                                        pay.setPriceOfTime2(payed.getPriceOfTime2());
                                        pay.setTime3(payed.getTime3());
                                        pay.setPriceOfTime3(payed.getPriceOfTime3());
                                        pay.setTime4(payed.getTime4());
                                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                                        pay.setTime5(payed.getTime5());
                                        pay.setPriceofTime5(payed.getPriceofTime5());
                                        pay.setTime4(TimeSent);
                                        if (checkforMulti == true) {
                                            pay.setPriceOfTime4(timeforCalc * MultiPrice);
//                                            JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 4: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
                                        } else {
                                            pay.setPriceOfTime4(timeforCalc * SinglePrice);

                                        }
                                    } else if (payed.getTime5().equals("0")) {
                                        pay.setTime1(payed.getTime1());
                                        pay.setPriceofTime1(payed.getPriceofTime1());
                                        pay.setTime2(payed.getTime2());
                                        pay.setPriceOfTime2(payed.getPriceOfTime2());
                                        pay.setTime3(payed.getTime3());
                                        pay.setPriceOfTime3(payed.getPriceOfTime3());
                                        pay.setTime4(payed.getTime4());
                                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                                        pay.setTime5(TimeSent);
                                        if (checkforMulti == true) {
                                            pay.setPriceofTime5(timeforCalc * MultiPrice);

                                        } else {
                                            pay.setPriceofTime5(timeforCalc * SinglePrice);

                                        }
                                    } else {
                                        pay.setTime1(payed.getTime1());
                                        pay.setPriceofTime1(payed.getPriceofTime1());
                                        pay.setTime2(payed.getTime2());
                                        pay.setPriceOfTime2(payed.getPriceOfTime2());
                                        pay.setTime3(payed.getTime3());
                                        pay.setPriceOfTime3(payed.getPriceOfTime3());
                                        pay.setTime4(payed.getTime4());
                                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                                        pay.setTime5(payed.getTime5());
                                        pay.setPriceofTime5(payed.getPriceofTime5());
                                    }
                                    paymentdevicesCruds.UpdatePaymentForTimes(pay, ids);
                                }
                                /// Update Remaining and Calculate of totalTime and Total Price and price for every time 
                            }

//                            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getTimesRecords(ids);
//                            Iterator<paymentDevicesModel> itr = list.iterator();
//                            while (itr.hasNext()) {
//                                paymentDevicesModel payed = itr.next();
//                                if (payed.getTime1().equals("0")) {
//                                    pay.setTime2(payed.getTime2());
//                                    pay.setPriceOfTime2(payed.getPriceOfTime2());
//                                    pay.setTime3(payed.getTime3());
//                                    pay.setPriceOfTime3(payed.getPriceOfTime3());
//                                    pay.setTime4(payed.getTime4());
//                                    pay.setPriceOfTime4(payed.getPriceOfTime4());
//                                    pay.setTime5(payed.getTime5());
//                                    pay.setPriceofTime5(payed.getPriceofTime5());
//                                    pay.setTime1(TimeSent);
//                                    if (checkforMulti == true) {
//                                        pay.setPriceOfTime2(timeforCalc * MultiPrice);
//                                        writer.append("\tMulti:\n\n\t\tTime 1: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice));
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 1: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
//                                    } else {
//                                        pay.setPriceOfTime2(timeforCalc * SinglePrice);
//                                        writer.append("\tSingle:\n\n\t\tTime 1: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "\n");
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 1: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
//                                    }
//                                } else if (payed.getTime2().equals("0")) {
//                                    pay.setTime1(payed.getTime1());
//                                    pay.setPriceofTime1(payed.getPriceofTime1());
//                                    pay.setTime3(payed.getTime3());
//                                    pay.setPriceOfTime3(payed.getPriceOfTime3());
//                                    pay.setTime4(payed.getTime4());
//                                    pay.setPriceOfTime4(payed.getPriceOfTime4());
//                                    pay.setTime5(payed.getTime5());
//                                    pay.setPriceofTime5(payed.getPriceofTime5());
//                                    pay.setTime2(TimeSent);
//                                    if (checkforMulti == true) {
//                                        pay.setPriceOfTime2(timeforCalc * MultiPrice);
//
//                                        writer.append("\tMulti:\n\n\t\tTime 2: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice));
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 2: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
//                                    } else {
//                                        pay.setPriceOfTime2(timeforCalc * SinglePrice);
//                                        writer.append("\tSingle:\n\n\t\tTime 2: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "\n");
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 2: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
//                                    }
//
//                                } else if (payed.getTime3().equals("0")) {
//                                    pay.setTime1(payed.getTime1());
//                                    pay.setPriceofTime1(payed.getPriceofTime1());
//                                    pay.setTime2(payed.getTime2());
//                                    pay.setPriceOfTime2(payed.getPriceOfTime2());
//                                    pay.setTime4(payed.getTime4());
//                                    pay.setPriceOfTime4(payed.getPriceOfTime4());
//                                    pay.setTime5(payed.getTime5());
//                                    pay.setPriceofTime5(payed.getPriceofTime5());
//                                    pay.setTime3(TimeSent);
//                                    if (checkforMulti == true) {
//                                        pay.setPriceOfTime3(timeforCalc * MultiPrice);
//                                        writer.append("\tMulti:\n\n\t\tTime 3: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice));
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 3: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
//                                    } else {
//                                        pay.setPriceOfTime3(timeforCalc * SinglePrice);
//                                        writer.append("\tSingle:\n\n\t\tTime 3: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "\n");
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 3: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
//                                    }
//                                } else if (payed.getTime4().equals("0")) {
//                                    pay.setTime1(payed.getTime1());
//                                    pay.setPriceofTime1(payed.getPriceofTime1());
//                                    pay.setTime2(payed.getTime2());
//                                    pay.setPriceOfTime2(payed.getPriceOfTime2());
//                                    pay.setTime3(payed.getTime3());
//                                    pay.setPriceOfTime3(payed.getPriceOfTime3());
//                                    pay.setTime4(payed.getTime4());
//                                    pay.setPriceOfTime4(payed.getPriceOfTime4());
//                                    pay.setTime5(payed.getTime5());
//                                    pay.setPriceofTime5(payed.getPriceofTime5());
//                                    pay.setTime4(TimeSent);
//                                    if (checkforMulti == true) {
//                                        pay.setPriceOfTime4(timeforCalc * MultiPrice);
//                                        writer.append("\tMulti:\n\n\t\tTime 4: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "\n");
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 4: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
//                                    } else {
//                                        pay.setPriceOfTime4(timeforCalc * SinglePrice);
//                                        writer.append("\tSingle:\n\n\t\tTime 4: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "\n");
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 4: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
//                                    }
//                                } else if (payed.getTime5().equals("0")) {
//                                    pay.setTime1(payed.getTime1());
//                                    pay.setPriceofTime1(payed.getPriceofTime1());
//                                    pay.setTime2(payed.getTime2());
//                                    pay.setPriceOfTime2(payed.getPriceOfTime2());
//                                    pay.setTime3(payed.getTime3());
//                                    pay.setPriceOfTime3(payed.getPriceOfTime3());
//                                    pay.setTime4(payed.getTime4());
//                                    pay.setPriceOfTime4(payed.getPriceOfTime4());
//                                    pay.setTime5(TimeSent);
//                                    if (checkforMulti == true) {
//                                        writer.append("\tMulti:\n\n\t\tTime 5: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice));
//                                        pay.setPriceofTime5(timeforCalc * MultiPrice);
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 5: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
//                                    } else {
//                                        pay.setPriceofTime5(timeforCalc * SinglePrice);
//                                        writer.append("\tSingle:\n\n\t\tTime 5: " + TimeSent + "\t التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "\n");
////                                           JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 5: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
//                                    }
//                                } else {
//                                    pay.setTime1(payed.getTime1());
//                                    pay.setPriceofTime1(payed.getPriceofTime1());
//                                    pay.setTime2(payed.getTime2());
//                                    pay.setPriceOfTime2(payed.getPriceOfTime2());
//                                    pay.setTime3(payed.getTime3());
//                                    pay.setPriceOfTime3(payed.getPriceOfTime3());
//                                    pay.setTime4(payed.getTime4());
//                                    pay.setPriceOfTime4(payed.getPriceOfTime4());
//                                    pay.setTime5(payed.getTime5());
//                                    pay.setPriceofTime5(payed.getPriceofTime5());
//                                }
//                                paymentdevicesCruds.UpdatePaymentForTimes(pay, ids);
//                                writer.close();
//                            }
//                                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
//                                String startTime1 = Date[i].substring(11, 22);  //2023-06-24 09:17:23 AM
//                                paymentDevicesModel pay2 = new paymentDevicesModel();
//                                pay2.setStartTime(startTime1);
//                                float sumofPriceAll = 0;
//                               
//                                String TotalPriceDevid;
//                                ArrayList<Float> list2= paymentdevicesCruds.getAllTimePrice(ids);
//                                for (int x = 0; x< list2.size(); x++) {
//                                    sumofPriceAll += list2.get(i);
//                                }
//
//                                pay2.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
//                                if (multi[i].isSelected()) {
//                                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
//                                    String minutes2= "";
//                                    double minutesf = 0;
//                                    float hours2= Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
//                                    if (TotalPriceDevid.length() >= 4) {
//                                        minutes2 = TotalPriceDevid.charAt(2) + "" + TotalPriceDevid.charAt(3);
//                                        minutesf = Float.parseFloat(minutes2);
//                                        if (minutesf <= 15) {
//                                            pay2.setAllTime(String.valueOf(hours2));
//                                        }
//                                        if (minutesf > 15 && minutesf <= 25) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.15));
//                                        }
//                                        if (minutesf > 25 && minutesf <= 35) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.2) + "0");
//                                        }
//                                        if (minutesf > 35 && minutesf <= 50) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.25));
//                                        }
//                                        if (minutesf > 50 && minutesf <= 65) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.3) + "0");
//                                        }
//                                        if (minutesf > 65 && minutesf <= 80) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.45));
//                                        }
//                                        if (minutesf > 80 && minutesf <= 90) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.5) + "0");
//                                        }
//                                        if (minutesf > 90 && minutesf <= 99) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 1));
//                                        }
//                                    } else if (TotalPriceDevid.length() == 1) {
//                                        pay2.setAllTime(String.valueOf(hours2));
//                                    } else if (TotalPriceDevid.length() == 3) {
//                                        minutes2 = TotalPriceDevid.charAt(2) + "";
//                                        minutesf = Float.parseFloat(minutes2);
//                                        if (minutesf == 0) {
//                                            pay2.setAllTime(String.valueOf(hours2));
//                                        }
//                                        if (minutesf == 1) {
//                                            pay2.setAllTime(String.valueOf(hours2));
//                                        }
//                                        if (minutesf == 2) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.1) + "0");
//                                        }
//                                        if (minutesf == 3) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.2) + "0");
//                                        }
//                                        if (minutesf == 4) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.25));
//                                        }
//                                        if (minutesf == 5) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.3) + "0");
//                                        }
//                                        if (minutesf == 6) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.4) + "0");
//                                        }
//                                        if (minutesf == 7) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.45));
//                                        }
//                                        if (minutesf == 8) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.5) + "0");
//                                        }
//                                        if (minutesf == 9) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 1));
//                                        }
//
//                                    }
//                                } else {
//                                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
//                                    String minutes2;
//                                    float minutesf = 0;
//                                    float hours2= Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
//                                    if (TotalPriceDevid.length() >= 4) {
//                                        minutes2 = TotalPriceDevid.charAt(2) + "" + TotalPriceDevid.charAt(3);
//                                        minutesf= Float.parseFloat(minutes2);
//                                        if (minutesf <= 15) {
//                                            pay2.setAllTime(String.valueOf(hours2));
//                                        }
//                                        if (minutesf > 15 && minutesf <= 25) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.15));
//                                        }
//                                        if (minutesf > 25 && minutesf <= 35) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.2) + "0");
//                                        }
//                                        if (minutesf > 35 && minutesf <= 50) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.25));
//                                        }
//                                        if (minutesf > 50 && minutesf <= 65) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.4) + "0");
//                                        }
//                                        if (minutesf > 65 && minutesf <= 80) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.45));
//                                        }
//                                        if (minutesf > 80 && minutesf <= 90) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.5) + "0");
//                                        }
//                                        if (minutesf > 90 && minutesf <= 99) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 1));
//                                        }
//                                    } else if (TotalPriceDevid.length() == 1) {
//                                        pay2.setAllTime(String.valueOf(hours2));
//                                    } else if (TotalPriceDevid.length() == 3) {
//                                        minutes2 = TotalPriceDevid.charAt(2) + "";
//                                        minutesf = Float.parseFloat(minutes2);
//                                        if (minutesf == 0) {
//                                            pay2.setAllTime(String.valueOf(hours2));
//                                        }
//                                        if (minutesf == 1) {
//                                            pay2.setAllTime(String.valueOf(hours2));
//                                        }
//                                        if (minutesf == 2) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.1) + "0");
//                                        }
//                                        if (minutesf == 3) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.2) + "0");
//                                        }
//                                        if (minutesf == 4) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.25));
//                                        }
//                                        if (minutesf == 5) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.3) + "0");
//
//                                        }
//                                        if (minutesf == 6) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.4) + "0");
//                                        }
//                                        if (minutesf == 7) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.45));
//                                        }
//                                        if (minutesf == 8) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 0.5) + "0");
//                                        }
//                                        if (minutesf == 9) {
//                                            pay2.setAllTime(String.valueOf(hours2 + 1));
//                                        }
//                                    }
//                                }
//                                prductPaymentCruds.updatePaymentProductsWithDate(1, "PS "+(i+1), Date[i]);
//                                 Date[i] = df.format(new Date());
//                                String EndTime1 = Date[i].substring(11, 22);
//                                pay2.setEndTime(EndTime1);
//                                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
//                                // the second part of this function is 
//                                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay2, ids);
//                                ArrayList<paymentDevicesModel> list1;
//                                ArrayList<paymentDevicesModel> listSecond;
//                                 
//                                if (txtSecond[i].isSelected()) {
//                                    if (multi[i].isSelected()) {
//                                        list1 = paymentdevicesCruds.getAllRecordsForRealTime("PS "+(i+1), EndTime1, "Multi");
//                                        listSecond=paymentdevicesCruds.getAllrecordsForSecondTime("PS "+(i+1), EndTime1, "Multi");
//                                    } else {
//                                        list1 = paymentdevicesCruds.getAllRecordsForRealTime("PS "+(i+1), EndTime1, "Single");
//                                        listSecond=paymentdevicesCruds.getAllrecordsForSecondTime("PS "+(i+1), EndTime1, "Single");
//                                    }
//                                     Iterator<paymentDevicesModel> itrss=list1.iterator();
//                                     Iterator<paymentDevicesModel> itrsss=listSecond.iterator();
//                                     while(itrss.hasNext())
//                                     {
//                                         paymentDevicesModel devpay=itrss.next();
//                                         writer.append("\t\t"+devpay.getHoursType()+":\t"+devpay.getAllTime()+"\tTOTAL: "+devpay.getTotalPrice()+"\n");
//                                     }
//                                      while(itrsss.hasNext())
//                                     {
//                                         paymentDevicesModel devpay=itrsss.next();
//                                         writer.append("\t\t"+devpay.getHoursType()+":\t"+devpay.getAllTime()+"\tTOTAL: "+devpay.getTotalPrice()+"\n");
//                                     }
//                                }
//                                 else {
//                                    if (multi[i].isSelected()) {
//                                        list1 = paymentdevicesCruds.getAllRecordsForRealTime("PS "+(i+1), EndTime1, "Multi");
//                                    } else {
//                                        list1 = paymentdevicesCruds.getAllRecordsForRealTime("PS "+(i+1), EndTime1, "Single");
//                                    }
//                                     Iterator<paymentDevicesModel> itrss=list1.iterator();
//                                    while(itrss.hasNext())
//                                     {
//                                         paymentDevicesModel devpay=itrss.next();
//                                         writer.append("\t\t"+devpay.getHoursType()+":\t"+devpay.getAllTime()+"\tTOTAL: "+Math.round(devpay.getTotalPrice())+"\n");
//                                     }
//                                }
//                                   ArrayList<paymentProductModel>list1=paymentdevicesCruds.getRecordsofDrinksWithDevicenameandDate(DeviceNameLabel.getText(),txtStartTime.getText());
//              Iterator<paymentProductModel>itr1=list1.iterator();
//              ArrayList<paymentProductModel>list2;
//               Iterator<paymentProductModel>itr2 = null;
//              if(!txtID2.getText().equals("0"))
//              {
//                list2=paymentdevicesCruds.getRecordsofDrinksWithDevicenameandDate(DeviceNameLabel.getText(),txtStartTime2.getText());
//               itr2=list2.iterator();
//         while(itr1.hasNext()&&itr2.hasNext())
//          {
//              paymentProductModel paypro=itr1.next();
//              paymentProductModel paypro2=itr2.next();
//              if(paypro.getProductname().equals(paypro2.getProductname()))
//              {
//                   dtm.addRow(new Object[]{
//                  paypro.getProductname(),
//                  paypro.getProductprice(),
//                  paypro.getQuantityneeded()+paypro2.getQuantityneeded(),
//                  paypro.getPriceofTaken()+paypro2.getPriceofTaken()
//              });
//              }else      
//              {
//                    dtm.addRow(new Object[]{
//                  paypro.getProductname(),
//                  paypro.getProductprice(),
//                  paypro.getQuantityneeded(),
//                  paypro.getPriceofTaken()
//              });  dtm.addRow(new Object[]{
//                  paypro2.getProductname(),
//                  paypro2.getProductprice(),
//                  paypro2.getQuantityneeded(),
//                  paypro2.getPriceofTaken()
//              });
//              }
//          }
//                     while(itr1.hasNext())
//          {
//              paymentProductModel paypro=itr1.next();
//              DeviceNameLabel.setText(paypro.getDeviceName());
//              dtm.addRow(new Object[]{
//                  paypro.getProductname(),
//                  paypro.getProductprice(),
//                  paypro.getQuantityneeded(),
//                  paypro.getPriceofTaken()
//              });
//          }
//             while(itr2.hasNext())
//            {
//                paymentProductModel paypro2=itr2.next();
//                DeviceNameLabel.setText(paypro2.getDeviceName());
//                dtm.addRow(new Object[]{
//                    paypro2.getProductname(),
//                    paypro2.getProductprice(),
//                    paypro2.getQuantityneeded(),
//                    paypro2.getPriceofTaken()
//                });
//            }
//              }else{
//                       while(itr1.hasNext())
//          {
//              paymentProductModel paypro=itr1.next();
//              DeviceNameLabel.setText(paypro.getDeviceName());
//              dtm.addRow(new Object[]{
//                  paypro.getProductname(),
//                  paypro.getProductprice(),
//                  paypro.getQuantityneeded(),
//                  paypro.getPriceofTaken()
//              });
//          }
//              }
//        
//                                //Check on payPro if null
                            id[i].setText("0");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                    }
                }

            } catch (Exception e) {

            }

        } catch (Exception e) {

        }
    }

}
