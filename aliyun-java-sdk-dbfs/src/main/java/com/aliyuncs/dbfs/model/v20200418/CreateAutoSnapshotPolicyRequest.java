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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbfs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAutoSnapshotPolicyRequest extends RpcAcsRequest<CreateAutoSnapshotPolicyResponse> {
	   

	@SerializedName("timePoints")
	private List<String> timePoints;

	@SerializedName("repeatWeekdays")
	private List<String> repeatWeekdays;

	private String policyName;

	private Integer retentionDays;
	public CreateAutoSnapshotPolicyRequest() {
		super("DBFS", "2020-04-18", "CreateAutoSnapshotPolicy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTimePoints() {
		return this.timePoints;
	}

	public void setTimePoints(List<String> timePoints) {
		this.timePoints = timePoints;	
		if (timePoints != null) {
			putQueryParameter("TimePoints" , new Gson().toJson(timePoints));
		}	
	}

	public List<String> getRepeatWeekdays() {
		return this.repeatWeekdays;
	}

	public void setRepeatWeekdays(List<String> repeatWeekdays) {
		this.repeatWeekdays = repeatWeekdays;	
		if (repeatWeekdays != null) {
			putQueryParameter("RepeatWeekdays" , new Gson().toJson(repeatWeekdays));
		}	
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
		if(policyName != null){
			putQueryParameter("PolicyName", policyName);
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

	@Override
	public Class<CreateAutoSnapshotPolicyResponse> getResponseClass() {
		return CreateAutoSnapshotPolicyResponse.class;
	}

}
