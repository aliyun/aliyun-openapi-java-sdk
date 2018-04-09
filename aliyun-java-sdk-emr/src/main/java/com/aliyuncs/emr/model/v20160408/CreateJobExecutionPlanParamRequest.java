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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateJobExecutionPlanParamRequest extends RpcAcsRequest<CreateJobExecutionPlanParamResponse> {
	
	public CreateJobExecutionPlanParamRequest() {
		super("Emr", "2016-04-08", "CreateJobExecutionPlanParam");
	}

	private Long resourceOwnerId;

	private String relateId;

	private List<WorkParamPair> workParamPairs;

	private String paramBizType;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getRelateId() {
		return this.relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
		if(relateId != null){
			putQueryParameter("RelateId", relateId);
		}
	}

	public List<WorkParamPair> getWorkParamPairs() {
		return this.workParamPairs;
	}

	public void setWorkParamPairs(List<WorkParamPair> workParamPairs) {
		this.workParamPairs = workParamPairs;	
		if (workParamPairs != null) {
			for (int depth1 = 0; depth1 < workParamPairs.size(); depth1++) {
				putQueryParameter("WorkParamPair." + (depth1 + 1) + ".Name" , workParamPairs.get(depth1).getName());
				putQueryParameter("WorkParamPair." + (depth1 + 1) + ".Value" , workParamPairs.get(depth1).getValue());
			}
		}	
	}

	public String getParamBizType() {
		return this.paramBizType;
	}

	public void setParamBizType(String paramBizType) {
		this.paramBizType = paramBizType;
		if(paramBizType != null){
			putQueryParameter("ParamBizType", paramBizType);
		}
	}

	public static class WorkParamPair {

		private String name;

		private String value;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateJobExecutionPlanParamResponse> getResponseClass() {
		return CreateJobExecutionPlanParamResponse.class;
	}

}
