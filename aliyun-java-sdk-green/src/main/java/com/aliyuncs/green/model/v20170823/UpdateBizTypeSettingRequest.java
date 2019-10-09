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
public class UpdateBizTypeSettingRequest extends RpcAcsRequest<UpdateBizTypeSettingResponse> {
	   

	private String resourceType;

	private String porn;

	private String terrorism;

	private String bizTypeName;
	public UpdateBizTypeSettingRequest() {
		super("Green", "2017-08-23", "UpdateBizTypeSetting", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getPorn() {
		return this.porn;
	}

	public void setPorn(String porn) {
		this.porn = porn;
		if(porn != null){
			putQueryParameter("Porn", porn);
		}
	}

	public String getTerrorism() {
		return this.terrorism;
	}

	public void setTerrorism(String terrorism) {
		this.terrorism = terrorism;
		if(terrorism != null){
			putQueryParameter("Terrorism", terrorism);
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
	public Class<UpdateBizTypeSettingResponse> getResponseClass() {
		return UpdateBizTypeSettingResponse.class;
	}

}
