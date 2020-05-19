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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CountOwnedJoinPermissionsRequest extends RpcAcsRequest<CountOwnedJoinPermissionsResponse> {
	   

	private Boolean enabled;

	private String fuzzyJoinEui;

	private String fuzzyJoinPermissionName;

	private String fuzzyRenterAliyunId;
	public CountOwnedJoinPermissionsRequest() {
		super("LinkWAN", "2019-03-01", "CountOwnedJoinPermissions", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	public String getFuzzyJoinEui() {
		return this.fuzzyJoinEui;
	}

	public void setFuzzyJoinEui(String fuzzyJoinEui) {
		this.fuzzyJoinEui = fuzzyJoinEui;
		if(fuzzyJoinEui != null){
			putQueryParameter("FuzzyJoinEui", fuzzyJoinEui);
		}
	}

	public String getFuzzyJoinPermissionName() {
		return this.fuzzyJoinPermissionName;
	}

	public void setFuzzyJoinPermissionName(String fuzzyJoinPermissionName) {
		this.fuzzyJoinPermissionName = fuzzyJoinPermissionName;
		if(fuzzyJoinPermissionName != null){
			putQueryParameter("FuzzyJoinPermissionName", fuzzyJoinPermissionName);
		}
	}

	public String getFuzzyRenterAliyunId() {
		return this.fuzzyRenterAliyunId;
	}

	public void setFuzzyRenterAliyunId(String fuzzyRenterAliyunId) {
		this.fuzzyRenterAliyunId = fuzzyRenterAliyunId;
		if(fuzzyRenterAliyunId != null){
			putQueryParameter("FuzzyRenterAliyunId", fuzzyRenterAliyunId);
		}
	}

	@Override
	public Class<CountOwnedJoinPermissionsResponse> getResponseClass() {
		return CountOwnedJoinPermissionsResponse.class;
	}

}
