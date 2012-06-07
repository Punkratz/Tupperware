package com.vcp.tupperware.services.info;

import java.util.Set;
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
		Set<OrderUnit> orderUnits = order.getOrderUnits();
		int i = 0;
		for (OrderUnit orderUnit : orderUnits)
		{
			if (i++ < MAX_ITEM_LENGHT)
			{
				result.append(orderUnit.toString() + SEPERATOR);
			}
			else
			{
				break;
			}
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

	private double sumSalesVolume(Iterable<OrderUnit> orderUnits)
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
		return orderUnit.getProduct().getPrice() * orderUnit.getQuantity();
	}
}
