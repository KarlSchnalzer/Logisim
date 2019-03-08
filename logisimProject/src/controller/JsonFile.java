package controller;

public class JsonFile {
	private final long id;
    private final boolean valid;

    public JsonFile(long id, boolean valid) {
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
