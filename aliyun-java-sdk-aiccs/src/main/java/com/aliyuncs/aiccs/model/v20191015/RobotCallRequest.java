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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RobotCallRequest extends RpcAcsRequest<RobotCallResponse> {
	   

	private Long resourceOwnerId;

	private Boolean earlyMediaAsr;

	private Long robotId;

	private String calledNumber;

	private String calledShowNumber;

	private String resourceOwnerAccount;

	private Boolean recordFlag;

	private Long ownerId;

	private String params;

	private String outId;
	public RobotCallRequest() {
		super("aiccs", "2019-10-15", "RobotCall");
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

	public Boolean getEarlyMediaAsr() {
		return this.earlyMediaAsr;
	}

	public void setEarlyMediaAsr(Boolean earlyMediaAsr) {
		this.earlyMediaAsr = earlyMediaAsr;
		if(earlyMediaAsr != null){
			putQueryParameter("EarlyMediaAsr", earlyMediaAsr.toString());
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

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public String getCalledShowNumber() {
		return this.calledShowNumber;
	}

	public void setCalledShowNumber(String calledShowNumber) {
		this.calledShowNumber = calledShowNumber;
		if(calledShowNumber != null){
			putQueryParameter("CalledShowNumber", calledShowNumber);
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

	public Boolean getRecordFlag() {
		return this.recordFlag;
	}

	public void setRecordFlag(Boolean recordFlag) {
		this.recordFlag = recordFlag;
		if(recordFlag != null){
			putQueryParameter("RecordFlag", recordFlag.toString());
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

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
		}
	}

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putQueryParameter("OutId", outId);
		}
	}

	@Override
	public Class<RobotCallResponse> getResponseClass() {
		return RobotCallResponse.class;
	}

}
