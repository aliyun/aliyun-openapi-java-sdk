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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayBlockVolumeRequest extends RpcAcsRequest<UpdateGatewayBlockVolumeResponse> {
	   

	private Boolean chapEnabled;

	private Long size;

	private String securityToken;

	private String chapInUser;

	private String indexId;

	private String chapInPassword;

	private String gatewayId;
	public UpdateGatewayBlockVolumeRequest() {
		super("sgw", "2018-05-11", "UpdateGatewayBlockVolume", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getChapEnabled() {
		return this.chapEnabled;
	}

	public void setChapEnabled(Boolean chapEnabled) {
		this.chapEnabled = chapEnabled;
		if(chapEnabled != null){
			putQueryParameter("ChapEnabled", chapEnabled.toString());
		}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getChapInUser() {
		return this.chapInUser;
	}

	public void setChapInUser(String chapInUser) {
		this.chapInUser = chapInUser;
		if(chapInUser != null){
			putQueryParameter("ChapInUser", chapInUser);
		}
	}

	public String getIndexId() {
		return this.indexId;
	}

	public void setIndexId(String indexId) {
		this.indexId = indexId;
		if(indexId != null){
			putQueryParameter("IndexId", indexId);
		}
	}

	public String getChapInPassword() {
		return this.chapInPassword;
	}

	public void setChapInPassword(String chapInPassword) {
		this.chapInPassword = chapInPassword;
		if(chapInPassword != null){
			putQueryParameter("ChapInPassword", chapInPassword);
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	@Override
	public Class<UpdateGatewayBlockVolumeResponse> getResponseClass() {
		return UpdateGatewayBlockVolumeResponse.class;
	}

}
