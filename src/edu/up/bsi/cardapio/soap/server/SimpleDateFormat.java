
package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de simpleDateFormat complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="simpleDateFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://server.soap.cardapio.bsi.up.edu/}dateFormat">
 *       &lt;sequence>
 *         &lt;element name="2DigitYearStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFormatSymbols" type="{http://server.soap.cardapio.bsi.up.edu/}dateFormatSymbols" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleDateFormat", propOrder = {
    "_2DigitYearStart",
    "dateFormatSymbols"
})
public class SimpleDateFormat
    extends DateFormat
{

    @XmlElement(name = "2DigitYearStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar _2DigitYearStart;
    protected DateFormatSymbols dateFormatSymbols;

    /**
     * Obtém o valor da propriedade 2DigitYearStart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get2DigitYearStart() {
        return _2DigitYearStart;
    }

    /**
     * Define o valor da propriedade 2DigitYearStart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set2DigitYearStart(XMLGregorianCalendar value) {
        this._2DigitYearStart = value;
    }

    /**
     * Obtém o valor da propriedade dateFormatSymbols.
     * 
     * @return
     *     possible object is
     *     {@link DateFormatSymbols }
     *     
     */
    public DateFormatSymbols getDateFormatSymbols() {
        return dateFormatSymbols;
    }

    /**
     * Define o valor da propriedade dateFormatSymbols.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormatSymbols }
     *     
     */
    public void setDateFormatSymbols(DateFormatSymbols value) {
        this.dateFormatSymbols = value;
    }

}
