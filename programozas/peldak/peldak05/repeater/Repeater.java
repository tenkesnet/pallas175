//  Repeater.java
public class Repeater {
	public String text = null;
	
	public void println(int times) {
		text = text.trim();
		// white space levagasa a szoveg elejerol es vegerol

		for (int i = 0; i < times; ++i) {
			System.out.println(text);
		}
	}
}
