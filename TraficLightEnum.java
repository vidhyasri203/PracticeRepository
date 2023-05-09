package com.cg.day4;

public class TraficLightEnum {
enum TraficLightColor{
	RED,YELLOW,GREEN;
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TraficLightColor color=TraficLightColor.RED;
		while(true) {
			switch(color) {
			case RED:
				System.out.println("Stop");
				Thread.sleep(4000);
				color=TraficLightColor.YELLOW;
				break;
			case YELLOW:
				System.out.println("Wait");
				Thread.sleep(3000);
				color=TraficLightColor.GREEN;
				break;
			case GREEN:
				System.out.println("Go");
				Thread.sleep(2000);
				color=TraficLightColor.RED;
				break;
			default :
				System.out.println("Invalid input");
			}
		}
	}

}
