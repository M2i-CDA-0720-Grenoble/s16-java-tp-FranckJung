public enum Couleur
{
    Rouge('R',0),
    Vert('V', 1),
    Bleu('B', 2),
    Jaune('J', 3),
    Cyan('C', 4),
    Magenta('M', 5);

    private char name;
    private int code;

    private Couleur(char name, int code)
    {
        this.name = name;
        this.code = code;
    }

    public char getName() {
		return name;
	}

	public int getCode() {
		return code;
	}


}
