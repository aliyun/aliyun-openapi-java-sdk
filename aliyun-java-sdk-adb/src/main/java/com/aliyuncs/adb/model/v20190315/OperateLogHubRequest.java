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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OperateLogHubRequest extends RpcAcsRequest<OperateLogHubResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	private String deliverName;

	private String deliverTime;

	private String password;

	private String provider;

	private Boolean create;

	private String tableName;

	private String projectName;

	private String schemaName;

	private String logStoreName;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	private List<LogHubStores> logHubStoress;

	private Boolean filterDirtyData;

	private String userName;
	public OperateLogHubRequest() {
		super("adb", "2019-03-15", "OperateLogHub", "ads");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getDeliverName() {
		return this.deliverName;
	}

	public void setDeliverName(String deliverName) {
		this.deliverName = deliverName;
		if(deliverName != null){
			putQueryParameter("DeliverName", deliverName);
		}
	}

	public String getDeliverTime() {
		return this.deliverTime;
	}

	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
		if(deliverTime != null){
			putQueryParameter("DeliverTime", deliverTime);
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

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
		if(provider != null){
			putQueryParameter("Provider", provider);
		}
	}

	public Boolean getCreate() {
		return this.create;
	}

	public void setCreate(Boolean create) {
		this.create = create;
		if(create != null){
			putQueryParameter("Create", create.toString());
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getSchemaName() {
		return this.schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
		if(schemaName != null){
			putQueryParameter("SchemaName", schemaName);
		}
	}

	public String getLogStoreName() {
		return this.logStoreName;
	}

	public void setLogStoreName(String logStoreName) {
		this.logStoreName = logStoreName;
		if(logStoreName != null){
			putQueryParameter("LogStoreName", logStoreName);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<LogHubStores> getLogHubStoress() {
		return this.logHubStoress;
	}

	public void setLogHubStoress(List<LogHubStores> logHubStoress) {
		this.logHubStoress = logHubStoress;	
		if (logHubStoress != null) {
			for (int depth1 = 0; depth1 < logHubStoress.size(); depth1++) {
				putQueryParameter("LogHubStores." + (depth1 + 1) + ".LogKey" , logHubStoress.get(depth1).getLogKey());
				putQueryParameter("LogHubStores." + (depth1 + 1) + ".FieldKey" , logHubStoress.get(depth1).getFieldKey());
			}
		}	
	}

	public Boolean getFilterDirtyData() {
		return this.filterDirtyData;
	}

	public void setFilterDirtyData(Boolean filterDirtyData) {
		this.filterDirtyData = filterDirtyData;
		if(filterDirtyData != null){
			putQueryParameter("FilterDirtyData", filterDirtyData.toString());
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	public static class LogHubStores {

		private String logKey;

		private String fieldKey;

		public String getLogKey() {
			return this.logKey;
		}

		public void setLogKey(String logKey) {
			this.logKey = logKey;
		}

		public String getFieldKey() {
			return this.fieldKey;
		}

		public void setFieldKey(String fieldKey) {
			this.fieldKey = fieldKey;
		}
	}

	@Override
	public Class<OperateLogHubResponse> getResponseClass() {
		return OperateLogHubResponse.class;
	}

}
