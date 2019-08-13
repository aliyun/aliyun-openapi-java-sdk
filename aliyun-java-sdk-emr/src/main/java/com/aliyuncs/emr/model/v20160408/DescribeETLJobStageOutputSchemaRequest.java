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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeETLJobStageOutputSchemaRequest extends RpcAcsRequest<DescribeETLJobStageOutputSchemaResponse> {
	
	public DescribeETLJobStageOutputSchemaRequest() {
		super("Emr", "2016-04-08", "DescribeETLJobStageOutputSchema", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String stageName;

	private Long resourceOwnerId;

	private String etlJobId;

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
		if(stageName != null){
			putQueryParameter("StageName", stageName);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getEtlJobId() {
		return this.etlJobId;
	}

	public void setEtlJobId(String etlJobId) {
		this.etlJobId = etlJobId;
		if(etlJobId != null){
			putQueryParameter("EtlJobId", etlJobId);
		}
	}

	@Override
	public Class<DescribeETLJobStageOutputSchemaResponse> getResponseClass() {
		return DescribeETLJobStageOutputSchemaResponse.class;
	}

}
