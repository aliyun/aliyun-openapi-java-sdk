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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSimpleOfficeSiteRequest extends RpcAcsRequest<CreateSimpleOfficeSiteResponse> {
	   

	private String cenId;

	private Long cenOwnerId;

	private Boolean enableInternetAccess;

	private String verifyCode;

	private Boolean needVerifyZeroDevice;

	private Boolean enableAdminAccess;

	private Integer bandwidth;

	private String desktopAccessType;

	private String officeSiteName;

	private Boolean cloudBoxOfficeSite;

	private List<String> vSwitchIds;

	private String cidrBlock;
	public CreateSimpleOfficeSiteRequest() {
		super("ecd", "2020-09-30", "CreateSimpleOfficeSite");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public Long getCenOwnerId() {
		return this.cenOwnerId;
	}

	public void setCenOwnerId(Long cenOwnerId) {
		this.cenOwnerId = cenOwnerId;
		if(cenOwnerId != null){
			putQueryParameter("CenOwnerId", cenOwnerId.toString());
		}
	}

	public Boolean getEnableInternetAccess() {
		return this.enableInternetAccess;
	}

	public void setEnableInternetAccess(Boolean enableInternetAccess) {
		this.enableInternetAccess = enableInternetAccess;
		if(enableInternetAccess != null){
			putQueryParameter("EnableInternetAccess", enableInternetAccess.toString());
		}
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
		if(verifyCode != null){
			putQueryParameter("VerifyCode", verifyCode);
		}
	}

	public Boolean getNeedVerifyZeroDevice() {
		return this.needVerifyZeroDevice;
	}

	public void setNeedVerifyZeroDevice(Boolean needVerifyZeroDevice) {
		this.needVerifyZeroDevice = needVerifyZeroDevice;
		if(needVerifyZeroDevice != null){
			putQueryParameter("NeedVerifyZeroDevice", needVerifyZeroDevice.toString());
		}
	}

	public Boolean getEnableAdminAccess() {
		return this.enableAdminAccess;
	}

	public void setEnableAdminAccess(Boolean enableAdminAccess) {
		this.enableAdminAccess = enableAdminAccess;
		if(enableAdminAccess != null){
			putQueryParameter("EnableAdminAccess", enableAdminAccess.toString());
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

	public String getDesktopAccessType() {
		return this.desktopAccessType;
	}

	public void setDesktopAccessType(String desktopAccessType) {
		this.desktopAccessType = desktopAccessType;
		if(desktopAccessType != null){
			putQueryParameter("DesktopAccessType", desktopAccessType);
		}
	}

	public String getOfficeSiteName() {
		return this.officeSiteName;
	}

	public void setOfficeSiteName(String officeSiteName) {
		this.officeSiteName = officeSiteName;
		if(officeSiteName != null){
			putQueryParameter("OfficeSiteName", officeSiteName);
		}
	}

	public Boolean getCloudBoxOfficeSite() {
		return this.cloudBoxOfficeSite;
	}

	public void setCloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
		this.cloudBoxOfficeSite = cloudBoxOfficeSite;
		if(cloudBoxOfficeSite != null){
			putQueryParameter("CloudBoxOfficeSite", cloudBoxOfficeSite.toString());
		}
	}

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;	
		if (vSwitchIds != null) {
			for (int i = 0; i < vSwitchIds.size(); i++) {
				putQueryParameter("VSwitchId." + (i + 1) , vSwitchIds.get(i));
			}
		}	
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
		if(cidrBlock != null){
			putQueryParameter("CidrBlock", cidrBlock);
		}
	}

	@Override
	public Class<CreateSimpleOfficeSiteResponse> getResponseClass() {
		return CreateSimpleOfficeSiteResponse.class;
	}

}
