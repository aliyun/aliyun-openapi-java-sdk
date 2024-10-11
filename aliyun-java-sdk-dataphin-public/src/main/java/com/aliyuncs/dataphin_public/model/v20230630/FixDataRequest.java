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
public class FixDataRequest extends RpcAcsRequest<FixDataResponse> {
	   

	private Long opTenantId;

	@SerializedName("fixDataCommand")
	private FixDataCommand fixDataCommand;

	private String env;
	public FixDataRequest() {
		super("dataphin-public", "2023-06-30", "FixData");
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

	public FixDataCommand getFixDataCommand() {
		return this.fixDataCommand;
	}

	public void setFixDataCommand(FixDataCommand fixDataCommand) {
		this.fixDataCommand = fixDataCommand;	
		if (fixDataCommand != null) {
			putBodyParameter("FixDataCommand" , new Gson().toJson(fixDataCommand));
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

	public static class FixDataCommand {

		@SerializedName("ForceRerun")
		private Boolean forceRerun;

		@SerializedName("ContainRootInstance")
		private Boolean containRootInstance;

		@SerializedName("DownstreamRange")
		private String downstreamRange;

		@SerializedName("RootInstanceId")
		private RootInstanceId rootInstanceId;

		@SerializedName("DownStreamInstanceIdList")
		private List<DownStreamInstanceIdListItem> downStreamInstanceIdList;

		@SerializedName("ProjectId")
		private Long projectId;

		public Boolean getForceRerun() {
			return this.forceRerun;
		}

		public void setForceRerun(Boolean forceRerun) {
			this.forceRerun = forceRerun;
		}

		public Boolean getContainRootInstance() {
			return this.containRootInstance;
		}

		public void setContainRootInstance(Boolean containRootInstance) {
			this.containRootInstance = containRootInstance;
		}

		public String getDownstreamRange() {
			return this.downstreamRange;
		}

		public void setDownstreamRange(String downstreamRange) {
			this.downstreamRange = downstreamRange;
		}

		public RootInstanceId getRootInstanceId() {
			return this.rootInstanceId;
		}

		public void setRootInstanceId(RootInstanceId rootInstanceId) {
			this.rootInstanceId = rootInstanceId;
		}

		public List<DownStreamInstanceIdListItem> getDownStreamInstanceIdList() {
			return this.downStreamInstanceIdList;
		}

		public void setDownStreamInstanceIdList(List<DownStreamInstanceIdListItem> downStreamInstanceIdList) {
			this.downStreamInstanceIdList = downStreamInstanceIdList;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public static class RootInstanceId {

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

		public static class DownStreamInstanceIdListItem {

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
	public Class<FixDataResponse> getResponseClass() {
		return FixDataResponse.class;
	}

}
