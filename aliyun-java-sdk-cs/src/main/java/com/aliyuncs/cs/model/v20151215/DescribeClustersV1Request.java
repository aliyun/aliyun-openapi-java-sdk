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
public class DescribeClustersV1Request extends RoaAcsRequest<DescribeClustersV1Response> {
	   

	private Long page_number;

	private String cluster_spec;

	private String profile;

	private String name;

	private String region_id;

	private String cluster_type;

	private Long page_size;
	public DescribeClustersV1Request() {
		super("CS", "2015-12-15", "DescribeClustersV1");
		setUriPattern("/api/v1/clusters");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPage_number() {
		return this.page_number;
	}

	public void setPage_number(Long page_number) {
		this.page_number = page_number;
		if(page_number != null){
			putQueryParameter("page_number", page_number.toString());
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

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
		if(profile != null){
			putQueryParameter("profile", profile);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("name", name);
		}
	}

	public String getRegion_id() {
		return this.region_id;
	}

	public void setRegion_id(String region_id) {
		this.region_id = region_id;
		if(region_id != null){
			putQueryParameter("region_id", region_id);
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

	public Long getPage_size() {
		return this.page_size;
	}

	public void setPage_size(Long page_size) {
		this.page_size = page_size;
		if(page_size != null){
			putQueryParameter("page_size", page_size.toString());
		}
	}

	@Override
	public Class<DescribeClustersV1Response> getResponseClass() {
		return DescribeClustersV1Response.class;
	}

}
