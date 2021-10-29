package bai3;

import java.util.Random;
public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		Guns DiepBeDe = new Guns();
		Guns DoanXinhGai = new Guns();
		DiepBeDe.setweaponName("M27");
		DiepBeDe.setammoNumber(100);
		DoanXinhGai.setweaponName("M14");
		DoanXinhGai.setammoNumber(100);
		
		while(DiepBeDe.getammoNumber() != 0 && DoanXinhGai.getammoNumber() != 0) {
			DiepBeDe.Shoot(rd.nextInt(11));
			DoanXinhGai.Shoot(rd.nextInt(11));
			
			if (DiepBeDe.getammoNumber() == 0 && DoanXinhGai.getammoNumber() == 0) {
                System.out.println("nap them dan");
                DiepBeDe.Load(rd.nextInt(11));
                DoanXinhGai.Load(rd.nextInt(11));
            }
           else {
                if (DiepBeDe.getammoNumber() == 0) {
                    System.out.println("DiepBeDe thua");
                    break;
                }
                else {
                    System.out.println("DoanXinhGai thua");
                    break;
                }
		}

	}

  }
}
