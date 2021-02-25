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

package com.aliyuncs.emas_appmonitor.model.v20190611;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emas_appmonitor.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAppDailyDeviceCountRequest extends RpcAcsRequest<GetAppDailyDeviceCountResponse> {
	   

	private String uniqueAppId;

	private Long fromDateMs;

	private String service;

	private Long untilDateMs;
	public GetAppDailyDeviceCountRequest() {
		super("emas-appmonitor", "2019-06-11", "GetAppDailyDeviceCount");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUniqueAppId() {
		return this.uniqueAppId;
	}

	public void setUniqueAppId(String uniqueAppId) {
		this.uniqueAppId = uniqueAppId;
		if(uniqueAppId != null){
			putBodyParameter("UniqueAppId", uniqueAppId);
		}
	}

	public Long getFromDateMs() {
		return this.fromDateMs;
	}

	public void setFromDateMs(Long fromDateMs) {
		this.fromDateMs = fromDateMs;
		if(fromDateMs != null){
			putBodyParameter("FromDateMs", fromDateMs.toString());
		}
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
		if(service != null){
			putBodyParameter("Service", service);
		}
	}

	public Long getUntilDateMs() {
		return this.untilDateMs;
	}

	public void setUntilDateMs(Long untilDateMs) {
		this.untilDateMs = untilDateMs;
		if(untilDateMs != null){
			putBodyParameter("UntilDateMs", untilDateMs.toString());
		}
	}

	@Override
	public Class<GetAppDailyDeviceCountResponse> getResponseClass() {
		return GetAppDailyDeviceCountResponse.class;
	}

}
