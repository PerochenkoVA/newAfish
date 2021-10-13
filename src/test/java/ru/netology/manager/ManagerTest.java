package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Catalog;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {

    Manager manager = new Manager();

    @Test
    void shouldRemoveIfExists() {

        int idToRemove = 1;
        Catalog first = new Catalog(1, 1, "Бладшот", 1, 1);
        Catalog second = new Catalog(2, 2, "Вперед", 1, 1);
        Catalog third = new Catalog(3, 3, "Отель Белград", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        Catalog[] actual = manager.getAll();
        Catalog[] expected = new Catalog[]{third, second};

        assertArrayEquals(expected, actual);
    }
    @Test
    void ShouldShowCatalogMovieAboveLim() {

        int idToRemove=1;
        Catalog first = new Catalog(1, 1, "Бладшот", 1, 1);
        Catalog second = new Catalog(2, 2, "Вперед", 1, 1);
        Catalog third = new Catalog(3, 3, "Отель Белград", 1, 1);
        Catalog four = new Catalog(4, 4, "Джентельмены", 1, 1);
        Catalog five = new Catalog(5, 5, "Человек невидимка", 1, 1);
        Catalog six = new Catalog(6, 6, "Тролли", 1, 1);
        Catalog seven = new Catalog(7, 7, "Номер один", 1, 1);
        Catalog eight = new Catalog(8, 8, "Поезд в Пусан", 1, 1);
        Catalog nine = new Catalog(9, 9, "Револьвер", 1, 1);
        Catalog ten = new Catalog(10, 10, "Гнев человеческий", 1, 1);
        Catalog eleven = new Catalog(11, 11, "Чернобыль", 1, 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        manager.removeById(idToRemove);

        Catalog[] actual = manager.getLast();
        Catalog[] expected = new Catalog[]{eleven,ten, nine, eight, seven, six, five, four,
                third, second};

        assertArrayEquals(expected, actual);
    }
    @Test
    void ShouldShowCatalogMovieBelowMLim() {

        Catalog first = new Catalog(1, 1, "Бладшот", 1, 1);
        Catalog second = new Catalog(2, 2, "Вперед", 1, 1);
        Catalog third = new Catalog(3, 3, "Отель Белград", 1, 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.getLast();

        Catalog[] actual = manager.getLast();
        Catalog[] expected = new Catalog[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowLimCatalogMovie() {
        Manager manager = new Manager();

        Catalog first = new Catalog(1, 1, "Бладшот", 1, 1);
        Catalog second = new Catalog(2, 2, "Вперед", 1, 1);
        Catalog third = new Catalog(3, 3, "Отель Белград", 1, 1);
        Catalog four = new Catalog(4, 4, "Джентельмены", 1, 1);
        Catalog five = new Catalog(5, 5, "Человек невидимка", 1, 1);
        Catalog six = new Catalog(6, 6, "Тролли", 1, 1);
        Catalog seven = new Catalog(7, 7, "Номер один", 1, 1);
        Catalog eight = new Catalog(8, 8, "Поезд в Пусан", 1, 1);
        Catalog nine = new Catalog(9, 9, "Револьвер", 1, 1);
        Catalog ten = new Catalog(10, 10, "Гнев человеческий", 1, 1);
        Catalog eleven = new Catalog(11, 11, "Чернобыль", 1, 1);


        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        manager.getLast();

        Catalog[] actual = manager.getLast();
        Catalog[] expected = new Catalog[]{eleven, ten, nine, eight, seven, six, five, four,
                third, second};
        assertArrayEquals(expected, actual);
    }


}