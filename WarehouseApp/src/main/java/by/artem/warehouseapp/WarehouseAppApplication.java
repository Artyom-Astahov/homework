package by.artem.warehouseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WarehouseAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseAppApplication.class, args);
    }

}
