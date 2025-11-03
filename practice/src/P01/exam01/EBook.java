package P01.exam01;

public class EBook extends Book {
	private int fileSize;

	public EBook() {
		super();
	}
	
	public EBook(String title, String author, int price, int fileSize) {
		super(title, author, price);
		this.fileSize = fileSize;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("파일크기: " + fileSize + "MB");
	}

}
