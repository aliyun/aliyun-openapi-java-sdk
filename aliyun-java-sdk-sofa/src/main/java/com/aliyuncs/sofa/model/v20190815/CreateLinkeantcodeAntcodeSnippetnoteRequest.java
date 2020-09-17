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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeantcodeAntcodeSnippetnoteRequest extends RpcAcsRequest<CreateLinkeantcodeAntcodeSnippetnoteResponse> {
	   

	private String note;

	private String isAward;

	private String id;

	private String projectId;

	private String requestGitOperate;

	private String discussionId;
	public CreateLinkeantcodeAntcodeSnippetnoteRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeantcodeAntcodeSnippetnote", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putBodyParameter("Note", note);
		}
	}

	public String getIsAward() {
		return this.isAward;
	}

	public void setIsAward(String isAward) {
		this.isAward = isAward;
		if(isAward != null){
			putBodyParameter("IsAward", isAward);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getDiscussionId() {
		return this.discussionId;
	}

	public void setDiscussionId(String discussionId) {
		this.discussionId = discussionId;
		if(discussionId != null){
			putBodyParameter("DiscussionId", discussionId);
		}
	}

	@Override
	public Class<CreateLinkeantcodeAntcodeSnippetnoteResponse> getResponseClass() {
		return CreateLinkeantcodeAntcodeSnippetnoteResponse.class;
	}

}
