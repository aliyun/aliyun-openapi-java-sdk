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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetectFaceAttributesRequest extends RpcAcsRequest<DetectFaceAttributesResponse> {
	   

	private String bizType;

	private String materialValue;
	public DetectFaceAttributesRequest() {
		super("Cloudauth", "2019-03-07", "DetectFaceAttributes");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getMaterialValue() {
		return this.materialValue;
	}

	public void setMaterialValue(String materialValue) {
		this.materialValue = materialValue;
		if(materialValue != null){
			putBodyParameter("MaterialValue", materialValue);
		}
	}

	@Override
	public Class<DetectFaceAttributesResponse> getResponseClass() {
		return DetectFaceAttributesResponse.class;
	}

}
