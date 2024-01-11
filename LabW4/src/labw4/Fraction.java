/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw4;

/**
 *
 * @author kitti
 */
public class Fraction {
    public int btmN;
    public int topN;
    public void addFraction(Fraction f) {
        if (this.btmN == f.btmN){
            this.topN = this.topN + f.topN;
        }else{
            this.topN = (this.topN * f.btmN) + (f.topN * this.btmN);
            this.btmN = this.btmN * f.btmN;
        }
    }
    public String toFloat(){
        double fFraction = 0;
        fFraction = (topN + 0.0) / (btmN + 0.0);
        return Double.toString(fFraction);
    }
    public String toFraction(){
        String rFraction = "";
        rFraction =  topN + "/" + btmN;
        return rFraction;
    }
}
