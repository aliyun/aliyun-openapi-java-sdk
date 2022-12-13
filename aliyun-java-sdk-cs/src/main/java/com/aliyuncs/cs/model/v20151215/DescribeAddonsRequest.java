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
public class DescribeAddonsRequest extends RoaAcsRequest<DescribeAddonsResponse> {
	   

	private String cluster_version;

	private String cluster_spec;

	private String cluster_profile;

	private String cluster_type;

	private String region;
	public DescribeAddonsRequest() {
		super("CS", "2015-12-15", "DescribeAddons");
		setUriPattern("/clusters/components/metadata");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCluster_version() {
		return this.cluster_version;
	}

	public void setCluster_version(String cluster_version) {
		this.cluster_version = cluster_version;
		if(cluster_version != null){
			putQueryParameter("cluster_version", cluster_version);
		}
	}

	public String getCluster_spec() {
		return this.cluster_spec;
	}

	public void setCluster_spec(String cluster_spec) {
		this.cluster_spec = cluster_spec;
		if(cluster_spec != null){
			putQueryParameter("cluster_spec", cluster_spec);
		}
	}

	public String getCluster_profile() {
		return this.cluster_profile;
	}

	public void setCluster_profile(String cluster_profile) {
		this.cluster_profile = cluster_profile;
		if(cluster_profile != null){
			putQueryParameter("cluster_profile", cluster_profile);
		}
	}

	public String getCluster_type() {
		return this.cluster_type;
	}

	public void setCluster_type(String cluster_type) {
		this.cluster_type = cluster_type;
		if(cluster_type != null){
			putQueryParameter("cluster_type", cluster_type);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("region", region);
		}
	}

	@Override
	public Class<DescribeAddonsResponse> getResponseClass() {
		return DescribeAddonsResponse.class;
	}

}
