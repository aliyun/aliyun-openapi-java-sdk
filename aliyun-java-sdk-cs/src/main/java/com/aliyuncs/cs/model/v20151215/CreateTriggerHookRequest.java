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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTriggerHookRequest extends RoaAcsRequest<CreateTriggerHookResponse> {
	   

	private String cluster_id;

	private String project_id;

	private String trigger_url;

	private String region_id;
	public CreateTriggerHookRequest() {
		super("CS", "2015-12-15", "CreateTriggerHook");
		setUriPattern("/hook/trigger");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCluster_id() {
		return this.cluster_id;
	}

	public void setCluster_id(String cluster_id) {
		this.cluster_id = cluster_id;
		if(cluster_id != null){
			putBodyParameter("cluster_id", cluster_id);
		}
	}

	public String getProject_id() {
		return this.project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
		if(project_id != null){
			putBodyParameter("project_id", project_id);
		}
	}

	public String getTrigger_url() {
		return this.trigger_url;
	}

	public void setTrigger_url(String trigger_url) {
		this.trigger_url = trigger_url;
		if(trigger_url != null){
			putBodyParameter("trigger_url", trigger_url);
		}
	}

	public String getRegion_id() {
		return this.region_id;
	}

	public void setRegion_id(String region_id) {
		this.region_id = region_id;
		if(region_id != null){
			putBodyParameter("region_id", region_id);
		}
	}

	@Override
	public Class<CreateTriggerHookResponse> getResponseClass() {
		return CreateTriggerHookResponse.class;
	}

}
