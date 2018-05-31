package cuj.basic.demo;

import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {
	//@RequestMapping(value="/customer_input")
	public String inputCustomer()
	{
		return "CustomerForm";
	}

}
