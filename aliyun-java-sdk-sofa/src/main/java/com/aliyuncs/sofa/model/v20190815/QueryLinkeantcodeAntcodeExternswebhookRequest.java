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
public class QueryLinkeantcodeAntcodeExternswebhookRequest extends RpcAcsRequest<QueryLinkeantcodeAntcodeExternswebhookResponse> {
	   

	private String body;

	private String gitlabEvent;

	private String requestGitOperate;
	public QueryLinkeantcodeAntcodeExternswebhookRequest() {
		super("SOFA", "2019-08-15", "QueryLinkeantcodeAntcodeExternswebhook", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("Body", body);
		}
	}

	public String getGitlabEvent() {
		return this.gitlabEvent;
	}

	public void setGitlabEvent(String gitlabEvent) {
		this.gitlabEvent = gitlabEvent;
		if(gitlabEvent != null){
			putBodyParameter("GitlabEvent", gitlabEvent);
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

	@Override
	public Class<QueryLinkeantcodeAntcodeExternswebhookResponse> getResponseClass() {
		return QueryLinkeantcodeAntcodeExternswebhookResponse.class;
	}

}
