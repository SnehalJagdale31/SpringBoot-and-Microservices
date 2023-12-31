package in.snehalJ.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

}
