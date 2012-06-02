package com.vcp.tupperware.presentation.model.controller.customer;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.vcp.tupperware.presentation.model.controller.PresentationController;
import com.vcp.tupperware.user.model.beans.Customer;


@ManagedBean
@SessionScoped
public class CustomerPresentationController extends PresentationController<Customer>
{
	@PostConstruct
	public void initialize()
	{
		IDENTIFIER = "Customer";
		setDataList(userModel.getCustomers());
		setClazz(Customer.class);
	}
}
