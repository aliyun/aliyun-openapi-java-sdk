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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PausePhysicalNodeRequest extends RpcAcsRequest<PausePhysicalNodeResponse> {
	   

	private Long opTenantId;

	private String env;

	@SerializedName("pauseCommand")
	private PauseCommand pauseCommand;
	public PausePhysicalNodeRequest() {
		super("dataphin-public", "2023-06-30", "PausePhysicalNode");
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

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	public PauseCommand getPauseCommand() {
		return this.pauseCommand;
	}

	public void setPauseCommand(PauseCommand pauseCommand) {
		this.pauseCommand = pauseCommand;	
		if (pauseCommand != null) {
			putBodyParameter("PauseCommand" , new Gson().toJson(pauseCommand));
		}	
	}

	public static class PauseCommand {

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("NodeIdList")
		private List<String> nodeIdList;

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public List<String> getNodeIdList() {
			return this.nodeIdList;
		}

		public void setNodeIdList(List<String> nodeIdList) {
			this.nodeIdList = nodeIdList;
		}
	}

	@Override
	public Class<PausePhysicalNodeResponse> getResponseClass() {
		return PausePhysicalNodeResponse.class;
	}

}
