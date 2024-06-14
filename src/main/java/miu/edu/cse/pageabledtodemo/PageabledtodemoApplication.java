package miu.edu.cse.pageabledtodemo;

import lombok.RequiredArgsConstructor;
import miu.edu.cse.pageabledtodemo.dto.BookRequestDto;
import miu.edu.cse.pageabledtodemo.dto.BookResponseDto;
import miu.edu.cse.pageabledtodemo.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class PageabledtodemoApplication implements CommandLineRunner {

    private final BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(PageabledtodemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
