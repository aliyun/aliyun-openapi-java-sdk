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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateBizTypeRequest extends RpcAcsRequest<UpdateBizTypeResponse> {
	   

	private String description;

	private String bizTypeName;
	public UpdateBizTypeRequest() {
		super("Green", "2017-08-23", "UpdateBizType", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getBizTypeName() {
		return this.bizTypeName;
	}

	public void setBizTypeName(String bizTypeName) {
		this.bizTypeName = bizTypeName;
		if(bizTypeName != null){
			putQueryParameter("BizTypeName", bizTypeName);
		}
	}

	@Override
	public Class<UpdateBizTypeResponse> getResponseClass() {
		return UpdateBizTypeResponse.class;
	}

}
