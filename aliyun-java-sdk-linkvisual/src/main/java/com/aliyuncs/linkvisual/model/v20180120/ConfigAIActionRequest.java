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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfigAIActionRequest extends RpcAcsRequest<ConfigAIActionResponse> {
	   

	private String algoConfig;

	private List<DataTypeConfigList> dataTypeConfigLists;

	private String actionId;
	public ConfigAIActionRequest() {
		super("Linkvisual", "2018-01-20", "ConfigAIAction", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlgoConfig() {
		return this.algoConfig;
	}

	public void setAlgoConfig(String algoConfig) {
		this.algoConfig = algoConfig;
		if(algoConfig != null){
			putQueryParameter("AlgoConfig", algoConfig);
		}
	}

	public List<DataTypeConfigList> getDataTypeConfigLists() {
		return this.dataTypeConfigLists;
	}

	public void setDataTypeConfigLists(List<DataTypeConfigList> dataTypeConfigLists) {
		this.dataTypeConfigLists = dataTypeConfigLists;	
		if (dataTypeConfigLists != null) {
			for (int depth1 = 0; depth1 < dataTypeConfigLists.size(); depth1++) {
				putQueryParameter("DataTypeConfigList." + (depth1 + 1) + ".Configs" , dataTypeConfigLists.get(depth1).getConfigs());
				putQueryParameter("DataTypeConfigList." + (depth1 + 1) + ".DataType" , dataTypeConfigLists.get(depth1).getDataType());
			}
		}	
	}

	public String getActionId() {
		return this.actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
		if(actionId != null){
			putQueryParameter("ActionId", actionId);
		}
	}

	public static class DataTypeConfigList {

		private String configs;

		private String dataType;

		public String getConfigs() {
			return this.configs;
		}

		public void setConfigs(String configs) {
			this.configs = configs;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}
	}

	@Override
	public Class<ConfigAIActionResponse> getResponseClass() {
		return ConfigAIActionResponse.class;
	}

}
