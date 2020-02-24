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

package com.aliyuncs.voicenavigator.model.v20180612;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.DescribeRedirectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRedirectionResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String categoryId;

	private String navigationScriptId;

	private String userUtterance;

	private String prompt;

	private Boolean interruptible;

	private String redirectionType;

	private String redirectionTarget;

	private List<String> similarUtterances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getNavigationScriptId() {
		return this.navigationScriptId;
	}

	public void setNavigationScriptId(String navigationScriptId) {
		this.navigationScriptId = navigationScriptId;
	}

	public String getUserUtterance() {
		return this.userUtterance;
	}

	public void setUserUtterance(String userUtterance) {
		this.userUtterance = userUtterance;
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public Boolean getInterruptible() {
		return this.interruptible;
	}

	public void setInterruptible(Boolean interruptible) {
		this.interruptible = interruptible;
	}

	public String getRedirectionType() {
		return this.redirectionType;
	}

	public void setRedirectionType(String redirectionType) {
		this.redirectionType = redirectionType;
	}

	public String getRedirectionTarget() {
		return this.redirectionTarget;
	}

	public void setRedirectionTarget(String redirectionTarget) {
		this.redirectionTarget = redirectionTarget;
	}

	public List<String> getSimilarUtterances() {
		return this.similarUtterances;
	}

	public void setSimilarUtterances(List<String> similarUtterances) {
		this.similarUtterances = similarUtterances;
	}

	@Override
	public DescribeRedirectionResponse getInstance(UnmarshallerContext context) {
		return	DescribeRedirectionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
