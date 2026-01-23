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
public class PublishStandardRequest extends RpcAcsRequest<PublishStandardResponse> {
	   

	private Long opTenantId;

	@SerializedName("publishCommand")
	private PublishCommand publishCommand;
	public PublishStandardRequest() {
		super("dataphin-public", "2023-06-30", "PublishStandard");
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

		@SerializedName("StandardStage")
		private String standardStage;

		@SerializedName("ReviewerIdList")
		private List<String> reviewerIdList;

		@SerializedName("Comment")
		private String comment;

		@SerializedName("Id")
		private Long id;

		@SerializedName("Version")
		private Integer version;

		@SerializedName("AutoPublishAfterApproval")
		private Boolean autoPublishAfterApproval;

		public String getStandardStage() {
			return this.standardStage;
		}

		public void setStandardStage(String standardStage) {
			this.standardStage = standardStage;
		}

		public List<String> getReviewerIdList() {
			return this.reviewerIdList;
		}

		public void setReviewerIdList(List<String> reviewerIdList) {
			this.reviewerIdList = reviewerIdList;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public Boolean getAutoPublishAfterApproval() {
			return this.autoPublishAfterApproval;
		}

		public void setAutoPublishAfterApproval(Boolean autoPublishAfterApproval) {
			this.autoPublishAfterApproval = autoPublishAfterApproval;
		}
	}

	@Override
	public Class<PublishStandardResponse> getResponseClass() {
		return PublishStandardResponse.class;
	}

}
