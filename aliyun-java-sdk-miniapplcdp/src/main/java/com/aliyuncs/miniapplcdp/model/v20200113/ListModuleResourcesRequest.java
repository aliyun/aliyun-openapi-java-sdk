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
public class ListModuleResourcesRequest extends RpcAcsRequest<ListModuleResourcesResponse> {
	   

	private Boolean withContent;

	private String types;

	private String moduleList;

	private String source;
	public ListModuleResourcesRequest() {
		super("miniapplcdp", "2020-01-13", "ListModuleResources");
		setMethod(MethodType.POST);
	}

	public Boolean getWithContent() {
		return this.withContent;
	}

	public void setWithContent(Boolean withContent) {
		this.withContent = withContent;
		if(withContent != null){
			putQueryParameter("WithContent", withContent.toString());
		}
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
		if(types != null){
			putQueryParameter("Types", types);
		}
	}

	public String getModuleList() {
		return this.moduleList;
	}

	public void setModuleList(String moduleList) {
		this.moduleList = moduleList;
		if(moduleList != null){
			putQueryParameter("ModuleList", moduleList);
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

	@Override
	public Class<ListModuleResourcesResponse> getResponseClass() {
		return ListModuleResourcesResponse.class;
	}

}
