package com;

import java.util.ArrayList;
import java.util.List;

public class Model {
	// 一组牌
	int value; // 权值
	int num;// 手数 (几次能够走完，没有挡的情况下)
	List<String> a1 = new ArrayList<String>(); // 单张
	List<String> a2 = new ArrayList<String>(); // 对子
	List<String> a3 = new ArrayList<String>(); // 3带
	List<String> a123 = new ArrayList<String>(); // 连子
	List<String> a112233 = new ArrayList<String>(); // 连牌
	List<String> a111222 = new ArrayList<String>(); // 飞机
	List<String> a4 = new ArrayList<String>(); // 炸弹
}
