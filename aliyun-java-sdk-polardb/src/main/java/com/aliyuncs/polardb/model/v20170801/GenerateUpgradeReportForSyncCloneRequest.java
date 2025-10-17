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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateUpgradeReportForSyncCloneRequest extends RpcAcsRequest<GenerateUpgradeReportForSyncCloneResponse> {
	   

	private Long resourceOwnerId;

	private String creationCategory;

	private String sourceDBClusterId;

	private String reserve;

	private String creationOption;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String dBName;

	private String dBType;

	private String dBVersion;
	public GenerateUpgradeReportForSyncCloneRequest() {
		super("polardb", "2017-08-01", "GenerateUpgradeReportForSyncClone", "polardb");
		setProtocol(ProtocolType.HTTPS);
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

	public String getCreationCategory() {
		return this.creationCategory;
	}

	public void setCreationCategory(String creationCategory) {
		this.creationCategory = creationCategory;
		if(creationCategory != null){
			putQueryParameter("CreationCategory", creationCategory);
		}
	}

	public String getSourceDBClusterId() {
		return this.sourceDBClusterId;
	}

	public void setSourceDBClusterId(String sourceDBClusterId) {
		this.sourceDBClusterId = sourceDBClusterId;
		if(sourceDBClusterId != null){
			putQueryParameter("SourceDBClusterId", sourceDBClusterId);
		}
	}

	public String getReserve() {
		return this.reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
		if(reserve != null){
			putQueryParameter("Reserve", reserve);
		}
	}

	public String getCreationOption() {
		return this.creationOption;
	}

	public void setCreationOption(String creationOption) {
		this.creationOption = creationOption;
		if(creationOption != null){
			putQueryParameter("CreationOption", creationOption);
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

	public String getDBName() {
		return this.dBName;
	}

	public void setDBName(String dBName) {
		this.dBName = dBName;
		if(dBName != null){
			putQueryParameter("DBName", dBName);
		}
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
		if(dBType != null){
			putQueryParameter("DBType", dBType);
		}
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
		if(dBVersion != null){
			putQueryParameter("DBVersion", dBVersion);
		}
	}

	@Override
	public Class<GenerateUpgradeReportForSyncCloneResponse> getResponseClass() {
		return GenerateUpgradeReportForSyncCloneResponse.class;
	}

}
