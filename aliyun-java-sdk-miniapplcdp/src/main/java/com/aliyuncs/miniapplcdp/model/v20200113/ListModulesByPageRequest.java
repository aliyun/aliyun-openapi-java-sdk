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
public class ListModulesByPageRequest extends RpcAcsRequest<ListModulesByPageResponse> {
	   

	private String description;

	private String customParentId;

	private String source;

	private Integer pageNumber;

	private String platform;

	private Boolean hasOwnerApp;

	private String moduleType;

	private Integer pageSize;

	private String moduleName;

	private String moduleId;
	public ListModulesByPageRequest() {
		super("miniapplcdp", "2020-01-13", "ListModulesByPage");
		setMethod(MethodType.POST);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public Boolean getHasOwnerApp() {
		return this.hasOwnerApp;
	}

	public void setHasOwnerApp(Boolean hasOwnerApp) {
		this.hasOwnerApp = hasOwnerApp;
		if(hasOwnerApp != null){
			putQueryParameter("HasOwnerApp", hasOwnerApp.toString());
		}
	}

	public String getModuleType() {
		return this.moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
		if(moduleType != null){
			putQueryParameter("ModuleType", moduleType);
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

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
		if(moduleName != null){
			putQueryParameter("ModuleName", moduleName);
		}
	}

	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
		if(moduleId != null){
			putQueryParameter("ModuleId", moduleId);
		}
	}

	@Override
	public Class<ListModulesByPageResponse> getResponseClass() {
		return ListModulesByPageResponse.class;
	}

}
