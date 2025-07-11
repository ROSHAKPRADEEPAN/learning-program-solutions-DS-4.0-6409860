package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
    public static void main(String[] args) {
        LOGGER.info("START of main()");
        displayCountry();
        LOGGER.info("END of main()");
    }
    public static void displayCountry() {
        LOGGER.info("START of displayCountry()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country1 = context.getBean("country1", Country.class);
        Country country2 = context.getBean("country2", Country.class);
        LOGGER.debug("Country : {}", country1.toString());
        LOGGER.debug("Country : {}", country2.toString());
        LOGGER.info("END of displayCountry()");
    }
}
