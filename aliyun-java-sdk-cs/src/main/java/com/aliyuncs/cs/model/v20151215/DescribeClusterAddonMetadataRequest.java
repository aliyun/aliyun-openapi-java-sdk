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
public class DescribeClusterAddonMetadataRequest extends RoaAcsRequest<DescribeClusterAddonMetadataResponse> {
	   

	private String cluster_id;

	private String component_id;

	private String version;
	public DescribeClusterAddonMetadataRequest() {
		super("CS", "2015-12-15", "DescribeClusterAddonMetadata");
		setUriPattern("/clusters/[cluster_id]/components/[component_id]/metadata");
		setMethod(MethodType.GET);
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
			putPathParameter("cluster_id", cluster_id);
		}
	}

	public String getComponent_id() {
		return this.component_id;
	}

	public void setComponent_id(String component_id) {
		this.component_id = component_id;
		if(component_id != null){
			putPathParameter("component_id", component_id);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putPathParameter("version", version);
		}
	}

	@Override
	public Class<DescribeClusterAddonMetadataResponse> getResponseClass() {
		return DescribeClusterAddonMetadataResponse.class;
	}

}
