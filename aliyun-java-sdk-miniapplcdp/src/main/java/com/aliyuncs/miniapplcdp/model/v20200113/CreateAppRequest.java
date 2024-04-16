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

package com.aliyuncs.miniapplcdp.model.v20200113;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAppRequest extends RpcAcsRequest<CreateAppResponse> {
	   

	private String clientToken;

	private String appType;

	private String icon;

	private String description;

	private String source;

	private String schemaVersion;

	private String templateId;

	private String appName;

	private Boolean templated;

	private String sourceCommitId;

	private Boolean asynchronous;

	private String platformVersion;

	private String categoryId;
	public CreateAppRequest() {
		super("miniapplcdp", "2020-01-13", "CreateApp");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
		if(appType != null){
			putQueryParameter("AppType", appType);
		}
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
		if(icon != null){
			putQueryParameter("Icon", icon);
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getSchemaVersion() {
		return this.schemaVersion;
	}

	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
		if(schemaVersion != null){
			putQueryParameter("SchemaVersion", schemaVersion);
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
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

	public Boolean getTemplated() {
		return this.templated;
	}

	public void setTemplated(Boolean templated) {
		this.templated = templated;
		if(templated != null){
			putQueryParameter("Templated", templated.toString());
		}
	}

	public String getSourceCommitId() {
		return this.sourceCommitId;
	}

	public void setSourceCommitId(String sourceCommitId) {
		this.sourceCommitId = sourceCommitId;
		if(sourceCommitId != null){
			putQueryParameter("SourceCommitId", sourceCommitId);
		}
	}

	public Boolean getAsynchronous() {
		return this.asynchronous;
	}

	public void setAsynchronous(Boolean asynchronous) {
		this.asynchronous = asynchronous;
		if(asynchronous != null){
			putQueryParameter("Asynchronous", asynchronous.toString());
		}
	}

	public String getPlatformVersion() {
		return this.platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
		if(platformVersion != null){
			putQueryParameter("PlatformVersion", platformVersion);
		}
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId);
		}
	}

	@Override
	public Class<CreateAppResponse> getResponseClass() {
		return CreateAppResponse.class;
	}

}
