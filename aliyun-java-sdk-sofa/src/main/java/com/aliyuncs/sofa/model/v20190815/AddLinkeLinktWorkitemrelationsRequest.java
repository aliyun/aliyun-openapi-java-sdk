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
public class AddLinkeLinktWorkitemrelationsRequest extends RpcAcsRequest<AddLinkeLinktWorkitemrelationsResponse> {
	   

	private String source;

	private String targets;

	private String workItemRelationType;
	public AddLinkeLinktWorkitemrelationsRequest() {
		super("SOFA", "2019-08-15", "AddLinkeLinktWorkitemrelations", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putBodyParameter("Source", source);
		}
	}

	public String getTargets() {
		return this.targets;
	}

	public void setTargets(String targets) {
		this.targets = targets;
		if(targets != null){
			putBodyParameter("Targets", targets);
		}
	}

	public String getWorkItemRelationType() {
		return this.workItemRelationType;
	}

	public void setWorkItemRelationType(String workItemRelationType) {
		this.workItemRelationType = workItemRelationType;
		if(workItemRelationType != null){
			putBodyParameter("WorkItemRelationType", workItemRelationType);
		}
	}

	@Override
	public Class<AddLinkeLinktWorkitemrelationsResponse> getResponseClass() {
		return AddLinkeLinktWorkitemrelationsResponse.class;
	}

}
