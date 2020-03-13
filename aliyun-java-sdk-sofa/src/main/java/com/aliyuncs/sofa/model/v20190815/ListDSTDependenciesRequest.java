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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDSTDependenciesRequest extends RpcAcsRequest<ListDSTDependenciesResponse> {
	   

	private List<ResourceInfo> resourceInfos;

	private String dependencyType;

	private String resourceType;

	private String instanceId;

	private List<Relations> relationss;
	public ListDSTDependenciesRequest() {
		super("SOFA", "2019-08-15", "ListDSTDependencies", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<ResourceInfo> getResourceInfos() {
		return this.resourceInfos;
	}

	public void setResourceInfos(List<ResourceInfo> resourceInfos) {
		this.resourceInfos = resourceInfos;	
		if (resourceInfos != null) {
			for (int depth1 = 0; depth1 < resourceInfos.size(); depth1++) {
				putBodyParameter("ResourceInfo." + (depth1 + 1) + ".Value" , resourceInfos.get(depth1).getValue());
				putBodyParameter("ResourceInfo." + (depth1 + 1) + ".Key" , resourceInfos.get(depth1).getKey());
			}
		}	
	}

	public String getDependencyType() {
		return this.dependencyType;
	}

	public void setDependencyType(String dependencyType) {
		this.dependencyType = dependencyType;
		if(dependencyType != null){
			putBodyParameter("DependencyType", dependencyType);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putBodyParameter("ResourceType", resourceType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public List<Relations> getRelationss() {
		return this.relationss;
	}

	public void setRelationss(List<Relations> relationss) {
		this.relationss = relationss;	
		if (relationss != null) {
			for (int depth1 = 0; depth1 < relationss.size(); depth1++) {
				putBodyParameter("Relations." + (depth1 + 1) + ".Value" , relationss.get(depth1).getValue());
			}
		}	
	}

	public static class ResourceInfo {

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

	public static class Relations {

		private String value;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<ListDSTDependenciesResponse> getResponseClass() {
		return ListDSTDependenciesResponse.class;
	}

}
