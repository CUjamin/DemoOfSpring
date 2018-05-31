package cuj.basic.demo;

import org.springframework.stereotype.Service;


//@Repository("car")
@Service
public class Car {
	private String brand;
	private String price;

	//@PostConstruct初始化注释方法验证完毕
//	public void init()
//	{
//		this.brand="红旗 CA72";
//		this.price="2000";
//	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
