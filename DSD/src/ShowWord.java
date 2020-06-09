
public class ShowWord {
	Word word = new Word(); // word, meaning, isBookmark가 들어있는
							// 클래스

	boolean bookMark(Word word) {

		if (word.isBookmark == false) {
			word.isBookmark = true;
			return true;
		} else {
			word.isBookmark = false;
			return false;
		}
	}
}
