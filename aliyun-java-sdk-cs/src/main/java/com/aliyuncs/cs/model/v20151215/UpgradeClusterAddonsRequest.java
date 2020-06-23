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
public class UpgradeClusterAddonsRequest extends RoaAcsRequest<UpgradeClusterAddonsResponse> {
	   

	private String component_name;

	private String clusterId;

	private String version;
	public UpgradeClusterAddonsRequest() {
		super("CS", "2015-12-15", "UpgradeClusterAddons");
		setUriPattern("/clusters/[ClusterId]/components/upgrade");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getComponent_name() {
		return this.component_name;
	}

	public void setComponent_name(String component_name) {
		this.component_name = component_name;
		if(component_name != null){
			putBodyParameter("component_name", component_name);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("version", version);
		}
	}

	@Override
	public Class<UpgradeClusterAddonsResponse> getResponseClass() {
		return UpgradeClusterAddonsResponse.class;
	}

}
