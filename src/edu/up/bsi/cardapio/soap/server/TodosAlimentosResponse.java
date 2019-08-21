
package edu.up.bsi.cardapio.soap.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de todos_alimentosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="todos_alimentosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="todos_alimentos_resultado" type="{http://server.soap.cardapio.bsi.up.edu/}alimentoCardapio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "todos_alimentosResponse", propOrder = {
    "todosAlimentosResultado"
})
public class TodosAlimentosResponse {

    @XmlElement(name = "todos_alimentos_resultado")
    protected List<AlimentoCardapio> todosAlimentosResultado;

    /**
     * Gets the value of the todosAlimentosResultado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the todosAlimentosResultado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTodosAlimentosResultado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlimentoCardapio }
     * 
     * 
     */
    public List<AlimentoCardapio> getTodosAlimentosResultado() {
        if (todosAlimentosResultado == null) {
            todosAlimentosResultado = new ArrayList<AlimentoCardapio>();
        }
        return this.todosAlimentosResultado;
    }

}
