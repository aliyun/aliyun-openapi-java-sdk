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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubscribeMeteringStatisticsPushServiceRequest extends RpcAcsRequest<SubscribeMeteringStatisticsPushServiceResponse> {
	   

	private String outletAuthInfo;

	private String gwEui;

	private String joinPermissionId;

	private String devEui;

	private String outletUrl;
	public SubscribeMeteringStatisticsPushServiceRequest() {
		super("LinkWAN", "2019-03-01", "SubscribeMeteringStatisticsPushService", "linkwan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOutletAuthInfo() {
		return this.outletAuthInfo;
	}

	public void setOutletAuthInfo(String outletAuthInfo) {
		this.outletAuthInfo = outletAuthInfo;
		if(outletAuthInfo != null){
			putQueryParameter("OutletAuthInfo", outletAuthInfo);
		}
	}

	public String getGwEui() {
		return this.gwEui;
	}

	public void setGwEui(String gwEui) {
		this.gwEui = gwEui;
		if(gwEui != null){
			putQueryParameter("GwEui", gwEui);
		}
	}

	public String getJoinPermissionId() {
		return this.joinPermissionId;
	}

	public void setJoinPermissionId(String joinPermissionId) {
		this.joinPermissionId = joinPermissionId;
		if(joinPermissionId != null){
			putQueryParameter("JoinPermissionId", joinPermissionId);
		}
	}

	public String getDevEui() {
		return this.devEui;
	}

	public void setDevEui(String devEui) {
		this.devEui = devEui;
		if(devEui != null){
			putQueryParameter("DevEui", devEui);
		}
	}

	public String getOutletUrl() {
		return this.outletUrl;
	}

	public void setOutletUrl(String outletUrl) {
		this.outletUrl = outletUrl;
		if(outletUrl != null){
			putQueryParameter("OutletUrl", outletUrl);
		}
	}

	@Override
	public Class<SubscribeMeteringStatisticsPushServiceResponse> getResponseClass() {
		return SubscribeMeteringStatisticsPushServiceResponse.class;
	}

}
