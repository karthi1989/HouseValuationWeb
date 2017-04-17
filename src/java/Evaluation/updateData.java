/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluation;

import Callback.INeuralNetworkCallback;
import Entity.Error;
import Entity.Result;
import NeuralNetwork.NeuralNetwork;
import Utils.DataUtils;
import static java.lang.System.out;

/**
 *
 * @author Karthi
 */
public class updateData {
    
 public static float price;
 public static float percentage;
 
    public void updateData(beanClass bean) {
    }
    
    public static void main(String[]args){
    
        beanClass Bean=new beanClass();

        int area2 = Bean.getArea2();
        int lsize2 = Bean.getLsize2();
        int lvalue2 = Bean.getLvalue2();
        int hsize2 = Bean.getHsize2();
        int stories2 = Bean.getStories2();
        int bed2 = Bean.getBed2();
        int bath2 = Bean.getBath2();
        int year2 = Bean.getYear2();
        int reno2 = Bean.getReno2();
        int highway2 = Bean.getHighway2();
        int mainrd2 = Bean.getMainrd2();
        int hos2 = Bean.getHos2();
        int col2 = Bean.getCol2();
        int supermarket2 = Bean.getSupermarket2();
        int scl2 = Bean.getScl2();
        int bus2 = Bean.getBus2();
        int wne2 = Bean.getWne2();
        int gar2 = Bean.getGar2();
        int cashcr2 = Bean.getCashcr2();
        int sec2 = Bean.getSec2();
        int garage2 = Bean.getGarage2();
        int ac2 = Bean.getAc2();
        int tiled2 = Bean.getTiled2();
        int citypoint2 = Bean.getCitypoint2();
        int frontal2 = Bean.getFrontal2();
        int bedroom2 = Bean.getBedroom2();
        int bathroom2 = Bean.getBathroom2();
        int kitchen2 = Bean.getKitchen2();
    
        int[][] x = DataUtils.readInputsFromFile("E:\\Final Project\\House\\info19.txt");
        float[] t = DataUtils.readOutputsFromFile("E:\\Final Project\\House\\price10.txt");
                  

        NeuralNetwork neuralNetwork = new NeuralNetwork(x, t, new INeuralNetworkCallback() {
            @Override
            public float success(Result result) {
                
                //int[] valueToPredict = new int[] {15,4,92,1,1,4,4,8,1,0,1,0,0,1,0,1,1,1,0,0,1,0,1,0,30,33,31,31}; 
                //int[] valueToPredict = new int[] {getArea(),getLsize(),getLvalue(),getHsize(),getStories(),getBed(),getBath(),getYear(),getReno(),getHighway(),getMainrd(),getHos(),getCol(),getSupermarket(),getScl(),getBus(),getWne(),getGar(),getCashcr(),getSec(),getGarage(),getAc(),getTiled(),getCitypoint(),getFrontal(),getBedroom(),getBathroom(),getKitchen()}; 
                int[] valueToPredict = new int[]{area2,lsize2,lvalue2,hsize2,stories2,bed2,bath2,year2,reno2,highway2,mainrd2,hos2,col2,supermarket2,scl2,bus2,wne2,gar2,cashcr2,sec2,garage2,ac2,tiled2,citypoint2,frontal2,bedroom2,bathroom2,kitchen2}; 
                out.println("Success percentage: " + result.getSuccessPercentage());
                //out.println("Predicted result: " + result.predictValue(valueToPredict));
                //out.print("<br/>");
                //out.println("Predicted price: " + result.predictValue(valueToPredict)*280);
                //out.print("<br/>");
                //System.out.println(getArea());
                percentage = result.getSuccessPercentage();
                return price = result.predictValue(valueToPredict)*280;
                //return price = area2;
                
            }

            @Override
            public void failure(Error error) {
                    out.println("Error: " + error.getDescription());
            }

        });

        neuralNetwork.startLearning();
        System.out.println("The Estimated Price is: " + price);
        out.println("The Success Percentage: " + percentage);
        //return price;
    }
    
         public String estPrice(){
            
            int sum = (int) price;
            String houseValue = Integer.toString(sum);
        return houseValue;
        
        }
                  
        public int testMain(){
            return (int) price;
        }
}
