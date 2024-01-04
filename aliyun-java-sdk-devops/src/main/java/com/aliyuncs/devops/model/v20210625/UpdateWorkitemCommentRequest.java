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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateWorkitemCommentRequest extends RoaAcsRequest<UpdateWorkitemCommentResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public UpdateWorkitemCommentRequest() {
		super("devops", "2021-06-25", "UpdateWorkitemComment");
		setUriPattern("/organization/[organizationId]/workitems/commentUpdate");
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public static class Body {

		@SerializedName("commentId")
		private Long commentId;

		@SerializedName("formatType")
		private String formatType;

		@SerializedName("workitemIdentifier")
		private String workitemIdentifier;

		@SerializedName("content")
		private String content;

		public Long getCommentId() {
			return this.commentId;
		}

		public void setCommentId(Long commentId) {
			this.commentId = commentId;
		}

		public String getFormatType() {
			return this.formatType;
		}

		public void setFormatType(String formatType) {
			this.formatType = formatType;
		}

		public String getWorkitemIdentifier() {
			return this.workitemIdentifier;
		}

		public void setWorkitemIdentifier(String workitemIdentifier) {
			this.workitemIdentifier = workitemIdentifier;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public Class<UpdateWorkitemCommentResponse> getResponseClass() {
		return UpdateWorkitemCommentResponse.class;
	}

}
