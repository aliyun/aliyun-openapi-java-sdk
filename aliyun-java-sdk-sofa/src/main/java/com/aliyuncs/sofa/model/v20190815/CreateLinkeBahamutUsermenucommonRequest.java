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
public class CreateLinkeBahamutUsermenucommonRequest extends RpcAcsRequest<CreateLinkeBahamutUsermenucommonResponse> {
	   

	private String memuId;

	private String url;

	private String userEmpId;

	private String displayName;
	public CreateLinkeBahamutUsermenucommonRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutUsermenucommon", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMemuId() {
		return this.memuId;
	}

	public void setMemuId(String memuId) {
		this.memuId = memuId;
		if(memuId != null){
			putBodyParameter("MemuId", memuId);
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putBodyParameter("Url", url);
		}
	}

	public String getUserEmpId() {
		return this.userEmpId;
	}

	public void setUserEmpId(String userEmpId) {
		this.userEmpId = userEmpId;
		if(userEmpId != null){
			putBodyParameter("UserEmpId", userEmpId);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putBodyParameter("DisplayName", displayName);
		}
	}

	@Override
	public Class<CreateLinkeBahamutUsermenucommonResponse> getResponseClass() {
		return CreateLinkeBahamutUsermenucommonResponse.class;
	}

}
