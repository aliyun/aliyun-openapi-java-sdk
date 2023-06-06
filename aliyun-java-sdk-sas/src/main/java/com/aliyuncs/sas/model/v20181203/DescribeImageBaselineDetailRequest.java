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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageBaselineDetailRequest extends RpcAcsRequest<DescribeImageBaselineDetailResponse> {
	   

	private String lang;

	private String imageUuid;

	private String baselineItemKey;
	public DescribeImageBaselineDetailRequest() {
		super("Sas", "2018-12-03", "DescribeImageBaselineDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getImageUuid() {
		return this.imageUuid;
	}

	public void setImageUuid(String imageUuid) {
		this.imageUuid = imageUuid;
		if(imageUuid != null){
			putQueryParameter("ImageUuid", imageUuid);
		}
	}

	public String getBaselineItemKey() {
		return this.baselineItemKey;
	}

	public void setBaselineItemKey(String baselineItemKey) {
		this.baselineItemKey = baselineItemKey;
		if(baselineItemKey != null){
			putQueryParameter("BaselineItemKey", baselineItemKey);
		}
	}

	@Override
	public Class<DescribeImageBaselineDetailResponse> getResponseClass() {
		return DescribeImageBaselineDetailResponse.class;
	}

}
