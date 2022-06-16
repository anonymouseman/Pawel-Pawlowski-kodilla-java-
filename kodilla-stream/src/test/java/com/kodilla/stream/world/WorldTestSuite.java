package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        Country country1 = new Country("Poland", new BigDecimal("123456789"));
        Country country2 = new Country("German", new BigDecimal("100000000"));
        List<Country> polandList = new ArrayList<>();
        polandList.add(country1);
        List<Country> germanList = new ArrayList<>();
        germanList.add(country2);
        Continent poland = new Continent(polandList);
        Continent german = new Continent(germanList);
        List<Continent> worldList = new ArrayList<>();
        worldList.add(poland);
        worldList.add(german);
        World world = new World(worldList);
        //when
        BigDecimal peopleGermanyPoland = world.getPeopleQuantity();
        //then
        Assertions.assertEquals(new BigDecimal("223456789"), peopleGermanyPoland);
    }
}
