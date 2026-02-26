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

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OperateExecuteJobRequest extends RpcAcsRequest<OperateExecuteJobResponse> {
	   

	private Long jobId;

	private String appName;

	private String worker;

	private String instanceParameters;

	private String clusterId;

	private String label;
	public OperateExecuteJobRequest() {
		super("SchedulerX3", "2024-06-24", "OperateExecuteJob");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putBodyParameter("JobId", jobId.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getWorker() {
		return this.worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
		if(worker != null){
			putBodyParameter("Worker", worker);
		}
	}

	public String getInstanceParameters() {
		return this.instanceParameters;
	}

	public void setInstanceParameters(String instanceParameters) {
		this.instanceParameters = instanceParameters;
		if(instanceParameters != null){
			putBodyParameter("InstanceParameters", instanceParameters);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
		if(label != null){
			putBodyParameter("Label", label);
		}
	}

	@Override
	public Class<OperateExecuteJobResponse> getResponseClass() {
		return OperateExecuteJobResponse.class;
	}

}
