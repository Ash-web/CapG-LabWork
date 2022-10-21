package lab4;

import java.util.Set;

abstract class Item{
	private void data() {
	int IdNum;
	String title;
	int NumCopies;
	}
public Item() {
	// TODO Auto-generated constructor stub
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
private void checkIn() {
	// TODO Auto-generated method stub

}
private void checkOut() {
	// TODO Auto-generated method stub

}
private void additem() {
	// TODO Auto-generated method stub

}
private void get() {
	// TODO Auto-generated method stub

}
private void set() {
	// TODO Auto-generated method stub

}
	
}
abstract class WrittenItem extends Item{
	
}
class Book extends WrittenItem{
	String name;
	
	
}
class JournalPaper extends WrittenItem{
	private void YearPublished() {
		int yp;
	}
}
abstract class MediaItem extends Item{
	
}
class Video extends MediaItem{
	private void Vdata() {
		String director,genre;
		int yearReleased;
	}
}
class CD extends MediaItem{
	private void Cdata(){
	String artist,genre;
}}
public class Ex3 {

}
