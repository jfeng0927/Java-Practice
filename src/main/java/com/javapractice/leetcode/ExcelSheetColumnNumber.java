/**
 *
 */
package com.javapractice.leetcode;

/**
 * @author feng
 * https://oj.leetcode.com/problems/excel-sheet-column-number/
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *
 */
public class ExcelSheetColumnNumber {
	public int titleToNumberOld(String s) {
		int sum = 0;
		for(int i=0; i<s.length(); i++) {
			sum = sum*26+s.charAt(i)-64;
		}
		return sum;
	}

	public int titleToNumber(String s) {
		int sum = 0;

		for (char c:s.toCharArray()) {
			sum = sum*26 + c - 'A' + 1;
		}

		return sum;
	}
}
