//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.27 at 03:14:11 PM EST 
//


package com.tallgeorge.dwml.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for heightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="heightType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
 *       &lt;attribute name="datum" use="required" type="{}datumType" />
 *       &lt;attribute name="height-units" type="{}height-unitsType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heightType", propOrder = {
    "value"
})
public class HeightType {

    @XmlValue
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger value;
    @XmlAttribute(name = "datum", required = true)
    protected DatumType datum;
    @XmlAttribute(name = "height-units")
    protected HeightUnitsType heightUnits;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link DatumType }
     *     
     */
    public DatumType getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumType }
     *     
     */
    public void setDatum(DatumType value) {
        this.datum = value;
    }

    /**
     * Gets the value of the heightUnits property.
     * 
     * @return
     *     possible object is
     *     {@link HeightUnitsType }
     *     
     */
    public HeightUnitsType getHeightUnits() {
        return heightUnits;
    }

    /**
     * Sets the value of the heightUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightUnitsType }
     *     
     */
    public void setHeightUnits(HeightUnitsType value) {
        this.heightUnits = value;
    }

}
