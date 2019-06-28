package coding.Assignment1;

import java.util.Arrays;
//import java.util.Collection;
import java.util.HashSet;
//import java.util.List;
//import java.util.List;
import java.util.Iterator;

//	public static String intersection(Integer[] nums1, Integer[] nums2) {
//
//		if (nums1 != null && nums2 != null) {
//			HashSet<Integer> hs = new HashSet<Integer>();
//			hs.addAll(Arrays.asList(nums1));
//
//			hs.retainAll(Arrays.asList(nums2));
//			System.out.println(hs);
//
//			 Integer[]	inter= {};
//			inter = hs.toArray(inter);
//			return Arrays.toString(inter);
//		}
//		return null;
//	}
public class IntersectionA {
	public static String intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i : nums1) {
			set.add(i);
		}

		for (int i : nums2) {

			set1.add(i);

		}
		set.retainAll(set1);

		int[] result = new int[set.size()];
		int i = 0;
		for (int itr : set) {
			result[i++] = itr;
		}
		return Arrays.toString(result);
	}

	public static void main(String args[]) {
		int nums1[] = { 1, 2, 2, 1 };
		int nums2[] = { 2, 2, 1 };
		System.out.println(intersection(nums1, nums2));
	}
}
