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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteStrategyRequest extends RpcAcsRequest<DeleteStrategyResponse> {
	
	public DeleteStrategyRequest() {
		super("CloudCallCenter", "2017-07-05", "DeleteStrategy", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String strategyId;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getStrategyId() {
		return this.strategyId;
	}

	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
		if(strategyId != null){
			putQueryParameter("StrategyId", strategyId);
		}
	}

	@Override
	public Class<DeleteStrategyResponse> getResponseClass() {
		return DeleteStrategyResponse.class;
	}

}
