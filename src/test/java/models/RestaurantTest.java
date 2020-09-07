package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    Restaurant setUpNewRestaurant(){
        return new Restaurant("Mugg & Bean", "Levy Mall", "00100", "0977123456", "m&g.com", "mandg@gmail.com");
    }
    Restaurant setUpHalfRestaurant() {
        return new Restaurant("Mugg & Bean Drive Thru", "Kabulonga", "00100", "0955123456");
    }

    @Test
    public void instantiatesRestaurantCorrectlyWithCorrectName () throws Exception {
        Restaurant restaurant = setUpNewRestaurant();
        assertEquals("Mugg & Bean", restaurant.getName());
    }

    @Test
    public void instantiatesHalfRestaurantCorrectlyWithCorrectPhone () throws Exception {
        Restaurant restaurant = setUpHalfRestaurant();
        assertEquals("0955123456", restaurant.getPhone());
    }
    @Test
    public void setsRestaurantCorrectlyWithCorrectName () throws Exception {
        Restaurant restaurant = setUpNewRestaurant();
        restaurant.setName("Pizza Hut");
        assertNotEquals("Mugg & Bean", restaurant.getName());
    }

    @Test
    public void setsHalfRestaurantCorrectlyWithCorrectPhone () throws Exception {
        Restaurant restaurant = setUpHalfRestaurant();
        assertNotEquals("0977123456", restaurant.getPhone());
    }
}