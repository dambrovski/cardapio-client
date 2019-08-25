
package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_empresaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_empresaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados_empresa_resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_empresaResponse", propOrder = {
    "dadosEmpresaResultado"
})
public class DadosEmpresaResponse {

    @XmlElement(name = "dados_empresa_resultado")
    protected String dadosEmpresaResultado;

    /**
     * Obtém o valor da propriedade dadosEmpresaResultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadosEmpresaResultado() {
        return dadosEmpresaResultado;
    }

    /**
     * Define o valor da propriedade dadosEmpresaResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadosEmpresaResultado(String value) {
        this.dadosEmpresaResultado = value;
    }

}
