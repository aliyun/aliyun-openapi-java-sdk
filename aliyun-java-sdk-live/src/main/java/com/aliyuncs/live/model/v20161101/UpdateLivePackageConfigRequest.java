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
public class UpdateLivePackageConfigRequest extends RpcAcsRequest<UpdateLivePackageConfigResponse> {
	   

	private Integer segmentNum;

	private String protocol;

	private String appName;

	private Integer partDuration;

	private String streamName;

	private Boolean ignoreTranscode;

	private String domainName;

	private Long ownerId;

	private Integer segmentDuration;
	public UpdateLivePackageConfigRequest() {
		super("live", "2016-11-01", "UpdateLivePackageConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSegmentNum() {
		return this.segmentNum;
	}

	public void setSegmentNum(Integer segmentNum) {
		this.segmentNum = segmentNum;
		if(segmentNum != null){
			putQueryParameter("SegmentNum", segmentNum.toString());
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
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

	public Integer getPartDuration() {
		return this.partDuration;
	}

	public void setPartDuration(Integer partDuration) {
		this.partDuration = partDuration;
		if(partDuration != null){
			putQueryParameter("PartDuration", partDuration.toString());
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

	public Boolean getIgnoreTranscode() {
		return this.ignoreTranscode;
	}

	public void setIgnoreTranscode(Boolean ignoreTranscode) {
		this.ignoreTranscode = ignoreTranscode;
		if(ignoreTranscode != null){
			putQueryParameter("IgnoreTranscode", ignoreTranscode.toString());
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

	public Integer getSegmentDuration() {
		return this.segmentDuration;
	}

	public void setSegmentDuration(Integer segmentDuration) {
		this.segmentDuration = segmentDuration;
		if(segmentDuration != null){
			putQueryParameter("SegmentDuration", segmentDuration.toString());
		}
	}

	@Override
	public Class<UpdateLivePackageConfigResponse> getResponseClass() {
		return UpdateLivePackageConfigResponse.class;
	}

}
