package com.hqhwzx.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyUtils {

	/**
	 * 生成多个随机数
	 * @param number 生成随机数个数
	 * @param range  生成随机数范围
	 * @return 返回一个随机数集合
	 */
	public  List moreRandom(int number, int range){
		List list = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i=0; i<number; i++) {
			list.add(rand.nextInt(range) + 1);
		}
		return list;
	}
	
	/**
	 * 生成单个随机数
	 * @param range  生成随机数范围
	 * @return 返回单个随机数
	 */
	public  int random( int range){
		Random rand = new Random();
		return rand.nextInt(range) + 1;
	}
	
	/**
	 * 判断输入的字符串参数是否为空
     * @return boolean 空则返回true,非空则flase
     */
    public static boolean isEmpty(String input) {
        return null==input || 0==input.length() || 0==input.replaceAll("\\s", "").length();
    }
}
