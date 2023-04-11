package com.example.junitexample;

import com.example.junitexample.entity.User;
import    org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class JunitExampleApplicationTests {


    @Test
    void testObject(){
       User user=new User("ram","pune");
       assertThat(user.getName().equals("ram"));
        assertThat(user.getCity()).as("city").isEqualTo("pune");

    }
}
