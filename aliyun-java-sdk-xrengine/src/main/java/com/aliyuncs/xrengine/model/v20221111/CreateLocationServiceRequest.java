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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xrengine.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLocationServiceRequest extends RpcAcsRequest<CreateLocationServiceResponse> {
	   

	private String note;

	private Long imageId;

	private Long qps;

	private String appId;

	private String name;

	private String jwtToken;
	public CreateLocationServiceRequest() {
		super("xrEngine", "2022-11-11", "CreateLocationService");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putBodyParameter("Note", note);
		}
	}

	public Long getImageId() {
		return this.imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putBodyParameter("ImageId", imageId.toString());
		}
	}

	public Long getQps() {
		return this.qps;
	}

	public void setQps(Long qps) {
		this.qps = qps;
		if(qps != null){
			putBodyParameter("Qps", qps.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
		if(jwtToken != null){
			putBodyParameter("JwtToken", jwtToken);
		}
	}

	@Override
	public Class<CreateLocationServiceResponse> getResponseClass() {
		return CreateLocationServiceResponse.class;
	}

}
