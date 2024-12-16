package day04;

import java.io.*;
import java.util.*;

public class Example3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(Integer.parseInt(st.nextToken()));
		}

		List<Integer> list2 = new ArrayList<Integer>(list);
		list.sort(Comparator.reverseOrder());

		System.out.println(list.get(0));
		System.out.println(list2.indexOf(list.get(0)) + 1);
	}
}
