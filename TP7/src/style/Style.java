package style;

public enum Style
{
	GRAS("b"), ITALIQUE("i"), EXPOSANT("sup");

	private final String code;

	private Style(String code)
	{
		this.code = code;
	}

	@Override
	public String toString()
	{
		return this.code;
	}
}
