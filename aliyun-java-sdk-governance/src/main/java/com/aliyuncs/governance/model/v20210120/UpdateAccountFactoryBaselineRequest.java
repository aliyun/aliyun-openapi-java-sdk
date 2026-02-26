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

package com.aliyuncs.governance.model.v20210120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.governance.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAccountFactoryBaselineRequest extends RpcAcsRequest<UpdateAccountFactoryBaselineResponse> {
	   

	private String description;

	private String baselineName;

	private String baselineId;

	private List<BaselineItems> baselineItems;
	public UpdateAccountFactoryBaselineRequest() {
		super("governance", "2021-01-20", "UpdateAccountFactoryBaseline", "governance");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getBaselineName() {
		return this.baselineName;
	}

	public void setBaselineName(String baselineName) {
		this.baselineName = baselineName;
		if(baselineName != null){
			putQueryParameter("BaselineName", baselineName);
		}
	}

	public String getBaselineId() {
		return this.baselineId;
	}

	public void setBaselineId(String baselineId) {
		this.baselineId = baselineId;
		if(baselineId != null){
			putQueryParameter("BaselineId", baselineId);
		}
	}

	public List<BaselineItems> getBaselineItems() {
		return this.baselineItems;
	}

	public void setBaselineItems(List<BaselineItems> baselineItems) {
		this.baselineItems = baselineItems;	
		if (baselineItems != null) {
			for (int depth1 = 0; depth1 < baselineItems.size(); depth1++) {
				if (baselineItems.get(depth1) != null) {
					
						putQueryParameter("BaselineItems." + (depth1 + 1) + ".Name" , baselineItems.get(depth1).getName());
						putQueryParameter("BaselineItems." + (depth1 + 1) + ".Config" , baselineItems.get(depth1).getConfig());
						putQueryParameter("BaselineItems." + (depth1 + 1) + ".Version" , baselineItems.get(depth1).getVersion());
				}
			}
		}	
	}

	public static class BaselineItems {

		private String name;

		private String config;

		private String version;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public Class<UpdateAccountFactoryBaselineResponse> getResponseClass() {
		return UpdateAccountFactoryBaselineResponse.class;
	}

}
