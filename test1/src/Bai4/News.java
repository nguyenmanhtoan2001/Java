package Bai4;
import java.util.Scanner;
import java.util.ArrayList;
public class News implements INews{
	private int id;
	Scanner sc = new Scanner(System.in);
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}
	public void Input() {
		System.out.println("Title:");
		title = sc.nextLine();
		System.out.println("PublishDate:");
		publishDate = sc.nextLine();
		System.out.println("Author:");
		author = sc.nextLine();
		System.out.println("Content:");
		content = sc.nextLine();
	}
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	
	public void display() {
		System.out.printf("Title:%s\nPublishDate:%s\nAuthor:%s\nContent:%s\nAverageRate:%.2f\n",title,publishDate,author,content,averageRate);
	}
	public static int rateList[] = new int[3];
	public void calculate() {
		int d = 0;
		for(int i=0;i<3;i++) {
			d+= rateList[i];
		}
		averageRate = d/3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<News> list = new ArrayList<News>();
		int choose = 0;
		do {
			System.out.println("1 - Insert news");
			System.out.println("2 - View list news");
			System.out.println("3 - Average rate");
			System.out.println("4 - Exit");
			int c = sc.nextInt();
			switch(c) {
			case 1:
				News n = new News();
				n.Input();
				for(int i=0;i<3;i++) {
					System.out.println("Nhap diem thu"+(i+1)+":");
					rateList[i] = sc.nextInt();
				}
				list.add(n);
				break;
			case 2:
				for(News item : list) {
					item.display();
				}
				break;
			case 3:
				for(News item : list) {
					item.calculate();
					item.display();
				}
				break;
			case 4:
				return;
			}
			
		}while(choose!=4);
	}
}
