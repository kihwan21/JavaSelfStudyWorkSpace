public class kkh_10_java {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public kkh_10_java(){
	}
	public kkh_10_java(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year+"년"+country+"국적의"+artist+"가 부른"+title);
	}
	public static void main(String[] args) {
		kkh_10_java music = new kkh_10_java("Dancing Queen","ABBA",1978,"스웨덴");
		music.show();
	}
}