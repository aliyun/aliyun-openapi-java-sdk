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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfirmPipelineBatchRequest extends RoaAcsRequest<ConfirmPipelineBatchResponse> {
	
	public ConfirmPipelineBatchRequest() {
		super("sae", "2019-05-06", "ConfirmPipelineBatch", "serverless");
		setUriPattern("/pop/v1/sam/changeorder/ConfirmPipelineBatch");
		setMethod(MethodType.GET);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean confirm;

	private String pipelineId;

	public Boolean getConfirm() {
		return this.confirm;
	}

	public void setConfirm(Boolean confirm) {
		this.confirm = confirm;
		if(confirm != null){
			putQueryParameter("Confirm", confirm.toString());
		}
	}

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId);
		}
	}

	@Override
	public Class<ConfirmPipelineBatchResponse> getResponseClass() {
		return ConfirmPipelineBatchResponse.class;
	}

}
