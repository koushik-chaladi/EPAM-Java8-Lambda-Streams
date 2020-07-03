package com.epam.Lambda_Streams;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


public class Ques1 {

	public static void main(String[] args) {
		IntStream stream=IntStream.of(1,2,3,4,5,6,7,8,9,10);
        OptionalDouble obj=stream.average();
        if(obj.isPresent())
        {
            System.out.println(obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }

	}

}
