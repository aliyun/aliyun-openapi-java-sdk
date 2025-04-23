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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckUsedPropertyValueRequest extends RpcAcsRequest<CheckUsedPropertyValueResponse> {
	   

	private Long propertyValueId;

	private Long propertyId;
	public CheckUsedPropertyValueRequest() {
		super("eds-user", "2021-03-08", "CheckUsedPropertyValue", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPropertyValueId() {
		return this.propertyValueId;
	}

	public void setPropertyValueId(Long propertyValueId) {
		this.propertyValueId = propertyValueId;
		if(propertyValueId != null){
			putQueryParameter("PropertyValueId", propertyValueId.toString());
		}
	}

	public Long getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
		if(propertyId != null){
			putQueryParameter("PropertyId", propertyId.toString());
		}
	}

	@Override
	public Class<CheckUsedPropertyValueResponse> getResponseClass() {
		return CheckUsedPropertyValueResponse.class;
	}

}
