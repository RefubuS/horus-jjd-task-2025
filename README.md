## FileCabinet
Prosta implementacja systemu katalogów w Javie z obsługą folderów zagnieżdżonych `MultiFolder`.

## Funkcjonalności
- Wyszukiwanie folderu po nazwie `findFolderByName`.
- Wyszukiwanie wszystkich folderów o określonym rozmiarze `findFoldersBySize`.
- Liczenie wszystkich folderów w strukturze `count`.
- Obsługa zagnieżdżonych katalogów.
- Jedna metoda rekurencyjna `traverseFolders`, pozwalająca unikać powielania kodu.