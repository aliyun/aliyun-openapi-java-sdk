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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGtmInstanceGlobalConfigRequest extends RpcAcsRequest<UpdateGtmInstanceGlobalConfigResponse> {
	   

	private String alertGroup;

	private String cnameMode;

	private String lbaStrategy;

	private Integer ttl;

	private String cnameCustomDomainName;

	private String instanceId;

	private String instanceName;

	private String userDomainName;

	private String lang;
	public UpdateGtmInstanceGlobalConfigRequest() {
		super("Alidns", "2015-01-09", "UpdateGtmInstanceGlobalConfig", "alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlertGroup() {
		return this.alertGroup;
	}

	public void setAlertGroup(String alertGroup) {
		this.alertGroup = alertGroup;
		if(alertGroup != null){
			putQueryParameter("AlertGroup", alertGroup);
		}
	}

	public String getCnameMode() {
		return this.cnameMode;
	}

	public void setCnameMode(String cnameMode) {
		this.cnameMode = cnameMode;
		if(cnameMode != null){
			putQueryParameter("CnameMode", cnameMode);
		}
	}

	public String getLbaStrategy() {
		return this.lbaStrategy;
	}

	public void setLbaStrategy(String lbaStrategy) {
		this.lbaStrategy = lbaStrategy;
		if(lbaStrategy != null){
			putQueryParameter("LbaStrategy", lbaStrategy);
		}
	}

	public Integer getTtl() {
		return this.ttl;
	}

	public void setTtl(Integer ttl) {
		this.ttl = ttl;
		if(ttl != null){
			putQueryParameter("Ttl", ttl.toString());
		}
	}

	public String getCnameCustomDomainName() {
		return this.cnameCustomDomainName;
	}

	public void setCnameCustomDomainName(String cnameCustomDomainName) {
		this.cnameCustomDomainName = cnameCustomDomainName;
		if(cnameCustomDomainName != null){
			putQueryParameter("CnameCustomDomainName", cnameCustomDomainName);
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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getUserDomainName() {
		return this.userDomainName;
	}

	public void setUserDomainName(String userDomainName) {
		this.userDomainName = userDomainName;
		if(userDomainName != null){
			putQueryParameter("UserDomainName", userDomainName);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<UpdateGtmInstanceGlobalConfigResponse> getResponseClass() {
		return UpdateGtmInstanceGlobalConfigResponse.class;
	}

}
