package com.sdabyd2.programowanie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PTestImpl {

    public static String last(List<String> lista) {

        return lista.get(lista.size() - 1);
    }

    public static int length(List<Integer> integers) {
        return integers.size();
    }

    /**
     * public static List<Integer> reverse(List<Integer> numbers) {
     * List<Integer> reversedList = new ArrayList<Integer>();
     * for (int i = numbers.size() - 1; i >= 0; i--) {
     * reversedList.add(numbers.get(i));
     * }
     * return reversedList;
     * }
     */
    public static <T> List<T> reverse(List<T> numbers) {
        Collections.reverse(numbers);
        return numbers;
    }

    public static boolean isPalindrome(List<String> list) {
        /**for (int i = 0; i < list.size(); i++) {
         for (int j = list.size() - 1; i >= 0; i--) {
         if (list.get(i).equals(list.get(j))) {
         return true;
         }
         }
         }*/
        List<String> reversed = new ArrayList<String>(list);
        Collections.reverse(reversed);
        return list.equals(reversed);
    }

    public static Object[] removeAt(List<String> list, int i) {
        List<String> input = new ArrayList<String>(list);
        String removed = input.remove(i - 1);
        return new Object[]{input, removed};
    }

    public static List<String> rendomSelect(List<String> list, int random) {
        List<String> result = new ArrayList<String>();
        Random randomSelect = new Random();
        for (int i = 0; i < random; i++) {
            int toSelect = randomSelect.nextInt(list.size() - 1);
            result.add(list.get(toSelect));
        }
        return result;
    }

    public static <T> List<T> flatten(List<?> list, Class<T> elementType) {

        return list
                .stream()
                .flatMap(e -> e instanceof List ? flatten(((List<?>)
                                e),
                        elementType).stream() : Stream.of(e))
                .map(e -> (T) e)
                .collect(Collectors.toList());
    }

    public static List<String> compress(List<String> strings) {
        Set<String> set = new LinkedHashSet<>(strings);
        List<String> withoutDupl = new ArrayList<>(set);
        return withoutDupl;
    }

    public static List<String> duplicate(List<String> strings) {
        List<String> duplicates = new ArrayList<>(strings);
        duplicates.addAll(strings);
        Collections.sort(duplicates);
        return duplicates;
    }

    public static List<String> dropEveryNth(List<String> strings, int element) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i < strings.size()+1; i++) {
            if(i%element==0){
                list.add(strings.get(i-1));
            }
        }
        strings.removeAll(list);
        return strings;
    }
}
