
package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de um_alimentoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="um_alimentoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="um_alimento_resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "um_alimentoResponse", propOrder = {
    "umAlimentoResultado"
})
public class UmAlimentoResponse {

    @XmlElement(name = "um_alimento_resultado")
    protected String umAlimentoResultado;

    /**
     * Obtém o valor da propriedade umAlimentoResultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmAlimentoResultado() {
        return umAlimentoResultado;
    }

    /**
     * Define o valor da propriedade umAlimentoResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmAlimentoResultado(String value) {
        this.umAlimentoResultado = value;
    }

}
