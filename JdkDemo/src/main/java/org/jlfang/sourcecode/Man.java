package org.jlfang.sourcecode;

/**
 * @author Cris
 * @description
 * @date 2019/9/17
 */
public class Man extends Person {

    private Ability superPower;

    private Short val;

    public Man(){
        this.superPower = ability;
    }

    public Man(Short val){
        this.val = val;
    }

    public Ability getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Ability superPower) {
        this.superPower = superPower;
    }

    public Short getVal() {
        return val;
    }

    public void setVal(Short val) {
        this.val = val;
    }
}
