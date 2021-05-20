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

/**
 * @author auto create
 * @version 
 */
public class IdentifyAccountModifyRiskRequest extends RpcAcsRequest<IdentifyAccountModifyRiskResponse> {
	   

	private String siteCode;

	private String operateSubType;

	private Long operateTime;

	private String extraData;

	private Integer accountType;

	private String userInput;

	private String deviceEnvironment;

	private String entranceCode;

	private Long userId;

	private String userInfo;
	public IdentifyAccountModifyRiskRequest() {
		super("CRO", "2020-01-02", "IdentifyAccountModifyRisk", "cro");
		setMethod(MethodType.POST);
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

	public Long getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(Long operateTime) {
		this.operateTime = operateTime;
		if(operateTime != null){
			putQueryParameter("OperateTime", operateTime.toString());
		}
	}

	public String getExtraData() {
		return this.extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
		if(extraData != null){
			putBodyParameter("ExtraData", extraData);
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

	public String getUserInput() {
		return this.userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
		if(userInput != null){
			putQueryParameter("UserInput", userInput);
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

	public String getEntranceCode() {
		return this.entranceCode;
	}

	public void setEntranceCode(String entranceCode) {
		this.entranceCode = entranceCode;
		if(entranceCode != null){
			putQueryParameter("EntranceCode", entranceCode);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
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
	public Class<IdentifyAccountModifyRiskResponse> getResponseClass() {
		return IdentifyAccountModifyRiskResponse.class;
	}

}
