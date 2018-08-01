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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateNotifyPolicyRequest extends RpcAcsRequest<CreateNotifyPolicyResponse> {
	
	public CreateNotifyPolicyRequest() {
		super("Cms", "2018-03-08", "CreateNotifyPolicy", "cms");
	}

	private String policyType;

	private String alertName;

	private String groupId;

	private Long endTime;

	private Long startTime;

	private String dimensions;

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
		if(policyType != null){
			putQueryParameter("PolicyType", policyType);
		}
	}

	public String getAlertName() {
		return this.alertName;
	}

	public void setAlertName(String alertName) {
		this.alertName = alertName;
		if(alertName != null){
			putQueryParameter("AlertName", alertName);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
		if(dimensions != null){
			putQueryParameter("Dimensions", dimensions);
		}
	}

	@Override
	public Class<CreateNotifyPolicyResponse> getResponseClass() {
		return CreateNotifyPolicyResponse.class;
	}

}
