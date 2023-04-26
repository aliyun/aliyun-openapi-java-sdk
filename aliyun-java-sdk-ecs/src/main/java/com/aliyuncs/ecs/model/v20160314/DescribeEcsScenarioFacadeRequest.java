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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeEcsScenarioFacadeRequest extends RpcAcsRequest<DescribeEcsScenarioFacadeResponse> {
	   

	private String extParam;

	private Long resourceOwnerId;

	private Long ownerId;

	private Map<String,String> extMap;

	private List<ScenarioList> scenarioList;
	public DescribeEcsScenarioFacadeRequest() {
		super("Ecs", "2016-03-14", "DescribeEcsScenarioFacade", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtParam() {
		return this.extParam;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
		if(extParam != null){
			putQueryParameter("ExtParam", extParam);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Map<String,String> getExtMap() {
		return this.extMap;
	}

	public void setExtMap(Map<String,String> extMap) {
		this.extMap = extMap;	
		if (extMap != null) {
			for (String key1: extMap.keySet() ) {
				putQueryParameter("ExtMap.#" + key1.length() + "#" + key1 , extMap.get(key1));
			}
		}	
	}

	public List<ScenarioList> getScenarioList() {
		return this.scenarioList;
	}

	public void setScenarioList(List<ScenarioList> scenarioList) {
		this.scenarioList = scenarioList;	
		if (scenarioList != null) {
			for (int depth1 = 0; depth1 < scenarioList.size(); depth1++) {
				if (scenarioList.get(depth1) != null) {
					
						if (scenarioList.get(depth1).getScenarioResources() != null) {
							for (int depth2 = 0; depth2 < scenarioList.get(depth1).getScenarioResources().size(); depth2++) {
								if (scenarioList.get(depth1).getScenarioResources().get(depth2) != null) {
									
										putQueryParameter("ScenarioList." + (depth1 + 1) + ".ScenarioResources." + (depth2 + 1) + ".Type" , scenarioList.get(depth1).getScenarioResources().get(depth2).getType());
										if (scenarioList.get(depth1).getScenarioResources().get(depth2).getValues() != null) {
											for (int depth3 = 0; depth3 < scenarioList.get(depth1).getScenarioResources().get(depth2).getValues().size(); depth3++) {
												putQueryParameter("ScenarioList." + (depth1 + 1) + ".ScenarioResources." + (depth2 + 1) + ".Values." + (depth3 + 1) , scenarioList.get(depth1).getScenarioResources().get(depth2).getValues().get(depth3));
											}
										}
								}
							}
						}
						putQueryParameter("ScenarioList." + (depth1 + 1) + ".Scenario" , scenarioList.get(depth1).getScenario());
				}
			}
		}	
	}

	public static class ScenarioList {

		private List<ScenarioResourcesItem> scenarioResources;

		private String scenario;

		public List<ScenarioResourcesItem> getScenarioResources() {
			return this.scenarioResources;
		}

		public void setScenarioResources(List<ScenarioResourcesItem> scenarioResources) {
			this.scenarioResources = scenarioResources;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public static class ScenarioResourcesItem {

			private String type;

			private List<String> values;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<String> getValues() {
				return this.values;
			}

			public void setValues(List<String> values) {
				this.values = values;
			}
		}
	}

	@Override
	public Class<DescribeEcsScenarioFacadeResponse> getResponseClass() {
		return DescribeEcsScenarioFacadeResponse.class;
	}

}
