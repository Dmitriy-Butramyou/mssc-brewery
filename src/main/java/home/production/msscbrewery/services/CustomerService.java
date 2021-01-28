package home.production.msscbrewery.services;

import home.production.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

  CustomerDto getCustomerById(UUID id);
}
