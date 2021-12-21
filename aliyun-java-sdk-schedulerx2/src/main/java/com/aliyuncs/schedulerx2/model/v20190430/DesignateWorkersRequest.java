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
public class DesignateWorkersRequest extends RpcAcsRequest<DesignateWorkersResponse> {
	   

	private String namespaceSource;

	private String groupId;

	private Boolean transferable;

	private String labels;

	private Integer designateType;

	private Long jobId;

	private String namespace;

	private String workers;
	public DesignateWorkersRequest() {
		super("schedulerx2", "2019-04-30", "DesignateWorkers");
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public Boolean getTransferable() {
		return this.transferable;
	}

	public void setTransferable(Boolean transferable) {
		this.transferable = transferable;
		if(transferable != null){
			putQueryParameter("Transferable", transferable.toString());
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putQueryParameter("Labels", labels);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getWorkers() {
		return this.workers;
	}

	public void setWorkers(String workers) {
		this.workers = workers;
		if(workers != null){
			putQueryParameter("Workers", workers);
		}
	}

	@Override
	public Class<DesignateWorkersResponse> getResponseClass() {
		return DesignateWorkersResponse.class;
	}

}
