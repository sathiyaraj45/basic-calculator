package com.calculator;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sathiyarajr on 25/2/16.
 */


public class Calc extends CordovaPlugin {

    public Calc(){}

    @Override
    public boolean execute(String action, JSONArray args,final CallbackContext callbackContext) throws JSONException {
        JSONObject data = args.getJSONObject(0);
        if (action.equals("add")) {
            double a = Double.parseDouble((String) data.get("firstValue"));
            double b = Double.parseDouble((String) data.get("secondValue"));
            addition(a, b, callbackContext);
        } else if (action.equals("sub")) {
            double a = Double.parseDouble((String) data.get("firstValue"));
            double b = Double.parseDouble((String) data.get("secondValue"));
            subtraction(a, b, callbackContext);
        } else if (action.equals("mul")) {
            double a = Double.parseDouble((String) data.get("firstValue"));
            double b = Double.parseDouble((String) data.get("secondValue"));
            multiplication(a, b, callbackContext);
        } else if (action.equals("div")) {
            double a = Double.parseDouble((String) data.get("firstValue"));
            double b = Double.parseDouble((String) data.get("secondValue"));
            division(a, b, callbackContext);
        }

        return false;
    }

    public boolean addition(double a, double b, CallbackContext callbackContext) throws JSONException {
        JSONObject res = new JSONObject();
        double c = a + b;
        res.put("firstValue", a);
        res.put("secondValue", b);
        res.put("result", c);
        callbackContext.success(res);
        return true;
    }

    public boolean subtraction(double a, double b, CallbackContext callbackContext) throws JSONException {
        JSONObject res = new JSONObject();
        double c = a - b;
        res.put("firstValue", a);
        res.put("secondValue", b);
        res.put("result", c);
        callbackContext.success(res);
        return true;
    }

    public boolean multiplication(double a, double b, CallbackContext callbackContext) throws JSONException {
        JSONObject res = new JSONObject();
        double c = a * b;
        res.put("firstValue", a);
        res.put("secondValue", b);
        res.put("result", c);
        callbackContext.success(res);
        return true;
    }

    public boolean division(double a, double b, CallbackContext callbackContext) throws JSONException {
        JSONObject res = new JSONObject();
        double c = a / b;
        res.put("firstValue", a);
        res.put("secondValue", b);
        res.put("result", c);
        callbackContext.success(res);
        return true;
    }
}

