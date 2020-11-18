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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddFaceUserRequest extends RpcAcsRequest<AddFaceUserResponse> {
	   

	private String isolationId;

	private String customUserId;

	private String params;

	private String facePicUrl;

	private String name;
	public AddFaceUserRequest() {
		super("Linkvisual", "2018-01-20", "AddFaceUser", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIsolationId() {
		return this.isolationId;
	}

	public void setIsolationId(String isolationId) {
		this.isolationId = isolationId;
		if(isolationId != null){
			putQueryParameter("IsolationId", isolationId);
		}
	}

	public String getCustomUserId() {
		return this.customUserId;
	}

	public void setCustomUserId(String customUserId) {
		this.customUserId = customUserId;
		if(customUserId != null){
			putQueryParameter("CustomUserId", customUserId);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
		}
	}

	public String getFacePicUrl() {
		return this.facePicUrl;
	}

	public void setFacePicUrl(String facePicUrl) {
		this.facePicUrl = facePicUrl;
		if(facePicUrl != null){
			putQueryParameter("FacePicUrl", facePicUrl);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<AddFaceUserResponse> getResponseClass() {
		return AddFaceUserResponse.class;
	}

}
