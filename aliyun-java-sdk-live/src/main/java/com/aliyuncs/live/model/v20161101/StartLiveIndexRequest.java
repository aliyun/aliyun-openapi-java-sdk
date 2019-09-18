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
public class StartLiveIndexRequest extends RpcAcsRequest<StartLiveIndexResponse> {
	
	public StartLiveIndexRequest() {
		super("live", "2016-11-01", "StartLiveIndex", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String tokenId;

	private String ossEndpoint;

	private String appName;

	private String ossRamRole;

	private String streamName;

	private String ossUserId;

	private String ossBucket;

	private String domainName;

	private String inputUrl;

	private Long ownerId;

	private Integer interval;

	public String getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
		if(tokenId != null){
			putQueryParameter("TokenId", tokenId);
		}
	}

	public String getOssEndpoint() {
		return this.ossEndpoint;
	}

	public void setOssEndpoint(String ossEndpoint) {
		this.ossEndpoint = ossEndpoint;
		if(ossEndpoint != null){
			putQueryParameter("OssEndpoint", ossEndpoint);
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

	public String getOssRamRole() {
		return this.ossRamRole;
	}

	public void setOssRamRole(String ossRamRole) {
		this.ossRamRole = ossRamRole;
		if(ossRamRole != null){
			putQueryParameter("OssRamRole", ossRamRole);
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

	public String getOssUserId() {
		return this.ossUserId;
	}

	public void setOssUserId(String ossUserId) {
		this.ossUserId = ossUserId;
		if(ossUserId != null){
			putQueryParameter("OssUserId", ossUserId);
		}
	}

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
		if(ossBucket != null){
			putQueryParameter("OssBucket", ossBucket);
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

	public String getInputUrl() {
		return this.inputUrl;
	}

	public void setInputUrl(String inputUrl) {
		this.inputUrl = inputUrl;
		if(inputUrl != null){
			putQueryParameter("InputUrl", inputUrl);
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

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	@Override
	public Class<StartLiveIndexResponse> getResponseClass() {
		return StartLiveIndexResponse.class;
	}

}
