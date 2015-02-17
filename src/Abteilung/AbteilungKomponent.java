package Abteilung;


import Merkmale.EAbteilung;
import Merkmale.EMitarbeiter;
import Visitor.AbteilungsVisitor;

import java.lang.String;import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sschiefer on 17.02.2015.
 */
public class AbteilungKomponent<E> implements IVsistable<E>
{
    EAbteilung abteilung;
    EMitarbeiter mitarbeiter;

    private String name;
    private ArrayList<E> abteilungListe;
    private ArrayList mitarbeiterListe;


    public AbteilungKomponent(EAbteilung abteilung)
    {
        this.abteilungListe = new ArrayList<E>();
        this.abteilung=abteilung;
    }

    // Der Builder - nested class
    public static class AbteilungBuilder
    {
        private AbteilungKomponent abt;

        //der Konstruktor des Builders - Pflichtattribute
        private AbteilungBuilder(EAbteilung abteilung)
        {
            abt= new AbteilungKomponent(abteilung);
            abt.mitarbeiter=EMitarbeiter.ABTEILUNGSLEITER;
        }

    }

    public ArrayList<E> getAbteilungListe()
    {
        return abteilungListe;
    }

    public Iterator<E> iterator()
    {
        return abteilungListe.iterator();
    }

    public void addAbteilung(E elem)
    {
        abteilungListe.add(elem);
    }

    @Override
    public void accept(IVsistable<AbteilungsVisitor> v) {

    }
}
