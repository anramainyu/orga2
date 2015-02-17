package Abteilung;


import Merkmale.EAbteilung;

import java.lang.String;import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sschiefer on 17.02.2015.
 */
public abstract class AbteilungKomponent<E> implements IVsistable<E>
{
    private String name;
    private ArrayList<E> abteilung;
    private ArrayList mitarbeiter;


    public AbteilungKomponent(String name)
    {
        this.abteilung = new ArrayList<E>();
        this.name=name;
    }

    public ArrayList<E> getAbteilungListe()
    {
        return abteilung;
    }

    public Iterator<E> iterator()
    {
        return abteilung.iterator();
    }

    public void addAbteilung(E elem)
    {
        abteilung.add(elem);
    }
}
