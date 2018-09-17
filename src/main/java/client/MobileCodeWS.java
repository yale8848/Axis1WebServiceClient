/**
 * MobileCodeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package client;

public interface MobileCodeWS extends javax.xml.rpc.Service {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>国内手机号码归属地查询WEB服务</strong>，提供最新的国内手机号码段归属地数据，每月更新。<br />使用本站
 * WEB 服务请注明或链接本站：<a href="http://www.webxml.com.cn/" target="_blank">http://www.webxml.com.cn/</a>
 * 感谢大家的支持！<br />&nbsp;
 */
    public String getMobileCodeWSSoapAddress();

    public client.MobileCodeWSSoap_PortType getMobileCodeWSSoap() throws javax.xml.rpc.ServiceException;

    public client.MobileCodeWSSoap_PortType getMobileCodeWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public String getMobileCodeWSSoap12Address();

    public client.MobileCodeWSSoap_PortType getMobileCodeWSSoap12() throws javax.xml.rpc.ServiceException;

    public client.MobileCodeWSSoap_PortType getMobileCodeWSSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
