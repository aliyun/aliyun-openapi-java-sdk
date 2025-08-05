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
public class AddLiveStreamMergeRequest extends RpcAcsRequest<AddLiveStreamMergeResponse> {
	   

	private String inAppName2;

	private String inAppName1;

	private String startTime;

	private String protocol;

	private String appName;

	private String liveMerger;

	private String inStreamName2;

	private String streamName;

	private String inStreamName1;

	private String domainName;

	private String endTime;

	private Long ownerId;

	private String mergeParameters;
	public AddLiveStreamMergeRequest() {
		super("live", "2016-11-01", "AddLiveStreamMerge", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInAppName2() {
		return this.inAppName2;
	}

	public void setInAppName2(String inAppName2) {
		this.inAppName2 = inAppName2;
		if(inAppName2 != null){
			putQueryParameter("InAppName2", inAppName2);
		}
	}

	public String getInAppName1() {
		return this.inAppName1;
	}

	public void setInAppName1(String inAppName1) {
		this.inAppName1 = inAppName1;
		if(inAppName1 != null){
			putQueryParameter("InAppName1", inAppName1);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public String getLiveMerger() {
		return this.liveMerger;
	}

	public void setLiveMerger(String liveMerger) {
		this.liveMerger = liveMerger;
		if(liveMerger != null){
			putQueryParameter("LiveMerger", liveMerger);
		}
	}

	public String getInStreamName2() {
		return this.inStreamName2;
	}

	public void setInStreamName2(String inStreamName2) {
		this.inStreamName2 = inStreamName2;
		if(inStreamName2 != null){
			putQueryParameter("InStreamName2", inStreamName2);
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

	public String getInStreamName1() {
		return this.inStreamName1;
	}

	public void setInStreamName1(String inStreamName1) {
		this.inStreamName1 = inStreamName1;
		if(inStreamName1 != null){
			putQueryParameter("InStreamName1", inStreamName1);
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	public String getMergeParameters() {
		return this.mergeParameters;
	}

	public void setMergeParameters(String mergeParameters) {
		this.mergeParameters = mergeParameters;
		if(mergeParameters != null){
			putQueryParameter("MergeParameters", mergeParameters);
		}
	}

	@Override
	public Class<AddLiveStreamMergeResponse> getResponseClass() {
		return AddLiveStreamMergeResponse.class;
	}

}
