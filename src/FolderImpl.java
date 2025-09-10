public class FolderImpl implements Folder {
    private final String name;
    private final String size;

    public FolderImpl(String name, String size) {
        this.name = name;
        this.size = size;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "FolderImpl{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
