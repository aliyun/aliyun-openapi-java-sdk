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

package com.aliyuncs.schedulerx2.model.v20190430;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.schedulerx2.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecuteJobRequest extends RpcAcsRequest<ExecuteJobResponse> {
	   

	private String namespaceSource;

	private Boolean checkJobStatus;

	private Integer designateType;

	private Long jobId;

	private String worker;

	private String instanceParameters;

	private String groupId;

	private String label;

	private String namespace;
	public ExecuteJobRequest() {
		super("schedulerx2", "2019-04-30", "ExecuteJob");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespaceSource() {
		return this.namespaceSource;
	}

	public void setNamespaceSource(String namespaceSource) {
		this.namespaceSource = namespaceSource;
		if(namespaceSource != null){
			putQueryParameter("NamespaceSource", namespaceSource);
		}
	}

	public Boolean getCheckJobStatus() {
		return this.checkJobStatus;
	}

	public void setCheckJobStatus(Boolean checkJobStatus) {
		this.checkJobStatus = checkJobStatus;
		if(checkJobStatus != null){
			putQueryParameter("CheckJobStatus", checkJobStatus.toString());
		}
	}

	public Integer getDesignateType() {
		return this.designateType;
	}

	public void setDesignateType(Integer designateType) {
		this.designateType = designateType;
		if(designateType != null){
			putQueryParameter("DesignateType", designateType.toString());
		}
	}

	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId.toString());
		}
	}

	public String getWorker() {
		return this.worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
		if(worker != null){
			putQueryParameter("Worker", worker);
		}
	}

	public String getInstanceParameters() {
		return this.instanceParameters;
	}

	public void setInstanceParameters(String instanceParameters) {
		this.instanceParameters = instanceParameters;
		if(instanceParameters != null){
			putQueryParameter("InstanceParameters", instanceParameters);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
		if(label != null){
			putQueryParameter("Label", label);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<ExecuteJobResponse> getResponseClass() {
		return ExecuteJobResponse.class;
	}

}
