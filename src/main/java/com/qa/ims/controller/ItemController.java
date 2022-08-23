package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = LogManager.getLogger();
	
	private ItemDAO itemDAO;
	private Utils utils;
	
	public ItemController(ItemDAO itemDAO, Utils utils) {
		this.itemDAO = itemDAO;
		this.utils = utils;
	}

	@Override
	public List<Item> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item create() {
		LOGGER.info("Please enter an item name");
		String name = utils.getString();
		LOGGER.info("Please enter a price, input should be numerical without symbols");
		double price = utils.getDouble();
		LOGGER.info("Please enter how many are in stock");
		long stock = utils.getLong();
		Item item = itemDAO.create(new Item(name, price, stock));
		LOGGER.info("Item created");
		return item;
	}

	@Override
	public Item update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}


}