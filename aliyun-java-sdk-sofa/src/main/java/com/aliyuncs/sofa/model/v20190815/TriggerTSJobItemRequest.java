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
public class TriggerTSJobItemRequest extends RpcAcsRequest<TriggerTSJobItemResponse> {
	   

	private Long jobId;

	private String zone;

	private String instanceId;

	private String paramMap;
	public TriggerTSJobItemRequest() {
		super("SOFA", "2019-08-15", "TriggerTSJobItem", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
		if(zone != null){
			putBodyParameter("Zone", zone);
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

	public String getParamMap() {
		return this.paramMap;
	}

	public void setParamMap(String paramMap) {
		this.paramMap = paramMap;
		if(paramMap != null){
			putBodyParameter("ParamMap", paramMap);
		}
	}

	@Override
	public Class<TriggerTSJobItemResponse> getResponseClass() {
		return TriggerTSJobItemResponse.class;
	}

}
