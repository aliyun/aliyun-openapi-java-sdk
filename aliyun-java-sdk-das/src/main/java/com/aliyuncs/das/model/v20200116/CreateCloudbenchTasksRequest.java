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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCloudbenchTasksRequest extends RpcAcsRequest<CreateCloudbenchTasksResponse> {
	   

	private String clientType;

	private String dstPort;

	private String description;

	private String requestStartTime;

	private String dstConnectionString;

	private String dstSuperPassword;

	private String dstSuperAccount;

	private String dstInstanceId;

	private String rate;

	private String requestDuration;

	private String dtsJobId;

	private String requestEndTime;

	private String amount;

	private String taskType;

	private String endState;

	private String backupId;

	private String srcSuperPassword;

	private String backupTime;

	private String gatewayVpcIp;

	private String workDir;

	private String dtsJobClass;

	private String srcPublicIp;

	private String srcInstanceId;

	private String dstType;

	private String srcSuperAccount;

	private String gatewayVpcId;

	private String smartPressureTime;
	public CreateCloudbenchTasksRequest() {
		super("DAS", "2020-01-16", "CreateCloudbenchTasks", "das");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putQueryParameter("ClientType", clientType);
		}
	}

	public String getDstPort() {
		return this.dstPort;
	}

	public void setDstPort(String dstPort) {
		this.dstPort = dstPort;
		if(dstPort != null){
			putQueryParameter("DstPort", dstPort);
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

	public String getRequestStartTime() {
		return this.requestStartTime;
	}

	public void setRequestStartTime(String requestStartTime) {
		this.requestStartTime = requestStartTime;
		if(requestStartTime != null){
			putQueryParameter("RequestStartTime", requestStartTime);
		}
	}

	public String getDstConnectionString() {
		return this.dstConnectionString;
	}

	public void setDstConnectionString(String dstConnectionString) {
		this.dstConnectionString = dstConnectionString;
		if(dstConnectionString != null){
			putQueryParameter("DstConnectionString", dstConnectionString);
		}
	}

	public String getDstSuperPassword() {
		return this.dstSuperPassword;
	}

	public void setDstSuperPassword(String dstSuperPassword) {
		this.dstSuperPassword = dstSuperPassword;
		if(dstSuperPassword != null){
			putQueryParameter("DstSuperPassword", dstSuperPassword);
		}
	}

	public String getDstSuperAccount() {
		return this.dstSuperAccount;
	}

	public void setDstSuperAccount(String dstSuperAccount) {
		this.dstSuperAccount = dstSuperAccount;
		if(dstSuperAccount != null){
			putQueryParameter("DstSuperAccount", dstSuperAccount);
		}
	}

	public String getDstInstanceId() {
		return this.dstInstanceId;
	}

	public void setDstInstanceId(String dstInstanceId) {
		this.dstInstanceId = dstInstanceId;
		if(dstInstanceId != null){
			putQueryParameter("DstInstanceId", dstInstanceId);
		}
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
		if(rate != null){
			putQueryParameter("Rate", rate);
		}
	}

	public String getRequestDuration() {
		return this.requestDuration;
	}

	public void setRequestDuration(String requestDuration) {
		this.requestDuration = requestDuration;
		if(requestDuration != null){
			putQueryParameter("RequestDuration", requestDuration);
		}
	}

	public String getDtsJobId() {
		return this.dtsJobId;
	}

	public void setDtsJobId(String dtsJobId) {
		this.dtsJobId = dtsJobId;
		if(dtsJobId != null){
			putQueryParameter("DtsJobId", dtsJobId);
		}
	}

	public String getRequestEndTime() {
		return this.requestEndTime;
	}

	public void setRequestEndTime(String requestEndTime) {
		this.requestEndTime = requestEndTime;
		if(requestEndTime != null){
			putQueryParameter("RequestEndTime", requestEndTime);
		}
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount);
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
		}
	}

	public String getEndState() {
		return this.endState;
	}

	public void setEndState(String endState) {
		this.endState = endState;
		if(endState != null){
			putQueryParameter("EndState", endState);
		}
	}

	public String getBackupId() {
		return this.backupId;
	}

	public void setBackupId(String backupId) {
		this.backupId = backupId;
		if(backupId != null){
			putQueryParameter("BackupId", backupId);
		}
	}

	public String getSrcSuperPassword() {
		return this.srcSuperPassword;
	}

	public void setSrcSuperPassword(String srcSuperPassword) {
		this.srcSuperPassword = srcSuperPassword;
		if(srcSuperPassword != null){
			putQueryParameter("SrcSuperPassword", srcSuperPassword);
		}
	}

	public String getBackupTime() {
		return this.backupTime;
	}

	public void setBackupTime(String backupTime) {
		this.backupTime = backupTime;
		if(backupTime != null){
			putQueryParameter("BackupTime", backupTime);
		}
	}

	public String getGatewayVpcIp() {
		return this.gatewayVpcIp;
	}

	public void setGatewayVpcIp(String gatewayVpcIp) {
		this.gatewayVpcIp = gatewayVpcIp;
		if(gatewayVpcIp != null){
			putQueryParameter("GatewayVpcIp", gatewayVpcIp);
		}
	}

	public String getWorkDir() {
		return this.workDir;
	}

	public void setWorkDir(String workDir) {
		this.workDir = workDir;
		if(workDir != null){
			putQueryParameter("WorkDir", workDir);
		}
	}

	public String getDtsJobClass() {
		return this.dtsJobClass;
	}

	public void setDtsJobClass(String dtsJobClass) {
		this.dtsJobClass = dtsJobClass;
		if(dtsJobClass != null){
			putQueryParameter("DtsJobClass", dtsJobClass);
		}
	}

	public String getSrcPublicIp() {
		return this.srcPublicIp;
	}

	public void setSrcPublicIp(String srcPublicIp) {
		this.srcPublicIp = srcPublicIp;
		if(srcPublicIp != null){
			putQueryParameter("SrcPublicIp", srcPublicIp);
		}
	}

	public String getSrcInstanceId() {
		return this.srcInstanceId;
	}

	public void setSrcInstanceId(String srcInstanceId) {
		this.srcInstanceId = srcInstanceId;
		if(srcInstanceId != null){
			putQueryParameter("SrcInstanceId", srcInstanceId);
		}
	}

	public String getDstType() {
		return this.dstType;
	}

	public void setDstType(String dstType) {
		this.dstType = dstType;
		if(dstType != null){
			putQueryParameter("DstType", dstType);
		}
	}

	public String getSrcSuperAccount() {
		return this.srcSuperAccount;
	}

	public void setSrcSuperAccount(String srcSuperAccount) {
		this.srcSuperAccount = srcSuperAccount;
		if(srcSuperAccount != null){
			putQueryParameter("SrcSuperAccount", srcSuperAccount);
		}
	}

	public String getGatewayVpcId() {
		return this.gatewayVpcId;
	}

	public void setGatewayVpcId(String gatewayVpcId) {
		this.gatewayVpcId = gatewayVpcId;
		if(gatewayVpcId != null){
			putQueryParameter("GatewayVpcId", gatewayVpcId);
		}
	}

	public String getSmartPressureTime() {
		return this.smartPressureTime;
	}

	public void setSmartPressureTime(String smartPressureTime) {
		this.smartPressureTime = smartPressureTime;
		if(smartPressureTime != null){
			putQueryParameter("SmartPressureTime", smartPressureTime);
		}
	}

	@Override
	public Class<CreateCloudbenchTasksResponse> getResponseClass() {
		return CreateCloudbenchTasksResponse.class;
	}

}
