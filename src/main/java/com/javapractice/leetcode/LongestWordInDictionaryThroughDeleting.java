/**
 *
 */
package com.javapractice.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Jianyu Feng
 * https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
 * Given a string and a string dictionary,
 * find the longest string in the dictionary that can be formed
 * by deleting some characters of the given string.
 * If there are more than one possible results,
 * return the longest word with the smallest lexicographical order.
 * If there is no possible result, return the empty string.
 * Example 1:
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * Output: 
 * "apple"
 * Example 2:
 * Input:
 * s = "abpcplea", d = ["a","b","c"]
 * Output: 
 * "a"
 * Note:
 * All the strings in the input will only contain lower-case letters.
 * The size of the dictionary won't exceed 1,000.
 * The length of all the strings in the input won't exceed 1,000.
 *
 */
public class LongestWordInDictionaryThroughDeleting {
	public String findLongestWord(String s, List<String> d) {
		Collections.sort(d, new Comparator<String>() {
			public int compare(String a, String b) {
				return a.length()==b.length() ? a.compareTo(b) : b.length()-a.length();
			}
		});

		for (int i=0; i<d.size(); i++) {
			String str = d.get(i);
			if (isValid(str,s)) {
				return str;
			}
		}

		return "";
	}

	protected boolean isValid(String a, String b) {
		for (int i=0, j=0; i<a.length(); i++, j++) {
			if (j>=b.length()) {
				return false;
			}
			for (; j<b.length(); j++) {
				if (b.charAt(j)==a.charAt(i)) {
					break;
				}
			}
			if (j>=b.length()) {
				return false;
			}
		}

		return true;
	}
}
