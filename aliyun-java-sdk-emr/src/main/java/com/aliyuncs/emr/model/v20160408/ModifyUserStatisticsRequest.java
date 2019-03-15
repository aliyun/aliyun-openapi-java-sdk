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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyUserStatisticsRequest extends RpcAcsRequest<ModifyUserStatisticsResponse> {
	
	public ModifyUserStatisticsRequest() {
		super("Emr", "2016-04-08", "ModifyUserStatistics");
	}

	private Integer jobMigratedNum;

	private Long resourceOwnerId;

	private Integer executePlanNum;

	private Integer jobNum;

	private Integer executePlanMigratedNum;

	private Integer interactionJobMigratedNum;

	private String userId;

	private Integer interactionJobNum;

	public Integer getJobMigratedNum() {
		return this.jobMigratedNum;
	}

	public void setJobMigratedNum(Integer jobMigratedNum) {
		this.jobMigratedNum = jobMigratedNum;
		if(jobMigratedNum != null){
			putQueryParameter("JobMigratedNum", jobMigratedNum.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getExecutePlanNum() {
		return this.executePlanNum;
	}

	public void setExecutePlanNum(Integer executePlanNum) {
		this.executePlanNum = executePlanNum;
		if(executePlanNum != null){
			putQueryParameter("ExecutePlanNum", executePlanNum.toString());
		}
	}

	public Integer getJobNum() {
		return this.jobNum;
	}

	public void setJobNum(Integer jobNum) {
		this.jobNum = jobNum;
		if(jobNum != null){
			putQueryParameter("JobNum", jobNum.toString());
		}
	}

	public Integer getExecutePlanMigratedNum() {
		return this.executePlanMigratedNum;
	}

	public void setExecutePlanMigratedNum(Integer executePlanMigratedNum) {
		this.executePlanMigratedNum = executePlanMigratedNum;
		if(executePlanMigratedNum != null){
			putQueryParameter("ExecutePlanMigratedNum", executePlanMigratedNum.toString());
		}
	}

	public Integer getInteractionJobMigratedNum() {
		return this.interactionJobMigratedNum;
	}

	public void setInteractionJobMigratedNum(Integer interactionJobMigratedNum) {
		this.interactionJobMigratedNum = interactionJobMigratedNum;
		if(interactionJobMigratedNum != null){
			putQueryParameter("InteractionJobMigratedNum", interactionJobMigratedNum.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public Integer getInteractionJobNum() {
		return this.interactionJobNum;
	}

	public void setInteractionJobNum(Integer interactionJobNum) {
		this.interactionJobNum = interactionJobNum;
		if(interactionJobNum != null){
			putQueryParameter("InteractionJobNum", interactionJobNum.toString());
		}
	}

	@Override
	public Class<ModifyUserStatisticsResponse> getResponseClass() {
		return ModifyUserStatisticsResponse.class;
	}

}
