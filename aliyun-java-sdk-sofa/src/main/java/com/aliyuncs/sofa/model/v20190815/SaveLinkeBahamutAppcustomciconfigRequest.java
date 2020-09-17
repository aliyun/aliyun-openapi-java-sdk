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
public class SaveLinkeBahamutAppcustomciconfigRequest extends RpcAcsRequest<SaveLinkeBahamutAppcustomciconfigResponse> {
	   

	private String pipelineTemplateName;

	private String branch;

	private Long pipelineTemplateId;

	private Long pipelineInstanceId;

	private String tenantId;

	private String id;

	private Long created;

	private String crontab;

	private Boolean deleted;

	private Long lastModified;

	private String appId;

	private String name;
	public SaveLinkeBahamutAppcustomciconfigRequest() {
		super("SOFA", "2019-08-15", "SaveLinkeBahamutAppcustomciconfig", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPipelineTemplateName() {
		return this.pipelineTemplateName;
	}

	public void setPipelineTemplateName(String pipelineTemplateName) {
		this.pipelineTemplateName = pipelineTemplateName;
		if(pipelineTemplateName != null){
			putBodyParameter("PipelineTemplateName", pipelineTemplateName);
		}
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
		if(branch != null){
			putBodyParameter("Branch", branch);
		}
	}

	public Long getPipelineTemplateId() {
		return this.pipelineTemplateId;
	}

	public void setPipelineTemplateId(Long pipelineTemplateId) {
		this.pipelineTemplateId = pipelineTemplateId;
		if(pipelineTemplateId != null){
			putBodyParameter("PipelineTemplateId", pipelineTemplateId.toString());
		}
	}

	public Long getPipelineInstanceId() {
		return this.pipelineInstanceId;
	}

	public void setPipelineInstanceId(Long pipelineInstanceId) {
		this.pipelineInstanceId = pipelineInstanceId;
		if(pipelineInstanceId != null){
			putBodyParameter("PipelineInstanceId", pipelineInstanceId.toString());
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
		if(created != null){
			putBodyParameter("Created", created.toString());
		}
	}

	public String getCrontab() {
		return this.crontab;
	}

	public void setCrontab(String crontab) {
		this.crontab = crontab;
		if(crontab != null){
			putBodyParameter("Crontab", crontab);
		}
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
		if(deleted != null){
			putBodyParameter("Deleted", deleted.toString());
		}
	}

	public Long getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Long lastModified) {
		this.lastModified = lastModified;
		if(lastModified != null){
			putBodyParameter("LastModified", lastModified.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	@Override
	public Class<SaveLinkeBahamutAppcustomciconfigResponse> getResponseClass() {
		return SaveLinkeBahamutAppcustomciconfigResponse.class;
	}

}
