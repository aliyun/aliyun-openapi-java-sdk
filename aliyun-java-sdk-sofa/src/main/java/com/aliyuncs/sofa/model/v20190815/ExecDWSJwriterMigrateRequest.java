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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecDWSJwriterMigrateRequest extends RpcAcsRequest<ExecDWSJwriterMigrateResponse> {
	   

	private String clusterName;

	private String writerName;

	private String node;

	private String instanceId;

	private Boolean force;
	public ExecDWSJwriterMigrateRequest() {
		super("SOFA", "2019-08-15", "ExecDWSJwriterMigrate", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putBodyParameter("ClusterName", clusterName);
		}
	}

	public String getWriterName() {
		return this.writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
		if(writerName != null){
			putBodyParameter("WriterName", writerName);
		}
	}

	public String getNode() {
		return this.node;
	}

	public void setNode(String node) {
		this.node = node;
		if(node != null){
			putBodyParameter("Node", node);
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

	public Boolean getForce() {
		return this.force;
	}

	public void setForce(Boolean force) {
		this.force = force;
		if(force != null){
			putBodyParameter("Force", force.toString());
		}
	}

	@Override
	public Class<ExecDWSJwriterMigrateResponse> getResponseClass() {
		return ExecDWSJwriterMigrateResponse.class;
	}

}
