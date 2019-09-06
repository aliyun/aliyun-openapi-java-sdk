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

package com.aliyuncs.indvi.model.v20190701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.indvi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDetectionResultRequest extends RpcAcsRequest<GetDetectionResultResponse> {
	
	public GetDetectionResultRequest() {
		super("Indvi", "2019-07-01", "GetDetectionResult", "indvi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String imageUrl;

	private String detectPath;

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
		}
	}

	public String getDetectPath() {
		return this.detectPath;
	}

	public void setDetectPath(String detectPath) {
		this.detectPath = detectPath;
		if(detectPath != null){
			putQueryParameter("DetectPath", detectPath);
		}
	}

	@Override
	public Class<GetDetectionResultResponse> getResponseClass() {
		return GetDetectionResultResponse.class;
	}

}
