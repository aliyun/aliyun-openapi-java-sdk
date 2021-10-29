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

package com.aliyuncs.clickhouse.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.clickhouse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TransferVersionRequest extends RpcAcsRequest<TransferVersionResponse> {
	   

	private Long resourceOwnerId;

	private Integer pageNumber;

	private String sourceAccount;

	private String targetAccount;

	private Integer pageSize;

	private String sourcePassword;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String targetPassword;

	private String ownerAccount;

	private Long ownerId;

	private String targetDbClusterId;
	public TransferVersionRequest() {
		super("clickhouse", "2019-11-11", "TransferVersion");
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getSourceAccount() {
		return this.sourceAccount;
	}

	public void setSourceAccount(String sourceAccount) {
		this.sourceAccount = sourceAccount;
		if(sourceAccount != null){
			putQueryParameter("SourceAccount", sourceAccount);
		}
	}

	public String getTargetAccount() {
		return this.targetAccount;
	}

	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
		if(targetAccount != null){
			putQueryParameter("TargetAccount", targetAccount);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSourcePassword() {
		return this.sourcePassword;
	}

	public void setSourcePassword(String sourcePassword) {
		this.sourcePassword = sourcePassword;
		if(sourcePassword != null){
			putQueryParameter("SourcePassword", sourcePassword);
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

	public String getTargetPassword() {
		return this.targetPassword;
	}

	public void setTargetPassword(String targetPassword) {
		this.targetPassword = targetPassword;
		if(targetPassword != null){
			putQueryParameter("TargetPassword", targetPassword);
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

	public String getTargetDbClusterId() {
		return this.targetDbClusterId;
	}

	public void setTargetDbClusterId(String targetDbClusterId) {
		this.targetDbClusterId = targetDbClusterId;
		if(targetDbClusterId != null){
			putQueryParameter("TargetDbClusterId", targetDbClusterId);
		}
	}

	@Override
	public Class<TransferVersionResponse> getResponseClass() {
		return TransferVersionResponse.class;
	}

}
