package com.epam.Lambda_Streams;

import java.util.*;
import java.util.stream.IntStream;

public class Ques3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("abca");
        list.add("aba");
        list.add("abba");
        list.add("add");
        list=palin(list);
        for(String s:list)
            System.out.println(s);
	}
	static List<String> palin(List<String> list)
    {
		List<String> list2=new ArrayList<String>();
		for(String s:list)
		{
			String t = s.replaceAll("\\s+", "").toLowerCase();
			if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
				list2.add(s);
		}
        return list2;
    }
	
}