
package com.sample.soap.xml.dm.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.16
 * Tue Dec 13 18:51:29 IST 2016
 * Generated source version: 2.6.16
 */

@XmlRootElement(name = "selectAllEmpAllDataResponse", namespace = "http://dm.xml.soap.sample.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectAllEmpAllDataResponse", namespace = "http://dm.xml.soap.sample.com/")

public class SelectAllEmpAllDataResponse {

    @XmlElement(name = "return")
    private java.util.List<com.sample.soap.xml.types.EmpDetails> _return;

    public java.util.List<com.sample.soap.xml.types.EmpDetails> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<com.sample.soap.xml.types.EmpDetails> new_return)  {
        this._return = new_return;
    }

}
