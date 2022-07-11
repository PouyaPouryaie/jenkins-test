package ir.bigz.jenkinstest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JenkinsTestApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(JenkinsTestApplicationTests.class);

    @Test
    contextLoads() {
        logger.info("Test case executing ...");
        logger.info("Test case run for first test ...");
        assertTrue(true);
    }

}
