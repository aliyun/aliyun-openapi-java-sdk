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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricTaskinfoRequest extends RpcAcsRequest<QueryLinkefabricFabricTaskinfoResponse> {
	   

	private String appName;

	private Boolean _public;

	private String originAppName;

	private Long tenantId;

	private String projectId;

	private String utcCreate;

	private String taskType;

	private String subTaskType;

	private String commonState;

	private Long count;

	private Long start;

	private String releaseId;

	private String devStage;

	private String utcModified;
	public QueryLinkefabricFabricTaskinfoRequest() {
		super("SOFA", "2019-08-15", "QueryLinkefabricFabricTaskinfo", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public Boolean get_Public() {
		return this._public;
	}

	public void set_Public(Boolean _public) {
		this._public = _public;
		if(_public != null){
			putBodyParameter("Public", _public.toString());
		}
	}

	public String getOriginAppName() {
		return this.originAppName;
	}

	public void setOriginAppName(String originAppName) {
		this.originAppName = originAppName;
		if(originAppName != null){
			putBodyParameter("OriginAppName", originAppName);
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getUtcCreate() {
		return this.utcCreate;
	}

	public void setUtcCreate(String utcCreate) {
		this.utcCreate = utcCreate;
		if(utcCreate != null){
			putBodyParameter("UtcCreate", utcCreate);
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putBodyParameter("TaskType", taskType);
		}
	}

	public String getSubTaskType() {
		return this.subTaskType;
	}

	public void setSubTaskType(String subTaskType) {
		this.subTaskType = subTaskType;
		if(subTaskType != null){
			putBodyParameter("SubTaskType", subTaskType);
		}
	}

	public String getCommonState() {
		return this.commonState;
	}

	public void setCommonState(String commonState) {
		this.commonState = commonState;
		if(commonState != null){
			putBodyParameter("CommonState", commonState);
		}
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
		if(count != null){
			putBodyParameter("Count", count.toString());
		}
	}

	public Long getStart() {
		return this.start;
	}

	public void setStart(Long start) {
		this.start = start;
		if(start != null){
			putBodyParameter("Start", start.toString());
		}
	}

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putBodyParameter("ReleaseId", releaseId);
		}
	}

	public String getDevStage() {
		return this.devStage;
	}

	public void setDevStage(String devStage) {
		this.devStage = devStage;
		if(devStage != null){
			putBodyParameter("DevStage", devStage);
		}
	}

	public String getUtcModified() {
		return this.utcModified;
	}

	public void setUtcModified(String utcModified) {
		this.utcModified = utcModified;
		if(utcModified != null){
			putBodyParameter("UtcModified", utcModified);
		}
	}

	@Override
	public Class<QueryLinkefabricFabricTaskinfoResponse> getResponseClass() {
		return QueryLinkefabricFabricTaskinfoResponse.class;
	}

}
