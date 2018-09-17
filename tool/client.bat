rem -p 为包名
set CURRENT_DIR=%cd%
set Axis_Lib=%CURRENT_DIR%\axis1.4\axis\WEB-INF\lib
set Java_Cmd=Java -Djava.ext.dirs=%Axis_Lib%
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java -p client http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl
