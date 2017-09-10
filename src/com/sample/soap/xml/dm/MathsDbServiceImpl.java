package com.sample.soap.xml.dm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.sample.soap.xml.types.EmpAddress;
import com.sample.soap.xml.types.EmpConfigIdentifier;
import com.sample.soap.xml.types.EmpDetails;

/**
 * @author mlahariya
 * @version 1.0, Nov 2016
 */

@WebService(targetNamespace = "http://dm.xml.soap.sample.com/", endpointInterface = "com.sample.soap.xml.dm.MathsDbService", portName = "MathsDbServiceImplPort", serviceName = "MathsDbServiceImplService")
public class MathsDbServiceImpl implements MathsDbService {

	private static final String getEmployeeById = "select * from employee where id = ? ";
	private static final String getAllEmpByAddress = "select * from employee where address = ? ";

	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultset = null;

	@Override
	public EmpDetails queryEmpConfigs(EmpConfigIdentifier id) {

		EmpDetails empDetails = null;

		try {

			connection = this.getMySqlConnection();
			System.out.println("connection is : " + connection);
			preparedStatement = connection.prepareStatement(getEmployeeById);
			preparedStatement.setInt(1, id.getId());
			resultset = preparedStatement.executeQuery();

			while (resultset.next()) {

				empDetails = new EmpDetails();
				empDetails.setId(resultset.getInt("id"));
				empDetails.setFirstName(resultset.getString("firstName"));
				empDetails.setLastName(resultset.getString("lastName"));
				empDetails.setAddress(resultset.getString("address"));
				empDetails.setCity(resultset.getString("city"));
				empDetails.setEmail(resultset.getString("email"));
				empDetails.setMobile(resultset.getString("mobile"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.cleanup(connection, preparedStatement, resultset);
		}
		return empDetails;

	}

	@Override
	public List<EmpDetails> selectAllEmpAllData(EmpAddress empAddr) {

		List<EmpDetails> empDetailList = null;
		EmpDetails empDetails = null;

		try {

			connection = this.getMySqlConnection();
			System.out.println("connection is : " + connection);
			preparedStatement = connection.prepareStatement(getAllEmpByAddress);
			preparedStatement.setString(1, empAddr.getAddress());
			resultset = preparedStatement.executeQuery();
			empDetailList = new ArrayList<EmpDetails>();
			while (resultset.next()) {

				empDetails = new EmpDetails();
				empDetails.setId(resultset.getInt("id"));
				empDetails.setFirstName(resultset.getString("firstName"));
				empDetails.setLastName(resultset.getString("lastName"));
				empDetails.setAddress(resultset.getString("address"));
				empDetails.setCity(resultset.getString("city"));
				empDetails.setEmail(resultset.getString("email"));
				empDetails.setMobile(resultset.getString("mobile"));
				empDetailList.add(empDetails);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.cleanup(connection, preparedStatement, resultset);
		}
		return empDetailList;

	}

	private Connection getMySqlConnection() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/springboot", "root", "root");
		return con;
	}

	private void cleanup(Connection con, PreparedStatement st, ResultSet rs) {

		try {
			if (con != null)
				con.close();
			if (st != null)
				st.close();
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
