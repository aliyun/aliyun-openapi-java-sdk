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
public class StartLinkeBahamutPrepubpipelineRequest extends RpcAcsRequest<StartLinkeBahamutPrepubpipelineResponse> {
	   

	private Long pipelineInstanceId;

	private String iterationUnitId;
	public StartLinkeBahamutPrepubpipelineRequest() {
		super("SOFA", "2019-08-15", "StartLinkeBahamutPrepubpipeline", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPipelineInstanceId() {
		return this.pipelineInstanceId;
	}

	public void setPipelineInstanceId(Long pipelineInstanceId) {
		this.pipelineInstanceId = pipelineInstanceId;
		if(pipelineInstanceId != null){
			putBodyParameter("PipelineInstanceId", pipelineInstanceId.toString());
		}
	}

	public String getIterationUnitId() {
		return this.iterationUnitId;
	}

	public void setIterationUnitId(String iterationUnitId) {
		this.iterationUnitId = iterationUnitId;
		if(iterationUnitId != null){
			putBodyParameter("IterationUnitId", iterationUnitId);
		}
	}

	@Override
	public Class<StartLinkeBahamutPrepubpipelineResponse> getResponseClass() {
		return StartLinkeBahamutPrepubpipelineResponse.class;
	}

}
