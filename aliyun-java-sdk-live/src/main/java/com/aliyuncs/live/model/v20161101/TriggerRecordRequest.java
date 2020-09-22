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
public class TriggerRecordRequest extends RpcAcsRequest<TriggerRecordResponse> {
	   

	private Integer source;

	private String userData;

	private String appName;

	private String streamName;

	private String avMode;

	private String storePath;

	private String domainName;

	private Long ownerId;

	private String forceTranscode;

	private Boolean needRecord;
	public TriggerRecordRequest() {
		super("live", "2016-11-01", "TriggerRecord", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSource() {
		return this.source;
	}

	public void setSource(Integer source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source.toString());
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
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

	public String getAvMode() {
		return this.avMode;
	}

	public void setAvMode(String avMode) {
		this.avMode = avMode;
		if(avMode != null){
			putQueryParameter("AvMode", avMode);
		}
	}

	public String getStorePath() {
		return this.storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
		if(storePath != null){
			putQueryParameter("StorePath", storePath);
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

	public String getForceTranscode() {
		return this.forceTranscode;
	}

	public void setForceTranscode(String forceTranscode) {
		this.forceTranscode = forceTranscode;
		if(forceTranscode != null){
			putQueryParameter("ForceTranscode", forceTranscode);
		}
	}

	public Boolean getNeedRecord() {
		return this.needRecord;
	}

	public void setNeedRecord(Boolean needRecord) {
		this.needRecord = needRecord;
		if(needRecord != null){
			putQueryParameter("NeedRecord", needRecord.toString());
		}
	}

	@Override
	public Class<TriggerRecordResponse> getResponseClass() {
		return TriggerRecordResponse.class;
	}

}
