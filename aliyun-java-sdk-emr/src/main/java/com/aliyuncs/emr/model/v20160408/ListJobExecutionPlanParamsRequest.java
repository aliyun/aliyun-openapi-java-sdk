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
public class ListJobExecutionPlanParamsRequest extends RpcAcsRequest<ListJobExecutionPlanParamsResponse> {
	
	public ListJobExecutionPlanParamsRequest() {
		super("Emr", "2016-04-08", "ListJobExecutionPlanParams");
	}

	private Long resourceOwnerId;

	private String relateId;

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

	public String getParamBizType() {
		return this.paramBizType;
	}

	public void setParamBizType(String paramBizType) {
		this.paramBizType = paramBizType;
		if(paramBizType != null){
			putQueryParameter("ParamBizType", paramBizType);
		}
	}

	@Override
	public Class<ListJobExecutionPlanParamsResponse> getResponseClass() {
		return ListJobExecutionPlanParamsResponse.class;
	}

}
