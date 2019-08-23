
package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de hora_atualResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="hora_atualResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hora_atual_resultado" type="{http://server.soap.cardapio.bsi.up.edu/}date" minOccurs="0"/>
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
    protected Date horaAtualResultado;

    /**
     * Obtém o valor da propriedade horaAtualResultado.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getHoraAtualResultado() {
        return horaAtualResultado;
    }

    /**
     * Define o valor da propriedade horaAtualResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setHoraAtualResultado(Date value) {
        this.horaAtualResultado = value;
    }

}
