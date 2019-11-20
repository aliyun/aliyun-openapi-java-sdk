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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ClickToDialRequest extends RpcAcsRequest<ClickToDialResponse> {
	   

	private Long resourceOwnerId;

	private String callerShowNumber;

	private Integer sessionTimeout;

	private String calledNumber;

	private String calledShowNumber;

	private Boolean asrFlag;

	private String resourceOwnerAccount;

	private Boolean recordFlag;

	private Long ownerId;

	private String outId;

	private String asrModelId;

	private String callerNumber;
	public ClickToDialRequest() {
		super("Dyvmsapi", "2017-05-25", "ClickToDial", "dyvms");
		setMethod(MethodType.POST);
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

	public String getCallerShowNumber() {
		return this.callerShowNumber;
	}

	public void setCallerShowNumber(String callerShowNumber) {
		this.callerShowNumber = callerShowNumber;
		if(callerShowNumber != null){
			putQueryParameter("CallerShowNumber", callerShowNumber);
		}
	}

	public Integer getSessionTimeout() {
		return this.sessionTimeout;
	}

	public void setSessionTimeout(Integer sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
		if(sessionTimeout != null){
			putQueryParameter("SessionTimeout", sessionTimeout.toString());
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

	public Boolean getAsrFlag() {
		return this.asrFlag;
	}

	public void setAsrFlag(Boolean asrFlag) {
		this.asrFlag = asrFlag;
		if(asrFlag != null){
			putQueryParameter("AsrFlag", asrFlag.toString());
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

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putQueryParameter("OutId", outId);
		}
	}

	public String getAsrModelId() {
		return this.asrModelId;
	}

	public void setAsrModelId(String asrModelId) {
		this.asrModelId = asrModelId;
		if(asrModelId != null){
			putQueryParameter("AsrModelId", asrModelId);
		}
	}

	public String getCallerNumber() {
		return this.callerNumber;
	}

	public void setCallerNumber(String callerNumber) {
		this.callerNumber = callerNumber;
		if(callerNumber != null){
			putQueryParameter("CallerNumber", callerNumber);
		}
	}

	@Override
	public Class<ClickToDialResponse> getResponseClass() {
		return ClickToDialResponse.class;
	}

}
