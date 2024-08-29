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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateJobGroupExportTaskRequest extends RpcAcsRequest<CreateJobGroupExportTaskResponse> {
	   

	private String instanceId;

	private String jobGroupId;

	private List<String> options;
	public CreateJobGroupExportTaskRequest() {
		super("OutboundBot", "2019-12-26", "CreateJobGroupExportTask", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getJobGroupId() {
		return this.jobGroupId;
	}

	public void setJobGroupId(String jobGroupId) {
		this.jobGroupId = jobGroupId;
		if(jobGroupId != null){
			putQueryParameter("JobGroupId", jobGroupId);
		}
	}

	public List<String> getOptions() {
		return this.options;
	}

	public void setOptions(List<String> options) {
		this.options = options;	
		if (options != null) {
			for (int i = 0; i < options.size(); i++) {
				putQueryParameter("Option." + (i + 1) , options.get(i));
			}
		}	
	}

	@Override
	public Class<CreateJobGroupExportTaskResponse> getResponseClass() {
		return CreateJobGroupExportTaskResponse.class;
	}

}
