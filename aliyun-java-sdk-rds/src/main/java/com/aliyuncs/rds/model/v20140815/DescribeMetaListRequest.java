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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetaListRequest extends RpcAcsRequest<DescribeMetaListResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String pattern;

	private String pageSize;

	private String dBInstanceId;

	private String pageIndex;

	private String restoreTime;

	private String resourceOwnerAccount;

	private String backupSetID;

	private Long ownerId;

	private String getDbName;

	private String restoreType;
	public DescribeMetaListRequest() {
		super("Rds", "2014-08-15", "DescribeMetaList", "rds");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
		if(pattern != null){
			putQueryParameter("Pattern", pattern);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex);
		}
	}

	public String getRestoreTime() {
		return this.restoreTime;
	}

	public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
		if(restoreTime != null){
			putQueryParameter("RestoreTime", restoreTime);
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

	public String getBackupSetID() {
		return this.backupSetID;
	}

	public void setBackupSetID(String backupSetID) {
		this.backupSetID = backupSetID;
		if(backupSetID != null){
			putQueryParameter("BackupSetID", backupSetID);
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

	public String getGetDbName() {
		return this.getDbName;
	}

	public void setGetDbName(String getDbName) {
		this.getDbName = getDbName;
		if(getDbName != null){
			putQueryParameter("GetDbName", getDbName);
		}
	}

	public String getRestoreType() {
		return this.restoreType;
	}

	public void setRestoreType(String restoreType) {
		this.restoreType = restoreType;
		if(restoreType != null){
			putQueryParameter("RestoreType", restoreType);
		}
	}

	@Override
	public Class<DescribeMetaListResponse> getResponseClass() {
		return DescribeMetaListResponse.class;
	}

}
