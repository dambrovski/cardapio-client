
package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de login_usuarioResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="login_usuarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login_usuario_resultado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "login_usuarioResponse", propOrder = {
    "loginUsuarioResultado"
})
public class LoginUsuarioResponse {

    @XmlElement(name = "login_usuario_resultado")
    protected boolean loginUsuarioResultado;

    /**
     * Obtém o valor da propriedade loginUsuarioResultado.
     * 
     */
    public boolean isLoginUsuarioResultado() {
        return loginUsuarioResultado;
    }

    /**
     * Define o valor da propriedade loginUsuarioResultado.
     * 
     */
    public void setLoginUsuarioResultado(boolean value) {
        this.loginUsuarioResultado = value;
    }

}
