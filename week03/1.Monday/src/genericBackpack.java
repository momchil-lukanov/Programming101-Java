
public class genericBackpack<T> {

	public T something;

	public genericBackpack(T something) {
		this.something = something;
	}

	public T getSomething() {
		return something;
	}

	public void setSomething(T something) {
		this.something = something;
	}

}
