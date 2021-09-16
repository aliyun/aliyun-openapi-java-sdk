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
public class SetLiveEdgeTransferRequest extends RpcAcsRequest<SetLiveEdgeTransferResponse> {
	   

	private String transferArgs;

	private String appName;

	private String streamName;

	private String targetDomainList;

	private String domainName;

	private Long ownerId;

	private String httpDns;
	public SetLiveEdgeTransferRequest() {
		super("live", "2016-11-01", "SetLiveEdgeTransfer", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTransferArgs() {
		return this.transferArgs;
	}

	public void setTransferArgs(String transferArgs) {
		this.transferArgs = transferArgs;
		if(transferArgs != null){
			putQueryParameter("TransferArgs", transferArgs);
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

	public String getTargetDomainList() {
		return this.targetDomainList;
	}

	public void setTargetDomainList(String targetDomainList) {
		this.targetDomainList = targetDomainList;
		if(targetDomainList != null){
			putQueryParameter("TargetDomainList", targetDomainList);
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

	public String getHttpDns() {
		return this.httpDns;
	}

	public void setHttpDns(String httpDns) {
		this.httpDns = httpDns;
		if(httpDns != null){
			putQueryParameter("HttpDns", httpDns);
		}
	}

	@Override
	public Class<SetLiveEdgeTransferResponse> getResponseClass() {
		return SetLiveEdgeTransferResponse.class;
	}

}
