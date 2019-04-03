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
public class CreateDrdsDBPreviewRequest extends RpcAcsRequest<CreateDrdsDBPreviewResponse> {
	
	public CreateDrdsDBPreviewRequest() {
		super("Drds", "2019-01-23", "CreateDrdsDBPreview");
	}

	private List<InstDbName> instDbNames;

	private String dbName;

	private String accountName;

	private List<String> rdsInstances;

	private String type;

	private String dbInstType;

	private String drdsInstanceId;

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

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
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

	public String getDbInstType() {
		return this.dbInstType;
	}

	public void setDbInstType(String dbInstType) {
		this.dbInstType = dbInstType;
		if(dbInstType != null){
			putQueryParameter("DbInstType", dbInstType);
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
	public Class<CreateDrdsDBPreviewResponse> getResponseClass() {
		return CreateDrdsDBPreviewResponse.class;
	}

}
