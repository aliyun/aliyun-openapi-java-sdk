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
public class ListNodeDownStreamRequest extends RpcAcsRequest<ListNodeDownStreamResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;

	private String env;
	public ListNodeDownStreamRequest() {
		super("dataphin-public", "2023-06-30", "ListNodeDownStream");
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

	public ListQuery getListQuery() {
		return this.listQuery;
	}

	public void setListQuery(ListQuery listQuery) {
		this.listQuery = listQuery;	
		if (listQuery != null) {
			putBodyParameter("ListQuery" , new Gson().toJson(listQuery));
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

	public static class ListQuery {

		@SerializedName("NodeIdList")
		private List<NodeIdListItem> nodeIdList;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("DownStreamDepth")
		private Integer downStreamDepth;

		@SerializedName("FilterList")
		private List<FilterListItem> filterList;

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

		public Integer getDownStreamDepth() {
			return this.downStreamDepth;
		}

		public void setDownStreamDepth(Integer downStreamDepth) {
			this.downStreamDepth = downStreamDepth;
		}

		public List<FilterListItem> getFilterList() {
			return this.filterList;
		}

		public void setFilterList(List<FilterListItem> filterList) {
			this.filterList = filterList;
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
	}

	@Override
	public Class<ListNodeDownStreamResponse> getResponseClass() {
		return ListNodeDownStreamResponse.class;
	}

}
