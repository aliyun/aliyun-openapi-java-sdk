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

package com.aliyuncs.threedvision.model.v20210131;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class EstimateStereoImageDepthRequest extends RpcAcsRequest<EstimateStereoImageDepthResponse> {
	   

	private String rightImageURL;

	private String leftImageURL;
	public EstimateStereoImageDepthRequest() {
		super("threedvision", "2021-01-31", "EstimateStereoImageDepth");
		setMethod(MethodType.POST);
	}

	public String getRightImageURL() {
		return this.rightImageURL;
	}

	public void setRightImageURL(String rightImageURL) {
		this.rightImageURL = rightImageURL;
		if(rightImageURL != null){
			putBodyParameter("RightImageURL", rightImageURL);
		}
	}

	public String getLeftImageURL() {
		return this.leftImageURL;
	}

	public void setLeftImageURL(String leftImageURL) {
		this.leftImageURL = leftImageURL;
		if(leftImageURL != null){
			putBodyParameter("LeftImageURL", leftImageURL);
		}
	}

	@Override
	public Class<EstimateStereoImageDepthResponse> getResponseClass() {
		return EstimateStereoImageDepthResponse.class;
	}

}
