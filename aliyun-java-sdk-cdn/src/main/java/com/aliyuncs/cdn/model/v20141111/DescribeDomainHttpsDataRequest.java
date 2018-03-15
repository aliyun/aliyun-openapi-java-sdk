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

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainHttpsDataRequest extends RpcAcsRequest<DescribeDomainHttpsDataResponse> {
	
	public DescribeDomainHttpsDataRequest() {
		super("Cdn", "2014-11-11", "DescribeDomainHttpsData");
	}

	private String domainType;

	private String fixTimeGap;

	private String securityToken;

	private String timeMerge;

	private String domainNames;

	private String endTime;

	private String interval;

	private String startTime;

	private String cls;

	private Long ownerId;

	public String getDomainType() {
		return this.domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
		if(domainType != null){
			putQueryParameter("DomainType", domainType);
		}
	}

	public String getFixTimeGap() {
		return this.fixTimeGap;
	}

	public void setFixTimeGap(String fixTimeGap) {
		this.fixTimeGap = fixTimeGap;
		if(fixTimeGap != null){
			putQueryParameter("FixTimeGap", fixTimeGap);
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

	public String getTimeMerge() {
		return this.timeMerge;
	}

	public void setTimeMerge(String timeMerge) {
		this.timeMerge = timeMerge;
		if(timeMerge != null){
			putQueryParameter("TimeMerge", timeMerge);
		}
	}

	public String getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(String domainNames) {
		this.domainNames = domainNames;
		if(domainNames != null){
			putQueryParameter("DomainNames", domainNames);
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

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval);
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

	public String getCls() {
		return this.cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
		if(cls != null){
			putQueryParameter("Cls", cls);
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
	public Class<DescribeDomainHttpsDataResponse> getResponseClass() {
		return DescribeDomainHttpsDataResponse.class;
	}

}
