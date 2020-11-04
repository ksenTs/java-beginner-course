package com.beginner.oop.inheritance;

public class CProgrammer extends Programmer {
    private String standard;

    CProgrammer(String name, String language, String standard) {
        super(name, language);
        this.standard = standard;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public String writeCode() {
        return "Пишу на С";
    }



}
