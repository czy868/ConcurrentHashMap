package com.czy;

import com.czy.deom.No1;
import com.czy.deom1.Main;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {


    @Test
    void contextLoads() {
        Main no1 = new Main();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                no1.device(i,j);
            }
        }
    }

}
