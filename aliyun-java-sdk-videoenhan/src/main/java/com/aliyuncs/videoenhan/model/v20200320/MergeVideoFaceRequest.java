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

package com.aliyuncs.videoenhan.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.videoenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MergeVideoFaceRequest extends RpcAcsRequest<MergeVideoFaceResponse> {
	   

	private String referenceURL;

	private String postURL;

	private String videoURL;
	public MergeVideoFaceRequest() {
		super("videoenhan", "2020-03-20", "MergeVideoFace");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReferenceURL() {
		return this.referenceURL;
	}

	public void setReferenceURL(String referenceURL) {
		this.referenceURL = referenceURL;
		if(referenceURL != null){
			putBodyParameter("ReferenceURL", referenceURL);
		}
	}

	public String getPostURL() {
		return this.postURL;
	}

	public void setPostURL(String postURL) {
		this.postURL = postURL;
		if(postURL != null){
			putBodyParameter("PostURL", postURL);
		}
	}

	public String getVideoURL() {
		return this.videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
		if(videoURL != null){
			putBodyParameter("VideoURL", videoURL);
		}
	}

	@Override
	public Class<MergeVideoFaceResponse> getResponseClass() {
		return MergeVideoFaceResponse.class;
	}

}
