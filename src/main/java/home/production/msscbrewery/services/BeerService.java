package home.production.msscbrewery.services;

import home.production.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
  BeerDto getBeerById(UUID beerId);
}
