package com.te.ecommerspring.service;

import java.util.List;

import com.te.ecommerspring.beans.ItemBean;

public interface AdminService {
	public ItemBean getEmpData(Integer aid);

	public boolean addItem(ItemBean Bean);

	public boolean updateItem(ItemBean infoBean);

	public boolean deleteItem(Integer id);

	public List<ItemBean> getAllEmployeeDetails();
}