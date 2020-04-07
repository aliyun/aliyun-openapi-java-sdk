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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateBackupSourceGroupRequest extends RpcAcsRequest<UpdateBackupSourceGroupResponse> {
	   

	private List<BackupSource> backupSources;

	private String description;

	private Boolean implicitlyCreateBackupSources;

	private List<String> backupSourceIds;

	private String backupSourceGroupId;
	public UpdateBackupSourceGroupRequest() {
		super("hbr", "2017-09-08", "UpdateBackupSourceGroup", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<BackupSource> getBackupSources() {
		return this.backupSources;
	}

	public void setBackupSources(List<BackupSource> backupSources) {
		this.backupSources = backupSources;	
		if (backupSources != null) {
			for (int depth1 = 0; depth1 < backupSources.size(); depth1++) {
				putQueryParameter("BackupSource." + (depth1 + 1) + ".BackupSourceId" , backupSources.get(depth1).getBackupSourceId());
				putQueryParameter("BackupSource." + (depth1 + 1) + ".DatabaseName" , backupSources.get(depth1).getDatabaseName());
				putQueryParameter("BackupSource." + (depth1 + 1) + ".Description" , backupSources.get(depth1).getDescription());
				putQueryParameter("BackupSource." + (depth1 + 1) + ".ClusterId" , backupSources.get(depth1).getClusterId());
			}
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

	public Boolean getImplicitlyCreateBackupSources() {
		return this.implicitlyCreateBackupSources;
	}

	public void setImplicitlyCreateBackupSources(Boolean implicitlyCreateBackupSources) {
		this.implicitlyCreateBackupSources = implicitlyCreateBackupSources;
		if(implicitlyCreateBackupSources != null){
			putQueryParameter("ImplicitlyCreateBackupSources", implicitlyCreateBackupSources.toString());
		}
	}

	public List<String> getBackupSourceIds() {
		return this.backupSourceIds;
	}

	public void setBackupSourceIds(List<String> backupSourceIds) {
		this.backupSourceIds = backupSourceIds;	
		if (backupSourceIds != null) {
			for (int i = 0; i < backupSourceIds.size(); i++) {
				putQueryParameter("BackupSourceId." + (i + 1) , backupSourceIds.get(i));
			}
		}	
	}

	public String getBackupSourceGroupId() {
		return this.backupSourceGroupId;
	}

	public void setBackupSourceGroupId(String backupSourceGroupId) {
		this.backupSourceGroupId = backupSourceGroupId;
		if(backupSourceGroupId != null){
			putQueryParameter("BackupSourceGroupId", backupSourceGroupId);
		}
	}

	public static class BackupSource {

		private String backupSourceId;

		private String databaseName;

		private String description;

		private String clusterId;

		public String getBackupSourceId() {
			return this.backupSourceId;
		}

		public void setBackupSourceId(String backupSourceId) {
			this.backupSourceId = backupSourceId;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}
	}

	@Override
	public Class<UpdateBackupSourceGroupResponse> getResponseClass() {
		return UpdateBackupSourceGroupResponse.class;
	}

}
