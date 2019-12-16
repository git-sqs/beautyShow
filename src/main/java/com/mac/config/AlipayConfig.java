package com.mac.config;

import org.springframework.context.annotation.Configuration;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
@Configuration
public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101600696402";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCFneaZoZeIuSqGfNPtjpncqTktS1b49IW/Bs9su7HjALeKePSYSgrJRYBE+ZtQEh0iw3LUK8LMoH9XF88i4SHB1lHMCOzuMSO4A15rEwNFIzj4z62sEId4yrhGE40kt58x0JQqu1OKMkTvL/pt/KW3eoHBsuE/bk3EnQg8YyO40xqsECIBthnnrFXdIH+JazSwDTfZA223fyThuvdUCU8PpP4qnxP3YUcy55IxjzagCwOTrC0WiL8pwmc6RS6SMjBS1AAH7pU224o6sZ3hZ3etw2YNrRfrDKm1dSgyr9wDIsH+HXMvmrbA6BrgoxKpZX/heJvgvkBAcj3A9LdqPhC5AgMBAAECggEBAIMrD0WiLHA71lNQF3wNkV3dghPE8gxTfziYJuhHGcoO2h9FvlgB17TeVZ1gq+de4NtPo1pF22Wl6VxGM0G6YLk4+/Ogj3cFJltuczIJ6BvnB/a5aXSQhW0/FMc2SkjROaZdbBbG7qurzaBBKUbvzn7f9KGCST1Lu2xX+83MRTUaGlOKJQyi4Cf31rH+OZPyXEIhgmdl5hYS2d8hXBrEpm2LWzG/P5yWXeAS0CPKTYzN4za2Ku4rHrsy/0icaWVReNG74BR5vcLRjSClFW/UMMTIpz14sF/RLllnEr0gASHw/JoI8WqOUY38cf91A9xaBvVgGxPN+/e5Fuwm2YxXJ0ECgYEA0EvvEVLPimJyiqJTbBkhIOaY9At+R0/KfBMMjlWbZXQXpvFMnOk+6BQEqIdMREWdsVzRjTfM5QLOZS1beIhaDWpZX6Mh99/Xc/ymbVg7V3YNirGI1Wqkve21CiYx/cJgihcZqtvMtOdBRwZV4/l5ifm8RuaiiimODArAmBn5/7MCgYEApDeetQqMO0+mqul69vitdW6s+RZiZgXxdd3ql94FPcPYbnkzdFWLH68WKa/CRdq7T8bUH8Hef6hxQrBL4C2lFXY+dIbSRZ9HglaL1Xlomx7X3sYEoF/uIr7Q0Cs7N5F6eQ1iFvDONrUdkHJvS0SGp7neQ5SnE5d54LVB6kRr1+MCgYACeDQAZ5PwVxR2klAc4vtikXlUw2Ie5FJJQEyQz3EFNegl4Yx/+7/0LnCTsu7zjEO/W5NcckHqoSrjRjNkbXFr4Uvn914quyupw2ARwc8KTWsBrvMpXJdRbSUNVsCW+pv8ZyO1w99ccbVzax7PkiCfwyc5S/i3XKDDgckgxIYTQwKBgQCFXUZe8ToB0SYiF4vtlvgILuH7SNqQ0LLQbnFe9Mh86NiUn4nSKMbb7G2rXToBUSpeF7OeNuxj8IBLELIOVgOD8ou2Ruft8vU4POFDdV4m3F2kZlzLghz7ysv6w6FL97HnLZ9D0j0m4OApt0X7cqOJA8ImUEt/9bzdaVcm0npi0QKBgDIDgED8Sh9kPeW+bEiXu7sB7Vp8/AoA50pvYwwfny8uXYiHLz9E0Aocc65v1z3UPVX52H4yr5gqCTPyzICrn7UngEPNb2o5nwCEO1DIj0rvP3anSw7jzZhOHLyZKmNJw/xCNMINsPQXesFrxLLzLiDbP+olb2DI6J0Owdo9hjqE";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhZ3mmaGXiLkqhnzT7Y6Z3Kk5LUtW+PSFvwbPbLux4wC3inj0mEoKyUWARPmbUBIdIsNy1CvCzKB/VxfPIuEhwdZRzAjs7jEjuANeaxMDRSM4+M+trBCHeMq4RhONJLefMdCUKrtTijJE7y/6bfylt3qBwbLhP25NxJ0IPGMjuNMarBAiAbYZ56xV3SB/iWs0sA032QNtt38k4br3VAlPD6T+Kp8T92FHMueSMY82oAsDk6wtFoi/KcJnOkUukjIwUtQAB+6VNtuKOrGd4Wd3rcNmDa0X6wyptXUoMq/cAyLB/h1zL5q2wOga4KMSqWV/4Xib4L5AQHI9wPS3aj4QuQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/pay/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost/pay/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";


	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

