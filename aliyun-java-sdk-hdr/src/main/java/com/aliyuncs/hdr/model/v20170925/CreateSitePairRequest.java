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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSitePairRequest extends RpcAcsRequest<CreateSitePairResponse> {
	
	public CreateSitePairRequest() {
		super("hdr", "2017-09-25", "CreateSitePair", "hdr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String primarySiteRegionId;

	private String secondarySiteVpcId;

	private String primarySiteVpcId;

	private String localSiteName;

	private String sitePairType;

	private String securityToken;

	private String secondarySiteName;

	private String cloudSiteName;

	private String localGatewayName;

	private String primarySiteType;

	private String secondarySiteType;

	private String primarySiteZoneId;

	private String primarySiteName;

	private String secondarySiteRegionId;

	private String secondarySiteZoneId;

	public String getPrimarySiteRegionId() {
		return this.primarySiteRegionId;
	}

	public void setPrimarySiteRegionId(String primarySiteRegionId) {
		this.primarySiteRegionId = primarySiteRegionId;
		if(primarySiteRegionId != null){
			putQueryParameter("PrimarySiteRegionId", primarySiteRegionId);
		}
	}

	public String getSecondarySiteVpcId() {
		return this.secondarySiteVpcId;
	}

	public void setSecondarySiteVpcId(String secondarySiteVpcId) {
		this.secondarySiteVpcId = secondarySiteVpcId;
		if(secondarySiteVpcId != null){
			putQueryParameter("SecondarySiteVpcId", secondarySiteVpcId);
		}
	}

	public String getPrimarySiteVpcId() {
		return this.primarySiteVpcId;
	}

	public void setPrimarySiteVpcId(String primarySiteVpcId) {
		this.primarySiteVpcId = primarySiteVpcId;
		if(primarySiteVpcId != null){
			putQueryParameter("PrimarySiteVpcId", primarySiteVpcId);
		}
	}

	public String getLocalSiteName() {
		return this.localSiteName;
	}

	public void setLocalSiteName(String localSiteName) {
		this.localSiteName = localSiteName;
		if(localSiteName != null){
			putQueryParameter("LocalSiteName", localSiteName);
		}
	}

	public String getSitePairType() {
		return this.sitePairType;
	}

	public void setSitePairType(String sitePairType) {
		this.sitePairType = sitePairType;
		if(sitePairType != null){
			putQueryParameter("SitePairType", sitePairType);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getSecondarySiteName() {
		return this.secondarySiteName;
	}

	public void setSecondarySiteName(String secondarySiteName) {
		this.secondarySiteName = secondarySiteName;
		if(secondarySiteName != null){
			putQueryParameter("SecondarySiteName", secondarySiteName);
		}
	}

	public String getCloudSiteName() {
		return this.cloudSiteName;
	}

	public void setCloudSiteName(String cloudSiteName) {
		this.cloudSiteName = cloudSiteName;
		if(cloudSiteName != null){
			putQueryParameter("CloudSiteName", cloudSiteName);
		}
	}

	public String getLocalGatewayName() {
		return this.localGatewayName;
	}

	public void setLocalGatewayName(String localGatewayName) {
		this.localGatewayName = localGatewayName;
		if(localGatewayName != null){
			putQueryParameter("LocalGatewayName", localGatewayName);
		}
	}

	public String getPrimarySiteType() {
		return this.primarySiteType;
	}

	public void setPrimarySiteType(String primarySiteType) {
		this.primarySiteType = primarySiteType;
		if(primarySiteType != null){
			putQueryParameter("PrimarySiteType", primarySiteType);
		}
	}

	public String getSecondarySiteType() {
		return this.secondarySiteType;
	}

	public void setSecondarySiteType(String secondarySiteType) {
		this.secondarySiteType = secondarySiteType;
		if(secondarySiteType != null){
			putQueryParameter("SecondarySiteType", secondarySiteType);
		}
	}

	public String getPrimarySiteZoneId() {
		return this.primarySiteZoneId;
	}

	public void setPrimarySiteZoneId(String primarySiteZoneId) {
		this.primarySiteZoneId = primarySiteZoneId;
		if(primarySiteZoneId != null){
			putQueryParameter("PrimarySiteZoneId", primarySiteZoneId);
		}
	}

	public String getPrimarySiteName() {
		return this.primarySiteName;
	}

	public void setPrimarySiteName(String primarySiteName) {
		this.primarySiteName = primarySiteName;
		if(primarySiteName != null){
			putQueryParameter("PrimarySiteName", primarySiteName);
		}
	}

	public String getSecondarySiteRegionId() {
		return this.secondarySiteRegionId;
	}

	public void setSecondarySiteRegionId(String secondarySiteRegionId) {
		this.secondarySiteRegionId = secondarySiteRegionId;
		if(secondarySiteRegionId != null){
			putQueryParameter("SecondarySiteRegionId", secondarySiteRegionId);
		}
	}

	public String getSecondarySiteZoneId() {
		return this.secondarySiteZoneId;
	}

	public void setSecondarySiteZoneId(String secondarySiteZoneId) {
		this.secondarySiteZoneId = secondarySiteZoneId;
		if(secondarySiteZoneId != null){
			putQueryParameter("SecondarySiteZoneId", secondarySiteZoneId);
		}
	}

	@Override
	public Class<CreateSitePairResponse> getResponseClass() {
		return CreateSitePairResponse.class;
	}

}
