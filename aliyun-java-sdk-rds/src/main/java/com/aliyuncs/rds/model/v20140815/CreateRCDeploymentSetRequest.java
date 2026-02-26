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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRCDeploymentSetRequest extends RpcAcsRequest<CreateRCDeploymentSetResponse> {
	   

	private String clientToken;

	private String description;

	private Long groupCount;

	private List<Tag> tags;

	private String deploymentSetName;

	private String onUnableToRedeployFailedInstance;

	private String strategy;
	public CreateRCDeploymentSetRequest() {
		super("Rds", "2014-08-15", "CreateRCDeploymentSet", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public Long getGroupCount() {
		return this.groupCount;
	}

	public void setGroupCount(Long groupCount) {
		this.groupCount = groupCount;
		if(groupCount != null){
			putQueryParameter("GroupCount", groupCount.toString());
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getDeploymentSetName() {
		return this.deploymentSetName;
	}

	public void setDeploymentSetName(String deploymentSetName) {
		this.deploymentSetName = deploymentSetName;
		if(deploymentSetName != null){
			putQueryParameter("DeploymentSetName", deploymentSetName);
		}
	}

	public String getOnUnableToRedeployFailedInstance() {
		return this.onUnableToRedeployFailedInstance;
	}

	public void setOnUnableToRedeployFailedInstance(String onUnableToRedeployFailedInstance) {
		this.onUnableToRedeployFailedInstance = onUnableToRedeployFailedInstance;
		if(onUnableToRedeployFailedInstance != null){
			putQueryParameter("OnUnableToRedeployFailedInstance", onUnableToRedeployFailedInstance);
		}
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
		if(strategy != null){
			putQueryParameter("Strategy", strategy);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateRCDeploymentSetResponse> getResponseClass() {
		return CreateRCDeploymentSetResponse.class;
	}

}
