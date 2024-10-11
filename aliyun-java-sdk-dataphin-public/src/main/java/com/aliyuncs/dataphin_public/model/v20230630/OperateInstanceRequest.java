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
public class OperateInstanceRequest extends RpcAcsRequest<OperateInstanceResponse> {
	   

	private Long opTenantId;

	@SerializedName("operateCommand")
	private OperateCommand operateCommand;

	private String env;
	public OperateInstanceRequest() {
		super("dataphin-public", "2023-06-30", "OperateInstance");
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

	public OperateCommand getOperateCommand() {
		return this.operateCommand;
	}

	public void setOperateCommand(OperateCommand operateCommand) {
		this.operateCommand = operateCommand;	
		if (operateCommand != null) {
			putBodyParameter("OperateCommand" , new Gson().toJson(operateCommand));
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

	public static class OperateCommand {

		@SerializedName("InstanceIdList")
		private List<InstanceIdListItem> instanceIdList;

		@SerializedName("Operation")
		private String operation;

		@SerializedName("ProjectId")
		private Long projectId;

		public List<InstanceIdListItem> getInstanceIdList() {
			return this.instanceIdList;
		}

		public void setInstanceIdList(List<InstanceIdListItem> instanceIdList) {
			this.instanceIdList = instanceIdList;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public static class InstanceIdListItem {

			@SerializedName("Id")
			private String id;

			@SerializedName("FieldInstanceIdList")
			private List<String> fieldInstanceIdList;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<String> getFieldInstanceIdList() {
				return this.fieldInstanceIdList;
			}

			public void setFieldInstanceIdList(List<String> fieldInstanceIdList) {
				this.fieldInstanceIdList = fieldInstanceIdList;
			}
		}
	}

	@Override
	public Class<OperateInstanceResponse> getResponseClass() {
		return OperateInstanceResponse.class;
	}

}
