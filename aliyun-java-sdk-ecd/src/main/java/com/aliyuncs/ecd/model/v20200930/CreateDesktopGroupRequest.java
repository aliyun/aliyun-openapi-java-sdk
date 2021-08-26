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
public class CreateDesktopGroupRequest extends RpcAcsRequest<CreateDesktopGroupResponse> {
	   

	private String officeSiteId;

	private List<String> endUserIdss;

	private String scaleStrategyId;

	private String clientToken;

	private String bundleId;

	private String desktopGroupName;

	private Integer allowBufferCount;

	private Integer defaultInitDesktopCount;

	private String directoryId;

	private Integer minDesktopsCount;

	private Integer maxDesktopsCount;

	private Integer period;

	private Integer allowAutoSetup;

	private Boolean autoPay;

	private String comments;

	private Integer ownType;

	private Long keepDuration;

	private String periodUnit;

	private String vpcId;

	private String chargeType;

	private String policyGroupId;
	public CreateDesktopGroupRequest() {
		super("ecd", "2020-09-30", "CreateDesktopGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
		}
	}

	public List<String> getEndUserIdss() {
		return this.endUserIdss;
	}

	public void setEndUserIdss(List<String> endUserIdss) {
		this.endUserIdss = endUserIdss;	
		if (endUserIdss != null) {
			for (int i = 0; i < endUserIdss.size(); i++) {
				putQueryParameter("EndUserIds." + (i + 1) , endUserIdss.get(i));
			}
		}	
	}

	public String getScaleStrategyId() {
		return this.scaleStrategyId;
	}

	public void setScaleStrategyId(String scaleStrategyId) {
		this.scaleStrategyId = scaleStrategyId;
		if(scaleStrategyId != null){
			putQueryParameter("ScaleStrategyId", scaleStrategyId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
		if(bundleId != null){
			putQueryParameter("BundleId", bundleId);
		}
	}

	public String getDesktopGroupName() {
		return this.desktopGroupName;
	}

	public void setDesktopGroupName(String desktopGroupName) {
		this.desktopGroupName = desktopGroupName;
		if(desktopGroupName != null){
			putQueryParameter("DesktopGroupName", desktopGroupName);
		}
	}

	public Integer getAllowBufferCount() {
		return this.allowBufferCount;
	}

	public void setAllowBufferCount(Integer allowBufferCount) {
		this.allowBufferCount = allowBufferCount;
		if(allowBufferCount != null){
			putQueryParameter("AllowBufferCount", allowBufferCount.toString());
		}
	}

	public Integer getDefaultInitDesktopCount() {
		return this.defaultInitDesktopCount;
	}

	public void setDefaultInitDesktopCount(Integer defaultInitDesktopCount) {
		this.defaultInitDesktopCount = defaultInitDesktopCount;
		if(defaultInitDesktopCount != null){
			putQueryParameter("DefaultInitDesktopCount", defaultInitDesktopCount.toString());
		}
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		if(directoryId != null){
			putQueryParameter("DirectoryId", directoryId);
		}
	}

	public Integer getMinDesktopsCount() {
		return this.minDesktopsCount;
	}

	public void setMinDesktopsCount(Integer minDesktopsCount) {
		this.minDesktopsCount = minDesktopsCount;
		if(minDesktopsCount != null){
			putQueryParameter("MinDesktopsCount", minDesktopsCount.toString());
		}
	}

	public Integer getMaxDesktopsCount() {
		return this.maxDesktopsCount;
	}

	public void setMaxDesktopsCount(Integer maxDesktopsCount) {
		this.maxDesktopsCount = maxDesktopsCount;
		if(maxDesktopsCount != null){
			putQueryParameter("MaxDesktopsCount", maxDesktopsCount.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Integer getAllowAutoSetup() {
		return this.allowAutoSetup;
	}

	public void setAllowAutoSetup(Integer allowAutoSetup) {
		this.allowAutoSetup = allowAutoSetup;
		if(allowAutoSetup != null){
			putQueryParameter("AllowAutoSetup", allowAutoSetup.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
		if(comments != null){
			putQueryParameter("Comments", comments);
		}
	}

	public Integer getOwnType() {
		return this.ownType;
	}

	public void setOwnType(Integer ownType) {
		this.ownType = ownType;
		if(ownType != null){
			putQueryParameter("OwnType", ownType.toString());
		}
	}

	public Long getKeepDuration() {
		return this.keepDuration;
	}

	public void setKeepDuration(Long keepDuration) {
		this.keepDuration = keepDuration;
		if(keepDuration != null){
			putQueryParameter("KeepDuration", keepDuration.toString());
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	@Override
	public Class<CreateDesktopGroupResponse> getResponseClass() {
		return CreateDesktopGroupResponse.class;
	}

}
