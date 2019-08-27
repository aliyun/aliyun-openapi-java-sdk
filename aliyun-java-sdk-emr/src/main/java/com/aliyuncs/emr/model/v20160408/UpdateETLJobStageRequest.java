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
public class UpdateETLJobStageRequest extends RpcAcsRequest<UpdateETLJobStageResponse> {
	
	public UpdateETLJobStageRequest() {
		super("Emr", "2016-04-08", "UpdateETLJobStage", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String stageName;

	private String stageConf;

	private Long resourceOwnerId;

	private String stageType;

	private String etlJobId;

	private String stagePlugin;

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
		if(stageName != null){
			putQueryParameter("StageName", stageName);
		}
	}

	public String getStageConf() {
		return this.stageConf;
	}

	public void setStageConf(String stageConf) {
		this.stageConf = stageConf;
		if(stageConf != null){
			putQueryParameter("StageConf", stageConf);
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

	public String getStageType() {
		return this.stageType;
	}

	public void setStageType(String stageType) {
		this.stageType = stageType;
		if(stageType != null){
			putQueryParameter("StageType", stageType);
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

	public String getStagePlugin() {
		return this.stagePlugin;
	}

	public void setStagePlugin(String stagePlugin) {
		this.stagePlugin = stagePlugin;
		if(stagePlugin != null){
			putQueryParameter("StagePlugin", stagePlugin);
		}
	}

	@Override
	public Class<UpdateETLJobStageResponse> getResponseClass() {
		return UpdateETLJobStageResponse.class;
	}

}
