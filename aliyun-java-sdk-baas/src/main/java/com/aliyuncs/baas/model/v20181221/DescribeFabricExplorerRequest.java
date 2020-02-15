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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeFabricExplorerRequest extends RpcAcsRequest<DescribeFabricExplorerResponse> {
	   

	private String exUrl;

	private String exMethod;

	private String organizationId;

	private String exBody;
	public DescribeFabricExplorerRequest() {
		super("Baas", "2018-12-21", "DescribeFabricExplorer", "baas");
		setMethod(MethodType.PUT);
	}

	public String getExUrl() {
		return this.exUrl;
	}

	public void setExUrl(String exUrl) {
		this.exUrl = exUrl;
		if(exUrl != null){
			putQueryParameter("ExUrl", exUrl);
		}
	}

	public String getExMethod() {
		return this.exMethod;
	}

	public void setExMethod(String exMethod) {
		this.exMethod = exMethod;
		if(exMethod != null){
			putQueryParameter("ExMethod", exMethod);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putBodyParameter("OrganizationId", organizationId);
		}
	}

	public String getExBody() {
		return this.exBody;
	}

	public void setExBody(String exBody) {
		this.exBody = exBody;
		if(exBody != null){
			putQueryParameter("ExBody", exBody);
		}
	}

	@Override
	public Class<DescribeFabricExplorerResponse> getResponseClass() {
		return DescribeFabricExplorerResponse.class;
	}

}
