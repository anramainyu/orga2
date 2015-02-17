package Abteilung;

import Visitor.AbteilungsVisitor;import java.lang.Override;import java.lang.String;

/**
 * Created by sschiefer on 17.02.2015.
 */
public class Technik extends AbteilungKomponent<Technik>
{

    public Technik(String name) {
        super(name);
    }

    @Override
    public void accept(IVsistable<AbteilungsVisitor> v) {

    }
}
