package Abteilung;

import Visitor.AbteilungsVisitor;

/**
 * Created by sschiefer on 17.02.2015.
 */
public interface IVsistable<E>
{
    abstract void accept(IVsistable<AbteilungsVisitor> v);
}
