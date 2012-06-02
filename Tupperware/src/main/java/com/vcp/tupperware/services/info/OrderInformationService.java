package com.vcp.tupperware.services.info;

import java.util.List;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import com.vcp.tupperware.user.model.beans.Order;
import com.vcp.tupperware.user.model.beans.OrderUnit;


@ManagedBean
@Stateless
public class OrderInformationService
{
	private static final String SEPERATOR = ", ";
	private static final int MAX_ITEM_LENGHT = 3;

	public String getOrdersUnitsListAsString(Order order)
	{
		StringBuilder result = new StringBuilder();
		List<OrderUnit> orderUnits = order.getOrderUnits();
		OrderUnit orderUnit = null;
		for (int i = 0; i < orderUnits.size() && i <= MAX_ITEM_LENGHT; i++)
		{
			orderUnit = orderUnits.get(i);
			result.append(orderUnit.getProduct().getName());
			result.append(SEPERATOR);
		}
		return result.toString().substring(0, result.toString().length() - SEPERATOR.length());
	}

	/**
	 * Returns the sales folume of the given {@link Order}.
	 * 
	 * @param order
	 * @return the sales volume.
	 */
	public double getSalesVolume(Order order)
	{
		return sumSalesVolume(order.getOrderUnits());
	}

	private double sumSalesVolume(List<OrderUnit> orderUnits)
	{
		double result = 0;
		for (OrderUnit orderUnit : orderUnits)
		{
			result += sumOrderUnitVolume(orderUnit);
		}
		return result;
	}

	private double sumOrderUnitVolume(OrderUnit orderUnit)
	{
		return orderUnit.getPrice() * orderUnit.getQuantity();
	}
}
