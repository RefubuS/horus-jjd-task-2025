import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FileCabinet implements Cabinet {
    private final List<Folder> folders;

    public FileCabinet(List<Folder> folders) {
        this.folders = folders != null ? folders : new ArrayList<>();
    }

    @Override
    public Optional<Folder> findFolderByName(String name) {
        return traverseFolders(folders)
                .filter(folder -> folder.getName().equals(name))
                .findFirst();
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        return traverseFolders(folders)
                .filter(folder -> folder.getSize().equals(size))
                .toList();
    }

    @Override
    public int count() {
        return (int) traverseFolders(folders).count();
    }

    private Stream<Folder> traverseFolders(List<Folder> folders) {
        if (folders == null || folders.isEmpty()) {
            return Stream.empty();
        }
        return folders.stream().flatMap(folder -> {
            if (folder instanceof MultiFolder multiFolder) {
                return Stream.concat(
                        Stream.of(folder),
                        traverseFolders(multiFolder.getFolders())
                );
            } else {
                return Stream.of(folder);
            }
        });
    }
}
