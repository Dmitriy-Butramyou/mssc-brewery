package home.production.msscbrewery.services;

import home.production.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerById(UUID id) {
    return CustomerDto.builder()
            .id(UUID.randomUUID())
            .name("Joe Buck")
            .build();
  }
}
