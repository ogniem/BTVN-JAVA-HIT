package bai3;

public class Guns {
      private String weaponName;
      private int ammoNumber;
      public void Load(int x) {
    	  this.ammoNumber += x;
      }
      public void Shoot(int x) {
    	  if(ammoNumber -x >= 0)
    		  this.ammoNumber -= x;
    	  else
    		  System.out.println("het dan");
    		
      }
      public void setweaponName(String weaponName) {
    	  this.weaponName= weaponName;
      }
      public void setammoNumber(int ammoNumber) {
    	  this.ammoNumber= ammoNumber;
      }
      public String getweaponName() {
    	  return weaponName;
      }
      public int getammoNumber() {
    	  return ammoNumber;
      }
	
}
