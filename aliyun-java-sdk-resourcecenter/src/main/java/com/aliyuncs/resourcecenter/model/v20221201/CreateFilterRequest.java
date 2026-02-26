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

package com.aliyuncs.resourcecenter.model.v20221201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateFilterRequest extends RpcAcsRequest<CreateFilterResponse> {
	   

	private String filterName;

	private String filterConfiguration;
	public CreateFilterRequest() {
		super("ResourceCenter", "2022-12-01", "CreateFilter");
		setMethod(MethodType.POST);
	}

	public String getFilterName() {
		return this.filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
		if(filterName != null){
			putQueryParameter("FilterName", filterName);
		}
	}

	public String getFilterConfiguration() {
		return this.filterConfiguration;
	}

	public void setFilterConfiguration(String filterConfiguration) {
		this.filterConfiguration = filterConfiguration;
		if(filterConfiguration != null){
			putQueryParameter("FilterConfiguration", filterConfiguration);
		}
	}

	@Override
	public Class<CreateFilterResponse> getResponseClass() {
		return CreateFilterResponse.class;
	}

}
