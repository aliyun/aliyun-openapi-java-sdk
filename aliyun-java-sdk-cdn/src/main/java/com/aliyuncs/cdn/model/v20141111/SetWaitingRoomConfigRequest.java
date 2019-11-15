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

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetWaitingRoomConfigRequest extends RpcAcsRequest<SetWaitingRoomConfigResponse> {
	   

	private String waitUrl;

	private String waitUri;

	private Integer maxTimeWait;

	private String domainName;

	private Integer allowPct;

	private Integer gapTime;

	private Long ownerId;
	public SetWaitingRoomConfigRequest() {
		super("Cdn", "2014-11-11", "SetWaitingRoomConfig");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWaitUrl() {
		return this.waitUrl;
	}

	public void setWaitUrl(String waitUrl) {
		this.waitUrl = waitUrl;
		if(waitUrl != null){
			putQueryParameter("WaitUrl", waitUrl);
		}
	}

	public String getWaitUri() {
		return this.waitUri;
	}

	public void setWaitUri(String waitUri) {
		this.waitUri = waitUri;
		if(waitUri != null){
			putQueryParameter("WaitUri", waitUri);
		}
	}

	public Integer getMaxTimeWait() {
		return this.maxTimeWait;
	}

	public void setMaxTimeWait(Integer maxTimeWait) {
		this.maxTimeWait = maxTimeWait;
		if(maxTimeWait != null){
			putQueryParameter("MaxTimeWait", maxTimeWait.toString());
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

	public Integer getAllowPct() {
		return this.allowPct;
	}

	public void setAllowPct(Integer allowPct) {
		this.allowPct = allowPct;
		if(allowPct != null){
			putQueryParameter("AllowPct", allowPct.toString());
		}
	}

	public Integer getGapTime() {
		return this.gapTime;
	}

	public void setGapTime(Integer gapTime) {
		this.gapTime = gapTime;
		if(gapTime != null){
			putQueryParameter("GapTime", gapTime.toString());
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

	@Override
	public Class<SetWaitingRoomConfigResponse> getResponseClass() {
		return SetWaitingRoomConfigResponse.class;
	}

}
