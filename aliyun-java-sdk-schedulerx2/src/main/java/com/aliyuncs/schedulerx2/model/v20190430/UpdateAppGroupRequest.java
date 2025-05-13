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

package com.aliyuncs.schedulerx2.model.v20190430;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.schedulerx2.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAppGroupRequest extends RpcAcsRequest<UpdateAppGroupResponse> {
	   

	private String description;

	private String monitorContactsJson;

	private String groupId;

	private Integer appVersion;

	private String monitorConfigJson;

	private String namespace;

	private Integer maxConcurrency;
	public UpdateAppGroupRequest() {
		super("schedulerx2", "2019-04-30", "UpdateAppGroup", "schedulerx2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getMonitorContactsJson() {
		return this.monitorContactsJson;
	}

	public void setMonitorContactsJson(String monitorContactsJson) {
		this.monitorContactsJson = monitorContactsJson;
		if(monitorContactsJson != null){
			putQueryParameter("MonitorContactsJson", monitorContactsJson);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public Integer getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(Integer appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putQueryParameter("AppVersion", appVersion.toString());
		}
	}

	public String getMonitorConfigJson() {
		return this.monitorConfigJson;
	}

	public void setMonitorConfigJson(String monitorConfigJson) {
		this.monitorConfigJson = monitorConfigJson;
		if(monitorConfigJson != null){
			putQueryParameter("MonitorConfigJson", monitorConfigJson);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public Integer getMaxConcurrency() {
		return this.maxConcurrency;
	}

	public void setMaxConcurrency(Integer maxConcurrency) {
		this.maxConcurrency = maxConcurrency;
		if(maxConcurrency != null){
			putQueryParameter("MaxConcurrency", maxConcurrency.toString());
		}
	}

	@Override
	public Class<UpdateAppGroupResponse> getResponseClass() {
		return UpdateAppGroupResponse.class;
	}

}
