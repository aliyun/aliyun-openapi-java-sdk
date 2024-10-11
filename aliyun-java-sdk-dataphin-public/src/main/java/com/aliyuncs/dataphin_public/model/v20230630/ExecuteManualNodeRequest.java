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
public class ExecuteManualNodeRequest extends RpcAcsRequest<ExecuteManualNodeResponse> {
	   

	private Long opTenantId;

	@SerializedName("executeCommand")
	private ExecuteCommand executeCommand;

	private String env;
	public ExecuteManualNodeRequest() {
		super("dataphin-public", "2023-06-30", "ExecuteManualNode");
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

	public ExecuteCommand getExecuteCommand() {
		return this.executeCommand;
	}

	public void setExecuteCommand(ExecuteCommand executeCommand) {
		this.executeCommand = executeCommand;	
		if (executeCommand != null) {
			putBodyParameter("ExecuteCommand" , new Gson().toJson(executeCommand));
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

	public static class ExecuteCommand {

		@SerializedName("StartBizDate")
		private String startBizDate;

		@SerializedName("FlowName")
		private String flowName;

		@SerializedName("EndBizDate")
		private String endBizDate;

		@SerializedName("ParamList")
		private List<ParamListItem> paramList;

		@SerializedName("NodeId")
		private String nodeId;

		@SerializedName("ProjectId")
		private Long projectId;

		public String getStartBizDate() {
			return this.startBizDate;
		}

		public void setStartBizDate(String startBizDate) {
			this.startBizDate = startBizDate;
		}

		public String getFlowName() {
			return this.flowName;
		}

		public void setFlowName(String flowName) {
			this.flowName = flowName;
		}

		public String getEndBizDate() {
			return this.endBizDate;
		}

		public void setEndBizDate(String endBizDate) {
			this.endBizDate = endBizDate;
		}

		public List<ParamListItem> getParamList() {
			return this.paramList;
		}

		public void setParamList(List<ParamListItem> paramList) {
			this.paramList = paramList;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public static class ParamListItem {

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public Class<ExecuteManualNodeResponse> getResponseClass() {
		return ExecuteManualNodeResponse.class;
	}

}
