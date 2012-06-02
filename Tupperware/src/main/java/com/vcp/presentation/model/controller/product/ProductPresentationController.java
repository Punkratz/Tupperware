package com.vcp.presentation.model.controller.product;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.vcp.presentation.model.controller.PresentationController;
import com.vcp.user.model.beans.Product;


@ManagedBean
@SessionScoped
public class ProductPresentationController extends PresentationController<Product>
{
	@PostConstruct
	public void initialize()
	{
		IDENTIFIER = "Product";
		setDataList(userModel.getProducts());
		setClazz(Product.class);
	}
}
