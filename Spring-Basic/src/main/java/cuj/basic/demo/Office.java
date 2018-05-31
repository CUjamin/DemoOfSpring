package cuj.basic.demo;

import org.springframework.stereotype.Service;

//@Repository("office")
@Service
public class Office {
	private String officeNo;

	//@PostConstruct初始化注释方法验证完毕
//	public void init()
//	{
//		this.officeNo="002";
//	}
	public String getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}
	

}
