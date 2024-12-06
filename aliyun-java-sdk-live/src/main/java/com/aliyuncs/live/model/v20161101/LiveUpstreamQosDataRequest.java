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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class LiveUpstreamQosDataRequest extends RpcAcsRequest<LiveUpstreamQosDataResponse> {
	   

	private String cdnDomains;

	private String startTime;

	private String cdnProvinces;

	private String kwaiSidcs;

	@SerializedName("kwaiTsc")
	private List<Integer> kwaiTsc;

	private String upstreamDomains;

	private String endTime;

	private Long ownerId;

	private String cdnIsps;

	private String region;
	public LiveUpstreamQosDataRequest() {
		super("live", "2016-11-01", "LiveUpstreamQosData", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCdnDomains() {
		return this.cdnDomains;
	}

	public void setCdnDomains(String cdnDomains) {
		this.cdnDomains = cdnDomains;
		if(cdnDomains != null){
			putQueryParameter("CdnDomains", cdnDomains);
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

	public String getCdnProvinces() {
		return this.cdnProvinces;
	}

	public void setCdnProvinces(String cdnProvinces) {
		this.cdnProvinces = cdnProvinces;
		if(cdnProvinces != null){
			putQueryParameter("CdnProvinces", cdnProvinces);
		}
	}

	public String getKwaiSidcs() {
		return this.kwaiSidcs;
	}

	public void setKwaiSidcs(String kwaiSidcs) {
		this.kwaiSidcs = kwaiSidcs;
		if(kwaiSidcs != null){
			putQueryParameter("KwaiSidcs", kwaiSidcs);
		}
	}

	public List<Integer> getKwaiTsc() {
		return this.kwaiTsc;
	}

	public void setKwaiTsc(List<Integer> kwaiTsc) {
		this.kwaiTsc = kwaiTsc;	
		if (kwaiTsc != null) {
			putQueryParameter("KwaiTsc" , new Gson().toJson(kwaiTsc));
		}	
	}

	public String getUpstreamDomains() {
		return this.upstreamDomains;
	}

	public void setUpstreamDomains(String upstreamDomains) {
		this.upstreamDomains = upstreamDomains;
		if(upstreamDomains != null){
			putQueryParameter("UpstreamDomains", upstreamDomains);
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

	public String getCdnIsps() {
		return this.cdnIsps;
	}

	public void setCdnIsps(String cdnIsps) {
		this.cdnIsps = cdnIsps;
		if(cdnIsps != null){
			putQueryParameter("CdnIsps", cdnIsps);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<LiveUpstreamQosDataResponse> getResponseClass() {
		return LiveUpstreamQosDataResponse.class;
	}

}
