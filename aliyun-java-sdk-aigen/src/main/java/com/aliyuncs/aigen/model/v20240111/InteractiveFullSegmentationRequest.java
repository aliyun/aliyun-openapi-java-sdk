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

package com.aliyuncs.aigen.model.v20240111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InteractiveFullSegmentationRequest extends RpcAcsRequest<InteractiveFullSegmentationResponse> {
	   

	private String returnFormat;

	private String imageUrl;
	public InteractiveFullSegmentationRequest() {
		super("aigen", "2024-01-11", "InteractiveFullSegmentation");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getReturnFormat() {
		return this.returnFormat;
	}

	public void setReturnFormat(String returnFormat) {
		this.returnFormat = returnFormat;
		if(returnFormat != null){
			putBodyParameter("ReturnFormat", returnFormat);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putBodyParameter("ImageUrl", imageUrl);
		}
	}

	@Override
	public Class<InteractiveFullSegmentationResponse> getResponseClass() {
		return InteractiveFullSegmentationResponse.class;
	}

}
