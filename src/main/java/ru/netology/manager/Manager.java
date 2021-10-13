package ru.netology.manager;

import ru.netology.domain.Catalog;

public class Manager {
    private Catalog[] movies = new Catalog[0];
    private int limit = 10;

    public Manager() {
    }
/*
    public Manager(int lim) {
        if (lim < limit) {
            this.limit = lim;
        } else {
            this.limit = limit;
        }
    }
*/
    public void add(Catalog movie) {
        int length = movies.length + 1;
        Catalog[] tmp = new Catalog[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Catalog[] getAll() {
        Catalog[] result = new Catalog[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public void removeById(int id) {
        int length = movies.length - 1;
        Catalog[] tmp = new Catalog[length];
        int index = 0;
        for (Catalog movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }
        }
        movies = tmp;
    }

    public Catalog[] getLast() {

        int resultLength = movies.length + 1;
        if (movies.length > limit) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        Catalog[] result = new Catalog[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = result.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}


