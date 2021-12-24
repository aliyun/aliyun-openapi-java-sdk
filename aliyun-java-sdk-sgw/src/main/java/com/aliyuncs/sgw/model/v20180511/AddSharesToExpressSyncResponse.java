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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.AddSharesToExpressSyncResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddSharesToExpressSyncResponse extends AcsResponse {

	private String taskId;

	private String requestId;

	private String message;

	private String mnsTopic;

	private String mnsQueues;

	private Long mnsFullSyncDelay;

	private String mnsPublicEndpoint;

	private String mnsInnerEndpoint;

	private String code;

	private Boolean success;

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMnsTopic() {
		return this.mnsTopic;
	}

	public void setMnsTopic(String mnsTopic) {
		this.mnsTopic = mnsTopic;
	}

	public String getMnsQueues() {
		return this.mnsQueues;
	}

	public void setMnsQueues(String mnsQueues) {
		this.mnsQueues = mnsQueues;
	}

	public Long getMnsFullSyncDelay() {
		return this.mnsFullSyncDelay;
	}

	public void setMnsFullSyncDelay(Long mnsFullSyncDelay) {
		this.mnsFullSyncDelay = mnsFullSyncDelay;
	}

	public String getMnsPublicEndpoint() {
		return this.mnsPublicEndpoint;
	}

	public void setMnsPublicEndpoint(String mnsPublicEndpoint) {
		this.mnsPublicEndpoint = mnsPublicEndpoint;
	}

	public String getMnsInnerEndpoint() {
		return this.mnsInnerEndpoint;
	}

	public void setMnsInnerEndpoint(String mnsInnerEndpoint) {
		this.mnsInnerEndpoint = mnsInnerEndpoint;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public AddSharesToExpressSyncResponse getInstance(UnmarshallerContext context) {
		return	AddSharesToExpressSyncResponseUnmarshaller.unmarshall(this, context);
	}
}
