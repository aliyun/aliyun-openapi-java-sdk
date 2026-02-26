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
public class SetLiveStreamPreloadTasksRequest extends RpcAcsRequest<SetLiveStreamPreloadTasksResponse> {
	   

	private String preloadedStartTime;

	private String area;

	private String preloadedEndTime;

	private String domainName;

	private Long ownerId;

	private String playUrl;
	public SetLiveStreamPreloadTasksRequest() {
		super("live", "2016-11-01", "SetLiveStreamPreloadTasks", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPreloadedStartTime() {
		return this.preloadedStartTime;
	}

	public void setPreloadedStartTime(String preloadedStartTime) {
		this.preloadedStartTime = preloadedStartTime;
		if(preloadedStartTime != null){
			putQueryParameter("PreloadedStartTime", preloadedStartTime);
		}
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
		if(area != null){
			putQueryParameter("Area", area);
		}
	}

	public String getPreloadedEndTime() {
		return this.preloadedEndTime;
	}

	public void setPreloadedEndTime(String preloadedEndTime) {
		this.preloadedEndTime = preloadedEndTime;
		if(preloadedEndTime != null){
			putQueryParameter("PreloadedEndTime", preloadedEndTime);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPlayUrl() {
		return this.playUrl;
	}

	public void setPlayUrl(String playUrl) {
		this.playUrl = playUrl;
		if(playUrl != null){
			putQueryParameter("PlayUrl", playUrl);
		}
	}

	@Override
	public Class<SetLiveStreamPreloadTasksResponse> getResponseClass() {
		return SetLiveStreamPreloadTasksResponse.class;
	}

}
