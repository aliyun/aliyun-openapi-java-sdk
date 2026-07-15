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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.schedulerx2.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ManageSchedulerxJobSyncRequest extends RpcAcsRequest<ManageSchedulerxJobSyncResponse> {
	   

	private String namespaceSource;

	private String targetNamespace;

	private String originalGroupId;

	private String jobIdList;

	private String originalNamespace;

	private String targetGroupId;
	public ManageSchedulerxJobSyncRequest() {
		super("schedulerx2", "2019-04-30", "ManageSchedulerxJobSync", "schedulerx2");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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
			putBodyParameter("NamespaceSource", namespaceSource);
		}
	}

	public String getTargetNamespace() {
		return this.targetNamespace;
	}

	public void setTargetNamespace(String targetNamespace) {
		this.targetNamespace = targetNamespace;
		if(targetNamespace != null){
			putBodyParameter("TargetNamespace", targetNamespace);
		}
	}

	public String getOriginalGroupId() {
		return this.originalGroupId;
	}

	public void setOriginalGroupId(String originalGroupId) {
		this.originalGroupId = originalGroupId;
		if(originalGroupId != null){
			putBodyParameter("OriginalGroupId", originalGroupId);
		}
	}

	public String getJobIdList() {
		return this.jobIdList;
	}

	public void setJobIdList(String jobIdList) {
		this.jobIdList = jobIdList;
		if(jobIdList != null){
			putBodyParameter("JobIdList", jobIdList);
		}
	}

	public String getOriginalNamespace() {
		return this.originalNamespace;
	}

	public void setOriginalNamespace(String originalNamespace) {
		this.originalNamespace = originalNamespace;
		if(originalNamespace != null){
			putBodyParameter("OriginalNamespace", originalNamespace);
		}
	}

	public String getTargetGroupId() {
		return this.targetGroupId;
	}

	public void setTargetGroupId(String targetGroupId) {
		this.targetGroupId = targetGroupId;
		if(targetGroupId != null){
			putBodyParameter("TargetGroupId", targetGroupId);
		}
	}

	@Override
	public Class<ManageSchedulerxJobSyncResponse> getResponseClass() {
		return ManageSchedulerxJobSyncResponse.class;
	}

}
