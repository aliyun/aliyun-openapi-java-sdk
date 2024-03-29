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
public class DescribeLiveStreamTranscodeInfoRequest extends RpcAcsRequest<DescribeLiveStreamTranscodeInfoResponse> {
	   

	private String appName;

	private Long ownerId;

	private String domainTranscodeName;
	public DescribeLiveStreamTranscodeInfoRequest() {
		super("live", "2016-11-01", "DescribeLiveStreamTranscodeInfo", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDomainTranscodeName() {
		return this.domainTranscodeName;
	}

	public void setDomainTranscodeName(String domainTranscodeName) {
		this.domainTranscodeName = domainTranscodeName;
		if(domainTranscodeName != null){
			putQueryParameter("DomainTranscodeName", domainTranscodeName);
		}
	}

	@Override
	public Class<DescribeLiveStreamTranscodeInfoResponse> getResponseClass() {
		return DescribeLiveStreamTranscodeInfoResponse.class;
	}

}
