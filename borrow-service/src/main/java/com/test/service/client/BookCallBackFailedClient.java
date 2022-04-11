package com.test.service.client;

import com.test.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookCallBackFailedClient implements BookClient{
    @Override
    public Book findBookById(int bid) {
        return new Book().setTitle("补救方案");
    }
}
