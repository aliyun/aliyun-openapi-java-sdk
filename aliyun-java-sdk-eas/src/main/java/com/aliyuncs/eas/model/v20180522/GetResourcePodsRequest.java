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

package com.aliyuncs.eas.model.v20180522;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetResourcePodsRequest extends RoaAcsRequest<GetResourcePodsResponse> {
	   

	private String cluster_id;

	private String instance_name;

	private String resource_name;
	public GetResourcePodsRequest() {
		super("eas", "2018-05-22", "GetResourcePods");
		setUriPattern("/api/resources/[cluster_id]/[resource_name]/instances/[instance_name]/pods");
		setMethod(MethodType.GET);
	}

	public String getCluster_id() {
		return this.cluster_id;
	}

	public void setCluster_id(String cluster_id) {
		this.cluster_id = cluster_id;
		if(cluster_id != null){
			putPathParameter("cluster_id", cluster_id);
		}
	}

	public String getInstance_name() {
		return this.instance_name;
	}

	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
		if(instance_name != null){
			putPathParameter("instance_name", instance_name);
		}
	}

	public String getResource_name() {
		return this.resource_name;
	}

	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
		if(resource_name != null){
			putPathParameter("resource_name", resource_name);
		}
	}

	@Override
	public Class<GetResourcePodsResponse> getResponseClass() {
		return GetResourcePodsResponse.class;
	}

}
