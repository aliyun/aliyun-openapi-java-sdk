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
public class DescribeRDSTablesRequest extends RpcAcsRequest<DescribeRDSTablesResponse> {
	   

	private String schema;

	private Long resourceOwnerId;

	private String rdsPassword;

	private String resourceOwnerAccount;

	private String dbClusterId;

	private String ownerAccount;

	private String rdsId;

	private Long ownerId;

	private Long rdsPort;

	private String rdsUserName;
	public DescribeRDSTablesRequest() {
		super("clickhouse", "2019-11-11", "DescribeRDSTables");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSchema() {
		return this.schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
		if(schema != null){
			putQueryParameter("Schema", schema);
		}
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

	public String getRdsPassword() {
		return this.rdsPassword;
	}

	public void setRdsPassword(String rdsPassword) {
		this.rdsPassword = rdsPassword;
		if(rdsPassword != null){
			putQueryParameter("RdsPassword", rdsPassword);
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

	public String getDbClusterId() {
		return this.dbClusterId;
	}

	public void setDbClusterId(String dbClusterId) {
		this.dbClusterId = dbClusterId;
		if(dbClusterId != null){
			putQueryParameter("DbClusterId", dbClusterId);
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

	public String getRdsId() {
		return this.rdsId;
	}

	public void setRdsId(String rdsId) {
		this.rdsId = rdsId;
		if(rdsId != null){
			putQueryParameter("RdsId", rdsId);
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

	public Long getRdsPort() {
		return this.rdsPort;
	}

	public void setRdsPort(Long rdsPort) {
		this.rdsPort = rdsPort;
		if(rdsPort != null){
			putQueryParameter("RdsPort", rdsPort.toString());
		}
	}

	public String getRdsUserName() {
		return this.rdsUserName;
	}

	public void setRdsUserName(String rdsUserName) {
		this.rdsUserName = rdsUserName;
		if(rdsUserName != null){
			putQueryParameter("RdsUserName", rdsUserName);
		}
	}

	@Override
	public Class<DescribeRDSTablesResponse> getResponseClass() {
		return DescribeRDSTablesResponse.class;
	}

}
