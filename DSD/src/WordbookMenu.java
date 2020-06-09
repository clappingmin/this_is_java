import java.util.Scanner;

public class WordbookMenu {

	int wordbookmenu;
	Wordbook ElementaryEng = new Wordbook();
	Wordbook SecondaryEng = new Wordbook();
	Wordbook HigherEng = new Wordbook();
	Wordbook TOEICEng = new Wordbook();

	public int getWordbookmenu() {
		return wordbookmenu;
	}

	public void setWordbookmenu(int wordbookmenu) {
		this.wordbookmenu = wordbookmenu;
	}

	void viewWordbook(int wordbookmenu) {
		// 사용자가 선택한 영어 단어장을 보여주는 method
		switch (wordbookmenu) {
		case 1:
			ElementaryEng shows words.
			break;
		case 2:
			SecondaryEng shows words.
			break;
		case 3:
			HigherEng shows words.
			break;
		case 4:
			TOEICEng shows words.
			break;
			
		}
	}
}
