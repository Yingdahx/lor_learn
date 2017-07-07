package com.ecsolutions.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.StringWriter;

/**
 * Created by tim on 2017/7/7.
 */
public class ObjectHelp {

    public static <T>  String ObjectToJsonStr(T tmpKbj)
    {
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer=new StringWriter();
        try {
            mapper.writeValue(writer, tmpKbj);
        }
        catch (Exception ee)
        {
            //ee.printStackTrace();
        }
        String objStr=writer.toString();
        return objStr;
    }

    public static <T>  String InitTransferData(String className,T tmpKbj)
    {
        JSONObject main=new JSONObject();
        main.put("className", className);
        //main.put("transferData", pleage_entity);
        String message= ObjectToJsonStr(tmpKbj);
        main.put("transferData", message);
        return main.toString();
    }
}
