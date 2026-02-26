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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMdsCubeTaskRequest extends RpcAcsRequest<CreateMdsCubeTaskResponse> {
	   

	private String taskDesc;

	private String greyConfigInfo;

	private Long templateResourceId;

	private String tenantId;

	private Integer publishMode;

	private String whitelistIds;

	private Integer publishType;

	private Integer greyNum;

	private String appId;

	private String greyEndtimeData;

	private String workspaceId;
	public CreateMdsCubeTaskRequest() {
		super("mPaaS", "2020-10-28", "CreateMdsCubeTask", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
		if(taskDesc != null){
			putBodyParameter("TaskDesc", taskDesc);
		}
	}

	public String getGreyConfigInfo() {
		return this.greyConfigInfo;
	}

	public void setGreyConfigInfo(String greyConfigInfo) {
		this.greyConfigInfo = greyConfigInfo;
		if(greyConfigInfo != null){
			putBodyParameter("GreyConfigInfo", greyConfigInfo);
		}
	}

	public Long getTemplateResourceId() {
		return this.templateResourceId;
	}

	public void setTemplateResourceId(Long templateResourceId) {
		this.templateResourceId = templateResourceId;
		if(templateResourceId != null){
			putBodyParameter("TemplateResourceId", templateResourceId.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public Integer getPublishMode() {
		return this.publishMode;
	}

	public void setPublishMode(Integer publishMode) {
		this.publishMode = publishMode;
		if(publishMode != null){
			putBodyParameter("PublishMode", publishMode.toString());
		}
	}

	public String getWhitelistIds() {
		return this.whitelistIds;
	}

	public void setWhitelistIds(String whitelistIds) {
		this.whitelistIds = whitelistIds;
		if(whitelistIds != null){
			putBodyParameter("WhitelistIds", whitelistIds);
		}
	}

	public Integer getPublishType() {
		return this.publishType;
	}

	public void setPublishType(Integer publishType) {
		this.publishType = publishType;
		if(publishType != null){
			putBodyParameter("PublishType", publishType.toString());
		}
	}

	public Integer getGreyNum() {
		return this.greyNum;
	}

	public void setGreyNum(Integer greyNum) {
		this.greyNum = greyNum;
		if(greyNum != null){
			putBodyParameter("GreyNum", greyNum.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getGreyEndtimeData() {
		return this.greyEndtimeData;
	}

	public void setGreyEndtimeData(String greyEndtimeData) {
		this.greyEndtimeData = greyEndtimeData;
		if(greyEndtimeData != null){
			putBodyParameter("GreyEndtimeData", greyEndtimeData);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<CreateMdsCubeTaskResponse> getResponseClass() {
		return CreateMdsCubeTaskResponse.class;
	}

}
