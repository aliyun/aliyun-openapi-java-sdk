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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String createdAt;

	private String email;

	private Long id;

	private Long responseStatusCode;

	private Long subscribableId;

	private String subscribableType;

	private Boolean subscribed;

	private String updatedAt;

	private Long userId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Long getSubscribableId() {
		return this.subscribableId;
	}

	public void setSubscribableId(Long subscribableId) {
		this.subscribableId = subscribableId;
	}

	public String getSubscribableType() {
		return this.subscribableType;
	}

	public void setSubscribableType(String subscribableType) {
		this.subscribableType = subscribableType;
	}

	public Boolean getSubscribed() {
		return this.subscribed;
	}

	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}

	public String getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
