package com.ecsolutions.soaClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;

import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.util.Date;


/**
 * Created by tim on 2017/6/30.
 */
public class TransferClient {

    private static Logger logger = Logger.getLogger(TransferClient.class);

    public static String  transfer(Model model)
    {
        System.out.println("Test OCRService...");
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(writer, model);
        }
        catch (Exception ee)
        {
            //ee.printStackTrace();
        }
        String message=writer.toString();
        System.out.println("receive message;["+message+"]");
        logger.debug(message);
        String sRet="";
        Object[] results = null;
        String popupWebServiceAddress="http://192.1.10.2:7001/WXSOA/services/";
        String popupWebServiceDefaultNameSpace="http://lorServer.ecsolutions.com";

        try {
            RPCServiceClient client = new RPCServiceClient();
            Options options = client.getOptions();
            options.setProperty(org.apache.axis2.Constants.Configuration.CHARACTER_SET_ENCODING, "UTF-8");
            options.setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED, Boolean.FALSE);


            if (!popupWebServiceAddress.endsWith("/")) {
                popupWebServiceAddress += "/";
            }
            String address ="http://localhost:8001/WebServiceProject/services/Transfer"; //"http://localhost:8001/WebServiceProject/services/Transfer?wsdl"; //popupWebServiceAddress + "OCRService?wsdl";
            address="http://localhost:8080/WebServiceProject/services/Transfer";
            EndpointReference epr = new EndpointReference(address);
            options.setTo(epr);
            QName qname = new QName(popupWebServiceDefaultNameSpace, "transferData");

            Date dtBegin;
            Date dtEnd;
            dtBegin=new Date();

            String strKey="";
            String strToken="ab";
            String strDataMaster="";
            String strDataDetail="";

            logger.debug("begin callWS...");
            //results = client.invokeBlocking(qname, new Object[] { strToken,strKey,strDataMaster,strDataDetail }, new Class[] { String.class,String.class,String.class,String.class });

            results = client.invokeBlocking(qname, new Object[] {message}, new Class[] { String.class });
            logger.debug("end callWS.");

             sRet=results[0].toString();
            logger.debug("Ret="+sRet+"");
            dtEnd=new Date();
            logger.error("callWS Cost="+((dtEnd.getTime()-dtBegin.getTime()) / 1000.000)+" seconds]");

            //popOutput = (PopupDataInfo) results[0];
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("getOCRService Error: " + ex);

        }
        return sRet;
    }
}
