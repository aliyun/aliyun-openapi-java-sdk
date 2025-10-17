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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyResourcePackageRequest extends RpcAcsRequest<ModifyResourcePackageResponse> {
	   

	private Boolean autoQuota;

	private String resourcePackageId;
	public ModifyResourcePackageRequest() {
		super("polardb", "2017-08-01", "ModifyResourcePackage", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAutoQuota() {
		return this.autoQuota;
	}

	public void setAutoQuota(Boolean autoQuota) {
		this.autoQuota = autoQuota;
		if(autoQuota != null){
			putQueryParameter("AutoQuota", autoQuota.toString());
		}
	}

	public String getResourcePackageId() {
		return this.resourcePackageId;
	}

	public void setResourcePackageId(String resourcePackageId) {
		this.resourcePackageId = resourcePackageId;
		if(resourcePackageId != null){
			putQueryParameter("ResourcePackageId", resourcePackageId);
		}
	}

	@Override
	public Class<ModifyResourcePackageResponse> getResponseClass() {
		return ModifyResourcePackageResponse.class;
	}

}
