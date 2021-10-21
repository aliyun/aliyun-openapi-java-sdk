/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateGADInstanceRequest extends RpcAcsRequest<CreateGADInstanceResponse> {
	   

	private String dBList;

	private String centralDBInstanceId;

	private String centralRdsDtsAdminPassword;

	private String description;

	private String centralRdsDtsAdminAccount;

	private String centralRegionId;

	private List<UnitNode> unitNodes;
	public CreateGADInstanceRequest() {
		super("Rds", "2014-08-15", "CreateGADInstance", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBList() {
		return this.dBList;
	}

	public void setDBList(String dBList) {
		this.dBList = dBList;
		if(dBList != null){
			putQueryParameter("DBList", dBList);
		}
	}

	public String getCentralDBInstanceId() {
		return this.centralDBInstanceId;
	}

	public void setCentralDBInstanceId(String centralDBInstanceId) {
		this.centralDBInstanceId = centralDBInstanceId;
		if(centralDBInstanceId != null){
			putQueryParameter("CentralDBInstanceId", centralDBInstanceId);
		}
	}

	public String getCentralRdsDtsAdminPassword() {
		return this.centralRdsDtsAdminPassword;
	}

	public void setCentralRdsDtsAdminPassword(String centralRdsDtsAdminPassword) {
		this.centralRdsDtsAdminPassword = centralRdsDtsAdminPassword;
		if(centralRdsDtsAdminPassword != null){
			putQueryParameter("CentralRdsDtsAdminPassword", centralRdsDtsAdminPassword);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getCentralRdsDtsAdminAccount() {
		return this.centralRdsDtsAdminAccount;
	}

	public void setCentralRdsDtsAdminAccount(String centralRdsDtsAdminAccount) {
		this.centralRdsDtsAdminAccount = centralRdsDtsAdminAccount;
		if(centralRdsDtsAdminAccount != null){
			putQueryParameter("CentralRdsDtsAdminAccount", centralRdsDtsAdminAccount);
		}
	}

	public String getCentralRegionId() {
		return this.centralRegionId;
	}

	public void setCentralRegionId(String centralRegionId) {
		this.centralRegionId = centralRegionId;
		if(centralRegionId != null){
			putQueryParameter("CentralRegionId", centralRegionId);
		}
	}

	public List<UnitNode> getUnitNodes() {
		return this.unitNodes;
	}

	public void setUnitNodes(List<UnitNode> unitNodes) {
		this.unitNodes = unitNodes;	
		if (unitNodes != null) {
			for (int depth1 = 0; depth1 < unitNodes.size(); depth1++) {
				putQueryParameter("UnitNode." + (depth1 + 1) + ".DBInstanceStorage" , unitNodes.get(depth1).getDBInstanceStorage());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".ZoneIDSlave1" , unitNodes.get(depth1).getZoneIDSlave1());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".ZoneIDSlave2" , unitNodes.get(depth1).getZoneIDSlave2());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".EngineVersion" , unitNodes.get(depth1).getEngineVersion());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".DbInstanceClass" , unitNodes.get(depth1).getDbInstanceClass());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".SecurityIPList" , unitNodes.get(depth1).getSecurityIPList());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".VSwitchID" , unitNodes.get(depth1).getVSwitchID());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".RegionID" , unitNodes.get(depth1).getRegionID());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".Engine" , unitNodes.get(depth1).getEngine());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".DtsInstanceClass" , unitNodes.get(depth1).getDtsInstanceClass());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".VpcID" , unitNodes.get(depth1).getVpcID());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".ZoneID" , unitNodes.get(depth1).getZoneID());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".DBInstanceDescription" , unitNodes.get(depth1).getDBInstanceDescription());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".PayType" , unitNodes.get(depth1).getPayType());
				putQueryParameter("UnitNode." + (depth1 + 1) + ".DtsConflict" , unitNodes.get(depth1).getDtsConflict());
			}
		}	
	}

	public static class UnitNode {

		private Long dBInstanceStorage;

		private String zoneIDSlave1;

		private String zoneIDSlave2;

		private String engineVersion;

		private String dbInstanceClass;

		private String securityIPList;

		private String vSwitchID;

		private String regionID;

		private String engine;

		private String dtsInstanceClass;

		private String vpcID;

		private String zoneID;

		private String dBInstanceDescription;

		private String payType;

		private String dtsConflict;

		public Long getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Long dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public String getZoneIDSlave1() {
			return this.zoneIDSlave1;
		}

		public void setZoneIDSlave1(String zoneIDSlave1) {
			this.zoneIDSlave1 = zoneIDSlave1;
		}

		public String getZoneIDSlave2() {
			return this.zoneIDSlave2;
		}

		public void setZoneIDSlave2(String zoneIDSlave2) {
			this.zoneIDSlave2 = zoneIDSlave2;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getDbInstanceClass() {
			return this.dbInstanceClass;
		}

		public void setDbInstanceClass(String dbInstanceClass) {
			this.dbInstanceClass = dbInstanceClass;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getVSwitchID() {
			return this.vSwitchID;
		}

		public void setVSwitchID(String vSwitchID) {
			this.vSwitchID = vSwitchID;
		}

		public String getRegionID() {
			return this.regionID;
		}

		public void setRegionID(String regionID) {
			this.regionID = regionID;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getDtsInstanceClass() {
			return this.dtsInstanceClass;
		}

		public void setDtsInstanceClass(String dtsInstanceClass) {
			this.dtsInstanceClass = dtsInstanceClass;
		}

		public String getVpcID() {
			return this.vpcID;
		}

		public void setVpcID(String vpcID) {
			this.vpcID = vpcID;
		}

		public String getZoneID() {
			return this.zoneID;
		}

		public void setZoneID(String zoneID) {
			this.zoneID = zoneID;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDtsConflict() {
			return this.dtsConflict;
		}

		public void setDtsConflict(String dtsConflict) {
			this.dtsConflict = dtsConflict;
		}
	}

	@Override
	public Class<CreateGADInstanceResponse> getResponseClass() {
		return CreateGADInstanceResponse.class;
	}

}
