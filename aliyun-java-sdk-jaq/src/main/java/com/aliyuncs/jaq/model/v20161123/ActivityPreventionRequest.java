/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.jaq.model.v20161123;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ActivityPreventionRequest extends RpcAcsRequest<ActivityPreventionResponse> {
	
	public ActivityPreventionRequest() {
		super("jaq", "2016-11-23", "ActivityPrevention");
	}

	private String callerName;

	private String ip;

	private String protocolVersion;

	private Integer source;

	private String activityDescription;

	private String activityId;

	private String prize;

	private Integer prizeType;

	private String phoneNumber;

	private String email;

	private String userId;

	private Integer idType;

	private String currentUrl;

	private String agent;

	private String cookie;

	private String sessionId;

	private String macAddress;

	private String referer;

	private String userName;

	private String companyName;

	private String address;

	private String iDNumber;

	private String bankCardNumber;

	private String registerIp;

	private Long registerDate;

	private String extendData;

	private String jsToken;

	private String sDKToken;

	public String getCallerName() {
		return this.callerName;
	}

	public void setCallerName(String callerName) {
		this.callerName = callerName;
		putQueryParameter("CallerName", callerName);
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		putQueryParameter("Ip", ip);
	}

	public String getProtocolVersion() {
		return this.protocolVersion;
	}

	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
		putQueryParameter("ProtocolVersion", protocolVersion);
	}

	public Integer getSource() {
		return this.source;
	}

	public void setSource(Integer source) {
		this.source = source;
		putQueryParameter("Source", source);
	}

	public String getActivityDescription() {
		return this.activityDescription;
	}

	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
		putQueryParameter("ActivityDescription", activityDescription);
	}

	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
		putQueryParameter("ActivityId", activityId);
	}

	public String getPrize() {
		return this.prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
		putQueryParameter("Prize", prize);
	}

	public Integer getPrizeType() {
		return this.prizeType;
	}

	public void setPrizeType(Integer prizeType) {
		this.prizeType = prizeType;
		putQueryParameter("PrizeType", prizeType);
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		putQueryParameter("PhoneNumber", phoneNumber);
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		putQueryParameter("Email", email);
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		putQueryParameter("UserId", userId);
	}

	public Integer getIdType() {
		return this.idType;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
		putQueryParameter("IdType", idType);
	}

	public String getCurrentUrl() {
		return this.currentUrl;
	}

	public void setCurrentUrl(String currentUrl) {
		this.currentUrl = currentUrl;
		putQueryParameter("CurrentUrl", currentUrl);
	}

	public String getAgent() {
		return this.agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
		putQueryParameter("Agent", agent);
	}

	public String getCookie() {
		return this.cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
		putQueryParameter("Cookie", cookie);
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		putQueryParameter("SessionId", sessionId);
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
		putQueryParameter("MacAddress", macAddress);
	}

	public String getReferer() {
		return this.referer;
	}

	public void setReferer(String referer) {
		this.referer = referer;
		putQueryParameter("Referer", referer);
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		putQueryParameter("UserName", userName);
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		putQueryParameter("CompanyName", companyName);
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		putQueryParameter("Address", address);
	}

	public String getIDNumber() {
		return this.iDNumber;
	}

	public void setIDNumber(String iDNumber) {
		this.iDNumber = iDNumber;
		putQueryParameter("IDNumber", iDNumber);
	}

	public String getBankCardNumber() {
		return this.bankCardNumber;
	}

	public void setBankCardNumber(String bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
		putQueryParameter("BankCardNumber", bankCardNumber);
	}

	public String getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
		putQueryParameter("RegisterIp", registerIp);
	}

	public Long getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Long registerDate) {
		this.registerDate = registerDate;
		putQueryParameter("RegisterDate", registerDate);
	}

	public String getExtendData() {
		return this.extendData;
	}

	public void setExtendData(String extendData) {
		this.extendData = extendData;
		putQueryParameter("ExtendData", extendData);
	}

	public String getJsToken() {
		return this.jsToken;
	}

	public void setJsToken(String jsToken) {
		this.jsToken = jsToken;
		putQueryParameter("JsToken", jsToken);
	}

	public String getSDKToken() {
		return this.sDKToken;
	}

	public void setSDKToken(String sDKToken) {
		this.sDKToken = sDKToken;
		putQueryParameter("SDKToken", sDKToken);
	}

	@Override
	public Class<ActivityPreventionResponse> getResponseClass() {
		return ActivityPreventionResponse.class;
	}

}
