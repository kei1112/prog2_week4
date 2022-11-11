public class Chatbot{
    private String name;

    public Chatbot(String name){
        this.name = name;
        System.out.println
        ("チャットボット名" + this.name +"を作成します。");
    }  

    public Chatbot(){
        System.out.println("チャットボットの原型を作成します。");    
    }

    public void greeting(){
        System.out.println
        ("はじめまして" + this.name + "です、よろしくお願いします");
    }

    public void setName(String name2){
        if(name2 == "差別用語"){
            System.out.println("禁止されています");
        }
        else{
            System.out.println
            ("ボット名を" + name + "から" + name2 + "へと変更します");
        this.name = name2;
        }
        
    }


}