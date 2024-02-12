package dev.kilima.library.entity;

public class BookCount {

	private String title;

	private long count;

	public BookCount(String title, long count) {
		super();
		this.title = title;
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}
