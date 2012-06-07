package com.vcp.tupperware.provider.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.vcp.tupperware.user.model.UserModel;


@ManagedBean
@SessionScoped
public class ModelProvider
{
	@PersistenceContext
	private EntityManager entityManager;
	private UserModel model = new UserModel();

	public UserModel getModel()
	{
		return model;
	}
}
