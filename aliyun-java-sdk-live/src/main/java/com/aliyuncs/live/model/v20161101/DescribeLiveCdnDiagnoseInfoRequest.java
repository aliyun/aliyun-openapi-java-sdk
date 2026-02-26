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
public class DescribeLiveCdnDiagnoseInfoRequest extends RpcAcsRequest<DescribeLiveCdnDiagnoseInfoResponse> {
	   

	private String intervalType;

	private String streamSuffix;

	private Long startTime;

	private String requestType;

	private String securityToken;

	private String streamName;

	private String app;

	private Integer phase;

	private Long endTime;

	private String domain;
	public DescribeLiveCdnDiagnoseInfoRequest() {
		super("live", "2016-11-01", "DescribeLiveCdnDiagnoseInfo", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIntervalType() {
		return this.intervalType;
	}

	public void setIntervalType(String intervalType) {
		this.intervalType = intervalType;
		if(intervalType != null){
			putQueryParameter("intervalType", intervalType);
		}
	}

	public String getStreamSuffix() {
		return this.streamSuffix;
	}

	public void setStreamSuffix(String streamSuffix) {
		this.streamSuffix = streamSuffix;
		if(streamSuffix != null){
			putQueryParameter("streamSuffix", streamSuffix);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime.toString());
		}
	}

	public String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
		if(requestType != null){
			putQueryParameter("requestType", requestType);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
		if(streamName != null){
			putQueryParameter("streamName", streamName);
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("app", app);
		}
	}

	public Integer getPhase() {
		return this.phase;
	}

	public void setPhase(Integer phase) {
		this.phase = phase;
		if(phase != null){
			putQueryParameter("phase", phase.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("endTime", endTime.toString());
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("domain", domain);
		}
	}

	@Override
	public Class<DescribeLiveCdnDiagnoseInfoResponse> getResponseClass() {
		return DescribeLiveCdnDiagnoseInfoResponse.class;
	}

}
