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
public class PublishObjectListRequest extends RpcAcsRequest<PublishObjectListResponse> {
	   

	private Long opTenantId;

	@SerializedName("publishCommand")
	private PublishCommand publishCommand;
	public PublishObjectListRequest() {
		super("dataphin-public", "2023-06-30", "PublishObjectList");
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

	public PublishCommand getPublishCommand() {
		return this.publishCommand;
	}

	public void setPublishCommand(PublishCommand publishCommand) {
		this.publishCommand = publishCommand;	
		if (publishCommand != null) {
			putBodyParameter("PublishCommand" , new Gson().toJson(publishCommand));
		}	
	}

	public static class PublishCommand {

		@SerializedName("SubmitIdList")
		private List<Long> submitIdList;

		@SerializedName("Comment")
		private String comment;

		@SerializedName("ProjectId")
		private Long projectId;

		public List<Long> getSubmitIdList() {
			return this.submitIdList;
		}

		public void setSubmitIdList(List<Long> submitIdList) {
			this.submitIdList = submitIdList;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}
	}

	@Override
	public Class<PublishObjectListResponse> getResponseClass() {
		return PublishObjectListResponse.class;
	}

}
