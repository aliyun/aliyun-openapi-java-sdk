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

package com.aliyuncs.imageprocess.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageprocess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FeedbackSessionRequest extends RpcAcsRequest<FeedbackSessionResponse> {
	   

	private String sessionId;

	private String feedback;
	public FeedbackSessionRequest() {
		super("imageprocess", "2020-03-20", "FeedbackSession", "imageprocess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putBodyParameter("SessionId", sessionId);
		}
	}

	public String getFeedback() {
		return this.feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
		if(feedback != null){
			putBodyParameter("Feedback", feedback);
		}
	}

	@Override
	public Class<FeedbackSessionResponse> getResponseClass() {
		return FeedbackSessionResponse.class;
	}

}
