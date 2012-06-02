package com.vcp.presentation.model.controller.order;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.vcp.presentation.model.controller.PresentationController;
import com.vcp.user.model.beans.Order;


@ManagedBean
@SessionScoped
public class OrderPresentationController extends PresentationController<Order>
{
	@PostConstruct
	public void initialize()
	{
		IDENTIFIER = "Order";
		setDataList(userModel.getOrders());
		setClazz(Order.class);
	}
}
