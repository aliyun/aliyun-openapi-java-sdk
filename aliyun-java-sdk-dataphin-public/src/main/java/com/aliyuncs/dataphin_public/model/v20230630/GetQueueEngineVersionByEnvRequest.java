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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetQueueEngineVersionByEnvRequest extends RpcAcsRequest<GetQueueEngineVersionByEnvResponse> {
	   

	private Long opTenantId;

	private String queueName;

	private String clusterId;

	private String env;

	private Long projectId;

	private String streamBatchMode;
	public GetQueueEngineVersionByEnvRequest() {
		super("dataphin-public", "2023-06-30", "GetQueueEngineVersionByEnv");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getQueueName() {
		return this.queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
		if(queueName != null){
			putQueryParameter("QueueName", queueName);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public String getStreamBatchMode() {
		return this.streamBatchMode;
	}

	public void setStreamBatchMode(String streamBatchMode) {
		this.streamBatchMode = streamBatchMode;
		if(streamBatchMode != null){
			putQueryParameter("StreamBatchMode", streamBatchMode);
		}
	}

	@Override
	public Class<GetQueueEngineVersionByEnvResponse> getResponseClass() {
		return GetQueueEngineVersionByEnvResponse.class;
	}

}
