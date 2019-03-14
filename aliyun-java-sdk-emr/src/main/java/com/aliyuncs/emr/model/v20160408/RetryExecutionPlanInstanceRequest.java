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
public class RetryExecutionPlanInstanceRequest extends RpcAcsRequest<RetryExecutionPlanInstanceResponse> {
	
	public RetryExecutionPlanInstanceRequest() {
		super("Emr", "2016-04-08", "RetryExecutionPlanInstance");
	}

	private Long resourceOwnerId;

	private String arguments;

	private String id;

	private Boolean rerunFail;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getArguments() {
		return this.arguments;
	}

	public void setArguments(String arguments) {
		this.arguments = arguments;
		if(arguments != null){
			putQueryParameter("Arguments", arguments);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public Boolean getRerunFail() {
		return this.rerunFail;
	}

	public void setRerunFail(Boolean rerunFail) {
		this.rerunFail = rerunFail;
		if(rerunFail != null){
			putQueryParameter("RerunFail", rerunFail.toString());
		}
	}

	@Override
	public Class<RetryExecutionPlanInstanceResponse> getResponseClass() {
		return RetryExecutionPlanInstanceResponse.class;
	}

}
