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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateVnRedirectionRequest extends RpcAcsRequest<CreateVnRedirectionResponse> {
	
	public CreateVnRedirectionRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateVnRedirection", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private List<String> similarUtterancess;

	private String redirectionType;

	private String userUtterance;

	private String redirectionTarget;

	private String prompt;

	private Boolean interruptible;

	private String categoryId;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getSimilarUtterancess() {
		return this.similarUtterancess;
	}

	public void setSimilarUtterancess(List<String> similarUtterancess) {
		this.similarUtterancess = similarUtterancess;	
		if (similarUtterancess != null) {
			for (int i = 0; i < similarUtterancess.size(); i++) {
				putQueryParameter("SimilarUtterances." + (i + 1) , similarUtterancess.get(i));
			}
		}	
	}

	public String getRedirectionType() {
		return this.redirectionType;
	}

	public void setRedirectionType(String redirectionType) {
		this.redirectionType = redirectionType;
		if(redirectionType != null){
			putQueryParameter("RedirectionType", redirectionType);
		}
	}

	public String getUserUtterance() {
		return this.userUtterance;
	}

	public void setUserUtterance(String userUtterance) {
		this.userUtterance = userUtterance;
		if(userUtterance != null){
			putQueryParameter("UserUtterance", userUtterance);
		}
	}

	public String getRedirectionTarget() {
		return this.redirectionTarget;
	}

	public void setRedirectionTarget(String redirectionTarget) {
		this.redirectionTarget = redirectionTarget;
		if(redirectionTarget != null){
			putQueryParameter("RedirectionTarget", redirectionTarget);
		}
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
		if(prompt != null){
			putQueryParameter("Prompt", prompt);
		}
	}

	public Boolean getInterruptible() {
		return this.interruptible;
	}

	public void setInterruptible(Boolean interruptible) {
		this.interruptible = interruptible;
		if(interruptible != null){
			putQueryParameter("Interruptible", interruptible.toString());
		}
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId);
		}
	}

	@Override
	public Class<CreateVnRedirectionResponse> getResponseClass() {
		return CreateVnRedirectionResponse.class;
	}

}
