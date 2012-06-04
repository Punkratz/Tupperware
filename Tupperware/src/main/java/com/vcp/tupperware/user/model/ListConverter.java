package com.vcp.tupperware.user.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.faces.model.SelectItem;


public class ListConverter
{
	public Collection<SelectItem> convertListToSelectItems(Collection<?> data)
	{
		List<SelectItem> result = new ArrayList<SelectItem>();
		for (Object bean : data)
		{
			result.add(new SelectItem(bean));
		}
		return result;
	}
}
