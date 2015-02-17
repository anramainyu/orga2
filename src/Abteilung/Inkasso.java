package Abteilung;

import Visitor.AbteilungsVisitor;import java.lang.Override;import java.lang.String;

/**
 * Created by sschiefer on 17.02.2015.
 */
public class Inkasso extends AbteilungKomponent<Inkasso>
{

    public Inkasso(String name) {
        super(name);
    }

    @Override
    public void accept(IVsistable<AbteilungsVisitor> v) {

    }
}
