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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterBootstrapActionRequest extends RpcAcsRequest<CreateClusterBootstrapActionResponse> {
	   

	private Long resourceOwnerId;

	private String clusterId;

	private List<BootstrapAction> bootstrapActions;
	public CreateClusterBootstrapActionRequest() {
		super("Emr", "2016-04-08", "CreateClusterBootstrapAction", "emr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public List<BootstrapAction> getBootstrapActions() {
		return this.bootstrapActions;
	}

	public void setBootstrapActions(List<BootstrapAction> bootstrapActions) {
		this.bootstrapActions = bootstrapActions;	
		if (bootstrapActions != null) {
			for (int depth1 = 0; depth1 < bootstrapActions.size(); depth1++) {
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".Path" , bootstrapActions.get(depth1).getPath());
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".ExecutionTarget" , bootstrapActions.get(depth1).getExecutionTarget());
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".ExecutionMoment" , bootstrapActions.get(depth1).getExecutionMoment());
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".Arg" , bootstrapActions.get(depth1).getArg());
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".Name" , bootstrapActions.get(depth1).getName());
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".ExecutionFailStrategy" , bootstrapActions.get(depth1).getExecutionFailStrategy());
			}
		}	
	}

	public static class BootstrapAction {

		private String path;

		private String executionTarget;

		private String executionMoment;

		private String arg;

		private String name;

		private String executionFailStrategy;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getExecutionTarget() {
			return this.executionTarget;
		}

		public void setExecutionTarget(String executionTarget) {
			this.executionTarget = executionTarget;
		}

		public String getExecutionMoment() {
			return this.executionMoment;
		}

		public void setExecutionMoment(String executionMoment) {
			this.executionMoment = executionMoment;
		}

		public String getArg() {
			return this.arg;
		}

		public void setArg(String arg) {
			this.arg = arg;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getExecutionFailStrategy() {
			return this.executionFailStrategy;
		}

		public void setExecutionFailStrategy(String executionFailStrategy) {
			this.executionFailStrategy = executionFailStrategy;
		}
	}

	@Override
	public Class<CreateClusterBootstrapActionResponse> getResponseClass() {
		return CreateClusterBootstrapActionResponse.class;
	}

}
