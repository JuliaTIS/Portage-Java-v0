/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;

/**
 *
 * @author dulacj
 */
public class EcritureXML {

    public EcritureXML(DossierMedical dm) {

        this.dm = dm;

    }

    private DossierMedical dm;

    public void setXML() {

        XMLOutputFactory factory = XMLOutputFactory.newInstance();

        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(
                    new FileWriter("src/donnees/test.xml"));
            writer.writeStartDocument();

            writer.writeStartElement("dossiers");

            for (int i = 0; i < dm.getFiches().size(); i++) {
                writer.writeStartElement("ficheDeSoins");
                writer.writeStartElement("date");
                // ecrire la date de la fiche de soin 
                writer.writeCharacters(dm.getFiches().get(i).getDate().toString());
                writer.writeEndElement();

                writer.writeStartElement("medecin"); // start medecin 

                writer.writeStartElement("nom");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getNom());
                writer.writeEndElement();

                writer.writeStartElement("prenom");

                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getPrenom());
                writer.writeEndElement();

                writer.writeStartElement("specialite");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getSpecialite());
                writer.writeEndElement();

                writer.writeEndElement(); // end de medecin 

                writer.writeStartElement("patient"); // start patient 

                writer.writeStartElement("nom");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNom());
                writer.writeEndElement();

                writer.writeStartElement("prenom");

                writer.writeCharacters(dm.getFiches().get(i).getPatient().getPrenom());
                writer.writeEndElement();

                writer.writeStartElement("secu");

                writer.writeCharacters(dm.getFiches().get(i).getPatient().getSecu());
                writer.writeEndElement();

                writer.writeEndElement(); // end patient

                for (int j = 0; j < dm.getFiches().get(i).getActes().size(); j++) {
                    writer.writeStartElement("acte"); // start acte 

                    writer.writeStartElement("code");
                    writer.writeCharacters(dm.getFiches().get(i).getActes().get(j).getCode().toString());
                    writer.writeEndElement();

                    Integer coef1 = dm.getFiches().get(i).getActes().get(j).getCoef();

                    writer.writeStartElement("coef");
                    writer.writeCharacters(coef1.toString());
                    writer.writeEndElement();

                    writer.writeEndElement(); // end acte 
                }

                writer.writeEndElement(); // end fiche de soins 

            }

            writer.writeEndDocument();

            writer.flush();
            writer.close();

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
