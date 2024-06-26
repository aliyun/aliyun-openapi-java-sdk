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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.schedulerx2.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAppGroupRequest extends RpcAcsRequest<CreateAppGroupResponse> {
	   

	private String namespaceName;

	private String namespaceSource;

	private Boolean scheduleBusyWorkers;

	private String description;

	private String appName;

	private String monitorContactsJson;

	private Integer maxJobs;

	private String groupId;

	private Integer appType;

	private Integer appVersion;

	private String monitorConfigJson;

	private String namespace;

	private Boolean enableLog;

	private String appKey;
	public CreateAppGroupRequest() {
		super("schedulerx2", "2019-04-30", "CreateAppGroup", "schedulerx2");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespaceName() {
		return this.namespaceName;
	}

	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
		if(namespaceName != null){
			putQueryParameter("NamespaceName", namespaceName);
		}
	}

	public String getNamespaceSource() {
		return this.namespaceSource;
	}

	public void setNamespaceSource(String namespaceSource) {
		this.namespaceSource = namespaceSource;
		if(namespaceSource != null){
			putQueryParameter("NamespaceSource", namespaceSource);
		}
	}

	public Boolean getScheduleBusyWorkers() {
		return this.scheduleBusyWorkers;
	}

	public void setScheduleBusyWorkers(Boolean scheduleBusyWorkers) {
		this.scheduleBusyWorkers = scheduleBusyWorkers;
		if(scheduleBusyWorkers != null){
			putQueryParameter("ScheduleBusyWorkers", scheduleBusyWorkers.toString());
		}
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

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
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

	public Integer getMaxJobs() {
		return this.maxJobs;
	}

	public void setMaxJobs(Integer maxJobs) {
		this.maxJobs = maxJobs;
		if(maxJobs != null){
			putQueryParameter("MaxJobs", maxJobs.toString());
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

	public Integer getAppType() {
		return this.appType;
	}

	public void setAppType(Integer appType) {
		this.appType = appType;
		if(appType != null){
			putQueryParameter("AppType", appType.toString());
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

	public Boolean getEnableLog() {
		return this.enableLog;
	}

	public void setEnableLog(Boolean enableLog) {
		this.enableLog = enableLog;
		if(enableLog != null){
			putQueryParameter("EnableLog", enableLog.toString());
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
	}

	@Override
	public Class<CreateAppGroupResponse> getResponseClass() {
		return CreateAppGroupResponse.class;
	}

}
