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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainRealTimeDetailDataRequest extends RpcAcsRequest<DescribeDomainRealTimeDetailDataResponse> {
	   

	private String locationNameEn;

	private String startTime;

	private String ispNameEn;

	private String merge;

	private String domainName;

	private String endTime;

	private String mergeLocIsp;

	private Long ownerId;

	private String field;
	public DescribeDomainRealTimeDetailDataRequest() {
		super("Cdn", "2018-05-10", "DescribeDomainRealTimeDetailData");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLocationNameEn() {
		return this.locationNameEn;
	}

	public void setLocationNameEn(String locationNameEn) {
		this.locationNameEn = locationNameEn;
		if(locationNameEn != null){
			putQueryParameter("LocationNameEn", locationNameEn);
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

	public String getIspNameEn() {
		return this.ispNameEn;
	}

	public void setIspNameEn(String ispNameEn) {
		this.ispNameEn = ispNameEn;
		if(ispNameEn != null){
			putQueryParameter("IspNameEn", ispNameEn);
		}
	}

	public String getMerge() {
		return this.merge;
	}

	public void setMerge(String merge) {
		this.merge = merge;
		if(merge != null){
			putQueryParameter("Merge", merge);
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

	public String getMergeLocIsp() {
		return this.mergeLocIsp;
	}

	public void setMergeLocIsp(String mergeLocIsp) {
		this.mergeLocIsp = mergeLocIsp;
		if(mergeLocIsp != null){
			putQueryParameter("MergeLocIsp", mergeLocIsp);
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

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
		if(field != null){
			putQueryParameter("Field", field);
		}
	}

	@Override
	public Class<DescribeDomainRealTimeDetailDataResponse> getResponseClass() {
		return DescribeDomainRealTimeDetailDataResponse.class;
	}

}
