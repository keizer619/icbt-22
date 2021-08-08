/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visibility;

/**
 *
 * @author root
 */
public class Undergradute extends Student {
    
    public void test() {
        String nomod = this.nomod;
        String pub = this.pub;
        String prot = this.prot;
        //String pvt = this.pvt;
    }
    
}
