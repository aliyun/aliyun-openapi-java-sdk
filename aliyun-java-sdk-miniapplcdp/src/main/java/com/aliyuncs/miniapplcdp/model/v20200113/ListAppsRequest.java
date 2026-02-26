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
public class ListAppsRequest extends RpcAcsRequest<ListAppsResponse> {
	   

	private Boolean template;

	private String appType;

	private String description;

	private String appStatus;

	private String customParentId;

	private String source;

	private String mainModuleId;

	private Integer pageNumber;

	private String appName;

	private String appId;

	private Integer pageSize;
	public ListAppsRequest() {
		super("miniapplcdp", "2020-01-13", "ListApps");
		setMethod(MethodType.POST);
	}

	public Boolean getTemplate() {
		return this.template;
	}

	public void setTemplate(Boolean template) {
		this.template = template;
		if(template != null){
			putQueryParameter("Template", template.toString());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getAppStatus() {
		return this.appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
		if(appStatus != null){
			putQueryParameter("AppStatus", appStatus);
		}
	}

	public String getCustomParentId() {
		return this.customParentId;
	}

	public void setCustomParentId(String customParentId) {
		this.customParentId = customParentId;
		if(customParentId != null){
			putQueryParameter("CustomParentId", customParentId);
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

	public String getMainModuleId() {
		return this.mainModuleId;
	}

	public void setMainModuleId(String mainModuleId) {
		this.mainModuleId = mainModuleId;
		if(mainModuleId != null){
			putQueryParameter("MainModuleId", mainModuleId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<ListAppsResponse> getResponseClass() {
		return ListAppsResponse.class;
	}

}
