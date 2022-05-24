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
public class CreateCloudMigrationPrecheckTaskRequest extends RpcAcsRequest<CreateCloudMigrationPrecheckTaskResponse> {
	   

	private String dBInstanceName;

	private Long resourceOwnerId;

	private String taskName;

	private String sourceAccount;

	private Long sourcePort;

	private String sourcePassword;

	private String sourceIpAddress;

	private String sourceCategory;
	public CreateCloudMigrationPrecheckTaskRequest() {
		super("Rds", "2014-08-15", "CreateCloudMigrationPrecheckTask", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
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

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
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

	public Long getSourcePort() {
		return this.sourcePort;
	}

	public void setSourcePort(Long sourcePort) {
		this.sourcePort = sourcePort;
		if(sourcePort != null){
			putQueryParameter("SourcePort", sourcePort.toString());
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

	public String getSourceIpAddress() {
		return this.sourceIpAddress;
	}

	public void setSourceIpAddress(String sourceIpAddress) {
		this.sourceIpAddress = sourceIpAddress;
		if(sourceIpAddress != null){
			putQueryParameter("SourceIpAddress", sourceIpAddress);
		}
	}

	public String getSourceCategory() {
		return this.sourceCategory;
	}

	public void setSourceCategory(String sourceCategory) {
		this.sourceCategory = sourceCategory;
		if(sourceCategory != null){
			putQueryParameter("SourceCategory", sourceCategory);
		}
	}

	@Override
	public Class<CreateCloudMigrationPrecheckTaskResponse> getResponseClass() {
		return CreateCloudMigrationPrecheckTaskResponse.class;
	}

}
