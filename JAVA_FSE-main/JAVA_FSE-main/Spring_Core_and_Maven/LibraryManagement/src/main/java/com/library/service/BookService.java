package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookService {

  @Autowired
  //Constructor Injection
  private final BookRepository bookRepository;
  public BookService(BookRepository bookRepository){
      this.bookRepository=bookRepository;
  }

  /*
  //Setter injection
  private BookRepository bookRepository;
  @Autowired

//          *The autowierd is used for wiring instead of doing that manually like
//          *
//          * <bean id="bookService" class="com.library.service.BookService">
//          <property name="bookRepository" ref="bookRepository"/>
//          * </bean>
//          *
//          * Since these lines are removed from the applicationContext and replaced by context we should
//          * use this stereotype annotation.
//          *
    public void setBookRepository(BookRepository bookRepository){
       this.bookRepository=bookRepository;
    }
*/


/*
* Using the beans in the application contest which we have created for service object will be created
* automatically. On seeing the beans the application context uses the setter injection. If we create a parameterized
* constructor then it will give error like "deault constructor not found".
* */
    public void add(String title){
        bookRepository.save(title);
    }
}
