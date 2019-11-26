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
public class CreateRobotSaasTaskRequest extends RpcAcsRequest<CreateRobotSaasTaskResponse> {
	   

	private Long resourceOwnerId;

	private String scheduleType;

	private String taskName;

	private String robotName;

	private Long robotId;

	private String ossFileName;

	private Boolean isSelfLine;

	private String resourceOwnerAccount;

	private String robotType;

	private String prodCode;

	private Long ownerId;

	private String orderTime;

	private String callerList;

	private String bizType;

	private Boolean numberStatusIdent;

	private String corpName;
	public CreateRobotSaasTaskRequest() {
		super("Dyvms", "2017-06-20", "CreateRobotSaasTask", "dyvms");
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

	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
		if(scheduleType != null){
			putQueryParameter("ScheduleType", scheduleType);
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

	public String getOssFileName() {
		return this.ossFileName;
	}

	public void setOssFileName(String ossFileName) {
		this.ossFileName = ossFileName;
		if(ossFileName != null){
			putQueryParameter("OssFileName", ossFileName);
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

	public String getRobotType() {
		return this.robotType;
	}

	public void setRobotType(String robotType) {
		this.robotType = robotType;
		if(robotType != null){
			putQueryParameter("RobotType", robotType);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
		if(orderTime != null){
			putQueryParameter("OrderTime", orderTime);
		}
	}

	public String getCallerList() {
		return this.callerList;
	}

	public void setCallerList(String callerList) {
		this.callerList = callerList;
		if(callerList != null){
			putQueryParameter("CallerList", callerList);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
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

	@Override
	public Class<CreateRobotSaasTaskResponse> getResponseClass() {
		return CreateRobotSaasTaskResponse.class;
	}

}
