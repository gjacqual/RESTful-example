package com.maxfilin.learning.rest_example.service;

import com.maxfilin.learning.rest_example.model.Client;

import java.util.List;

public interface ClientService {
	void create(Client client);
	List<Client> readAll();
	Client read(int id);
	boolean update(Client client, int id);
	boolean delete(int id);
}
