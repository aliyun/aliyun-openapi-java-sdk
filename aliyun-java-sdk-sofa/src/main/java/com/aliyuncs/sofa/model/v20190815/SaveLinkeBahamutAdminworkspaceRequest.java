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
public class SaveLinkeBahamutAdminworkspaceRequest extends RpcAcsRequest<SaveLinkeBahamutAdminworkspaceResponse> {
	   

	private String use;

	private String modifier;

	private String workspaceName;

	private String envId;

	private String type;

	private String extraInfo;

	private Boolean defaultUse;

	private String workspaceGroupId;

	private String id;

	private String accessSecret;

	private Long created;

	private Boolean crossCloud;

	private String clusterId;

	private Boolean deleted;

	private Long lastModified;

	private String customerId;

	private String namespace;

	private String cloudTenant;

	private String bahamutAccessKey;

	private String linkETenant;

	private String workspaceId;
	public SaveLinkeBahamutAdminworkspaceRequest() {
		super("SOFA", "2019-08-15", "SaveLinkeBahamutAdminworkspace", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUse() {
		return this.use;
	}

	public void setUse(String use) {
		this.use = use;
		if(use != null){
			putBodyParameter("Use", use);
		}
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
		if(modifier != null){
			putBodyParameter("Modifier", modifier);
		}
	}

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putBodyParameter("WorkspaceName", workspaceName);
		}
	}

	public String getEnvId() {
		return this.envId;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
		if(envId != null){
			putBodyParameter("EnvId", envId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getExtraInfo() {
		return this.extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
		if(extraInfo != null){
			putBodyParameter("ExtraInfo", extraInfo);
		}
	}

	public Boolean getDefaultUse() {
		return this.defaultUse;
	}

	public void setDefaultUse(Boolean defaultUse) {
		this.defaultUse = defaultUse;
		if(defaultUse != null){
			putBodyParameter("DefaultUse", defaultUse.toString());
		}
	}

	public String getWorkspaceGroupId() {
		return this.workspaceGroupId;
	}

	public void setWorkspaceGroupId(String workspaceGroupId) {
		this.workspaceGroupId = workspaceGroupId;
		if(workspaceGroupId != null){
			putBodyParameter("WorkspaceGroupId", workspaceGroupId);
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

	public String getAccessSecret() {
		return this.accessSecret;
	}

	public void setAccessSecret(String accessSecret) {
		this.accessSecret = accessSecret;
		if(accessSecret != null){
			putBodyParameter("AccessSecret", accessSecret);
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

	public Boolean getCrossCloud() {
		return this.crossCloud;
	}

	public void setCrossCloud(Boolean crossCloud) {
		this.crossCloud = crossCloud;
		if(crossCloud != null){
			putBodyParameter("CrossCloud", crossCloud.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
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

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putBodyParameter("CustomerId", customerId);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	public String getCloudTenant() {
		return this.cloudTenant;
	}

	public void setCloudTenant(String cloudTenant) {
		this.cloudTenant = cloudTenant;
		if(cloudTenant != null){
			putBodyParameter("CloudTenant", cloudTenant);
		}
	}

	public String getBahamutAccessKey() {
		return this.bahamutAccessKey;
	}

	public void setBahamutAccessKey(String bahamutAccessKey) {
		this.bahamutAccessKey = bahamutAccessKey;
		if(bahamutAccessKey != null){
			putBodyParameter("BahamutAccessKey", bahamutAccessKey);
		}
	}

	public String getLinkETenant() {
		return this.linkETenant;
	}

	public void setLinkETenant(String linkETenant) {
		this.linkETenant = linkETenant;
		if(linkETenant != null){
			putBodyParameter("LinkETenant", linkETenant);
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
	public Class<SaveLinkeBahamutAdminworkspaceResponse> getResponseClass() {
		return SaveLinkeBahamutAdminworkspaceResponse.class;
	}

}
