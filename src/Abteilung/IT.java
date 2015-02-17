package Abteilung;

import Visitor.AbteilungsVisitor;import java.lang.Override;import java.lang.String;

/**
 * Created by sschiefer on 17.02.2015.
 */
public class IT extends AbteilungKomponent<IT>
{


    public IT(String name) {
        super(name);
    }

    @Override
    public void accept(IVsistable<AbteilungsVisitor> v) {

    }
}
