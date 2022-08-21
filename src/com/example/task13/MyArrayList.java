package com.example.task13;


public class MyArrayList<T> {
    final int DEFAULT_SIZE_ARRAY = 15;
    final int REDUCTION = 2;
    T[] array = (T[]) new Object[DEFAULT_SIZE_ARRAY];
    int position = 0;

    //���������� ��������
    public void add(T element) {
        if (position == array.length) {
            expandArray();
            array[position++] = element;
        } else {
            array[position++] = element;
        }
    }

    // ���������� ������� ������ �� �������.
    public T get(int index) {
        return array[index];
    }

    //�������� ��������
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

    // ������� �������
    private void constrictionArray() {
        Object[] arrayNew = new Object[array.length - DEFAULT_SIZE_ARRAY];
        System.arraycopy(array, 0, arrayNew, 0, position);
        array = (T[]) arrayNew;
    }

    //������� ��� ��������
    public void removeAll() {
        array = (T[]) new Object[0];
        position = 0;
    }

    //���������� �������
    private void expandArray() {
        Object[] arrayNew = new Object[DEFAULT_SIZE_ARRAY + DEFAULT_SIZE_ARRAY];
        System.arraycopy(array, 0, arrayNew, 0, position);
        array = (T[]) arrayNew;
    }

    // ���������� ���������� ��������� � ������
    public int size() {
        return position;
    }

    //�������� ������� ��������
    public boolean contains(T value) {
        for (Object o : array) {
            if (o.equals(value)) {
                return true;
            }
        }
        return false;
    }

    // �����������
    public MyArrayList() {
        this.array = (T[]) new Object[DEFAULT_SIZE_ARRAY];
    }

    // ����������� � �����������
    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.array = (T[]) new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }
}
