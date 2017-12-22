package com.earyant.dao.primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
public class ZhiHuBean {
    @Id
    @GeneratedValue
    Long id;
	String question;// 问题
	
	String questionDescription;// 问题描述
	
	String zhihuUrl;// 网页链接
	
	ArrayList<String> answers;// 存储所有回答的数组



	@Override
	public String toString() {
		return "问题：" + question + "\n" + "描述：" + questionDescription + "\n" + "链接：" + zhihuUrl + "\n回答：" + answers
				+ "\n";
	}

	// 处理url
	boolean getRealUrl(String url) {
		// 将http://www.zhihu.com/question/22355264/answer/21102139
		// 转化成http://www.zhihu.com/question/22355264
		// 否则不变
		Pattern pattern = Pattern.compile("question/(.*?)/");
		Matcher matcher = pattern.matcher(url);
		if (matcher.find()) {
			zhihuUrl = "http://www.zhihu.com/question/" + matcher.group(1);
		} else {
			return false;
		}
		return true;
	}

	public String writeString() {
		String result = "";
		result += "问题：" + question + "\r\n\r\n";
		result += "描述：" + questionDescription + "\r\n\r\n";
		result += "链接：" + zhihuUrl + "\r\n\r\n";
		for (int i = 0; i < answers.size(); i++) {
			result += "回答" + i + "：" + answers.get(i) + "\r\n\r\n\r\n\r\n";
		}
		result += "\r\n\r\n\r\n\r\n";
		// 将其中的html标签进行筛选
		result = result.replaceAll("<br>", "\r\n");
		result = result.replaceAll("<.*?>", "");
		return result;
	}

}
