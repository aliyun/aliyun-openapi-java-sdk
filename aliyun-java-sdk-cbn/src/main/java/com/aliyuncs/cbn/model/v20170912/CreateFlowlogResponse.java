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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.CreateFlowlogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateFlowlogResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String flowLogId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getFlowLogId() {
		return this.flowLogId;
	}

	public void setFlowLogId(String flowLogId) {
		this.flowLogId = flowLogId;
	}

	@Override
	public CreateFlowlogResponse getInstance(UnmarshallerContext context) {
		return	CreateFlowlogResponseUnmarshaller.unmarshall(this, context);
	}
}
