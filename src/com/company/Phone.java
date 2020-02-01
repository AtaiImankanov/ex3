package com.company;

public class Phone implements Zvonkoe  {
    private  String model;
    @Override
    public void zvonit() {
        System.out.println("zzzzzzzzzz");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
