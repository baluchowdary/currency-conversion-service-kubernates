package com.in28minutes.microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*@FeignClient(name="currency-exchange-service", url="localhost:8000" )*/


 
/*@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")*/

/*@FeignClient(name="currency-exchange-service")*/

//@FeignClient(name="currency-exchange-service", url="${currency-exchange-service_service_host:http://localhost}:8000")

 @FeignClient(name="currency-exchange-service", url="${CURRENCY_EXCHANGE_URI:http://localhost}:8000")

public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retriveExchangeValue(@PathVariable("from") String from, 
			@PathVariable("to") String to);	
}
