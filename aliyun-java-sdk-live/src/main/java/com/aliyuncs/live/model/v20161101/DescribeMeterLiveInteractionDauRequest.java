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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeMeterLiveInteractionDauRequest extends RpcAcsRequest<DescribeMeterLiveInteractionDauResponse> {
	   

	private Long startTs;

	private String serviceArea;

	private String appId;

	private Long endTs;

	private Long interval;
	public DescribeMeterLiveInteractionDauRequest() {
		super("live", "2016-11-01", "DescribeMeterLiveInteractionDau", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStartTs() {
		return this.startTs;
	}

	public void setStartTs(Long startTs) {
		this.startTs = startTs;
		if(startTs != null){
			putQueryParameter("StartTs", startTs.toString());
		}
	}

	public String getServiceArea() {
		return this.serviceArea;
	}

	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
		if(serviceArea != null){
			putQueryParameter("ServiceArea", serviceArea);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Long getEndTs() {
		return this.endTs;
	}

	public void setEndTs(Long endTs) {
		this.endTs = endTs;
		if(endTs != null){
			putQueryParameter("EndTs", endTs.toString());
		}
	}

	public Long getInterval() {
		return this.interval;
	}

	public void setInterval(Long interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	@Override
	public Class<DescribeMeterLiveInteractionDauResponse> getResponseClass() {
		return DescribeMeterLiveInteractionDauResponse.class;
	}

}
