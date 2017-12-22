package com.earyant.dao.primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 知乎图片bean
 * 
 * @author KKys
 *
 */
@Entity
public class ZhiHuPicBean {
    @Id
    @GeneratedValue
    Long id;
    String zhihuUrl;// 网页链接
    
	String question;// 问题;
	
	ArrayList<String> zhihuPicUrl;// 图片链接

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public ArrayList<String> getZhihuPicUrl() {
		return zhihuPicUrl;
	}

	public void setZhihuPicUrl(ArrayList<String> zhihuPicUrl) {
		this.zhihuPicUrl = zhihuPicUrl;
	}


	// 处理url
	boolean getRealUrl(String url) {
		// 将http://www.zhihu.com/question/22355264/answer/21102139
		// 转化成http://www.zhihu.com/question/22355264
		// 否则不变
		Pattern pattern = Pattern.compile("question/(.*?)");
		Matcher matcher = pattern.matcher(url);
		if (matcher.find()) {
			url = "http://www.zhihu.com/question/" + matcher.group(1);
		} else {
			return false;
		}
		return true;
	}
}
