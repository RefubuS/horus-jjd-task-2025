import java.util.List;

public class Main {
    public static void main(String[] args) {
        Folder folder1 = new FolderImpl("Downloads", "SMALL");
        Folder folder2 = new FolderImpl("Photos", "MEDIUM");
        Folder folder3 = new FolderImpl("Music", "LARGE");

        MultiFolder projects = new MultiFolderImpl("Projects", "LARGE", List.of(
                new FolderImpl("Java", "LARGE"),
                new FolderImpl("Python", "MEDIUM")
        ));

        MultiFolder archive = new MultiFolderImpl("Archive", "LARGE", List.of(
                folder1,
                folder2,
                projects
        ));

        FileCabinet fileCabinet = new FileCabinet(List.of(
                folder3,
                archive
        ));

        // Testy
        System.out.println("count() = " + fileCabinet.count());
        System.out.println("findFolderByName('Python') = " + fileCabinet.findFolderByName("Python"));
        System.out.println("findFoldersBySize('SMALL') = " + fileCabinet.findFoldersBySize("SMALL"));
    }
}
