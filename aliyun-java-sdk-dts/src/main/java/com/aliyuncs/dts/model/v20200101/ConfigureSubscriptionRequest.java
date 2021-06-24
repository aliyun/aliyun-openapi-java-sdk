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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfigureSubscriptionRequest extends RpcAcsRequest<ConfigureSubscriptionResponse> {
	   

	private String sourceEndpointRegion;

	private String checkpoint;

	private String subscriptionInstanceVSwitchId;

	private Boolean delayNotice;

	private String sourceEndpointInstanceID;

	private String sourceEndpointUserName;

	private String sourceEndpointOwnerID;

	private String delayPhone;

	private Boolean subscriptionDataTypeDML;

	private String sourceEndpointDatabaseName;

	private String sourceEndpointIP;

	private String errorPhone;

	private String reserve;

	private String dtsJobId;

	private String dbList;

	private String subscriptionInstanceNetworkType;

	private Boolean subscriptionDataTypeDDL;

	private String sourceEndpointPassword;

	private String sourceEndpointPort;

	private String subscriptionInstanceVPCId;

	private Long delayRuleTime;

	private String sourceEndpointInstanceType;

	private String dtsJobName;

	private String sourceEndpointOracleSID;

	private Boolean errorNotice;

	private String sourceEndpointRole;

	private String dtsInstanceId;

	private String sourceEndpointEngineName;
	public ConfigureSubscriptionRequest() {
		super("Dts", "2020-01-01", "ConfigureSubscription", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceEndpointRegion() {
		return this.sourceEndpointRegion;
	}

	public void setSourceEndpointRegion(String sourceEndpointRegion) {
		this.sourceEndpointRegion = sourceEndpointRegion;
		if(sourceEndpointRegion != null){
			putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
		}
	}

	public String getCheckpoint() {
		return this.checkpoint;
	}

	public void setCheckpoint(String checkpoint) {
		this.checkpoint = checkpoint;
		if(checkpoint != null){
			putQueryParameter("Checkpoint", checkpoint);
		}
	}

	public String getSubscriptionInstanceVSwitchId() {
		return this.subscriptionInstanceVSwitchId;
	}

	public void setSubscriptionInstanceVSwitchId(String subscriptionInstanceVSwitchId) {
		this.subscriptionInstanceVSwitchId = subscriptionInstanceVSwitchId;
		if(subscriptionInstanceVSwitchId != null){
			putQueryParameter("SubscriptionInstanceVSwitchId", subscriptionInstanceVSwitchId);
		}
	}

	public Boolean getDelayNotice() {
		return this.delayNotice;
	}

	public void setDelayNotice(Boolean delayNotice) {
		this.delayNotice = delayNotice;
		if(delayNotice != null){
			putQueryParameter("DelayNotice", delayNotice.toString());
		}
	}

	public String getSourceEndpointInstanceID() {
		return this.sourceEndpointInstanceID;
	}

	public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
		this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		if(sourceEndpointInstanceID != null){
			putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
		}
	}

	public String getSourceEndpointUserName() {
		return this.sourceEndpointUserName;
	}

	public void setSourceEndpointUserName(String sourceEndpointUserName) {
		this.sourceEndpointUserName = sourceEndpointUserName;
		if(sourceEndpointUserName != null){
			putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
		}
	}

	public String getSourceEndpointOwnerID() {
		return this.sourceEndpointOwnerID;
	}

	public void setSourceEndpointOwnerID(String sourceEndpointOwnerID) {
		this.sourceEndpointOwnerID = sourceEndpointOwnerID;
		if(sourceEndpointOwnerID != null){
			putQueryParameter("SourceEndpointOwnerID", sourceEndpointOwnerID);
		}
	}

	public String getDelayPhone() {
		return this.delayPhone;
	}

	public void setDelayPhone(String delayPhone) {
		this.delayPhone = delayPhone;
		if(delayPhone != null){
			putQueryParameter("DelayPhone", delayPhone);
		}
	}

	public Boolean getSubscriptionDataTypeDML() {
		return this.subscriptionDataTypeDML;
	}

	public void setSubscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
		this.subscriptionDataTypeDML = subscriptionDataTypeDML;
		if(subscriptionDataTypeDML != null){
			putQueryParameter("SubscriptionDataTypeDML", subscriptionDataTypeDML.toString());
		}
	}

	public String getSourceEndpointDatabaseName() {
		return this.sourceEndpointDatabaseName;
	}

	public void setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
		this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
		if(sourceEndpointDatabaseName != null){
			putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
		}
	}

	public String getSourceEndpointIP() {
		return this.sourceEndpointIP;
	}

	public void setSourceEndpointIP(String sourceEndpointIP) {
		this.sourceEndpointIP = sourceEndpointIP;
		if(sourceEndpointIP != null){
			putQueryParameter("SourceEndpointIP", sourceEndpointIP);
		}
	}

	public String getErrorPhone() {
		return this.errorPhone;
	}

	public void setErrorPhone(String errorPhone) {
		this.errorPhone = errorPhone;
		if(errorPhone != null){
			putQueryParameter("ErrorPhone", errorPhone);
		}
	}

	public String getReserve() {
		return this.reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
		if(reserve != null){
			putQueryParameter("Reserve", reserve);
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

	public String getDbList() {
		return this.dbList;
	}

	public void setDbList(String dbList) {
		this.dbList = dbList;
		if(dbList != null){
			putQueryParameter("DbList", dbList);
		}
	}

	public String getSubscriptionInstanceNetworkType() {
		return this.subscriptionInstanceNetworkType;
	}

	public void setSubscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
		this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
		if(subscriptionInstanceNetworkType != null){
			putQueryParameter("SubscriptionInstanceNetworkType", subscriptionInstanceNetworkType);
		}
	}

	public Boolean getSubscriptionDataTypeDDL() {
		return this.subscriptionDataTypeDDL;
	}

	public void setSubscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
		this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
		if(subscriptionDataTypeDDL != null){
			putQueryParameter("SubscriptionDataTypeDDL", subscriptionDataTypeDDL.toString());
		}
	}

	public String getSourceEndpointPassword() {
		return this.sourceEndpointPassword;
	}

	public void setSourceEndpointPassword(String sourceEndpointPassword) {
		this.sourceEndpointPassword = sourceEndpointPassword;
		if(sourceEndpointPassword != null){
			putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
		}
	}

	public String getSourceEndpointPort() {
		return this.sourceEndpointPort;
	}

	public void setSourceEndpointPort(String sourceEndpointPort) {
		this.sourceEndpointPort = sourceEndpointPort;
		if(sourceEndpointPort != null){
			putQueryParameter("SourceEndpointPort", sourceEndpointPort);
		}
	}

	public String getSubscriptionInstanceVPCId() {
		return this.subscriptionInstanceVPCId;
	}

	public void setSubscriptionInstanceVPCId(String subscriptionInstanceVPCId) {
		this.subscriptionInstanceVPCId = subscriptionInstanceVPCId;
		if(subscriptionInstanceVPCId != null){
			putQueryParameter("SubscriptionInstanceVPCId", subscriptionInstanceVPCId);
		}
	}

	public Long getDelayRuleTime() {
		return this.delayRuleTime;
	}

	public void setDelayRuleTime(Long delayRuleTime) {
		this.delayRuleTime = delayRuleTime;
		if(delayRuleTime != null){
			putQueryParameter("DelayRuleTime", delayRuleTime.toString());
		}
	}

	public String getSourceEndpointInstanceType() {
		return this.sourceEndpointInstanceType;
	}

	public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
		this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		if(sourceEndpointInstanceType != null){
			putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
		}
	}

	public String getDtsJobName() {
		return this.dtsJobName;
	}

	public void setDtsJobName(String dtsJobName) {
		this.dtsJobName = dtsJobName;
		if(dtsJobName != null){
			putQueryParameter("DtsJobName", dtsJobName);
		}
	}

	public String getSourceEndpointOracleSID() {
		return this.sourceEndpointOracleSID;
	}

	public void setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
		this.sourceEndpointOracleSID = sourceEndpointOracleSID;
		if(sourceEndpointOracleSID != null){
			putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
		}
	}

	public Boolean getErrorNotice() {
		return this.errorNotice;
	}

	public void setErrorNotice(Boolean errorNotice) {
		this.errorNotice = errorNotice;
		if(errorNotice != null){
			putQueryParameter("ErrorNotice", errorNotice.toString());
		}
	}

	public String getSourceEndpointRole() {
		return this.sourceEndpointRole;
	}

	public void setSourceEndpointRole(String sourceEndpointRole) {
		this.sourceEndpointRole = sourceEndpointRole;
		if(sourceEndpointRole != null){
			putQueryParameter("SourceEndpointRole", sourceEndpointRole);
		}
	}

	public String getDtsInstanceId() {
		return this.dtsInstanceId;
	}

	public void setDtsInstanceId(String dtsInstanceId) {
		this.dtsInstanceId = dtsInstanceId;
		if(dtsInstanceId != null){
			putQueryParameter("DtsInstanceId", dtsInstanceId);
		}
	}

	public String getSourceEndpointEngineName() {
		return this.sourceEndpointEngineName;
	}

	public void setSourceEndpointEngineName(String sourceEndpointEngineName) {
		this.sourceEndpointEngineName = sourceEndpointEngineName;
		if(sourceEndpointEngineName != null){
			putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
		}
	}

	@Override
	public Class<ConfigureSubscriptionResponse> getResponseClass() {
		return ConfigureSubscriptionResponse.class;
	}

}
