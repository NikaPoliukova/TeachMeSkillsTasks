package com.example.task13;


public class MyArrayList<T> {
    final int DEFAULT_SIZE_ARRAY = 15;
    final int REDUCTION = 2;
    T[] array = (T[]) new Object[DEFAULT_SIZE_ARRAY];
    int position = 0;

    //добавление элемента
    public void add(T element) {
        if (position == array.length) {
            expandArray();
            array[position++] = element;
        } else {
            array[position++] = element;
        }
    }

    // Возвращает элемент списка по индексу.
    public T get(int index) {
        return array[index];
    }

    //удаления элемента
    public void remove(int index) {
        if (index < position) {
            for (int i = index; i < position; i++) {
                array[i] = array[i + 1];
                array[i + 1] = null;
            }
            position--;
            if ((array.length > DEFAULT_SIZE_ARRAY && position < (array.length / REDUCTION))) {
                constrictionArray();
            }

        } else {
            throw new IllegalArgumentException("Exceeded index number entered");
        }
    }

    // сужение массива
    private void constrictionArray() {
        Object[] arrayNew = new Object[array.length - DEFAULT_SIZE_ARRAY];
        System.arraycopy(array, 0, arrayNew, 0, position);
        array = (T[]) arrayNew;
    }

    //удалить все элементы
    public void removeAll() {
        array = (T[]) new Object[0];
        position = 0;
    }

    //расширение массива
    private void expandArray() {
        Object[] arrayNew = new Object[DEFAULT_SIZE_ARRAY + DEFAULT_SIZE_ARRAY];
        System.arraycopy(array, 0, arrayNew, 0, position);
        array = (T[]) arrayNew;
    }

    // Возвращает количество элементов в списке
    public int size() {
        return position;
    }

    //проверка наличия элемента
    public boolean contains(T value) {
        for (Object o : array) {
            if (o.equals(value)) {
                return true;
            }
        }
        return false;
    }

    // конструктор
    public MyArrayList() {
        this.array = (T[]) new Object[DEFAULT_SIZE_ARRAY];
    }

    // конструктор с параметарми
    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.array = (T[]) new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }
}
