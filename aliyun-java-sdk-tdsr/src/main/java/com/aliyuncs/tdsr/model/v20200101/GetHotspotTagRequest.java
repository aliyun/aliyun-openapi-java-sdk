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

package com.aliyuncs.tdsr.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.tdsr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetHotspotTagRequest extends RpcAcsRequest<GetHotspotTagResponse> {
	   

	private String subSceneId;

	private String type;

	private String previewToken;
	public GetHotspotTagRequest() {
		super("tdsr", "2020-01-01", "GetHotspotTag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubSceneId() {
		return this.subSceneId;
	}

	public void setSubSceneId(String subSceneId) {
		this.subSceneId = subSceneId;
		if(subSceneId != null){
			putQueryParameter("SubSceneId", subSceneId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getPreviewToken() {
		return this.previewToken;
	}

	public void setPreviewToken(String previewToken) {
		this.previewToken = previewToken;
		if(previewToken != null){
			putQueryParameter("PreviewToken", previewToken);
		}
	}

	@Override
	public Class<GetHotspotTagResponse> getResponseClass() {
		return GetHotspotTagResponse.class;
	}

}
