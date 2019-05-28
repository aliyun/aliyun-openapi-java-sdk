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

/**
 * @author auto create
 * @version 
 */
public class CreateScenarioRequest extends RpcAcsRequest<CreateScenarioResponse> {
	
	public CreateScenarioRequest() {
		super("CCC", "2017-07-05", "CreateScenario");
	}

	private String instanceId;

	private List<String> surveysJsons;

	private String strategyJson;

	private String name;

	private String description;

	private String type;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getSurveysJsons() {
		return this.surveysJsons;
	}

	public void setSurveysJsons(List<String> surveysJsons) {
		this.surveysJsons = surveysJsons;	
		if (surveysJsons != null) {
			for (int i = 0; i < surveysJsons.size(); i++) {
				putQueryParameter("SurveysJson." + (i + 1) , surveysJsons.get(i));
			}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	@Override
	public Class<CreateScenarioResponse> getResponseClass() {
		return CreateScenarioResponse.class;
	}

}
