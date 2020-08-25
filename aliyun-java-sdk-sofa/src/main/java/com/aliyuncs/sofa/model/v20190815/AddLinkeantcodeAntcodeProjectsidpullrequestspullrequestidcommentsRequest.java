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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest extends RpcAcsRequest<AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse> {
	   

	private String lineCode;

	private String note;

	private String commitId;

	private String type;

	private String pullRequestId;

	private String id;

	private String rightLineNum;

	private List<String> pathRepeatLists;

	private List<String> labelsRepeatLists;

	private String requestGitOperate;

	private String leftLineNum;

	private String discussionId;

	private String startSha;

	private String diffId;
	public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest() {
		super("SOFA", "2019-08-15", "AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcomments", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLineCode() {
		return this.lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
		if(lineCode != null){
			putBodyParameter("LineCode", lineCode);
		}
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

	public String getCommitId() {
		return this.commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
		if(commitId != null){
			putBodyParameter("CommitId", commitId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
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

	public String getRightLineNum() {
		return this.rightLineNum;
	}

	public void setRightLineNum(String rightLineNum) {
		this.rightLineNum = rightLineNum;
		if(rightLineNum != null){
			putBodyParameter("RightLineNum", rightLineNum);
		}
	}

	public List<String> getPathRepeatLists() {
		return this.pathRepeatLists;
	}

	public void setPathRepeatLists(List<String> pathRepeatLists) {
		this.pathRepeatLists = pathRepeatLists;	
		if (pathRepeatLists != null) {
			for (int i = 0; i < pathRepeatLists.size(); i++) {
				putBodyParameter("PathRepeatList." + (i + 1) , pathRepeatLists.get(i));
			}
		}	
	}

	public List<String> getLabelsRepeatLists() {
		return this.labelsRepeatLists;
	}

	public void setLabelsRepeatLists(List<String> labelsRepeatLists) {
		this.labelsRepeatLists = labelsRepeatLists;	
		if (labelsRepeatLists != null) {
			for (int i = 0; i < labelsRepeatLists.size(); i++) {
				putBodyParameter("LabelsRepeatList." + (i + 1) , labelsRepeatLists.get(i));
			}
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

	public String getLeftLineNum() {
		return this.leftLineNum;
	}

	public void setLeftLineNum(String leftLineNum) {
		this.leftLineNum = leftLineNum;
		if(leftLineNum != null){
			putBodyParameter("LeftLineNum", leftLineNum);
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

	public String getStartSha() {
		return this.startSha;
	}

	public void setStartSha(String startSha) {
		this.startSha = startSha;
		if(startSha != null){
			putBodyParameter("StartSha", startSha);
		}
	}

	public String getDiffId() {
		return this.diffId;
	}

	public void setDiffId(String diffId) {
		this.diffId = diffId;
		if(diffId != null){
			putBodyParameter("DiffId", diffId);
		}
	}

	@Override
	public Class<AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse> getResponseClass() {
		return AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.class;
	}

}
