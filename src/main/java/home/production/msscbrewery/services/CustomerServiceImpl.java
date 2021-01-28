package home.production.msscbrewery.services;

import home.production.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerById(UUID id) {
    return CustomerDto.builder()
            .id(UUID.randomUUID())
            .name("Joe Buck")
            .build();
  }

  @Override
  public CustomerDto saveNewCustomer(CustomerDto customerDto) {
    return CustomerDto.builder()
        .id(UUID.randomUUID())
        .build();
  }

  @Override
  public void updateCustomer(UUID customerId, CustomerDto customerDto) {
    log.debug("Update customer...");
  }

  @Override
  public void deleteById(UUID customerId) {
    log.debug("Deletion customer...");
  }
}
