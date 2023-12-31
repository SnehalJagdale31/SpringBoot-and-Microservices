package in.snehalJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.snehalJ.entity.Book;
import in.snehalJ.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository bookRepo = context.getBean(BookRepository.class);
		
		Book b = new Book();
		b.setBookId(101);
		b.setBookName("Java");
    	b.setBookPrice(1200.50);
    	
    	b.setBookId(102);
		b.setBookName("aws");
    	b.setBookPrice(13.50);
		
    	bookRepo.save(b);
		
	}

}
