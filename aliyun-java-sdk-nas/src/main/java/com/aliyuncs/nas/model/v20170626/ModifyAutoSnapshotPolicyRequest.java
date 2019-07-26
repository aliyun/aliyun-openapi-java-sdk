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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyAutoSnapshotPolicyRequest extends RpcAcsRequest<ModifyAutoSnapshotPolicyResponse> {
	
	public ModifyAutoSnapshotPolicyRequest() {
		super("NAS", "2017-06-26", "ModifyAutoSnapshotPolicy", "NAS");
	}

	private String autoSnapshotPolicyId;

	private Integer retentionDays;

	private String timePoints;

	private String repeatWeekdays;

	private String autoSnapshotPolicyName;

	public String getAutoSnapshotPolicyId() {
		return this.autoSnapshotPolicyId;
	}

	public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
		this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		if(autoSnapshotPolicyId != null){
			putQueryParameter("AutoSnapshotPolicyId", autoSnapshotPolicyId);
		}
	}

	public Integer getRetentionDays() {
		return this.retentionDays;
	}

	public void setRetentionDays(Integer retentionDays) {
		this.retentionDays = retentionDays;
		if(retentionDays != null){
			putQueryParameter("RetentionDays", retentionDays.toString());
		}
	}

	public String getTimePoints() {
		return this.timePoints;
	}

	public void setTimePoints(String timePoints) {
		this.timePoints = timePoints;
		if(timePoints != null){
			putQueryParameter("TimePoints", timePoints);
		}
	}

	public String getRepeatWeekdays() {
		return this.repeatWeekdays;
	}

	public void setRepeatWeekdays(String repeatWeekdays) {
		this.repeatWeekdays = repeatWeekdays;
		if(repeatWeekdays != null){
			putQueryParameter("RepeatWeekdays", repeatWeekdays);
		}
	}

	public String getAutoSnapshotPolicyName() {
		return this.autoSnapshotPolicyName;
	}

	public void setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
		this.autoSnapshotPolicyName = autoSnapshotPolicyName;
		if(autoSnapshotPolicyName != null){
			putQueryParameter("AutoSnapshotPolicyName", autoSnapshotPolicyName);
		}
	}

	@Override
	public Class<ModifyAutoSnapshotPolicyResponse> getResponseClass() {
		return ModifyAutoSnapshotPolicyResponse.class;
	}

}
