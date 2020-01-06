package com.chaoxing.springboot.config;

public class KafkaProducer {
    public KafkaProducer(){

    }
    public void send(String message){
        System.out.println("message : "+ message +" 发送完毕");
    }
    public void destroy(){
        System.out.println("消亡");
    }
    public void init(){
        System.out.println("初始化");
    }
}
