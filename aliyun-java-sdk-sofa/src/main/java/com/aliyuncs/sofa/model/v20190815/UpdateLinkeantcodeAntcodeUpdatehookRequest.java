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
public class UpdateLinkeantcodeAntcodeUpdatehookRequest extends RpcAcsRequest<UpdateLinkeantcodeAntcodeUpdatehookResponse> {
	   

	private String mergeRequestsEvents;

	private String id;

	private String tagPushEvents;

	private String requestGitOperate;

	private String noteEvents;

	private String pushEvents;

	private String url;

	private String hookId;

	private String enableSslVerification;

	private String issuesEvents;
	public UpdateLinkeantcodeAntcodeUpdatehookRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeantcodeAntcodeUpdatehook", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMergeRequestsEvents() {
		return this.mergeRequestsEvents;
	}

	public void setMergeRequestsEvents(String mergeRequestsEvents) {
		this.mergeRequestsEvents = mergeRequestsEvents;
		if(mergeRequestsEvents != null){
			putBodyParameter("MergeRequestsEvents", mergeRequestsEvents);
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

	public String getTagPushEvents() {
		return this.tagPushEvents;
	}

	public void setTagPushEvents(String tagPushEvents) {
		this.tagPushEvents = tagPushEvents;
		if(tagPushEvents != null){
			putBodyParameter("TagPushEvents", tagPushEvents);
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

	public String getNoteEvents() {
		return this.noteEvents;
	}

	public void setNoteEvents(String noteEvents) {
		this.noteEvents = noteEvents;
		if(noteEvents != null){
			putBodyParameter("NoteEvents", noteEvents);
		}
	}

	public String getPushEvents() {
		return this.pushEvents;
	}

	public void setPushEvents(String pushEvents) {
		this.pushEvents = pushEvents;
		if(pushEvents != null){
			putBodyParameter("PushEvents", pushEvents);
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putBodyParameter("Url", url);
		}
	}

	public String getHookId() {
		return this.hookId;
	}

	public void setHookId(String hookId) {
		this.hookId = hookId;
		if(hookId != null){
			putBodyParameter("HookId", hookId);
		}
	}

	public String getEnableSslVerification() {
		return this.enableSslVerification;
	}

	public void setEnableSslVerification(String enableSslVerification) {
		this.enableSslVerification = enableSslVerification;
		if(enableSslVerification != null){
			putBodyParameter("EnableSslVerification", enableSslVerification);
		}
	}

	public String getIssuesEvents() {
		return this.issuesEvents;
	}

	public void setIssuesEvents(String issuesEvents) {
		this.issuesEvents = issuesEvents;
		if(issuesEvents != null){
			putBodyParameter("IssuesEvents", issuesEvents);
		}
	}

	@Override
	public Class<UpdateLinkeantcodeAntcodeUpdatehookResponse> getResponseClass() {
		return UpdateLinkeantcodeAntcodeUpdatehookResponse.class;
	}

}
