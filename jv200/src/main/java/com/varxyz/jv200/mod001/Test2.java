package com.varxyz.jv200.mod001;

class Song {
	String songName;
	String songType;
	
	void set_song(String _songName, String _songType) {
		songName = _songName;
		songType = _songType;
	}
}

class Singer {
	String singer;
	Song song;	// 3번 밑에 hit song에 들어간 song이 여기에 들어감
	
	void set_singer(String _singer) {
		singer = _singer;
	}
	
	void hit_song(Song _song) {	// 2번 set_song에서 만들어진 메소드의 값이 hit_song 메소드에 파라미터로 들어감
		song = _song;
	}
	
	void print_singer() {
		System.out.println("가수이름: " + singer);
		System.out.println("노래제목: " + song.songName+"("+song.songType+")");
	}
	
}

public class Test2 {
	public static void main(String[] args) {
		Song song = new Song();
		song.set_song("가나다", "댄스");
		
		Singer singer = new Singer();
		singer.set_singer("에이비씨");
		singer.hit_song(song);	
		// 1번 song 객체에 set_song 메소드 값과 파라미터 값("가나다", "댄스")을 받아와 hit_song 안에 들어옴
		singer.print_singer();
		
	}
}
