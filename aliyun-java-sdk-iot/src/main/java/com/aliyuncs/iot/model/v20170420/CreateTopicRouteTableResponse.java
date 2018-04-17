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

package com.aliyuncs.iot.model.v20170420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20170420.CreateTopicRouteTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTopicRouteTableResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Boolean isAllSucceed;

	private String errorMessage;

	private List<String> failureTopics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getIsAllSucceed() {
		return this.isAllSucceed;
	}

	public void setIsAllSucceed(Boolean isAllSucceed) {
		this.isAllSucceed = isAllSucceed;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getFailureTopics() {
		return this.failureTopics;
	}

	public void setFailureTopics(List<String> failureTopics) {
		this.failureTopics = failureTopics;
	}

	@Override
	public CreateTopicRouteTableResponse getInstance(UnmarshallerContext context) {
		return	CreateTopicRouteTableResponseUnmarshaller.unmarshall(this, context);
	}
}
