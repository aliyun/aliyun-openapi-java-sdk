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
public class UpdateQualityRuleSwitchRequest extends RpcAcsRequest<UpdateQualityRuleSwitchResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateQualityRuleSwitchRequest() {
		super("dataphin-public", "2023-06-30", "UpdateQualityRuleSwitch");
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

	public UpdateCommand getUpdateCommand() {
		return this.updateCommand;
	}

	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;	
		if (updateCommand != null) {
			putBodyParameter("UpdateCommand" , new Gson().toJson(updateCommand));
		}	
	}

	public static class UpdateCommand {

		@SerializedName("RuleIdList")
		private List<Long> ruleIdList;

		@SerializedName("Open")
		private Boolean open;

		public List<Long> getRuleIdList() {
			return this.ruleIdList;
		}

		public void setRuleIdList(List<Long> ruleIdList) {
			this.ruleIdList = ruleIdList;
		}

		public Boolean getOpen() {
			return this.open;
		}

		public void setOpen(Boolean open) {
			this.open = open;
		}
	}

	@Override
	public Class<UpdateQualityRuleSwitchResponse> getResponseClass() {
		return UpdateQualityRuleSwitchResponse.class;
	}

}
