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
public class CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest extends RpcAcsRequest<CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse> {
	   

	private String branch;

	private String content;

	private String filePath;

	private String authorName;

	private String id;

	private String authorEmail;

	private String requestGitOperate;

	private String commitMessage;

	private String encoding;

	private String startBranch;
	public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepath", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
		if(branch != null){
			putBodyParameter("Branch", branch);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putBodyParameter("FilePath", filePath);
		}
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
		if(authorName != null){
			putBodyParameter("AuthorName", authorName);
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

	public String getAuthorEmail() {
		return this.authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
		if(authorEmail != null){
			putBodyParameter("AuthorEmail", authorEmail);
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

	public String getCommitMessage() {
		return this.commitMessage;
	}

	public void setCommitMessage(String commitMessage) {
		this.commitMessage = commitMessage;
		if(commitMessage != null){
			putBodyParameter("CommitMessage", commitMessage);
		}
	}

	public String getEncoding() {
		return this.encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
		if(encoding != null){
			putBodyParameter("Encoding", encoding);
		}
	}

	public String getStartBranch() {
		return this.startBranch;
	}

	public void setStartBranch(String startBranch) {
		this.startBranch = startBranch;
		if(startBranch != null){
			putBodyParameter("StartBranch", startBranch);
		}
	}

	@Override
	public Class<CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse> getResponseClass() {
		return CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.class;
	}

}
