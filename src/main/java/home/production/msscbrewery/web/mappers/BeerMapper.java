package home.production.msscbrewery.web.mappers;

import home.production.msscbrewery.domain.Beer;
import home.production.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

  BeerDto beerToBeerDto(Beer beer);

  Beer beerDtoToBeer(BeerDto dto);
}
