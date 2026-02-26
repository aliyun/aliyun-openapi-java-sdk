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
public class ModifyDesktopOversoldGroupRequest extends RpcAcsRequest<ModifyDesktopOversoldGroupResponse> {
	   

	private String imageId;

	private Integer oversoldUserCount;

	private String description;

	private Integer oversoldWarn;

	private Long idleDisconnectDuration;

	private String oversoldGroupId;

	private Integer stopDuration;

	private Integer keepDuration;

	private String name;

	private Integer concurrenceCount;

	private String policyGroupId;
	public ModifyDesktopOversoldGroupRequest() {
		super("ecd", "2020-09-30", "ModifyDesktopOversoldGroup", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public Integer getOversoldUserCount() {
		return this.oversoldUserCount;
	}

	public void setOversoldUserCount(Integer oversoldUserCount) {
		this.oversoldUserCount = oversoldUserCount;
		if(oversoldUserCount != null){
			putQueryParameter("OversoldUserCount", oversoldUserCount.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getOversoldWarn() {
		return this.oversoldWarn;
	}

	public void setOversoldWarn(Integer oversoldWarn) {
		this.oversoldWarn = oversoldWarn;
		if(oversoldWarn != null){
			putQueryParameter("OversoldWarn", oversoldWarn.toString());
		}
	}

	public Long getIdleDisconnectDuration() {
		return this.idleDisconnectDuration;
	}

	public void setIdleDisconnectDuration(Long idleDisconnectDuration) {
		this.idleDisconnectDuration = idleDisconnectDuration;
		if(idleDisconnectDuration != null){
			putQueryParameter("IdleDisconnectDuration", idleDisconnectDuration.toString());
		}
	}

	public String getOversoldGroupId() {
		return this.oversoldGroupId;
	}

	public void setOversoldGroupId(String oversoldGroupId) {
		this.oversoldGroupId = oversoldGroupId;
		if(oversoldGroupId != null){
			putQueryParameter("OversoldGroupId", oversoldGroupId);
		}
	}

	public Integer getStopDuration() {
		return this.stopDuration;
	}

	public void setStopDuration(Integer stopDuration) {
		this.stopDuration = stopDuration;
		if(stopDuration != null){
			putQueryParameter("StopDuration", stopDuration.toString());
		}
	}

	public Integer getKeepDuration() {
		return this.keepDuration;
	}

	public void setKeepDuration(Integer keepDuration) {
		this.keepDuration = keepDuration;
		if(keepDuration != null){
			putQueryParameter("KeepDuration", keepDuration.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getConcurrenceCount() {
		return this.concurrenceCount;
	}

	public void setConcurrenceCount(Integer concurrenceCount) {
		this.concurrenceCount = concurrenceCount;
		if(concurrenceCount != null){
			putQueryParameter("ConcurrenceCount", concurrenceCount.toString());
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
	public Class<ModifyDesktopOversoldGroupResponse> getResponseClass() {
		return ModifyDesktopOversoldGroupResponse.class;
	}

}
