package hamzadabaghi.testingdemo;

import org.springframework.boot.SpringApplication;

public class TestTestingDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(TestingDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
