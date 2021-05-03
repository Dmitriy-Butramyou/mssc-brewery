package home.production.msscbrewery.web.mappers;

import home.production.msscbrewery.domain.Customer;
import home.production.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

  Customer customerDtoToCustomer(CustomerDto dto);

  CustomerDto customerToCustomerDto(Customer customer);
}
