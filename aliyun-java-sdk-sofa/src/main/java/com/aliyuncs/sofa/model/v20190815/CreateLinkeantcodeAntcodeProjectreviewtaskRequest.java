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
public class CreateLinkeantcodeAntcodeProjectreviewtaskRequest extends RpcAcsRequest<CreateLinkeantcodeAntcodeProjectreviewtaskResponse> {
	   

	private String userId;

	private String id;

	private String reviewId;

	private String requestGitOperate;

	private String globPattern;
	public CreateLinkeantcodeAntcodeProjectreviewtaskRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeantcodeAntcodeProjectreviewtask", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
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

	public String getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
		if(reviewId != null){
			putBodyParameter("ReviewId", reviewId);
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

	public String getGlobPattern() {
		return this.globPattern;
	}

	public void setGlobPattern(String globPattern) {
		this.globPattern = globPattern;
		if(globPattern != null){
			putBodyParameter("GlobPattern", globPattern);
		}
	}

	@Override
	public Class<CreateLinkeantcodeAntcodeProjectreviewtaskResponse> getResponseClass() {
		return CreateLinkeantcodeAntcodeProjectreviewtaskResponse.class;
	}

}
