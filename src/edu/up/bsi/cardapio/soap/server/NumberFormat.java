
package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de numberFormat complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="numberFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://server.soap.cardapio.bsi.up.edu/}format">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://server.soap.cardapio.bsi.up.edu/}currency" minOccurs="0"/>
 *         &lt;element name="groupingUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maximumFractionDigits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximumIntegerDigits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minimumFractionDigits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minimumIntegerDigits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parseIntegerOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="roundingMode" type="{http://server.soap.cardapio.bsi.up.edu/}roundingMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numberFormat", propOrder = {
    "currency",
    "groupingUsed",
    "maximumFractionDigits",
    "maximumIntegerDigits",
    "minimumFractionDigits",
    "minimumIntegerDigits",
    "parseIntegerOnly",
    "roundingMode"
})
public abstract class NumberFormat
    extends Format
{

    protected Currency currency;
    protected boolean groupingUsed;
    protected int maximumFractionDigits;
    protected int maximumIntegerDigits;
    protected int minimumFractionDigits;
    protected int minimumIntegerDigits;
    protected boolean parseIntegerOnly;
    @XmlSchemaType(name = "string")
    protected RoundingMode roundingMode;

    /**
     * Obtém o valor da propriedade currency.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Define o valor da propriedade currency.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Obtém o valor da propriedade groupingUsed.
     * 
     */
    public boolean isGroupingUsed() {
        return groupingUsed;
    }

    /**
     * Define o valor da propriedade groupingUsed.
     * 
     */
    public void setGroupingUsed(boolean value) {
        this.groupingUsed = value;
    }

    /**
     * Obtém o valor da propriedade maximumFractionDigits.
     * 
     */
    public int getMaximumFractionDigits() {
        return maximumFractionDigits;
    }

    /**
     * Define o valor da propriedade maximumFractionDigits.
     * 
     */
    public void setMaximumFractionDigits(int value) {
        this.maximumFractionDigits = value;
    }

    /**
     * Obtém o valor da propriedade maximumIntegerDigits.
     * 
     */
    public int getMaximumIntegerDigits() {
        return maximumIntegerDigits;
    }

    /**
     * Define o valor da propriedade maximumIntegerDigits.
     * 
     */
    public void setMaximumIntegerDigits(int value) {
        this.maximumIntegerDigits = value;
    }

    /**
     * Obtém o valor da propriedade minimumFractionDigits.
     * 
     */
    public int getMinimumFractionDigits() {
        return minimumFractionDigits;
    }

    /**
     * Define o valor da propriedade minimumFractionDigits.
     * 
     */
    public void setMinimumFractionDigits(int value) {
        this.minimumFractionDigits = value;
    }

    /**
     * Obtém o valor da propriedade minimumIntegerDigits.
     * 
     */
    public int getMinimumIntegerDigits() {
        return minimumIntegerDigits;
    }

    /**
     * Define o valor da propriedade minimumIntegerDigits.
     * 
     */
    public void setMinimumIntegerDigits(int value) {
        this.minimumIntegerDigits = value;
    }

    /**
     * Obtém o valor da propriedade parseIntegerOnly.
     * 
     */
    public boolean isParseIntegerOnly() {
        return parseIntegerOnly;
    }

    /**
     * Define o valor da propriedade parseIntegerOnly.
     * 
     */
    public void setParseIntegerOnly(boolean value) {
        this.parseIntegerOnly = value;
    }

    /**
     * Obtém o valor da propriedade roundingMode.
     * 
     * @return
     *     possible object is
     *     {@link RoundingMode }
     *     
     */
    public RoundingMode getRoundingMode() {
        return roundingMode;
    }

    /**
     * Define o valor da propriedade roundingMode.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingMode }
     *     
     */
    public void setRoundingMode(RoundingMode value) {
        this.roundingMode = value;
    }

}
