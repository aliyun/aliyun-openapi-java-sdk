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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeMigrationJobDetailRequest extends RpcAcsRequest<DescribeMigrationJobDetailResponse> {
	   

	private String clientToken;

	private Boolean migrationModeDataInitialization;

	private String migrationJobId;

	private Integer pageNum;

	private String accountId;

	private Boolean migrationModeDataSynchronization;

	private Integer pageSize;

	private String ownerId;

	private Boolean migrationModeStructureInitialization;
	public DescribeMigrationJobDetailRequest() {
		super("Dts", "2020-01-01", "DescribeMigrationJobDetail", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Boolean getMigrationModeDataInitialization() {
		return this.migrationModeDataInitialization;
	}

	public void setMigrationModeDataInitialization(Boolean migrationModeDataInitialization) {
		this.migrationModeDataInitialization = migrationModeDataInitialization;
		if(migrationModeDataInitialization != null){
			putQueryParameter("MigrationMode.DataInitialization", migrationModeDataInitialization.toString());
		}
	}

	public String getMigrationJobId() {
		return this.migrationJobId;
	}

	public void setMigrationJobId(String migrationJobId) {
		this.migrationJobId = migrationJobId;
		if(migrationJobId != null){
			putQueryParameter("MigrationJobId", migrationJobId);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public Boolean getMigrationModeDataSynchronization() {
		return this.migrationModeDataSynchronization;
	}

	public void setMigrationModeDataSynchronization(Boolean migrationModeDataSynchronization) {
		this.migrationModeDataSynchronization = migrationModeDataSynchronization;
		if(migrationModeDataSynchronization != null){
			putQueryParameter("MigrationMode.DataSynchronization", migrationModeDataSynchronization.toString());
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

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public Boolean getMigrationModeStructureInitialization() {
		return this.migrationModeStructureInitialization;
	}

	public void setMigrationModeStructureInitialization(Boolean migrationModeStructureInitialization) {
		this.migrationModeStructureInitialization = migrationModeStructureInitialization;
		if(migrationModeStructureInitialization != null){
			putQueryParameter("MigrationMode.StructureInitialization", migrationModeStructureInitialization.toString());
		}
	}

	@Override
	public Class<DescribeMigrationJobDetailResponse> getResponseClass() {
		return DescribeMigrationJobDetailResponse.class;
	}

}
