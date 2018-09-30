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

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainBpsDataByTimeStampRequest extends RpcAcsRequest<DescribeDomainBpsDataByTimeStampResponse> {
	
	public DescribeDomainBpsDataByTimeStampRequest() {
		super("Cdn", "2018-05-10", "DescribeDomainBpsDataByTimeStamp");
	}

	private String ispNames;

	private String securityToken;

	private String locationNames;

	private String domainName;

	private Long ownerId;

	private String timePoint;

	public String getIspNames() {
		return this.ispNames;
	}

	public void setIspNames(String ispNames) {
		this.ispNames = ispNames;
		if(ispNames != null){
			putQueryParameter("IspNames", ispNames);
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

	public String getLocationNames() {
		return this.locationNames;
	}

	public void setLocationNames(String locationNames) {
		this.locationNames = locationNames;
		if(locationNames != null){
			putQueryParameter("LocationNames", locationNames);
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

	public String getTimePoint() {
		return this.timePoint;
	}

	public void setTimePoint(String timePoint) {
		this.timePoint = timePoint;
		if(timePoint != null){
			putQueryParameter("TimePoint", timePoint);
		}
	}

	@Override
	public Class<DescribeDomainBpsDataByTimeStampResponse> getResponseClass() {
		return DescribeDomainBpsDataByTimeStampResponse.class;
	}

}
