package com.earyant.common.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;
import java.util.Map;

/**
 * 返回结果模板
 * @author 韩志伟
 *
 */
@ApiModel(value = "ResultDataDto", description = "返回结果模板")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ResultDataDto {


	public ResultDataDto() {
		super();
	}

	public ResultDataDto(CodeMsgContants codeMsg) {
		this() ;
		this.code = codeMsg.getCode();
		this.message = codeMsg.getMsg();
	}

	public ResultDataDto(Exception ex) {
		this();
		CodeMsgContants msg = ExceptionType.getErrorMessage(ex) ;
		this.code = msg.getCode();
		this.message = msg.getMsg();
	}

	/**
	 * 返回单个实体
	 */
	public<T> ResultDataDto(T entity) {
		super();
		CodeMsgContants codeMsg = CodeMsgContants.SUCCESS;
		this.code = codeMsg.getCode();
		this.message = codeMsg.getMsg();
		this.datas = entity;
	}
	
	/**
	 * 返回集合类型
	 */
	public ResultDataDto(List<?> list) {
		super();
//		this.code = CommonContants.SUCCESS;
		CodeMsgContants codeMsg = CodeMsgContants.SUCCESS;
		this.code = codeMsg.getCode();
		this.message = codeMsg.getMsg();
		this.datas = list;
	}
	
	/**
	 * 返回Map集合类型
	 */
	public ResultDataDto(Map<String, Object> map) {
		super();
//		this.code = CommonContants.SUCCESS;
		CodeMsgContants codeMsg = CodeMsgContants.SUCCESS;
		this.code = codeMsg.getCode();
		this.message = codeMsg.getMsg();
		this.datas = map;
	}
	
	/**
	 * 返回分页集合
	 */
	public<T> ResultDataDto(List<T> list, FlexiPageDto flexiPageDto) {
		super();
//		this.code = CommonContants.SUCCESS;
		CodeMsgContants codeMsg = CodeMsgContants.SUCCESS;
		this.code = codeMsg.getCode();
		this.message = codeMsg.getMsg();
		this.datas = list;
		this.flexiPageDto = flexiPageDto;
	}

//	private final String SUCCESS = "200";
	/**
	 * 结果编码
	 */
	@ApiModelProperty(value = "结果编码", required = true)
	@XmlElement(name="code")
	private String code;
	
	/**
	 * 消息
	 */
	@ApiModelProperty(value = "消息")
	private String message;

	/**
	 * 结果数据，单个实体 或 List<T>
	 */
	@ApiModelProperty(value = "结果数据，单个实体 或 List<T>")
	private Object datas;
	
	/**
	 * 分页数据
	 */
	@ApiModelProperty(value = "分页数据")
	private FlexiPageDto flexiPageDto;
	

	// -------------------------- getter and setter -----------------------------
	public String getCode() {
		return code;
	}

	public ResultDataDto setCode(String code) {
		this.code = code;
		return this;
	}

	public Object getDatas() {
		return datas;
	}

	public ResultDataDto setDatas(Object datas) {
		this.datas = datas;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ResultDataDto setMessage(String message) {
		this.message = message;
		return this;
	}

	public FlexiPageDto getFlexiPageDto() {
		return flexiPageDto;
	}

	public ResultDataDto setFlexiPageDto(FlexiPageDto flexiPageDto) {
		this.flexiPageDto = flexiPageDto;
		return this;
	}

}
