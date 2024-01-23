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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class LinkMergeRequestLabelRequest extends RoaAcsRequest<LinkMergeRequestLabelResponse> {
	   

	private String organizationId;

	private String repositoryIdentity;

	private String accessToken;

	@SerializedName("body")
	private Body body;

	private Long localId;
	public LinkMergeRequestLabelRequest() {
		super("devops", "2021-06-25", "LinkMergeRequestLabel");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v4/projects/merge_requests/link_labels");
		setMethod(MethodType.POST);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public String getRepositoryIdentity() {
		return this.repositoryIdentity;
	}

	public void setRepositoryIdentity(String repositoryIdentity) {
		this.repositoryIdentity = repositoryIdentity;
		if(repositoryIdentity != null){
			putQueryParameter("repositoryIdentity", repositoryIdentity);
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("accessToken", accessToken);
		}
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

	public Long getLocalId() {
		return this.localId;
	}

	public void setLocalId(Long localId) {
		this.localId = localId;
		if(localId != null){
			putQueryParameter("localId", localId.toString());
		}
	}

	public static class Body {

		@SerializedName("labelIds")
		private List<String> labelIds;

		public List<String> getLabelIds() {
			return this.labelIds;
		}

		public void setLabelIds(List<String> labelIds) {
			this.labelIds = labelIds;
		}
	}

	@Override
	public Class<LinkMergeRequestLabelResponse> getResponseClass() {
		return LinkMergeRequestLabelResponse.class;
	}

}
