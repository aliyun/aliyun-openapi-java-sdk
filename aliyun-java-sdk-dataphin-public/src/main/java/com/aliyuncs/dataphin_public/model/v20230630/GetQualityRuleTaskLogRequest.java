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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetQualityRuleTaskLogRequest extends RpcAcsRequest<GetQualityRuleTaskLogResponse> {
	   

	private Long opTenantId;

	private Long ruleTaskId;
	public GetQualityRuleTaskLogRequest() {
		super("dataphin-public", "2023-06-30", "GetQualityRuleTaskLog");
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

	public Long getRuleTaskId() {
		return this.ruleTaskId;
	}

	public void setRuleTaskId(Long ruleTaskId) {
		this.ruleTaskId = ruleTaskId;
		if(ruleTaskId != null){
			putQueryParameter("RuleTaskId", ruleTaskId.toString());
		}
	}

	@Override
	public Class<GetQualityRuleTaskLogResponse> getResponseClass() {
		return GetQualityRuleTaskLogResponse.class;
	}

}
