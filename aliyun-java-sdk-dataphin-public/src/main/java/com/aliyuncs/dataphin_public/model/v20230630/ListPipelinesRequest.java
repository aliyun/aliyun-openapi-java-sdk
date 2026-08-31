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
public class ListPipelinesRequest extends RpcAcsRequest<ListPipelinesResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("listCommand")
	private ListCommand listCommand;

	@SerializedName("context")
	private Context context;
	public ListPipelinesRequest() {
		super("dataphin-public", "2023-06-30", "ListPipelines", "Dataphin");
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

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public ListCommand getListCommand() {
		return this.listCommand;
	}

	public void setListCommand(ListCommand listCommand) {
		this.listCommand = listCommand;	
		if (listCommand != null) {
			putBodyParameter("ListCommand" , new Gson().toJson(listCommand));
		}	
	}

	public Context getContext() {
		return this.context;
	}

	public void setContext(Context context) {
		this.context = context;	
		if (context != null) {
			putBodyParameter("Context" , new Gson().toJson(context));
		}	
	}

	public static class ListCommand {

		@SerializedName("TotalCount")
		private Integer totalCount;

		@SerializedName("ScheduleTypeList")
		private List<Integer> scheduleTypeList;

		@SerializedName("Keywords")
		private List<String> keywords;

		@SerializedName("CreatorList")
		private List<String> creatorList;

		@SerializedName("PipelineTypeList")
		private List<Integer> pipelineTypeList;

		@SerializedName("PageNum")
		private Integer pageNum;

		@SerializedName("NextCursor")
		private Long nextCursor;

		@SerializedName("ExactMatch")
		private Boolean exactMatch;

		@SerializedName("Recursive")
		private Boolean recursive;

		@SerializedName("TagList")
		private List<String> tagList;

		@SerializedName("OpsOwnerList")
		private List<String> opsOwnerList;

		@SerializedName("DevelopOwnerList")
		private List<String> developOwnerList;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("SubmitStatusList")
		private List<String> submitStatusList;

		@SerializedName("Directories")
		private List<String> directories;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Integer> getScheduleTypeList() {
			return this.scheduleTypeList;
		}

		public void setScheduleTypeList(List<Integer> scheduleTypeList) {
			this.scheduleTypeList = scheduleTypeList;
		}

		public List<String> getKeywords() {
			return this.keywords;
		}

		public void setKeywords(List<String> keywords) {
			this.keywords = keywords;
		}

		public List<String> getCreatorList() {
			return this.creatorList;
		}

		public void setCreatorList(List<String> creatorList) {
			this.creatorList = creatorList;
		}

		public List<Integer> getPipelineTypeList() {
			return this.pipelineTypeList;
		}

		public void setPipelineTypeList(List<Integer> pipelineTypeList) {
			this.pipelineTypeList = pipelineTypeList;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Long getNextCursor() {
			return this.nextCursor;
		}

		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}

		public Boolean getExactMatch() {
			return this.exactMatch;
		}

		public void setExactMatch(Boolean exactMatch) {
			this.exactMatch = exactMatch;
		}

		public Boolean getRecursive() {
			return this.recursive;
		}

		public void setRecursive(Boolean recursive) {
			this.recursive = recursive;
		}

		public List<String> getTagList() {
			return this.tagList;
		}

		public void setTagList(List<String> tagList) {
			this.tagList = tagList;
		}

		public List<String> getOpsOwnerList() {
			return this.opsOwnerList;
		}

		public void setOpsOwnerList(List<String> opsOwnerList) {
			this.opsOwnerList = opsOwnerList;
		}

		public List<String> getDevelopOwnerList() {
			return this.developOwnerList;
		}

		public void setDevelopOwnerList(List<String> developOwnerList) {
			this.developOwnerList = developOwnerList;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<String> getSubmitStatusList() {
			return this.submitStatusList;
		}

		public void setSubmitStatusList(List<String> submitStatusList) {
			this.submitStatusList = submitStatusList;
		}

		public List<String> getDirectories() {
			return this.directories;
		}

		public void setDirectories(List<String> directories) {
			this.directories = directories;
		}
	}

	public static class Context {

		@SerializedName("Env")
		private String env;

		@SerializedName("ProjectId")
		private Long projectId;

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}
	}

	@Override
	public Class<ListPipelinesResponse> getResponseClass() {
		return ListPipelinesResponse.class;
	}

}
