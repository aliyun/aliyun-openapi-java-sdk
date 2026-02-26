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
public class ListModulePublishVersionsRequest extends RpcAcsRequest<ListModulePublishVersionsResponse> {
	   

	private String customParentId;

	private String source;

	private String moduleVersion;

	private Integer pageNumber;

	private Integer pageSize;

	private String moduleId;
	public ListModulePublishVersionsRequest() {
		super("miniapplcdp", "2020-01-13", "ListModulePublishVersions");
		setMethod(MethodType.POST);
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

	public String getModuleVersion() {
		return this.moduleVersion;
	}

	public void setModuleVersion(String moduleVersion) {
		this.moduleVersion = moduleVersion;
		if(moduleVersion != null){
			putQueryParameter("ModuleVersion", moduleVersion);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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
	public Class<ListModulePublishVersionsResponse> getResponseClass() {
		return ListModulePublishVersionsResponse.class;
	}

}
