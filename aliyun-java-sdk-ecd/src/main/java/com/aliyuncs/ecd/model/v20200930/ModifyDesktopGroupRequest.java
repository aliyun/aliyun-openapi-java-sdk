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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDesktopGroupRequest extends RpcAcsRequest<ModifyDesktopGroupResponse> {
	   

	private String scaleStrategyId;

	private String desktopGroupName;

	private Integer allowBufferCount;

	private String desktopGroupId;

	private Integer minDesktopsCount;

	private Integer maxDesktopsCount;

	private Integer allowAutoSetup;

	private String comments;

	private String ownBundleId;

	private Long keepDuration;

	private String policyGroupId;
	public ModifyDesktopGroupRequest() {
		super("ecd", "2020-09-30", "ModifyDesktopGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDesktopGroupId() {
		return this.desktopGroupId;
	}

	public void setDesktopGroupId(String desktopGroupId) {
		this.desktopGroupId = desktopGroupId;
		if(desktopGroupId != null){
			putQueryParameter("DesktopGroupId", desktopGroupId);
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

	public Integer getAllowAutoSetup() {
		return this.allowAutoSetup;
	}

	public void setAllowAutoSetup(Integer allowAutoSetup) {
		this.allowAutoSetup = allowAutoSetup;
		if(allowAutoSetup != null){
			putQueryParameter("AllowAutoSetup", allowAutoSetup.toString());
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

	public String getOwnBundleId() {
		return this.ownBundleId;
	}

	public void setOwnBundleId(String ownBundleId) {
		this.ownBundleId = ownBundleId;
		if(ownBundleId != null){
			putQueryParameter("OwnBundleId", ownBundleId);
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
	public Class<ModifyDesktopGroupResponse> getResponseClass() {
		return ModifyDesktopGroupResponse.class;
	}

}
