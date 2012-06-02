package com.vcp.presentation.model.controller;

import java.io.Serializable;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import com.vcp.presentation.model.PresentationModel;


/**
 * @author Punkratz
 * 
 * @param <E>
 */
@ManagedBean
public class PresentationController<E> extends PresentationModel implements Serializable
{
	public String IDENTIFIER = "Error";
	private Collection<E> dataList;
	private E bean;
	private Class<E> clazz;

	/**
	 * Gets called from the view to create a new E instance.
	 * 
	 * @return
	 */
	public String addBean()
	{
		try
		{
			setBean(clazz.newInstance());
		}
		catch (Exception ex)
		{
			logger.info("ERROR123");
			logger.info("Clazz = " + clazz);
			ex.printStackTrace();
		}
		return "add" + IDENTIFIER;
	}

	public String editBean(E bean)
	{
		setBean(bean);
		return "edit" + IDENTIFIER;
	}

	public String saveChanges()
	{
		if (!dataList.contains(bean))
		{
			dataList.add(bean);
		}
		return retunToMain();
	}

	public String resetChanges()
	{
		return retunToMain();
	}

	public String deleteBean(E bean)
	{
		dataList.remove(bean);
		return retunToMain();
	}

	private String retunToMain()
	{
		return IDENTIFIER.toLowerCase().concat("s");
	}

	public E getBean()
	{
		return bean;
	}

	public void setBean(E bean)
	{
		this.bean = bean;
	}

	public Collection<E> getDataList()
	{
		return dataList;
	}

	public void setDataList(Collection<E> dataList)
	{
		this.dataList = dataList;
	}

	public Class<E> getClazz()
	{
		return clazz;
	}

	public void setClazz(Class<E> clazz)
	{
		this.clazz = clazz;
	}
}
