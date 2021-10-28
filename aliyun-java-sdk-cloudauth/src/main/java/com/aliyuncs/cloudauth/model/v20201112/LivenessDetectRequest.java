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

package com.aliyuncs.cloudauth.model.v20201112;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class LivenessDetectRequest extends RpcAcsRequest<LivenessDetectResponse> {
	   

	private String mediaCategory;

	private String mediaUrl;

	private String bizType;

	private String bizId;

	private String mediaFile;
	public LivenessDetectRequest() {
		super("Cloudauth", "2020-11-12", "LivenessDetect", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMediaCategory() {
		return this.mediaCategory;
	}

	public void setMediaCategory(String mediaCategory) {
		this.mediaCategory = mediaCategory;
		if(mediaCategory != null){
			putBodyParameter("MediaCategory", mediaCategory);
		}
	}

	public String getMediaUrl() {
		return this.mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
		if(mediaUrl != null){
			putBodyParameter("MediaUrl", mediaUrl);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public String getMediaFile() {
		return this.mediaFile;
	}

	public void setMediaFile(String mediaFile) {
		this.mediaFile = mediaFile;
		if(mediaFile != null){
			putBodyParameter("MediaFile", mediaFile);
		}
	}

	@Override
	public Class<LivenessDetectResponse> getResponseClass() {
		return LivenessDetectResponse.class;
	}

}
