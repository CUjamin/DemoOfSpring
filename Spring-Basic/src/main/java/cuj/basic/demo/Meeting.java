package cuj.basic.demo;


import org.springframework.stereotype.Repository;

@Repository("meeting")
public class Meeting {
	
	private String boss_car_brand;
	
	private String boss_car_price;
	
	private String boss_officeNo;
	public void start(Boss boss)
	{
		boss_car_brand=boss.getCar().getBrand();
		boss_car_price=boss.getCar().getPrice();
		boss_officeNo=boss.getOffice().getOfficeNo();
		System.out.println("boss_car_brand="+boss_car_brand);
		System.out.println("boss_car_price="+boss_car_price);
		System.out.println("boss_officeNo="+boss_officeNo);
		
	}
}
