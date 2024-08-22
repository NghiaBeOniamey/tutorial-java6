package com.example.demo;

import com.example.demo.entity.LanAnh;
import com.example.demo.entity.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Configuration
@Service
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);

        // ApplicationContext chính là container, chứa toàn bộ các Bean
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.

        // Lấy Bean ra bằng cách
        Outfit outfit = context.getBean(Outfit.class);

        // In ra để xem thử nó là gì
        System.out.println("Instance: " + outfit);
        // xài hàm wear()
        outfit.wear();

        // Lấy Bean ra bằng cách
        LanAnh lanAnh = context.getBean(LanAnh.class);

        // In ra để xem thử nó là gì
        System.out.println("Instance: " + lanAnh);
        // xài hàm wear()
        lanAnh.getStudy().studyEnglish();
    }

}
