package com.beginner.oop.inheritance;

public class JavaProgrammer extends Programmer {
    private int javaVersion;

    public JavaProgrammer(String name, String language, int javaVersion) {
        super(name, language);
        this.javaVersion = javaVersion;
    }

    public int getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(int javaVersion) {
        this.javaVersion = javaVersion;
    }

    @Override
    public String writeCode() {
        return "Пишу на Java";
    }


}
