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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateProductFilterConfigRequest extends RpcAcsRequest<UpdateProductFilterConfigResponse> {
	   

	private Boolean propertyTimestampFilter;

	private String productKey;

	private Boolean propertyValueFilter;
	public UpdateProductFilterConfigRequest() {
		super("Iot", "2018-01-20", "UpdateProductFilterConfig", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getPropertyTimestampFilter() {
		return this.propertyTimestampFilter;
	}

	public void setPropertyTimestampFilter(Boolean propertyTimestampFilter) {
		this.propertyTimestampFilter = propertyTimestampFilter;
		if(propertyTimestampFilter != null){
			putQueryParameter("PropertyTimestampFilter", propertyTimestampFilter.toString());
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public Boolean getPropertyValueFilter() {
		return this.propertyValueFilter;
	}

	public void setPropertyValueFilter(Boolean propertyValueFilter) {
		this.propertyValueFilter = propertyValueFilter;
		if(propertyValueFilter != null){
			putQueryParameter("PropertyValueFilter", propertyValueFilter.toString());
		}
	}

	@Override
	public Class<UpdateProductFilterConfigResponse> getResponseClass() {
		return UpdateProductFilterConfigResponse.class;
	}

}
