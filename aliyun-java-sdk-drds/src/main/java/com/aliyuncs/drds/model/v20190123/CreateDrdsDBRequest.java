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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDrdsDBRequest extends RpcAcsRequest<CreateDrdsDBResponse> {
	   

	private String encode;

	private List<String> rdsInstances;

	private String type;

	private String password;

	private List<RdsSuperAccount> rdsSuperAccounts;

	private String accountName;

	private String drdsInstanceId;

	private Boolean dbInstanceIsCreating;

	private List<InstDbName> instDbNames;

	private String dbName;

	private String dbInstType;
	public CreateDrdsDBRequest() {
		super("Drds", "2019-01-23", "CreateDrdsDB", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEncode() {
		return this.encode;
	}

	public void setEncode(String encode) {
		this.encode = encode;
		if(encode != null){
			putQueryParameter("Encode", encode);
		}
	}

	public List<String> getRdsInstances() {
		return this.rdsInstances;
	}

	public void setRdsInstances(List<String> rdsInstances) {
		this.rdsInstances = rdsInstances;	
		if (rdsInstances != null) {
			for (int i = 0; i < rdsInstances.size(); i++) {
				putQueryParameter("RdsInstance." + (i + 1) , rdsInstances.get(i));
			}
		}	
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public List<RdsSuperAccount> getRdsSuperAccounts() {
		return this.rdsSuperAccounts;
	}

	public void setRdsSuperAccounts(List<RdsSuperAccount> rdsSuperAccounts) {
		this.rdsSuperAccounts = rdsSuperAccounts;	
		if (rdsSuperAccounts != null) {
			for (int depth1 = 0; depth1 < rdsSuperAccounts.size(); depth1++) {
				putQueryParameter("RdsSuperAccount." + (depth1 + 1) + ".Password" , rdsSuperAccounts.get(depth1).getPassword());
				putQueryParameter("RdsSuperAccount." + (depth1 + 1) + ".AccountName" , rdsSuperAccounts.get(depth1).getAccountName());
				putQueryParameter("RdsSuperAccount." + (depth1 + 1) + ".DbInstanceId" , rdsSuperAccounts.get(depth1).getDbInstanceId());
			}
		}	
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
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

	public Boolean getDbInstanceIsCreating() {
		return this.dbInstanceIsCreating;
	}

	public void setDbInstanceIsCreating(Boolean dbInstanceIsCreating) {
		this.dbInstanceIsCreating = dbInstanceIsCreating;
		if(dbInstanceIsCreating != null){
			putQueryParameter("DbInstanceIsCreating", dbInstanceIsCreating.toString());
		}
	}

	public List<InstDbName> getInstDbNames() {
		return this.instDbNames;
	}

	public void setInstDbNames(List<InstDbName> instDbNames) {
		this.instDbNames = instDbNames;	
		if (instDbNames != null) {
			for (int depth1 = 0; depth1 < instDbNames.size(); depth1++) {
				if (instDbNames.get(depth1).getShardDbNames() != null) {
					for (int i = 0; i < instDbNames.get(depth1).getShardDbNames().size(); i++) {
						putQueryParameter("InstDbName." + (depth1 + 1) + ".ShardDbName." + (i + 1) , instDbNames.get(depth1).getShardDbNames().get(i));
					}
				}
				putQueryParameter("InstDbName." + (depth1 + 1) + ".DbInstanceId" , instDbNames.get(depth1).getDbInstanceId());
			}
		}	
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getDbInstType() {
		return this.dbInstType;
	}

	public void setDbInstType(String dbInstType) {
		this.dbInstType = dbInstType;
		if(dbInstType != null){
			putQueryParameter("DbInstType", dbInstType);
		}
	}

	public static class RdsSuperAccount {

		private String password;

		private String accountName;

		private String dbInstanceId;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}
	}

	public static class InstDbName {

		private List<String> shardDbNames;

		private String dbInstanceId;

		public List<String> getShardDbNames() {
			return this.shardDbNames;
		}

		public void setShardDbNames(List<String> shardDbNames) {
			this.shardDbNames = shardDbNames;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}
	}

	@Override
	public Class<CreateDrdsDBResponse> getResponseClass() {
		return CreateDrdsDBResponse.class;
	}

}
