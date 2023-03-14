# OperacjeNaTablicach
Napisz program, w którym zaimplementujesz funkcjonalność zgodną z poniższym opisem.

Klasa Person przechowuje informacje pozwalające zidentyfikować osobę poprzez imię, nazwisko oraz PESEL. Każde z tych pól powinno być reprezentowane przez wartość typu String, a klasa powinna mieć zdefiniowane także metody equals() i toString() oraz konstruktor pozwalający ustawić wszystkie pola.

Klasa PersonDatabase reprezentuje prostą bazę danych służącą do przechowywania informacji o osobach. Powinna przechowywać informacje w tablicy typu Person[] i posiadać metody:

    add(Person p) - dodaje nową osobę na pierwsze, wolne miejsce w tablicy. W przypadku, gdy wszystkie elementy tablicy są zapełnione, tablica powinna powiększyć swój rozmiar dwukrotnie, przy próbie dodania wartości null rzuć wyjątek NullPointerException,
    remove(Person p) - usuwa z tablicy pierwszy obiekt reprezentujący osobę, który przekazano jako argument (dla której metoda equals() zwróci true). Puste miejsce powinno być "usunięte" poprzez przesunięcie wszystkich elementów tablicy o indeksach większych o jedno miejsce wstecz. Przykładowo dla tablicy {A, B, C}, po usunięciu B, tablica powinna wyglądać tak {A, C, null}. Gdy ktoś przekaże do metody wartość null, rzuć wyjątek NullPointerException.
    get(int index) - zwraca element tablicy o indeksie podanym jako parametr,
    size() - zwraca liczbę aktualnie przechowywanych elementów w tablicy (nie liczy wartości null / pustych miejsc).

Początkowy rozmiar tablicy w klasie PersonDatabase powinien wynosić 1. W powyższych metodach wykorzystaj klasę Arrays z pakietu java.utils, lub metodę System.arraycopy.

Przetestuj działanie klasy PersonDatabase dodając do niej kilka elementów, po czym wyświetlisz o nich informacje (łącznie z rozmiarem), następnie usuń jeden z elementów i wyświetl informacje ponownie. Dane mogą być zdefiniowane bezpośrednio w kodzie programu, nie muszą być odbierane od użytkownika z klawiatury.
