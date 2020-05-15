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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeOpenAccountRequest extends RpcAcsRequest<DescribeOpenAccountResponse> {
	   

	private String openId;

	private String idp;

	private String identityId;

	private String idToken;

	private String projectId;
	public DescribeOpenAccountRequest() {
		super("iovcc", "2018-05-01", "DescribeOpenAccount", "iovcc");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
		if(openId != null){
			putQueryParameter("OpenId", openId);
		}
	}

	public String getIdp() {
		return this.idp;
	}

	public void setIdp(String idp) {
		this.idp = idp;
		if(idp != null){
			putQueryParameter("Idp", idp);
		}
	}

	public String getIdentityId() {
		return this.identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
		if(identityId != null){
			putQueryParameter("IdentityId", identityId);
		}
	}

	public String getIdToken() {
		return this.idToken;
	}

	public void setIdToken(String idToken) {
		this.idToken = idToken;
		if(idToken != null){
			putQueryParameter("IdToken", idToken);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<DescribeOpenAccountResponse> getResponseClass() {
		return DescribeOpenAccountResponse.class;
	}

}
