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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateBookkeepingOrgRequest extends RpcAcsRequest<UpdateBookkeepingOrgResponse> {
	   

	private String orgAddress;

	private String orgName;

	private String orgCode;

	private String orgMobile;
	public UpdateBookkeepingOrgRequest() {
		super("companyreg", "2019-05-08", "UpdateBookkeepingOrg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrgAddress() {
		return this.orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
		if(orgAddress != null){
			putQueryParameter("OrgAddress", orgAddress);
		}
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
		if(orgName != null){
			putQueryParameter("OrgName", orgName);
		}
	}

	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
		if(orgCode != null){
			putQueryParameter("OrgCode", orgCode);
		}
	}

	public String getOrgMobile() {
		return this.orgMobile;
	}

	public void setOrgMobile(String orgMobile) {
		this.orgMobile = orgMobile;
		if(orgMobile != null){
			putQueryParameter("OrgMobile", orgMobile);
		}
	}

	@Override
	public Class<UpdateBookkeepingOrgResponse> getResponseClass() {
		return UpdateBookkeepingOrgResponse.class;
	}

}
