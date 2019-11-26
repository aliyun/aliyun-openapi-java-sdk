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

package com.aliyuncs.aligreen_console.model.v20191115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aligreen_console.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveSfaceFaceRequest extends RpcAcsRequest<RemoveSfaceFaceResponse> {
	   

	private String faceId;

	private String dataId;

	private String callbackSeed;

	private String personId;

	private String callbackUrl;
	public RemoveSfaceFaceRequest() {
		super("aligreen-console", "2019-11-15", "RemoveSfaceFace");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFaceId() {
		return this.faceId;
	}

	public void setFaceId(String faceId) {
		this.faceId = faceId;
		if(faceId != null){
			putQueryParameter("FaceId", faceId);
		}
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
		if(dataId != null){
			putQueryParameter("DataId", dataId);
		}
	}

	public String getCallbackSeed() {
		return this.callbackSeed;
	}

	public void setCallbackSeed(String callbackSeed) {
		this.callbackSeed = callbackSeed;
		if(callbackSeed != null){
			putQueryParameter("CallbackSeed", callbackSeed);
		}
	}

	public String getPersonId() {
		return this.personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
		if(personId != null){
			putQueryParameter("PersonId", personId);
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
		}
	}

	@Override
	public Class<RemoveSfaceFaceResponse> getResponseClass() {
		return RemoveSfaceFaceResponse.class;
	}

}
