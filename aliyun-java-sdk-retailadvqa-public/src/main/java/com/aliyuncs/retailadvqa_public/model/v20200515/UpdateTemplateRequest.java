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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateTemplateRequest extends RpcAcsRequest<UpdateTemplateResponse> {
	   

	private String accessId;

	private String templateContent;

	private Long isVariable;

	private Long templateType;

	private String tenantId;

	private String comefrom;

	private String templateName;

	private String remark;

	private String platformIds;

	private String id;

	private String workspaceId;
	public UpdateTemplateRequest() {
		super("retailadvqa-public", "2020-05-15", "UpdateTemplate");
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getTemplateContent() {
		return this.templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
		if(templateContent != null){
			putQueryParameter("TemplateContent", templateContent);
		}
	}

	public Long getIsVariable() {
		return this.isVariable;
	}

	public void setIsVariable(Long isVariable) {
		this.isVariable = isVariable;
		if(isVariable != null){
			putQueryParameter("IsVariable", isVariable.toString());
		}
	}

	public Long getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(Long templateType) {
		this.templateType = templateType;
		if(templateType != null){
			putQueryParameter("TemplateType", templateType.toString());
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

	public String getComefrom() {
		return this.comefrom;
	}

	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
		if(comefrom != null){
			putQueryParameter("Comefrom", comefrom);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getPlatformIds() {
		return this.platformIds;
	}

	public void setPlatformIds(String platformIds) {
		this.platformIds = platformIds;
		if(platformIds != null){
			putQueryParameter("PlatformIds", platformIds);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<UpdateTemplateResponse> getResponseClass() {
		return UpdateTemplateResponse.class;
	}

}
