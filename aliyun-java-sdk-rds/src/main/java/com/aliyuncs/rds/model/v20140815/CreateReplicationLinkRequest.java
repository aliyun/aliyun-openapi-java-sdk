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
public class CreateReplicationLinkRequest extends RpcAcsRequest<CreateReplicationLinkResponse> {
	   

	private String replicatorAccount;

	private String taskName;

	private Long sourcePort;

	private String dBInstanceId;

	private Long taskId;

	private String sourceInstanceName;

	private Boolean dryRun;

	private String sourceInstanceRegionId;

	private String targetAddress;

	private String replicatorPassword;

	private String sourceAddress;

	private String sourceCategory;
	public CreateReplicationLinkRequest() {
		super("Rds", "2014-08-15", "CreateReplicationLink", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReplicatorAccount() {
		return this.replicatorAccount;
	}

	public void setReplicatorAccount(String replicatorAccount) {
		this.replicatorAccount = replicatorAccount;
		if(replicatorAccount != null){
			putQueryParameter("ReplicatorAccount", replicatorAccount);
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

	public Long getSourcePort() {
		return this.sourcePort;
	}

	public void setSourcePort(Long sourcePort) {
		this.sourcePort = sourcePort;
		if(sourcePort != null){
			putQueryParameter("SourcePort", sourcePort.toString());
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

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	public String getSourceInstanceName() {
		return this.sourceInstanceName;
	}

	public void setSourceInstanceName(String sourceInstanceName) {
		this.sourceInstanceName = sourceInstanceName;
		if(sourceInstanceName != null){
			putQueryParameter("SourceInstanceName", sourceInstanceName);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getSourceInstanceRegionId() {
		return this.sourceInstanceRegionId;
	}

	public void setSourceInstanceRegionId(String sourceInstanceRegionId) {
		this.sourceInstanceRegionId = sourceInstanceRegionId;
		if(sourceInstanceRegionId != null){
			putQueryParameter("SourceInstanceRegionId", sourceInstanceRegionId);
		}
	}

	public String getTargetAddress() {
		return this.targetAddress;
	}

	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
		if(targetAddress != null){
			putQueryParameter("TargetAddress", targetAddress);
		}
	}

	public String getReplicatorPassword() {
		return this.replicatorPassword;
	}

	public void setReplicatorPassword(String replicatorPassword) {
		this.replicatorPassword = replicatorPassword;
		if(replicatorPassword != null){
			putQueryParameter("ReplicatorPassword", replicatorPassword);
		}
	}

	public String getSourceAddress() {
		return this.sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
		if(sourceAddress != null){
			putQueryParameter("SourceAddress", sourceAddress);
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
	public Class<CreateReplicationLinkResponse> getResponseClass() {
		return CreateReplicationLinkResponse.class;
	}

}
