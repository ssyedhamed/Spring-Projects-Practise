package spring.di;

public class TextEditor {
	private SpellChecker spellChecker;
	private Grammer grammer;
	private int num;
	private int num2;
//	public TextEditor(SpellChecker spellChecker, Grammer grammer, int num,int num2) {
//		super();
//		System.out.println("inside text editor const");
//		this.spellChecker = spellChecker;
//		this.grammer=grammer;
//		this.num=num;
//		this.num2=num2;
//	}
	public void checkSpelling() {
		spellChecker.checker();
	}
	public void testGrammer() {
		grammer.tester();
		System.out.println("num : "+num);
		System.out.println("num2 : "+num2);
	}
	public SpellChecker getSpellChecker() {
		System.out.println(spellChecker);
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public Grammer getGrammer() {
		System.out.println(grammer);
		return grammer;
	}
	public void setGrammer(Grammer grammer) {
		this.grammer = grammer;
	}
	
}
