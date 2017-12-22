package com.earyant.common.dto;

/**
 * @version: V1.0
 * @des:
 * @author: CTSIG
 * @email: shenzhaoxiang@gmail.com
 * @date: 2017-02-22 14:14
 */
public enum CodeMsgContants {


    SUCCESS("200","成功"),
    SecurtyAuthOK("200001","验证通过"),
    IspUnknowErr("200002","服务暂不可用"),

    CodeAuthInvalidOK("400","授权权限成功"),
    CodeAuthInvalid("401","授权权限不足"),
    InvalidAuthToken("401001","无效的访问令牌"),
    AuthTokenTime("401002","访问令牌已过期"),
    InvalidAppAuthToken("401003","无效的应用授权令牌"),
    InvalidAppAuthTokenNoAPI("401004","用户未授权当前接口"),
    InvalidErrUserName("401005","验证未通过,未知账户"),
    InvalidErrPassWd("401006","密码不正确"),
    InvalidLocked("401007","密账户已锁定"),
    InvalidTimesOver("401008","用户名或密码错误次数过多"),
    InvalidErrUserNameOrPassWd("401009","用户名或密码不正确"),

    CodeErrorService("500","业务逻辑错误"),
    CodeErrorFunction("501","功能不完善，无对应方法"),
    CodeErrorWeb("502","功能不完善，网络异常"),

    ApikeyNotEmpty("503001","apikey不能为空"),
    PlatcodeNotEmpty("503002","平台代码不能为空"),
    VersionNotEmpty("503003","版本号不能为空"),
    AuthObjectNotEmpty("503004","验证对象不能为空"),
    QueryIdNotEmpty("503005","查询id不能为空"),
    SignatureNotEmpty("503006","签名参数不能为空"),
    CardNoNotEmpty("503007","卡号不能为空"),
    ChargeTimeNotEmpty("503008","卡号不能为空"),
    ObjectNotEmpty("503009","对象参数不能为空"),

    InvalidPlatCode("505001","平台代码不存在"),
    InvalidPlatCodeAndApikey("505002","平台代码与apikey不匹配"),
    InvalidSignature("505003","无效签名"),
    InvalidAppId("505004","无效appid"),
    InvalidTimestamp("505005","非法时间戳参数"),
    InvalidCharset("505006","字符集错误"),
    DecryptionErrorNotValidEncryptType("50507","解密出错，不支持的加密算法"),
    DecryptionErrorUnknown("50508","解密出错，未知异常"),

    SystemException("504","系统异常"),
    ArithmeticException("504001","系统异常：计算错误"),
    NullPointerException("504002","输入错误，缺少输入值"),
    ClassCastException("504003","系统异常：类型转换错误"),
    NegativeArraySizeException("504004","系统异常：集合负数"),
    ArrayIndexOutOfBoundsException("504005","系统异常：集合超出范围"),
    FileNotFoundException("504006","系统异常：文件未找到"),
    NumberFormatException("504007","系统异常：输入数字错误"),
    SQLException("504008","系统异常：数据库异常"),
    IOException("504009","系统异常：文件读写错误"),
    NoSuchMethodException("504010","系统异常：方法找不到"),
    DataIntegrityViolationException("504011","数据库异常：传入参数存在过长字段"),
    MyBatisSystemException("504012","数据库异常：mybatis操作数据库异常"),
    MissingServletRequestParameterException("504013","需要的字符串参数不存在"),
    OtherException("504999","系统异常：未知异常"),
    ;

    private String code;

    private String msg;


    private CodeMsgContants(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
