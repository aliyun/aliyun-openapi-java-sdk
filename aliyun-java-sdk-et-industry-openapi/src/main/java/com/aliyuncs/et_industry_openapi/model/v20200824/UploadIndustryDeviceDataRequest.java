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

package com.aliyuncs.et_industry_openapi.model.v20200824;

import com.aliyuncs.RoaAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.et_industry_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadIndustryDeviceDataRequest extends RoaAcsRequest<UploadIndustryDeviceDataResponse> {
	   

	private Map<Object,Object> request;
	public UploadIndustryDeviceDataRequest() {
		super("et-industry-openapi", "2020-08-24", "UploadIndustryDeviceData");
		setUriPattern("/api/igate/timeseries/upload/pop/multifieldbatch");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Map<Object,Object> getRequest() {
		return this.request;
	}

	public void setRequest(Map<Object,Object> request) {
		this.request = request;
		if(request != null){
			putBodyParameter("Request", new Gson().toJson(request));
		}
	}

	@Override
	public Class<UploadIndustryDeviceDataResponse> getResponseClass() {
		return UploadIndustryDeviceDataResponse.class;
	}

}
