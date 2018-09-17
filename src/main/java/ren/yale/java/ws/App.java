package ren.yale.java.ws;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import javax.xml.namespace.QName;

/**
 * Hello world!
 *
 */
public class App {

    private static void hello(String endpoint,String namespace,String localPart) throws Exception {
        Service service = new Service();
        Call call = (Call) service.createCall();
        call.setTimeout(new Integer(200000));
        call.setTargetEndpointAddress(new java.net.URL (endpoint));
        call.setOperationName(new QName(namespace, localPart));
        //call.setReturnClass(String.class);
        call.setUseSOAPAction(true);

        String Response=(String) call.invoke(new Object[]{"13511111111",""});
        System.out.println("请求成功，返回信息如下：----------------------->");
        System.out.println(Response);
        System.out.println("成功----------------------->");
    }

    public static void main( String[] args ) {
        try {
            hello("http://localhost:8080/services/MobileCodeWSSoap","http://WebXml.com.cn/","getMobileCodeInfo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
