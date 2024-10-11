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
public class CreateNodeSupplementRequest extends RpcAcsRequest<CreateNodeSupplementResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;

	private String env;
	public CreateNodeSupplementRequest() {
		super("dataphin-public", "2023-06-30", "CreateNodeSupplement");
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

	public CreateCommand getCreateCommand() {
		return this.createCommand;
	}

	public void setCreateCommand(CreateCommand createCommand) {
		this.createCommand = createCommand;	
		if (createCommand != null) {
			putBodyParameter("CreateCommand" , new Gson().toJson(createCommand));
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

	public static class CreateCommand {

		@SerializedName("MaxDueTime")
		private String maxDueTime;

		@SerializedName("ContainAllDownStream")
		private Boolean containAllDownStream;

		@SerializedName("StartBizDate")
		private String startBizDate;

		@SerializedName("Parallelism")
		private Integer parallelism;

		@SerializedName("GlobalParamList")
		private List<GlobalParamListItem> globalParamList;

		@SerializedName("EndBizDate")
		private String endBizDate;

		@SerializedName("FilterList")
		private List<FilterListItem> filterList;

		@SerializedName("NodeParamsList")
		private List<NodeParamsListItem> nodeParamsList;

		@SerializedName("Name")
		private String name;

		@SerializedName("MinDueTime")
		private String minDueTime;

		@SerializedName("NodeIdList")
		private List<NodeIdListItem> nodeIdList;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("DownStreamNodeIdList")
		private List<DownStreamNodeIdListItem> downStreamNodeIdList;

		public String getMaxDueTime() {
			return this.maxDueTime;
		}

		public void setMaxDueTime(String maxDueTime) {
			this.maxDueTime = maxDueTime;
		}

		public Boolean getContainAllDownStream() {
			return this.containAllDownStream;
		}

		public void setContainAllDownStream(Boolean containAllDownStream) {
			this.containAllDownStream = containAllDownStream;
		}

		public String getStartBizDate() {
			return this.startBizDate;
		}

		public void setStartBizDate(String startBizDate) {
			this.startBizDate = startBizDate;
		}

		public Integer getParallelism() {
			return this.parallelism;
		}

		public void setParallelism(Integer parallelism) {
			this.parallelism = parallelism;
		}

		public List<GlobalParamListItem> getGlobalParamList() {
			return this.globalParamList;
		}

		public void setGlobalParamList(List<GlobalParamListItem> globalParamList) {
			this.globalParamList = globalParamList;
		}

		public String getEndBizDate() {
			return this.endBizDate;
		}

		public void setEndBizDate(String endBizDate) {
			this.endBizDate = endBizDate;
		}

		public List<FilterListItem> getFilterList() {
			return this.filterList;
		}

		public void setFilterList(List<FilterListItem> filterList) {
			this.filterList = filterList;
		}

		public List<NodeParamsListItem> getNodeParamsList() {
			return this.nodeParamsList;
		}

		public void setNodeParamsList(List<NodeParamsListItem> nodeParamsList) {
			this.nodeParamsList = nodeParamsList;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMinDueTime() {
			return this.minDueTime;
		}

		public void setMinDueTime(String minDueTime) {
			this.minDueTime = minDueTime;
		}

		public List<NodeIdListItem> getNodeIdList() {
			return this.nodeIdList;
		}

		public void setNodeIdList(List<NodeIdListItem> nodeIdList) {
			this.nodeIdList = nodeIdList;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public List<DownStreamNodeIdListItem> getDownStreamNodeIdList() {
			return this.downStreamNodeIdList;
		}

		public void setDownStreamNodeIdList(List<DownStreamNodeIdListItem> downStreamNodeIdList) {
			this.downStreamNodeIdList = downStreamNodeIdList;
		}

		public static class GlobalParamListItem {

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

		public static class FilterListItem {

			@SerializedName("ValueList")
			private List<String> valueList;

			@SerializedName("Exclude")
			private Boolean exclude;

			@SerializedName("Key")
			private String key;

			public List<String> getValueList() {
				return this.valueList;
			}

			public void setValueList(List<String> valueList) {
				this.valueList = valueList;
			}

			public Boolean getExclude() {
				return this.exclude;
			}

			public void setExclude(Boolean exclude) {
				this.exclude = exclude;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class NodeParamsListItem {

			@SerializedName("ParamList")
			private List<ParamListItem> paramList;

			@SerializedName("NodeId")
			private String nodeId;

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

		public static class NodeIdListItem {

			@SerializedName("Id")
			private String id;

			@SerializedName("FieldIdList")
			private List<String> fieldIdList;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<String> getFieldIdList() {
				return this.fieldIdList;
			}

			public void setFieldIdList(List<String> fieldIdList) {
				this.fieldIdList = fieldIdList;
			}
		}

		public static class DownStreamNodeIdListItem {

			@SerializedName("Id")
			private String id;

			@SerializedName("FieldIdList")
			private List<String> fieldIdList;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<String> getFieldIdList() {
				return this.fieldIdList;
			}

			public void setFieldIdList(List<String> fieldIdList) {
				this.fieldIdList = fieldIdList;
			}
		}
	}

	@Override
	public Class<CreateNodeSupplementResponse> getResponseClass() {
		return CreateNodeSupplementResponse.class;
	}

}
