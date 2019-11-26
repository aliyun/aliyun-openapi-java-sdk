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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRobotTaskRequest extends RpcAcsRequest<CreateRobotTaskResponse> {
	   

	private Long resourceOwnerId;

	private String recallStateCodes;

	private String taskName;

	private String robotName;

	private Long robotId;

	private Integer recallTimes;

	private Long taskId;

	private Boolean isSelfLine;

	private String resourceOwnerAccount;

	private String prodCode;

	private Integer retryType;

	private String ossFilePath;

	private Long ownerId;

	private String caller;

	private Boolean numberStatusIdent;

	private String corpName;

	private Integer recallInterval;
	public CreateRobotTaskRequest() {
		super("Dyvms", "2017-06-20", "CreateRobotTask", "dyvms");
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

	public String getRecallStateCodes() {
		return this.recallStateCodes;
	}

	public void setRecallStateCodes(String recallStateCodes) {
		this.recallStateCodes = recallStateCodes;
		if(recallStateCodes != null){
			putQueryParameter("RecallStateCodes", recallStateCodes);
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

	public String getRobotName() {
		return this.robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
		if(robotName != null){
			putQueryParameter("RobotName", robotName);
		}
	}

	public Long getRobotId() {
		return this.robotId;
	}

	public void setRobotId(Long robotId) {
		this.robotId = robotId;
		if(robotId != null){
			putQueryParameter("RobotId", robotId.toString());
		}
	}

	public Integer getRecallTimes() {
		return this.recallTimes;
	}

	public void setRecallTimes(Integer recallTimes) {
		this.recallTimes = recallTimes;
		if(recallTimes != null){
			putQueryParameter("RecallTimes", recallTimes.toString());
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

	public Boolean getIsSelfLine() {
		return this.isSelfLine;
	}

	public void setIsSelfLine(Boolean isSelfLine) {
		this.isSelfLine = isSelfLine;
		if(isSelfLine != null){
			putQueryParameter("IsSelfLine", isSelfLine.toString());
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

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
		}
	}

	public Integer getRetryType() {
		return this.retryType;
	}

	public void setRetryType(Integer retryType) {
		this.retryType = retryType;
		if(retryType != null){
			putQueryParameter("RetryType", retryType.toString());
		}
	}

	public String getOssFilePath() {
		return this.ossFilePath;
	}

	public void setOssFilePath(String ossFilePath) {
		this.ossFilePath = ossFilePath;
		if(ossFilePath != null){
			putQueryParameter("OssFilePath", ossFilePath);
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

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
		}
	}

	public Boolean getNumberStatusIdent() {
		return this.numberStatusIdent;
	}

	public void setNumberStatusIdent(Boolean numberStatusIdent) {
		this.numberStatusIdent = numberStatusIdent;
		if(numberStatusIdent != null){
			putQueryParameter("NumberStatusIdent", numberStatusIdent.toString());
		}
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
		if(corpName != null){
			putQueryParameter("CorpName", corpName);
		}
	}

	public Integer getRecallInterval() {
		return this.recallInterval;
	}

	public void setRecallInterval(Integer recallInterval) {
		this.recallInterval = recallInterval;
		if(recallInterval != null){
			putQueryParameter("RecallInterval", recallInterval.toString());
		}
	}

	@Override
	public Class<CreateRobotTaskResponse> getResponseClass() {
		return CreateRobotTaskResponse.class;
	}

}
