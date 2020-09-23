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
public class AttachInstancesRequest extends RoaAcsRequest<AttachInstancesResponse> {
	   

	private String password;

	private Boolean keep_instance_name;

	private String key_pair;

	private String cpu_policy;

	private Boolean is_edge_worker;

	private String clusterId;

	private String user_data;

	private String image_id;

	private Boolean format_disk;

	private String nodepool_id;
	public AttachInstancesRequest() {
		super("CS", "2015-12-15", "AttachInstances");
		setUriPattern("/clusters/[ClusterId]/attach");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("password", password);
		}
	}

	public Boolean getKeep_instance_name() {
		return this.keep_instance_name;
	}

	public void setKeep_instance_name(Boolean keep_instance_name) {
		this.keep_instance_name = keep_instance_name;
		if(keep_instance_name != null){
			putBodyParameter("keep_instance_name", keep_instance_name.toString());
		}
	}

	public String getKey_pair() {
		return this.key_pair;
	}

	public void setKey_pair(String key_pair) {
		this.key_pair = key_pair;
		if(key_pair != null){
			putBodyParameter("key_pair", key_pair);
		}
	}

	public String getCpu_policy() {
		return this.cpu_policy;
	}

	public void setCpu_policy(String cpu_policy) {
		this.cpu_policy = cpu_policy;
		if(cpu_policy != null){
			putBodyParameter("cpu_policy", cpu_policy);
		}
	}

	public Boolean getIs_edge_worker() {
		return this.is_edge_worker;
	}

	public void setIs_edge_worker(Boolean is_edge_worker) {
		this.is_edge_worker = is_edge_worker;
		if(is_edge_worker != null){
			putBodyParameter("is_edge_worker", is_edge_worker.toString());
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

	public String getUser_data() {
		return this.user_data;
	}

	public void setUser_data(String user_data) {
		this.user_data = user_data;
		if(user_data != null){
			putBodyParameter("user_data", user_data);
		}
	}

	public String getImage_id() {
		return this.image_id;
	}

	public void setImage_id(String image_id) {
		this.image_id = image_id;
		if(image_id != null){
			putBodyParameter("image_id", image_id);
		}
	}

	public Boolean getFormat_disk() {
		return this.format_disk;
	}

	public void setFormat_disk(Boolean format_disk) {
		this.format_disk = format_disk;
		if(format_disk != null){
			putBodyParameter("format_disk", format_disk.toString());
		}
	}

	public String getNodepool_id() {
		return this.nodepool_id;
	}

	public void setNodepool_id(String nodepool_id) {
		this.nodepool_id = nodepool_id;
		if(nodepool_id != null){
			putBodyParameter("nodepool_id", nodepool_id);
		}
	}

	@Override
	public Class<AttachInstancesResponse> getResponseClass() {
		return AttachInstancesResponse.class;
	}

}
