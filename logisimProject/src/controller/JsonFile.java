package controller;

public class JsonFile {
	private final int id;
    private final boolean valid;

    public JsonFile(int id, boolean valid) {
        this.id = id;
        this.valid = valid;
    }

    public long getId() {
        return id;
    }

    public boolean getContent() {
        return valid;
    }
}
