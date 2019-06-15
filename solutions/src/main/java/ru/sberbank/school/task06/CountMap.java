package ru.sberbank.school.task06;

import java.util.Map;

public interface CountMap<T> {
    /**
     * Добавление элепмента в контейнер.
     *
     * @param o элемент для добавления
     */
    void add(T o);

    /**
     * Получение количества вхождений данного элемента.
     *
     * @param o элемент
     * @return количество вхождений эелемента
     */
    int getCount(T o);

    /**
     * Удаление элемента из контейнера (полностью).
     *
     * @param o элемент
     * @return количество добавлений элемента(до удаления)
     */
    int remove(T o);

    /**
     * Получение количества разных элементов.
     *
     * @return количество разных элементов.
     */
    int size();

    /**
     * Добавление всех элементов из коллекции source в текущий контейнер. При совпадениии ключей,
     * счётчики увеличивается.
     *
     * @param source коллекция - источник
     */
    void addAll(CountMap<? extends T> source);


    /**
     * Трансформация текущего контейнеру к контейнеру java.util.Map. Ключ - добавленный элемент,
     * значение - количество его добавлений.
     *
     * @return контейнер java.util.Map
     */
    Map<T, Integer> toMap();


    /**
     * Тот же контракт, что и у toMap(), но результат записать в destination.
     */
    void toMap(Map<? super T, Integer> destination);
}