package com.sample.soap.xml.dm;

import java.util.List;

import javax.jws.WebService;

import com.sample.soap.xml.types.EmpAddress;
import com.sample.soap.xml.types.EmpConfigIdentifier;
import com.sample.soap.xml.types.EmpDetails;

/**
 * @author mlahariya
 * @version 1.0, Nov 2016
 */

@WebService(name = "MathsDbService", targetNamespace = "http://dm.xml.soap.sample.com/")
public interface MathsDbService {

	public EmpDetails queryEmpConfigs(EmpConfigIdentifier id);

	public List<EmpDetails> selectAllEmpAllData(EmpAddress empAddr);

}
