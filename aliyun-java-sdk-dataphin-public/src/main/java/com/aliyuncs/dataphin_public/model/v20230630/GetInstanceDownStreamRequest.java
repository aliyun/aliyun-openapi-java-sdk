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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceDownStreamRequest extends RpcAcsRequest<GetInstanceDownStreamResponse> {
	   

	private Long opTenantId;

	private String runStatus;

	private String env;

	@SerializedName("instanceGet")
	private InstanceGet instanceGet;

	private Integer downStreamDepth;
	public GetInstanceDownStreamRequest() {
		super("dataphin-public", "2023-06-30", "GetInstanceDownStream");
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

	public String getRunStatus() {
		return this.runStatus;
	}

	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
		if(runStatus != null){
			putQueryParameter("RunStatus", runStatus);
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

	public InstanceGet getInstanceGet() {
		return this.instanceGet;
	}

	public void setInstanceGet(InstanceGet instanceGet) {
		this.instanceGet = instanceGet;	
		if (instanceGet != null) {
			putBodyParameter("InstanceGet" , new Gson().toJson(instanceGet));
		}	
	}

	public Integer getDownStreamDepth() {
		return this.downStreamDepth;
	}

	public void setDownStreamDepth(Integer downStreamDepth) {
		this.downStreamDepth = downStreamDepth;
		if(downStreamDepth != null){
			putQueryParameter("DownStreamDepth", downStreamDepth.toString());
		}
	}

	public static class InstanceGet {

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("NodeType")
		private String nodeType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}
	}

	@Override
	public Class<GetInstanceDownStreamResponse> getResponseClass() {
		return GetInstanceDownStreamResponse.class;
	}

}
