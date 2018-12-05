package hello.model;

public class ResponseWrapper {

	private String word;
	private boolean isPalindrome;
	private boolean isAnagramOfPalindrome;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public boolean isPalindrome() {
		return isPalindrome;
	}
	public void setPalindrome(boolean isPalindrome) {
		this.isPalindrome = isPalindrome;
	}
	public boolean isAnagramOfPalindrome() {
		return isAnagramOfPalindrome;
	}
	public void setAnagramOfPalindrome(boolean isAnagramOfPalindrome) {
		this.isAnagramOfPalindrome = isAnagramOfPalindrome;
	}
	@Override
	public String toString() {
		return "ResponseWrapper [word=" + word + ", isPalindrome=" + isPalindrome + ", isAnagramOfPalindrome="
				+ isAnagramOfPalindrome + "]";
	}
}
