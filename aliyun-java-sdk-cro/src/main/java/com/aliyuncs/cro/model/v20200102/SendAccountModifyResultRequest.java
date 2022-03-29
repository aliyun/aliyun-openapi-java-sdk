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

package com.aliyuncs.cro.model.v20200102;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendAccountModifyResultRequest extends RpcAcsRequest<SendAccountModifyResultResponse> {
	   

	private String modifyFailureReason;

	private Integer accountType;

	private String actionSource;

	private String newContent;

	private String userId;

	private String siteCode;

	private String operateSubType;

	private Boolean modifyResult;

	private String oldContent;

	private Long operateTime;

	private String asToken;

	private String modifyType;

	private String deviceEnvironment;

	private String operateType;

	private String userInfo;
	public SendAccountModifyResultRequest() {
		super("CRO", "2020-01-02", "SendAccountModifyResult");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getModifyFailureReason() {
		return this.modifyFailureReason;
	}

	public void setModifyFailureReason(String modifyFailureReason) {
		this.modifyFailureReason = modifyFailureReason;
		if(modifyFailureReason != null){
			putQueryParameter("ModifyFailureReason", modifyFailureReason);
		}
	}

	public Integer getAccountType() {
		return this.accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType.toString());
		}
	}

	public String getActionSource() {
		return this.actionSource;
	}

	public void setActionSource(String actionSource) {
		this.actionSource = actionSource;
		if(actionSource != null){
			putQueryParameter("ActionSource", actionSource);
		}
	}

	public String getNewContent() {
		return this.newContent;
	}

	public void setNewContent(String newContent) {
		this.newContent = newContent;
		if(newContent != null){
			putQueryParameter("NewContent", newContent);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getSiteCode() {
		return this.siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
		if(siteCode != null){
			putQueryParameter("SiteCode", siteCode);
		}
	}

	public String getOperateSubType() {
		return this.operateSubType;
	}

	public void setOperateSubType(String operateSubType) {
		this.operateSubType = operateSubType;
		if(operateSubType != null){
			putQueryParameter("OperateSubType", operateSubType);
		}
	}

	public Boolean getModifyResult() {
		return this.modifyResult;
	}

	public void setModifyResult(Boolean modifyResult) {
		this.modifyResult = modifyResult;
		if(modifyResult != null){
			putQueryParameter("ModifyResult", modifyResult.toString());
		}
	}

	public String getOldContent() {
		return this.oldContent;
	}

	public void setOldContent(String oldContent) {
		this.oldContent = oldContent;
		if(oldContent != null){
			putQueryParameter("OldContent", oldContent);
		}
	}

	public Long getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(Long operateTime) {
		this.operateTime = operateTime;
		if(operateTime != null){
			putQueryParameter("OperateTime", operateTime.toString());
		}
	}

	public String getAsToken() {
		return this.asToken;
	}

	public void setAsToken(String asToken) {
		this.asToken = asToken;
		if(asToken != null){
			putQueryParameter("AsToken", asToken);
		}
	}

	public String getModifyType() {
		return this.modifyType;
	}

	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
		if(modifyType != null){
			putQueryParameter("ModifyType", modifyType);
		}
	}

	public String getDeviceEnvironment() {
		return this.deviceEnvironment;
	}

	public void setDeviceEnvironment(String deviceEnvironment) {
		this.deviceEnvironment = deviceEnvironment;
		if(deviceEnvironment != null){
			putBodyParameter("DeviceEnvironment", deviceEnvironment);
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	public String getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
		if(userInfo != null){
			putBodyParameter("UserInfo", userInfo);
		}
	}

	@Override
	public Class<SendAccountModifyResultResponse> getResponseClass() {
		return SendAccountModifyResultResponse.class;
	}

}
