/**
 * MobileCodeWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package client;

public class MobileCodeWSLocator extends org.apache.axis.client.Service implements MobileCodeWS {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>国内手机号码归属地查询WEB服务</strong>，提供最新的国内手机号码段归属地数据，每月更新。<br />使用本站
 * WEB 服务请注明或链接本站：<a href="http://www.webxml.com.cn/" target="_blank">http://www.webxml.com.cn/</a>
 * 感谢大家的支持！<br />&nbsp;
 */

    public MobileCodeWSLocator() {
    }


    public MobileCodeWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MobileCodeWSLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MobileCodeWSSoap
    private String MobileCodeWSSoap_address = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx";

    public String getMobileCodeWSSoapAddress() {
        return MobileCodeWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String MobileCodeWSSoapWSDDServiceName = "MobileCodeWSSoap";

    public String getMobileCodeWSSoapWSDDServiceName() {
        return MobileCodeWSSoapWSDDServiceName;
    }

    public void setMobileCodeWSSoapWSDDServiceName(String name) {
        MobileCodeWSSoapWSDDServiceName = name;
    }

    public client.MobileCodeWSSoap_PortType getMobileCodeWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MobileCodeWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMobileCodeWSSoap(endpoint);
    }

    public client.MobileCodeWSSoap_PortType getMobileCodeWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            client.MobileCodeWSSoap_BindingStub _stub = new client.MobileCodeWSSoap_BindingStub(portAddress, this);
            _stub.setPortName(getMobileCodeWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMobileCodeWSSoapEndpointAddress(String address) {
        MobileCodeWSSoap_address = address;
    }


    // Use to get a proxy class for MobileCodeWSSoap12
    private String MobileCodeWSSoap12_address = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx";

    public String getMobileCodeWSSoap12Address() {
        return MobileCodeWSSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String MobileCodeWSSoap12WSDDServiceName = "MobileCodeWSSoap12";

    public String getMobileCodeWSSoap12WSDDServiceName() {
        return MobileCodeWSSoap12WSDDServiceName;
    }

    public void setMobileCodeWSSoap12WSDDServiceName(String name) {
        MobileCodeWSSoap12WSDDServiceName = name;
    }

    public client.MobileCodeWSSoap_PortType getMobileCodeWSSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MobileCodeWSSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMobileCodeWSSoap12(endpoint);
    }

    public client.MobileCodeWSSoap_PortType getMobileCodeWSSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            client.MobileCodeWSSoap12Stub _stub = new client.MobileCodeWSSoap12Stub(portAddress, this);
            _stub.setPortName(getMobileCodeWSSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMobileCodeWSSoap12EndpointAddress(String address) {
        MobileCodeWSSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (client.MobileCodeWSSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                client.MobileCodeWSSoap_BindingStub _stub = new client.MobileCodeWSSoap_BindingStub(new java.net.URL(MobileCodeWSSoap_address), this);
                _stub.setPortName(getMobileCodeWSSoapWSDDServiceName());
                return _stub;
            }
            if (client.MobileCodeWSSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                client.MobileCodeWSSoap12Stub _stub = new client.MobileCodeWSSoap12Stub(new java.net.URL(MobileCodeWSSoap12_address), this);
                _stub.setPortName(getMobileCodeWSSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("MobileCodeWSSoap".equals(inputPortName)) {
            return getMobileCodeWSSoap();
        }
        else if ("MobileCodeWSSoap12".equals(inputPortName)) {
            return getMobileCodeWSSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "MobileCodeWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "MobileCodeWSSoap"));
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "MobileCodeWSSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("MobileCodeWSSoap".equals(portName)) {
            setMobileCodeWSSoapEndpointAddress(address);
        }
        else 
if ("MobileCodeWSSoap12".equals(portName)) {
            setMobileCodeWSSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
