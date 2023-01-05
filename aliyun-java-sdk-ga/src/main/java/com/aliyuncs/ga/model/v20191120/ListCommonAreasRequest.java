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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCommonAreasRequest extends RpcAcsRequest<ListCommonAreasResponse> {
	   

	private Boolean isEpg;

	private Boolean isIpSet;

	private String ipVersion;
	public ListCommonAreasRequest() {
		super("Ga", "2019-11-20", "ListCommonAreas", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsEpg() {
		return this.isEpg;
	}

	public void setIsEpg(Boolean isEpg) {
		this.isEpg = isEpg;
		if(isEpg != null){
			putQueryParameter("IsEpg", isEpg.toString());
		}
	}

	public Boolean getIsIpSet() {
		return this.isIpSet;
	}

	public void setIsIpSet(Boolean isIpSet) {
		this.isIpSet = isIpSet;
		if(isIpSet != null){
			putQueryParameter("IsIpSet", isIpSet.toString());
		}
	}

	public String getIpVersion() {
		return this.ipVersion;
	}

	public void setIpVersion(String ipVersion) {
		this.ipVersion = ipVersion;
		if(ipVersion != null){
			putQueryParameter("IpVersion", ipVersion);
		}
	}

	@Override
	public Class<ListCommonAreasResponse> getResponseClass() {
		return ListCommonAreasResponse.class;
	}

}
