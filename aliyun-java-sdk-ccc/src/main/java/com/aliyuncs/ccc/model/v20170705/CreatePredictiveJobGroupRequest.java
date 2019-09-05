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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePredictiveJobGroupRequest extends RpcAcsRequest<CreatePredictiveJobGroupResponse> {
	
	public CreatePredictiveJobGroupRequest() {
		super("CCC", "2017-07-05", "CreatePredictiveJobGroup");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String description;

	private Boolean timingSchedule;

	private List<String> jobsJsons;

	private String jobFilePath;

	private String instanceId;

	private Boolean isDraft;

	private String skillGroupId;

	private String strategyJson;

	private String name;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Boolean getTimingSchedule() {
		return this.timingSchedule;
	}

	public void setTimingSchedule(Boolean timingSchedule) {
		this.timingSchedule = timingSchedule;
		if(timingSchedule != null){
			putQueryParameter("TimingSchedule", timingSchedule.toString());
		}
	}

	public List<String> getJobsJsons() {
		return this.jobsJsons;
	}

	public void setJobsJsons(List<String> jobsJsons) {
		this.jobsJsons = jobsJsons;	
		if (jobsJsons != null) {
			for (int i = 0; i < jobsJsons.size(); i++) {
				putBodyParameter("JobsJson." + (i + 1) , jobsJsons.get(i));
			}
		}	
	}

	public String getJobFilePath() {
		return this.jobFilePath;
	}

	public void setJobFilePath(String jobFilePath) {
		this.jobFilePath = jobFilePath;
		if(jobFilePath != null){
			putQueryParameter("JobFilePath", jobFilePath);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Boolean getIsDraft() {
		return this.isDraft;
	}

	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
		if(isDraft != null){
			putQueryParameter("IsDraft", isDraft.toString());
		}
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
		}
	}

	public String getStrategyJson() {
		return this.strategyJson;
	}

	public void setStrategyJson(String strategyJson) {
		this.strategyJson = strategyJson;
		if(strategyJson != null){
			putQueryParameter("StrategyJson", strategyJson);
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

	@Override
	public Class<CreatePredictiveJobGroupResponse> getResponseClass() {
		return CreatePredictiveJobGroupResponse.class;
	}

}
