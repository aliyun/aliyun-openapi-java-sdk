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
public class ExecLinkeantcodeAntcodeMergepullrequestRequest extends RpcAcsRequest<ExecLinkeantcodeAntcodeMergepullrequestResponse> {
	   

	private String mergeCommitMessage;

	private String pullRequestId;

	private String id;

	private String mergeMethod;

	private String requestGitOperate;

	private String shouldRemoveSourceBranch;
	public ExecLinkeantcodeAntcodeMergepullrequestRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeantcodeAntcodeMergepullrequest", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMergeCommitMessage() {
		return this.mergeCommitMessage;
	}

	public void setMergeCommitMessage(String mergeCommitMessage) {
		this.mergeCommitMessage = mergeCommitMessage;
		if(mergeCommitMessage != null){
			putBodyParameter("MergeCommitMessage", mergeCommitMessage);
		}
	}

	public String getPullRequestId() {
		return this.pullRequestId;
	}

	public void setPullRequestId(String pullRequestId) {
		this.pullRequestId = pullRequestId;
		if(pullRequestId != null){
			putBodyParameter("PullRequestId", pullRequestId);
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

	public String getMergeMethod() {
		return this.mergeMethod;
	}

	public void setMergeMethod(String mergeMethod) {
		this.mergeMethod = mergeMethod;
		if(mergeMethod != null){
			putBodyParameter("MergeMethod", mergeMethod);
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

	public String getShouldRemoveSourceBranch() {
		return this.shouldRemoveSourceBranch;
	}

	public void setShouldRemoveSourceBranch(String shouldRemoveSourceBranch) {
		this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
		if(shouldRemoveSourceBranch != null){
			putBodyParameter("ShouldRemoveSourceBranch", shouldRemoveSourceBranch);
		}
	}

	@Override
	public Class<ExecLinkeantcodeAntcodeMergepullrequestResponse> getResponseClass() {
		return ExecLinkeantcodeAntcodeMergepullrequestResponse.class;
	}

}
