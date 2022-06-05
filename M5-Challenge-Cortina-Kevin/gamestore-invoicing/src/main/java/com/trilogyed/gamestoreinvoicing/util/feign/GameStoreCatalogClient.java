package com.trilogyed.gamestoreinvoicing.util.feign;

import com.trilogyed.gamestoreinvoicing.model.Console;
import com.trilogyed.gamestoreinvoicing.model.Game;
import com.trilogyed.gamestoreinvoicing.model.TShirt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;


@FeignClient(name = "gamestore-catalog")
public interface GameStoreCatalogClient {


    @RequestMapping(value = "/console/{id}", method = RequestMethod.GET)
    public Optional<Console> getConsoleById(@PathVariable long id);

    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
    public Optional<Game> getGameById(@PathVariable long id);

    @RequestMapping(value = "/tshirt/{id}", method = RequestMethod.GET)
    public Optional<TShirt> getTShirtById(@PathVariable long id);

}


