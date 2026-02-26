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
public class CreateLivePrivateLineRequest extends RpcAcsRequest<CreateLivePrivateLineResponse> {
	   

	private String maxBandwidth;

	private String reuse;

	private String accelerationArea;

	private String appName;

	private String streamName;

	private String domainName;

	private Long ownerId;

	private String videoCenter;

	private String accelerationType;

	private String instanceId;
	public CreateLivePrivateLineRequest() {
		super("live", "2016-11-01", "CreateLivePrivateLine", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMaxBandwidth() {
		return this.maxBandwidth;
	}

	public void setMaxBandwidth(String maxBandwidth) {
		this.maxBandwidth = maxBandwidth;
		if(maxBandwidth != null){
			putQueryParameter("MaxBandwidth", maxBandwidth);
		}
	}

	public String getReuse() {
		return this.reuse;
	}

	public void setReuse(String reuse) {
		this.reuse = reuse;
		if(reuse != null){
			putQueryParameter("Reuse", reuse);
		}
	}

	public String getAccelerationArea() {
		return this.accelerationArea;
	}

	public void setAccelerationArea(String accelerationArea) {
		this.accelerationArea = accelerationArea;
		if(accelerationArea != null){
			putQueryParameter("AccelerationArea", accelerationArea);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
		if(streamName != null){
			putQueryParameter("StreamName", streamName);
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

	public String getVideoCenter() {
		return this.videoCenter;
	}

	public void setVideoCenter(String videoCenter) {
		this.videoCenter = videoCenter;
		if(videoCenter != null){
			putQueryParameter("VideoCenter", videoCenter);
		}
	}

	public String getAccelerationType() {
		return this.accelerationType;
	}

	public void setAccelerationType(String accelerationType) {
		this.accelerationType = accelerationType;
		if(accelerationType != null){
			putQueryParameter("AccelerationType", accelerationType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<CreateLivePrivateLineResponse> getResponseClass() {
		return CreateLivePrivateLineResponse.class;
	}

}
