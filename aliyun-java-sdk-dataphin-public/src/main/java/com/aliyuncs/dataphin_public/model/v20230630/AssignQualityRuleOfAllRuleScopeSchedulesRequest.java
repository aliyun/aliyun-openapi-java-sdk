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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AssignQualityRuleOfAllRuleScopeSchedulesRequest extends RpcAcsRequest<AssignQualityRuleOfAllRuleScopeSchedulesResponse> {
	   

	private Long opTenantId;

	@SerializedName("assignCommand")
	private AssignCommand assignCommand;
	public AssignQualityRuleOfAllRuleScopeSchedulesRequest() {
		super("dataphin-public", "2023-06-30", "AssignQualityRuleOfAllRuleScopeSchedules");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public AssignCommand getAssignCommand() {
		return this.assignCommand;
	}

	public void setAssignCommand(AssignCommand assignCommand) {
		this.assignCommand = assignCommand;	
		if (assignCommand != null) {
			putBodyParameter("AssignCommand" , new Gson().toJson(assignCommand));
		}	
	}

	public static class AssignCommand {

		@SerializedName("RuleIdList")
		private List<Long> ruleIdList;

		@SerializedName("WatchId")
		private Long watchId;

		@SerializedName("ScheduleIdList")
		private List<Long> scheduleIdList;

		public List<Long> getRuleIdList() {
			return this.ruleIdList;
		}

		public void setRuleIdList(List<Long> ruleIdList) {
			this.ruleIdList = ruleIdList;
		}

		public Long getWatchId() {
			return this.watchId;
		}

		public void setWatchId(Long watchId) {
			this.watchId = watchId;
		}

		public List<Long> getScheduleIdList() {
			return this.scheduleIdList;
		}

		public void setScheduleIdList(List<Long> scheduleIdList) {
			this.scheduleIdList = scheduleIdList;
		}
	}

	@Override
	public Class<AssignQualityRuleOfAllRuleScopeSchedulesResponse> getResponseClass() {
		return AssignQualityRuleOfAllRuleScopeSchedulesResponse.class;
	}

}
