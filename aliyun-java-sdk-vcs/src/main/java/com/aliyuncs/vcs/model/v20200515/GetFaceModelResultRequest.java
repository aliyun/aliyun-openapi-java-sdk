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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetFaceModelResultRequest extends RpcAcsRequest<GetFaceModelResultResponse> {
	   

	private String pictureUrl;

	private String pictureContent;

	private String pictureId;
	public GetFaceModelResultRequest() {
		super("Vcs", "2020-05-15", "GetFaceModelResult", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
		if(pictureUrl != null){
			putBodyParameter("PictureUrl", pictureUrl);
		}
	}

	public String getPictureContent() {
		return this.pictureContent;
	}

	public void setPictureContent(String pictureContent) {
		this.pictureContent = pictureContent;
		if(pictureContent != null){
			putBodyParameter("PictureContent", pictureContent);
		}
	}

	public String getPictureId() {
		return this.pictureId;
	}

	public void setPictureId(String pictureId) {
		this.pictureId = pictureId;
		if(pictureId != null){
			putBodyParameter("PictureId", pictureId);
		}
	}

	@Override
	public Class<GetFaceModelResultResponse> getResponseClass() {
		return GetFaceModelResultResponse.class;
	}

}
