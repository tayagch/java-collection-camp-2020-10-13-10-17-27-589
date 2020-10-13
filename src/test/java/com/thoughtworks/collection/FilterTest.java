package com.thoughtworks.collection;

import org.junit.Test;

import java.util.*;

import static org.fest.assertions.Assertions.assertThat;

public class FilterTest {

    @Test
    public void should_return_even() {
        //get all the even number from the list
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> arrayList = Arrays.asList(array);

        Filter filter = new Filter(arrayList);

        Integer[] result = new Integer[]{2, 4};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(filter.filterEven()).isEqualTo(resultList);
    }

    @Test
    public void should_return_multiple_of_three() {
        //get the number which is multiple of 3, like 3, 6, 9 ...
        Integer[] array = new Integer[]{6, 2, 3, 4, 9};
        List<Integer> arrayList = Arrays.asList(array);

        Filter filter = new Filter(arrayList);

        Integer[] result = new Integer[]{6, 3, 9};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(filter.filterMultipleOfThree()).isEqualTo(resultList);
    }

    @Test
    public void should_return_common_elements() {
        /*
            remove the duplicate numbers between two lists
            list1 [1,2,5]
            list2 [1,2,6,8]
            the duplicate numbers are [1,2]
         */

        Integer[] array = new Integer[]{6, 2, 3, 4, 9};
        Integer[] array1 = new Integer[]{2, 3, 5, 9, 6};

        List<Integer> arrayList = Arrays.asList(array);
        List<Integer> arrayList1 = Arrays.asList(array1);

        Filter filter = new Filter(arrayList);

        Integer[] result = new Integer[]{6, 2, 3, 9};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(filter.getCommonElements(arrayList, arrayList1)).isEqualTo(resultList);
    }

}
