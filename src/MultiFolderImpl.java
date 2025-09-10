import java.util.ArrayList;
import java.util.List;

public class MultiFolderImpl implements MultiFolder {
    private final String name;
    private final String size;
    private final ArrayList<Folder> folders;

    public MultiFolderImpl(String name, String size, ArrayList<Folder> folders) {
        this.name = name;
        this.size = size;
        this.folders = folders != null ? folders : new ArrayList<>();
    }

    @Override
    public List<Folder> getFolders() {
        return folders;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }
}
