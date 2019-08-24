
package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de dateFormat complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dateFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://server.soap.cardapio.bsi.up.edu/}format">
 *       &lt;sequence>
 *         &lt;element name="calendar" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lenient" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numberFormat" type="{http://server.soap.cardapio.bsi.up.edu/}numberFormat" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://server.soap.cardapio.bsi.up.edu/}timeZone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateFormat", propOrder = {
    "calendar",
    "lenient",
    "numberFormat",
    "timeZone"
})
@XmlSeeAlso({
    SimpleDateFormat.class
})
public abstract class DateFormat
    extends Format
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calendar;
    protected boolean lenient;
    protected NumberFormat numberFormat;
    protected TimeZone timeZone;

    /**
     * Obtém o valor da propriedade calendar.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalendar() {
        return calendar;
    }

    /**
     * Define o valor da propriedade calendar.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalendar(XMLGregorianCalendar value) {
        this.calendar = value;
    }

    /**
     * Obtém o valor da propriedade lenient.
     * 
     */
    public boolean isLenient() {
        return lenient;
    }

    /**
     * Define o valor da propriedade lenient.
     * 
     */
    public void setLenient(boolean value) {
        this.lenient = value;
    }

    /**
     * Obtém o valor da propriedade numberFormat.
     * 
     * @return
     *     possible object is
     *     {@link NumberFormat }
     *     
     */
    public NumberFormat getNumberFormat() {
        return numberFormat;
    }

    /**
     * Define o valor da propriedade numberFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberFormat }
     *     
     */
    public void setNumberFormat(NumberFormat value) {
        this.numberFormat = value;
    }

    /**
     * Obtém o valor da propriedade timeZone.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Define o valor da propriedade timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

}
