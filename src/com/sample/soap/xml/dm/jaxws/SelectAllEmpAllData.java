
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

@XmlRootElement(name = "selectAllEmpAllData", namespace = "http://dm.xml.soap.sample.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectAllEmpAllData", namespace = "http://dm.xml.soap.sample.com/")

public class SelectAllEmpAllData {

    @XmlElement(name = "arg0")
    private com.sample.soap.xml.types.EmpAddress arg0;

    public com.sample.soap.xml.types.EmpAddress getArg0() {
        return this.arg0;
    }

    public void setArg0(com.sample.soap.xml.types.EmpAddress newArg0)  {
        this.arg0 = newArg0;
    }

}

