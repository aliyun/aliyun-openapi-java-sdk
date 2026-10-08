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
public class ListScheduleTemplatesRequest extends RpcAcsRequest<ListScheduleTemplatesResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("listScheduleTemplatesCommand")
	private ListScheduleTemplatesCommand listScheduleTemplatesCommand;
	public ListScheduleTemplatesRequest() {
		super("dataphin-public", "2023-06-30", "ListScheduleTemplates", "1111");
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

	public ListScheduleTemplatesCommand getListScheduleTemplatesCommand() {
		return this.listScheduleTemplatesCommand;
	}

	public void setListScheduleTemplatesCommand(ListScheduleTemplatesCommand listScheduleTemplatesCommand) {
		this.listScheduleTemplatesCommand = listScheduleTemplatesCommand;	
		if (listScheduleTemplatesCommand != null) {
			putBodyParameter("ListScheduleTemplatesCommand" , new Gson().toJson(listScheduleTemplatesCommand));
		}	
	}

	public static class ListScheduleTemplatesCommand {

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("ScheduleTemplateType")
		private String scheduleTemplateType;

		@SerializedName("PageNumber")
		private Integer pageNumber;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public String getScheduleTemplateType() {
			return this.scheduleTemplateType;
		}

		public void setScheduleTemplateType(String scheduleTemplateType) {
			this.scheduleTemplateType = scheduleTemplateType;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}
	}

	@Override
	public Class<ListScheduleTemplatesResponse> getResponseClass() {
		return ListScheduleTemplatesResponse.class;
	}

}
