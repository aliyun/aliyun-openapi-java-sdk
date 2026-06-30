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
public class ListOperationRecordRequest extends RpcAcsRequest<ListOperationRecordResponse> {
	   

	private Long opTenantId;

	@SerializedName("listCommand")
	private ListCommand listCommand;
	public ListOperationRecordRequest() {
		super("dataphin-public", "2023-06-30", "ListOperationRecord");
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

	public ListCommand getListCommand() {
		return this.listCommand;
	}

	public void setListCommand(ListCommand listCommand) {
		this.listCommand = listCommand;	
		if (listCommand != null) {
			putBodyParameter("ListCommand" , new Gson().toJson(listCommand));
		}	
	}

	public static class ListCommand {

		@SerializedName("SortType")
		private Integer sortType;

		@SerializedName("BeginTimeEnd")
		private String beginTimeEnd;

		@SerializedName("Duration")
		private List<Integer> duration;

		@SerializedName("FileName")
		private String fileName;

		@SerializedName("CodeType")
		private List<Integer> codeType;

		@SerializedName("UserIds")
		private List<String> userIds;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("BeginTimeStart")
		private String beginTimeStart;

		@SerializedName("ObjectType")
		private List<String> objectType;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("CodeContent")
		private String codeContent;

		@SerializedName("Status")
		private List<Integer> status;

		public Integer getSortType() {
			return this.sortType;
		}

		public void setSortType(Integer sortType) {
			this.sortType = sortType;
		}

		public String getBeginTimeEnd() {
			return this.beginTimeEnd;
		}

		public void setBeginTimeEnd(String beginTimeEnd) {
			this.beginTimeEnd = beginTimeEnd;
		}

		public List<Integer> getDuration() {
			return this.duration;
		}

		public void setDuration(List<Integer> duration) {
			this.duration = duration;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public List<Integer> getCodeType() {
			return this.codeType;
		}

		public void setCodeType(List<Integer> codeType) {
			this.codeType = codeType;
		}

		public List<String> getUserIds() {
			return this.userIds;
		}

		public void setUserIds(List<String> userIds) {
			this.userIds = userIds;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public String getBeginTimeStart() {
			return this.beginTimeStart;
		}

		public void setBeginTimeStart(String beginTimeStart) {
			this.beginTimeStart = beginTimeStart;
		}

		public List<String> getObjectType() {
			return this.objectType;
		}

		public void setObjectType(List<String> objectType) {
			this.objectType = objectType;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getCodeContent() {
			return this.codeContent;
		}

		public void setCodeContent(String codeContent) {
			this.codeContent = codeContent;
		}

		public List<Integer> getStatus() {
			return this.status;
		}

		public void setStatus(List<Integer> status) {
			this.status = status;
		}
	}

	@Override
	public Class<ListOperationRecordResponse> getResponseClass() {
		return ListOperationRecordResponse.class;
	}

}
