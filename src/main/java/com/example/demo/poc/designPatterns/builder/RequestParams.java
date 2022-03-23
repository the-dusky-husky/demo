package com.example.demo.poc.designPatterns.builder;

public class RequestParams {

    private int phone;
    private int shortCode;
    private String message;

    private boolean intFlag;
    private boolean alert;

    public RequestParams(int phone, int shortCode, String message, boolean intFlag, boolean alert) {
        this.alert=alert;
        this.intFlag=intFlag;
        this.message=message;
        this.phone=phone;
        this.shortCode=shortCode;
    }

    public static class RequestParamsBuilder {

        private int phone;
        private int shortCode;
        private String message;

        private boolean intFlag;
        private boolean alert;

        public RequestParamsBuilder(int phone, int shortCode, String message){
            this.phone = phone;
            this.shortCode = shortCode;
            this.message = message;
        }

        public RequestParamsBuilder setIntFlag(boolean intFlag){
            this.intFlag=intFlag;
            return this;
        }

        public RequestParamsBuilder setMessage(boolean alert){
            this.alert=alert;
            return this;
        }

        public RequestParams build(){
            
            return new RequestParams(phone, shortCode,message, intFlag, alert);
        }
    }
}
