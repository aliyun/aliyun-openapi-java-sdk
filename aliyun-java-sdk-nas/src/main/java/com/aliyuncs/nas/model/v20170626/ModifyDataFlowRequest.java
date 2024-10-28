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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDataFlowRequest extends RpcAcsRequest<ModifyDataFlowResponse> {
	   

	private String clientToken;

	private String description;

	private Long throughput;

	private String fileSystemId;

	private Boolean dryRun;

	private String dataFlowId;
	public ModifyDataFlowRequest() {
		super("NAS", "2017-06-26", "ModifyDataFlow", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getThroughput() {
		return this.throughput;
	}

	public void setThroughput(Long throughput) {
		this.throughput = throughput;
		if(throughput != null){
			putQueryParameter("Throughput", throughput.toString());
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getDataFlowId() {
		return this.dataFlowId;
	}

	public void setDataFlowId(String dataFlowId) {
		this.dataFlowId = dataFlowId;
		if(dataFlowId != null){
			putQueryParameter("DataFlowId", dataFlowId);
		}
	}

	@Override
	public Class<ModifyDataFlowResponse> getResponseClass() {
		return ModifyDataFlowResponse.class;
	}

}
