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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateConfigRequest extends RpcAcsRequest<UpdateConfigResponse> {
	   

	private String openSuperAcl;

	private Boolean configAuthEnabled;

	private String passWord;

	private String maxClientCnxns;

	private String requestPars;

	private String juteMaxbuffer;

	private String configType;

	private String autopurgeSnapRetainCount;

	private Boolean configSecretEnabled;

	private Boolean mCPEnabled;

	private String tickTime;

	private String clusterId;

	private String syncLimit;

	private String instanceId;

	private String autopurgePurgeInterval;

	private String initLimit;

	private String userName;
	public UpdateConfigRequest() {
		super("mse", "2019-05-31", "UpdateConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOpenSuperAcl() {
		return this.openSuperAcl;
	}

	public void setOpenSuperAcl(String openSuperAcl) {
		this.openSuperAcl = openSuperAcl;
		if(openSuperAcl != null){
			putBodyParameter("OpenSuperAcl", openSuperAcl);
		}
	}

	public Boolean getConfigAuthEnabled() {
		return this.configAuthEnabled;
	}

	public void setConfigAuthEnabled(Boolean configAuthEnabled) {
		this.configAuthEnabled = configAuthEnabled;
		if(configAuthEnabled != null){
			putQueryParameter("ConfigAuthEnabled", configAuthEnabled.toString());
		}
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
		if(passWord != null){
			putQueryParameter("PassWord", passWord);
		}
	}

	public String getMaxClientCnxns() {
		return this.maxClientCnxns;
	}

	public void setMaxClientCnxns(String maxClientCnxns) {
		this.maxClientCnxns = maxClientCnxns;
		if(maxClientCnxns != null){
			putQueryParameter("MaxClientCnxns", maxClientCnxns);
		}
	}

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putQueryParameter("RequestPars", requestPars);
		}
	}

	public String getJuteMaxbuffer() {
		return this.juteMaxbuffer;
	}

	public void setJuteMaxbuffer(String juteMaxbuffer) {
		this.juteMaxbuffer = juteMaxbuffer;
		if(juteMaxbuffer != null){
			putQueryParameter("JuteMaxbuffer", juteMaxbuffer);
		}
	}

	public String getConfigType() {
		return this.configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
		if(configType != null){
			putQueryParameter("ConfigType", configType);
		}
	}

	public String getAutopurgeSnapRetainCount() {
		return this.autopurgeSnapRetainCount;
	}

	public void setAutopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
		this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
		if(autopurgeSnapRetainCount != null){
			putQueryParameter("AutopurgeSnapRetainCount", autopurgeSnapRetainCount);
		}
	}

	public Boolean getConfigSecretEnabled() {
		return this.configSecretEnabled;
	}

	public void setConfigSecretEnabled(Boolean configSecretEnabled) {
		this.configSecretEnabled = configSecretEnabled;
		if(configSecretEnabled != null){
			putQueryParameter("ConfigSecretEnabled", configSecretEnabled.toString());
		}
	}

	public Boolean getMCPEnabled() {
		return this.mCPEnabled;
	}

	public void setMCPEnabled(Boolean mCPEnabled) {
		this.mCPEnabled = mCPEnabled;
		if(mCPEnabled != null){
			putQueryParameter("MCPEnabled", mCPEnabled.toString());
		}
	}

	public String getTickTime() {
		return this.tickTime;
	}

	public void setTickTime(String tickTime) {
		this.tickTime = tickTime;
		if(tickTime != null){
			putQueryParameter("TickTime", tickTime);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getSyncLimit() {
		return this.syncLimit;
	}

	public void setSyncLimit(String syncLimit) {
		this.syncLimit = syncLimit;
		if(syncLimit != null){
			putQueryParameter("SyncLimit", syncLimit);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getAutopurgePurgeInterval() {
		return this.autopurgePurgeInterval;
	}

	public void setAutopurgePurgeInterval(String autopurgePurgeInterval) {
		this.autopurgePurgeInterval = autopurgePurgeInterval;
		if(autopurgePurgeInterval != null){
			putQueryParameter("AutopurgePurgeInterval", autopurgePurgeInterval);
		}
	}

	public String getInitLimit() {
		return this.initLimit;
	}

	public void setInitLimit(String initLimit) {
		this.initLimit = initLimit;
		if(initLimit != null){
			putQueryParameter("InitLimit", initLimit);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<UpdateConfigResponse> getResponseClass() {
		return UpdateConfigResponse.class;
	}

}
