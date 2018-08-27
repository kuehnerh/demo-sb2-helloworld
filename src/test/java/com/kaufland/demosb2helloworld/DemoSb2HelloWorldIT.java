package com.kaufland.demosb2helloworld;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoSb2HelloworldApplication.class)
public class DemoSb2HelloWorldIT {

    @Test
    public void delete() {
        assertEquals(true, true);

    }
}
