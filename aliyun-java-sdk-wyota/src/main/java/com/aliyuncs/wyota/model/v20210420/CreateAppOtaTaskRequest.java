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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAppOtaTaskRequest extends RpcAcsRequest<CreateAppOtaTaskResponse> {
	   

	private Integer clientType;

	private List<String> regionss;

	private List<String> clientIdLists;

	private String channel;

	private String project;

	private String description;

	private String tenantId;

	private String creator;

	private Integer taskType;

	private String label;

	private String appVersionUid;

	private String name;

	private Integer forceUpgrade;

	private Integer status;
	public CreateAppOtaTaskRequest() {
		super("wyota", "2021-04-20", "CreateAppOtaTask");
		setMethod(MethodType.POST);
	}

	public Integer getClientType() {
		return this.clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putQueryParameter("ClientType", clientType.toString());
		}
	}

	public List<String> getRegionss() {
		return this.regionss;
	}

	public void setRegionss(List<String> regionss) {
		this.regionss = regionss;	
		if (regionss != null) {
			for (int i = 0; i < regionss.size(); i++) {
				putQueryParameter("Regions." + (i + 1) , regionss.get(i));
			}
		}	
	}

	public List<String> getClientIdLists() {
		return this.clientIdLists;
	}

	public void setClientIdLists(List<String> clientIdLists) {
		this.clientIdLists = clientIdLists;	
		if (clientIdLists != null) {
			for (int i = 0; i < clientIdLists.size(); i++) {
				putQueryParameter("ClientIdList." + (i + 1) , clientIdLists.get(i));
			}
		}	
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("Creator", creator);
		}
	}

	public Integer getTaskType() {
		return this.taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType.toString());
		}
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
		if(label != null){
			putQueryParameter("Label", label);
		}
	}

	public String getAppVersionUid() {
		return this.appVersionUid;
	}

	public void setAppVersionUid(String appVersionUid) {
		this.appVersionUid = appVersionUid;
		if(appVersionUid != null){
			putQueryParameter("AppVersionUid", appVersionUid);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getForceUpgrade() {
		return this.forceUpgrade;
	}

	public void setForceUpgrade(Integer forceUpgrade) {
		this.forceUpgrade = forceUpgrade;
		if(forceUpgrade != null){
			putQueryParameter("ForceUpgrade", forceUpgrade.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<CreateAppOtaTaskResponse> getResponseClass() {
		return CreateAppOtaTaskResponse.class;
	}

}
