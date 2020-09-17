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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCASApplicationRequest extends RpcAcsRequest<UpdateCASApplicationResponse> {
	   

	private String extraParams;

	private String appLevelJsonStr;

	private String stackId;

	private String description;

	private String appDomainId;

	private String chineseName;

	private String id;

	private String buildpackVersion;

	private String appOwnerJsonStr;

	private String utcCreate;

	private List<AppExtraInfos> appExtraInfoss;

	private String ownerId;

	private String tags;

	private String archetypeJsonStr;

	private String codeRepositoryJsonStr;

	private Boolean isService;

	private String name;

	private String utcModified;

	private String status;

	private String workspaceId;
	public UpdateCASApplicationRequest() {
		super("SOFA", "2019-08-15", "UpdateCASApplication", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
		}
	}

	public String getAppLevelJsonStr() {
		return this.appLevelJsonStr;
	}

	public void setAppLevelJsonStr(String appLevelJsonStr) {
		this.appLevelJsonStr = appLevelJsonStr;
		if(appLevelJsonStr != null){
			putBodyParameter("AppLevelJsonStr", appLevelJsonStr);
		}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putBodyParameter("StackId", stackId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getAppDomainId() {
		return this.appDomainId;
	}

	public void setAppDomainId(String appDomainId) {
		this.appDomainId = appDomainId;
		if(appDomainId != null){
			putBodyParameter("AppDomainId", appDomainId);
		}
	}

	public String getChineseName() {
		return this.chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
		if(chineseName != null){
			putBodyParameter("ChineseName", chineseName);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getBuildpackVersion() {
		return this.buildpackVersion;
	}

	public void setBuildpackVersion(String buildpackVersion) {
		this.buildpackVersion = buildpackVersion;
		if(buildpackVersion != null){
			putBodyParameter("BuildpackVersion", buildpackVersion);
		}
	}

	public String getAppOwnerJsonStr() {
		return this.appOwnerJsonStr;
	}

	public void setAppOwnerJsonStr(String appOwnerJsonStr) {
		this.appOwnerJsonStr = appOwnerJsonStr;
		if(appOwnerJsonStr != null){
			putBodyParameter("AppOwnerJsonStr", appOwnerJsonStr);
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

	public List<AppExtraInfos> getAppExtraInfoss() {
		return this.appExtraInfoss;
	}

	public void setAppExtraInfoss(List<AppExtraInfos> appExtraInfoss) {
		this.appExtraInfoss = appExtraInfoss;	
		if (appExtraInfoss != null) {
			for (int depth1 = 0; depth1 < appExtraInfoss.size(); depth1++) {
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".AppExtrainfoId" , appExtraInfoss.get(depth1).getAppExtrainfoId());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".TemplateDataId" , appExtraInfoss.get(depth1).getTemplateDataId());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".AppId" , appExtraInfoss.get(depth1).getAppId());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".Name" , appExtraInfoss.get(depth1).getName());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".Description" , appExtraInfoss.get(depth1).getDescription());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".Id" , appExtraInfoss.get(depth1).getId());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".TemplateId" , appExtraInfoss.get(depth1).getTemplateId());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".Type" , appExtraInfoss.get(depth1).getType());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".UtcCreate" , appExtraInfoss.get(depth1).getUtcCreate());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".Value" , appExtraInfoss.get(depth1).getValue());
				putBodyParameter("AppExtraInfos." + (depth1 + 1) + ".UtcModified" , appExtraInfoss.get(depth1).getUtcModified());
			}
		}	
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putBodyParameter("OwnerId", ownerId);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putBodyParameter("Tags", tags);
		}
	}

	public String getArchetypeJsonStr() {
		return this.archetypeJsonStr;
	}

	public void setArchetypeJsonStr(String archetypeJsonStr) {
		this.archetypeJsonStr = archetypeJsonStr;
		if(archetypeJsonStr != null){
			putBodyParameter("ArchetypeJsonStr", archetypeJsonStr);
		}
	}

	public String getCodeRepositoryJsonStr() {
		return this.codeRepositoryJsonStr;
	}

	public void setCodeRepositoryJsonStr(String codeRepositoryJsonStr) {
		this.codeRepositoryJsonStr = codeRepositoryJsonStr;
		if(codeRepositoryJsonStr != null){
			putBodyParameter("CodeRepositoryJsonStr", codeRepositoryJsonStr);
		}
	}

	public Boolean getIsService() {
		return this.isService;
	}

	public void setIsService(Boolean isService) {
		this.isService = isService;
		if(isService != null){
			putBodyParameter("IsService", isService.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
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

	public static class AppExtraInfos {

		private String appExtrainfoId;

		private String templateDataId;

		private String appId;

		private String name;

		private String description;

		private String id;

		private String templateId;

		private String type;

		private String utcCreate;

		private String value;

		private String utcModified;

		public String getAppExtrainfoId() {
			return this.appExtrainfoId;
		}

		public void setAppExtrainfoId(String appExtrainfoId) {
			this.appExtrainfoId = appExtrainfoId;
		}

		public String getTemplateDataId() {
			return this.templateDataId;
		}

		public void setTemplateDataId(String templateDataId) {
			this.templateDataId = templateDataId;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}
	}

	@Override
	public Class<UpdateCASApplicationResponse> getResponseClass() {
		return UpdateCASApplicationResponse.class;
	}

}
