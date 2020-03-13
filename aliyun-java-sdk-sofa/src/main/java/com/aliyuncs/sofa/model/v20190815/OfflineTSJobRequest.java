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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OfflineTSJobRequest extends RpcAcsRequest<OfflineTSJobResponse> {
	   

	private List<Long> jobItemIdss;

	private String instanceId;
	public OfflineTSJobRequest() {
		super("SOFA", "2019-08-15", "OfflineTSJob", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getJobItemIdss() {
		return this.jobItemIdss;
	}

	public void setJobItemIdss(List<Long> jobItemIdss) {
		this.jobItemIdss = jobItemIdss;	
		if (jobItemIdss != null) {
			for (int i = 0; i < jobItemIdss.size(); i++) {
				putBodyParameter("JobItemIds." + (i + 1) , jobItemIdss.get(i));
			}
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

	@Override
	public Class<OfflineTSJobResponse> getResponseClass() {
		return OfflineTSJobResponse.class;
	}

}
