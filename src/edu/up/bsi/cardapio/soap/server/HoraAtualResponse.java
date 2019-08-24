
package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de hora_atualResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="hora_atualResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hora_atual_resultado" type="{http://server.soap.cardapio.bsi.up.edu/}simpleDateFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hora_atualResponse", propOrder = {
    "horaAtualResultado"
})
public class HoraAtualResponse {

    @XmlElement(name = "hora_atual_resultado")
    protected SimpleDateFormat horaAtualResultado;

    /**
     * Obt�m o valor da propriedade horaAtualResultado.
     * 
     * @return
     *     possible object is
     *     {@link SimpleDateFormat }
     *     
     */
    public SimpleDateFormat getHoraAtualResultado() {
        return horaAtualResultado;
    }

    /**
     * Define o valor da propriedade horaAtualResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleDateFormat }
     *     
     */
    public void setHoraAtualResultado(SimpleDateFormat value) {
        this.horaAtualResultado = value;
    }

}
