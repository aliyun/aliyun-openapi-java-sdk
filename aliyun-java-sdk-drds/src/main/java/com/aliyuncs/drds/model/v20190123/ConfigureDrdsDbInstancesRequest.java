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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ConfigureDrdsDbInstancesRequest extends RpcAcsRequest<ConfigureDrdsDbInstancesResponse> {
	
	public ConfigureDrdsDbInstancesRequest() {
		super("Drds", "2019-01-23", "ConfigureDrdsDbInstances", "drds");
	}

	private String dbName;

	private List<DbInstance> dbInstances;

	private String drdsInstanceId;

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public List<DbInstance> getDbInstances() {
		return this.dbInstances;
	}

	public void setDbInstances(List<DbInstance> dbInstances) {
		this.dbInstances = dbInstances;	
		if (dbInstances != null) {
			for (int depth1 = 0; depth1 < dbInstances.size(); depth1++) {
				putQueryParameter("DbInstance." + (depth1 + 1) + ".SlaveDbInstanceType" , dbInstances.get(depth1).getSlaveDbInstanceType());
				putQueryParameter("DbInstance." + (depth1 + 1) + ".SlaveDbInstanceId" , dbInstances.get(depth1).getSlaveDbInstanceId());
				putQueryParameter("DbInstance." + (depth1 + 1) + ".MasterDbInstanceId" , dbInstances.get(depth1).getMasterDbInstanceId());
			}
		}	
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public static class DbInstance {

		private String slaveDbInstanceType;

		private String slaveDbInstanceId;

		private String masterDbInstanceId;

		public String getSlaveDbInstanceType() {
			return this.slaveDbInstanceType;
		}

		public void setSlaveDbInstanceType(String slaveDbInstanceType) {
			this.slaveDbInstanceType = slaveDbInstanceType;
		}

		public String getSlaveDbInstanceId() {
			return this.slaveDbInstanceId;
		}

		public void setSlaveDbInstanceId(String slaveDbInstanceId) {
			this.slaveDbInstanceId = slaveDbInstanceId;
		}

		public String getMasterDbInstanceId() {
			return this.masterDbInstanceId;
		}

		public void setMasterDbInstanceId(String masterDbInstanceId) {
			this.masterDbInstanceId = masterDbInstanceId;
		}
	}

	@Override
	public Class<ConfigureDrdsDbInstancesResponse> getResponseClass() {
		return ConfigureDrdsDbInstancesResponse.class;
	}

}
