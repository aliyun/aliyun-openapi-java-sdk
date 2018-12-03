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

package com.aliyuncs.scdn.model.v20171115;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OpenScdnServiceRequest extends RpcAcsRequest<OpenScdnServiceResponse> {
	
	public OpenScdnServiceRequest() {
		super("scdn", "2017-11-15", "OpenScdnService");
	}

	private String endDate;

	private String securityToken;

	private Integer bandwidth;

	private Integer domainCount;

	private Long ownerId;

	private String protectType;

	private String startDate;

	private Integer elasticProtection;

	private Integer dDoSBasic;

	private Integer ccProtection;

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
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

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public Integer getDomainCount() {
		return this.domainCount;
	}

	public void setDomainCount(Integer domainCount) {
		this.domainCount = domainCount;
		if(domainCount != null){
			putQueryParameter("DomainCount", domainCount.toString());
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

	public String getProtectType() {
		return this.protectType;
	}

	public void setProtectType(String protectType) {
		this.protectType = protectType;
		if(protectType != null){
			putQueryParameter("ProtectType", protectType);
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate);
		}
	}

	public Integer getElasticProtection() {
		return this.elasticProtection;
	}

	public void setElasticProtection(Integer elasticProtection) {
		this.elasticProtection = elasticProtection;
		if(elasticProtection != null){
			putQueryParameter("ElasticProtection", elasticProtection.toString());
		}
	}

	public Integer getDDoSBasic() {
		return this.dDoSBasic;
	}

	public void setDDoSBasic(Integer dDoSBasic) {
		this.dDoSBasic = dDoSBasic;
		if(dDoSBasic != null){
			putQueryParameter("DDoSBasic", dDoSBasic.toString());
		}
	}

	public Integer getCcProtection() {
		return this.ccProtection;
	}

	public void setCcProtection(Integer ccProtection) {
		this.ccProtection = ccProtection;
		if(ccProtection != null){
			putQueryParameter("CcProtection", ccProtection.toString());
		}
	}

	@Override
	public Class<OpenScdnServiceResponse> getResponseClass() {
		return OpenScdnServiceResponse.class;
	}

}
